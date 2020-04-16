package com.hd.common.payment;

import com.github.wxpay.sdk.WXPayUtil;
import com.hd.common.log.hdLog;
import com.hd.common.utils.RandomUtils;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by WangLiMing on 2017/7/9.
 */
public class WxPayUtil {

    public static final  String WxPay ="0";
    private String partnerkey;
    private String charset;
    /**
     * 初始构造函数。
     *
     * @return
     */
//    public RequestHandler(HttpServletRequest request, HttpServletResponse response) {
//        this.last_errcode = "0";
//        this.request = request;
//        this.response = response;
//        // this.charset = "GBK";
//        this.charset = "UTF-8";
//        this.parameters = new TreeMap();
//        // 验证notify支付订单网关
//        notifyUrl = "https://gw.tenpay.com/gateway/simpleverifynotifyid.xml";
//
//    }
    /**
     * 获取微信支付app版AppId
     */
    public static String getWxPayAppIdForApp(){return ConfigurationWx.getInstance().getValue("app_app_id");}

    /**
     * 获取微信支付app版商户号（微信支付分配的商户号）
     */
    public static String getWxPayMchIdForApp(){return ConfigurationWx.getInstance().getValue("app_mch_id");}

    /**
     * 获取微信支付app版app key
     */
    public static String getWxPayKeyForApp(){return ConfigurationWx.getInstance().getValue("app_key"); }



    /**
     * 获取微信支付AppId
     */
    public static String getWxPayAppId(){return ConfigurationWx.getInstance().getValue("app_id");}

    /**
     * 获取微信支付商户号（微信支付分配的商户号）
     */
    public static String getWxPayMchId(){return ConfigurationWx.getInstance().getValue("mch_id");}

    /**
     * 获取微信支付app key
     */
    public static String getWxPayKey(){return ConfigurationWx.getInstance().getValue("key"); }

    /**
     * 获取微信支付app版AppId
     */
    public static String getMongoAppId(){return ConfigurationWx.getInstance().getValue("mongo_app_id");}

    /**
     * 获取微信支付app版商户号（微信支付分配的商户号）
     */
    public static String getMongoMchId(){return ConfigurationWx.getInstance().getValue("mongo_mch_id");}

    /**
     * 获取微信支付app版app key
     */
    public static String getMongoKey(){return ConfigurationWx.getInstance().getValue("mongo_key"); }

    /**
     * 获取随机数()
     */
    public static String getWxPayNonceStr(){
        String noncestr = RandomUtils.generateString(16);
        return noncestr;
    }
    /**
     * 获取编码格式
     */
    public static String getWxPayCharset(){return ConfigurationWx.getInstance().getValue("charset");}
    /**
     *获取微信预支付订单交易接口
     */
    public static String getWxPayGateWay(){return ConfigurationWx.getInstance().getValue("gateway");}

    /**
     *获取微信支付单个订单查询网关
     */
    public static String getWxPayQueryGateWay(){return ConfigurationWx.getInstance().getValue("querygateway");}
    /**
     * 获取终端Ip
     */
    public static String getWxPaySpbillCreateIp() throws Exception{
        InetAddress localhost = InetAddress.getLocalHost();
        return localhost.getHostAddress();
    }
    /**
     * 获取异步通知地址
     */
    public static String getWxPayNotifyUrl() {
        return ConfigurationWx.getInstance().getValue("notify_url");
    }

