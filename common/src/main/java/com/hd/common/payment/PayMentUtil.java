package com.hd.common.payment;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.github.wxpay.sdk.WXPayUtil;
import com.hd.common.log.hdLog;


import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by WangLiMing on 2017/7/4.
 */
public class PayMentUtil {

    /**
     *
     * @param orderNo
     * @param totalCommodityAmount
     * @param onlinePayType
     * @return
     * @throws Exception
     * @author WangLiMing
     * @date 2017年7月4日10:16:11
     */
    public static Map signStr(String orderNo, Double totalCommodityAmount, Date payTime, String onlinePayType)throws Exception {
        /**
         * 组装支付参数生成支付签名
         */

        if(AliPayUtil.AliPay.equals(onlinePayType)){//支付宝支付
            Map map = new HashMap();
            //公共参数
            String appId = AliPayUtil.getAliPayAppId();//获取APP_ID
            String format = AliPayUtil.getAliPayFormat();//获取支持格式
            String charset = AliPayUtil. getCharset();//获取编码格式
            String signType = AliPayUtil.getSignType();//获取签名方式
            String notifyUrl = AliPayUtil.getNotifyUrl();//异步通知地址
            //业务参数
            String subject =orderNo;//支付主题描述
            String out_trade_no = orderNo;//订单号
            String timeout_express = AliPayUtil.getTimeOutExpress();//超时时间
            String total_amount = totalCommodityAmount+"";//支付金额
            String seller_id ="";//收款支付宝用户ID。 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
            String product_code = AliPayUtil.getAlPayProductCode();//销售产品码
            String private_key = AliPayUtil.getAliPayPrivateKey();//私钥
            String public_key = AliPayUtil.getAliPayPublicKey();
            AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",appId,private_key,format,charset,public_key,signType);
            AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
            AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
            model.setSubject(subject);
            model.setOutTradeNo(out_trade_no);
            model.setTimeoutExpress(timeout_express);
            model.setTotalAmount(total_amount);
            model.setProductCode(product_code);
            model.setSellerId(seller_id);
            request.setBizModel(model);
            request.setNotifyUrl(notifyUrl);
            AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
            String preSignStr = response.getBody();
            map.put("preSignStr",preSignStr);
            return map;
        }else{//微信支付
            Map map = new HashMap();
            //组装预支付订单参数
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            String appId = WxPayUtil.getWxPayAppIdForApp(); //app应用Id
            String mch_id = WxPayUtil.getWxPayMchIdForApp();//微信支付分配的商户号
            String body = "如e商城商品";//商品描述
            String out_trade_no = orderNo; //订单号
            String charset = WxPayUtil.getWxPayCharset();//获取编码格式
            BigDecimal amount = new BigDecimal(totalCommodityAmount+"").multiply(new BigDecimal("100"));
            String total_fee = amount.intValue()+"";//支付金额 将元转换为分
            String nonce_str = WxPayUtil.getWxPayNonceStr();//随机字符串
            String notify_url = WxPayUtil.getWxPayNotifyUrl();//微信异步回调通知地址
            String spbill_create_ip = WxPayUtil.getWxPaySpbillCreateIp();//用户端实际IP
            String time_expire = WxPayUtil.getWxPayTimeExpire(payTime);//这里需要根据订单支付时间动态设置支付失效时间
            String trade_type = WxPayUtil.getWxPayTradeType();//支付类型（APP,公众号等）
//            String trade_type = "JSAPI";//支付类型（APP,公众号等）
            String key = WxPayUtil.getWxPayKeyForApp();//获取key
            String time_start = format.format(payTime);//交易开始时间
            SortedMap<String,String> parameters = new TreeMap<>();
            parameters.put("appid", appId);
            parameters.put("mch_id", mch_id);
            parameters.put("nonce_str", nonce_str);
            parameters.put("body", body);
            parameters.put("out_trade_no", out_trade_no);
            parameters.put("time_start",time_start);
            parameters.put("time_expire", time_expire);
            parameters.put("notify_url", notify_url);
            parameters.put("trade_type", trade_type);
            parameters.put("spbill_create_ip", spbill_create_ip);
            parameters.put("total_fee",total_fee);
            String sign = WxPayUtil.createSign(parameters,charset);
            parameters.put("sign",sign);
            //构建支付xml
            String xmlInfo = WxPayUtil.getXmlInfo(parameters);
            String wxGateWay = WxPayUtil.getWxPayGateWay();//获取微信预支付订单交易接口
            Map<String,String> wxPost = WxPayUtil.getWxPost(wxGateWay,xmlInfo);//获取预支付订单
            String prepay_id = wxPost.get("prepay_id");
            SortedMap<String,String> finalpackage = new TreeMap<>();
            String appId2 = WxPayUtil.getWxPayAppIdForApp();
            String timestamp = WxPayUtil.getTimeStamp();
            String noncestr2 = WxPayUtil.getWxPayNonceStr();
            String partnerid = WxPayUtil.getWxPayMchId();
            String packages = "Sign=WXPay";
            finalpackage.put("appid",appId2);
            finalpackage.put("partnerid",partnerid);
            finalpackage.put("prepayid",prepay_id);
            finalpackage.put("timestamp",timestamp);
            finalpackage.put("noncestr",noncestr2);
            finalpackage.put("package",packages);
            String preSignStr = WxPayUtil.createSign(finalpackage,charset);
            map.put("appId",appId2);
            map.put("partnerId",partnerid);
            map.put("prepayId",prepay_id);
            map.put("package",packages);
            map.put("nonceStr",noncestr2);
            map.put("timeStamp",timestamp);
            map.put("preSignStr",preSignStr);
            //
            return map;
        }
    }
}