    /**
     * 获取异步通知地址
     */
    public static String getWxPayHttpUrl() {
        return ConfigurationWx.getInstance().getValue("http_url");
    }
    /**
     * 获取芒果树异步通知地址
     */
    public static String getMongoHttpUrl() {
        return ConfigurationWx.getInstance().getValue("mongo_http_url");
    }
    /**
     * 调用微信预查询订单接口并且得到返回数据
     *
     * @return
     */
    public static Map getWxQuery(String QueryGateWay, String xmlInfo) {
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
        HttpPost httpPost = new HttpPost(QueryGateWay);
        HttpClientContext httpClientContext = new HttpClientContext();
        String trade_state = "";
        try {
            StringEntity se = new StringEntity(xmlInfo);
            se.setContentType("text/xml");
            se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/xml"));
            httpPost.setEntity(se);
            httpPost.setConfig(RequestConfig.DEFAULT);
            HttpResponse httpResponse = closeableHttpClient.execute(httpPost, httpClientContext);
            HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity != null) {
                InputStream content = httpEntity.getContent();
                Map<String, String> params = getParamsMapFromXml(content);
                String return_code = params.get("return_code");
                if ("SUCCESS".equals(return_code)) {
                    trade_state= params.get("trade_state");
                }else {
                    hdLog.error("统一支付接口获取预订单失败", new Exception());
                }
                Map resultMap = new HashMap();
                resultMap.put("trade_state", trade_state);
                return resultMap;
            } else {
                hdLog.error("查询订单响应失败", new Exception());
                return null;
            }
        } catch (Exception e) {
            hdLog.error(e.getMessage(), new Exception());
        }
        return null;
    }

    /**
     * 调用微信预支付订单接口并且得到返回数据
     * @return
     */
    public static Map getWxPost(String wxGateWay, String xmlInfo){
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
        HttpPost httpPost = new HttpPost(wxGateWay);
        HttpClientContext httpClientContext = new HttpClientContext();
        String prepay_id = "";
        try{
            StringEntity se = new StringEntity(xmlInfo);
            se.setContentType("text/xml");
            se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,"application/xml"));
            httpPost.setEntity(se);
            httpPost.setConfig(RequestConfig.DEFAULT);
            HttpResponse httpResponse = closeableHttpClient.execute(httpPost,httpClientContext);
            HttpEntity httpEntity = httpResponse.getEntity();
            if(httpEntity!=null){
                InputStream content = httpEntity.getContent();
                Map<String,String> params = getParamsMapFromXml(content);
                hdLog.info("getWxPost|params|"+ JSONObject.fromObject(params));
                prepay_id = params.get("prepay_id");//预支付订单Id
                if("".equals(prepay_id)||prepay_id ==null){
                    hdLog.error("统一支付接口获取预订单失败",new Exception());
                }
                Map resultMap = new HashMap();
                resultMap.put("prepay_id",prepay_id);
                return  resultMap;
            }else{
                hdLog.error("预支付订单响应失败",new Exception());
                return null;
            }
        }catch (Exception e){
            hdLog.error(e.getMessage(),new Exception());
        }
        return null;
    }

    /**
     * 获取当前时间戳
     * @return
     */
    public static String getTimeStamp(){
        return String.valueOf(System.currentTimeMillis() / 1000);
    }
    /**
     *
     * @param content
     * @return
     * @throws Exception
     */
    public static Map getParamsMapFromXml(InputStream content) throws Exception{
        Map<String, String> params = new HashMap<String, String>();
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(content);
        Element node = read.getRootElement();
        listNodes(node, params);
        return params;
    }

    public static void listNodes(Element node, Map<String, String> params) {
        // 获取当前节点的所有属性节点
        List<Attribute> list = node.attributes();
        // 遍历属性节点
        if ((list == null || list.size() == 0) && !("".equals(node.getTextTrim()))) {
            if(node.getTextTrim().contains("<![CDATA[")){
                String[] split = node.getTextTrim().split("<![CDATA[");
                split[1].replaceAll("]]>", "");
                params.put(node.getName(), split[1]);
            }else{
                params.put(node.getName(),node.getTextTrim());
            }
        }
        // 当前节点下面子节点迭代器
        Iterator<Element> it = node.elementIterator();
        // 遍历
        while (it.hasNext()) {
            // 获取某个子节点对象
            Element e = it.next();
            // 对子节点进行遍历
            listNodes(e, params);
        }
    }
    /**
     *
     * @param date
     * @return
     * 根据传入的订单支付日期通过设置的超时时间获取微信入参需要的超时时间格式
     */
    public static String getWxPayTimeExpire(Date date){
        String timeExpire = ConfigurationWx.getInstance().getValue("time_expire");//配置文件中设置的超时时间（以分钟为单位）
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String wxTimeExpire = sdf.format(new Date(date.getTime()+Long.parseLong(timeExpire)* 60 * 1000));
        return wxTimeExpire;
    }

    /**
     * 获取微信支付支付类型(APP)
     * @return
     */
    public static String getWxPayTradeType(){return ConfigurationWx.getInstance().getValue("trade_type");}

    /**
     * 将微信请求的参数转换为xml
     * @param params
     * @return
     */
    public static String getXmlInfo(Map<String,String> params) throws UnsupportedEncodingException {
        StringBuffer bf = new StringBuffer();
        bf.append("<xml>");
        bf.append("<appid>");
        bf.append(params.get("appid"));
        bf.append("</appid>");
        bf.append("<mch_id>");
        bf.append(params.get("mch_id"));
        bf.append("</mch_id>");
        bf.append("<nonce_str>");
        bf.append(params.get("nonce_str"));
        bf.append("</nonce_str>");
        bf.append("<sign>");
        bf.append(params.get("sign"));
        bf.append("</sign>");
        bf.append("<body>");
        bf.append(params.get("body"));
        bf.append("</body>");
        bf.append("<out_trade_no>");
        bf.append(params.get("out_trade_no"));
        bf.append("</out_trade_no>");
        bf.append("<total_fee>");
        bf.append(params.get("total_fee"));
        bf.append("</total_fee>");
        bf.append("<spbill_create_ip>");
        bf.append(params.get("spbill_create_ip"));
        bf.append("</spbill_create_ip>");
        bf.append("<time_start>");
        bf.append(params.get("time_start"));
        bf.append("</time_start>");
        bf.append("<time_expire>");
        bf.append(params.get("time_expire"));
        bf.append("</time_expire>");
        bf.append("<notify_url>");
        bf.append(params.get("notify_url"));
        bf.append("</notify_url>");
        bf.append("<trade_type>");
        bf.append(params.get("trade_type"));
        bf.append("</trade_type>");
        bf.append("</xml>");
        String bfStr = bf.toString();
        String sb1 = new String(bfStr.getBytes("UTF-8"), "ISO8859-1");
        return sb1;
    }

    /**
     * @description 构建微信单个订单查询接口xml
     * @param params
     * @return
     * @author WangLiMing 2017年7月20日13:11:10
     */
    public static String  getQueryXmlInfo(Map<String,String> params){
        StringBuffer sb = new StringBuffer();
        sb.append("<xml>");
        sb.append("<appid>");
        sb.append(params.get("appid"));
        sb.append("</appid>");
        sb.append("<mch_id>");
        sb.append(params.get("mch_id"));
        sb.append("</mch_id>");
        sb.append("<nonce_str>");
        sb.append(params.get("nonce_str"));
        sb.append("</nonce_str>");
        sb.append("<transaction_id>");
        sb.append(params.get("transaction_id"));
        sb.append("</transaction_id>");
        sb.append("<sign>");
        sb.append(params.get("sign"));
        sb.append("</sign>");
        sb.append("</xml>");
        return sb.toString();
    }
    /**
     * 接到异步通知后返回给微信结果
     * @param return_code
     * @param return_msg
     * @return
     */
    public static String backWeiXin(String return_code,String return_msg){
        StringBuffer bf = new StringBuffer();
        bf.append("<xml>");
        bf.append("<return_code><![CDATA[");
        bf.append(return_code);
        bf.append("]]></return_code>");
        bf.append("<return_msg><![CDATA[");
        bf.append(return_msg);
        bf.append("]]></return_msg>");
        bf.append("</xml>");
        return bf.toString();
    }
    /**
     * 微信支付签名算法sign
     * @param characterEncoding
     * @param parameters
     * @return
     */
    public static String createSign(SortedMap<String,String> parameters, String characterEncoding)throws Exception{
        StringBuffer sb = new StringBuffer();
        Set es = parameters.entrySet();//所有参与传参的参数按照accsii排序（升序）
        Iterator it = es.iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            String key = (String)entry.getKey();
            Object value = entry.getValue();
            if(null != value && !"".equals(value)
                    && !"sign".equals(key) && !"key".equals(key)) {
                sb.append(key + "=" + value + "&");
            }
        }
        sb.append("key="+getWxPayKeyForApp());
        String sign = WXPayUtil.MD5(sb.toString());
        return sign;
    }
    /**
     * 创建md5摘要,规则是:按参数名称a-z排序,遇到空值的参数不参加签名。
     */
    public static String createSignByWX (SortedMap<String, String> packageParams,String partnerkey) {
        StringBuffer sb = new StringBuffer();
        Set es = packageParams.entrySet();
        Iterator it = es.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            String v = (String) entry.getValue();
            if (null != v && !"".equals(v) && !"sign".equals(k) && !"key".equals(k)) {
                sb.append(k + "=" + v + "&");
            }
        }
        sb.append("key=" + partnerkey);
//         System.out.println("md5 sb:" + sb+"key="+this.getKey());
        String sign = MD5Util.MD5Encode(sb.toString(), "UTF-8").toUpperCase();
         System.out.println("packge签名:" + sign +"key:"+sb.toString());
        return sign;

    }

    public static InputStream StringInputstream(String str) {
        return new ByteArrayInputStream(str.getBytes());
    }

    /**
     * 方法名称: parse<br>
     * 描述：微信xml解析
     * 作者: syr
     * 修改日期：2016年10月9日上午9:18:47
     *
     * @param protocolXML
     */
    public static Map<String, Object> parseXML(String protocolXML) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document doc = builder
                    .parse(new InputSource(new StringReader(protocolXML)));

            org.w3c.dom.Element root = doc.getDocumentElement();
            NodeList books = root.getChildNodes();

            if (books != null) {
                for (int i = 0; i < books.getLength(); i++) {
                    Node book = books.item(i);
                    map.put(book.getNodeName(), book.getFirstChild().getNodeValue());
                   /* System.out.println("节点=" + book.getNodeName() + "\ttext="
                             + book.getFirstChild().getNodeValue()); */
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
