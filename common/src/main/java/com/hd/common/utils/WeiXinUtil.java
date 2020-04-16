package com.hd.common.utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hd.common.log.hdLog;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.UUID;


/**
 * 描述：微信工具类<br>
 * 作者：lxj <br>
 * 修改日期：2016年9月14日上午9:03:38 <br>
 * E-mail:  <br>
 */
public class WeiXinUtil {
	private static final String APP_ID="wxf2c7ef7b7e52f293";
	private static final String SECRET="f5848823b131989f3abb60827416f364";

	//公众号返回的域名
	private static final String sendAccessTonkenUrlSignUp ="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+APP_ID+"&secret="+SECRET;

	//获取用户微信卡券
	private static String wxUserCard="https://api.weixin.qq.com/card/user/getcardlist?access_token=";
	//获取优惠券二维码
	private static String wxCardQrCodeUrl="https://api.weixin.qq.com/card/qrcode/create?access_token=";
	//code解码
	private static String wxCardCode="https://api.weixin.qq.com/card/code/decrypt?access_token=";

	/**
	 * 方法名称: getToken<br>
	 * 描述：	获取token
	 * 作者: 	lxj
	 * 修改日期：2016年9月13日下午3:53:09
	 * @param appid
	 * @param secret
	 * @return String
	 */
	public static String getToken(String appid, String secret)
	    {
		 	String apiurl="https://api.weixin.qq.com/cgi-bin/token";
	        String turl = String.format("%s?grant_type=client_credential&appid=%s&secret=%s", apiurl,appid, secret);
	        HttpClient client = new DefaultHttpClient();
	        HttpGet get = new HttpGet(turl);
	        JsonParser jsonparer = new JsonParser();
	        String result = null;
	        try
	        {
	            HttpResponse res = client.execute(get);
	            String responseContent = null; 
	            HttpEntity entity = res.getEntity();
	            responseContent = EntityUtils.toString(entity, "UTF-8");
	            JsonObject json = jsonparer.parse(responseContent).getAsJsonObject();
	            if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK)
	            {
	                if (json.get("errcode") != null)
	                {
						hdLog.info("定时任务授权失败,错误信息："+json.toString());
	                }
	                else
	                {
	                    result = json.get("access_token").getAsString();
	                }
	            }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            client.getConnectionManager().shutdown();
	            return result;
	        }
	    }
	/**
	 * 方法名称: getTicket<br>
	 * 描述：获取网页（H5）中签名所用的ticket
	 * 作者:lxj
	 * 修改日期：2016年9月13日下午3:56:25
	 * @param access_token
	 * @return String
	 */
	public static String getTicket(String access_token,String type) {
        String Apiticket = null; 
        String url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token="+ access_token +"&type="+type;
        try {
            URL urlGet = new URL(url);
            HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
            http.setRequestMethod("GET");
            http.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            http.setDoOutput(true);
            http.setDoInput(true);
            System.setProperty("sun.net.client.defaultConnectTimeout", "30000");
            System.setProperty("sun.net.client.defaultReadTimeout", "30000");
            http.connect();
            InputStream is = http.getInputStream();
            int size = is.available();
            byte[] jsonBytes = new byte[size];
            is.read(jsonBytes);
            String message = new String(jsonBytes, "UTF-8");
            JsonParser jsonparer = new JsonParser();
            JsonObject json = jsonparer.parse(message).getAsJsonObject();
            Apiticket=json.get("ticket").getAsString();
            is.close();
        } catch (Exception e) {
                e.printStackTrace();
        }
         
        return Apiticket;
    }
	/**
	 * 方法名称: sign<br>
	 * 描述：微信网页应用签名
	 * 作者: lxj
	 * 修改日期：2016年9月13日下午4:12:24
	 * @param jsapi_ticket
	 * @param url
	 * @return Map
	 */
	public static Map<String, String> sign(String jsapi_ticket, String url,String api_ticket,String cardId,String openId) {
        Map<String, String> ret = new HashMap<String, String>();
		String nonce_str = create_nonce_str();
        String timestamp = create_timestamp();
        String string1;
        StringBuffer string2=new StringBuffer();
        String signature = "";
        String cardSign="";

        //按字典序排序（ASCII）注意这里的值是用key,value的形式
        string1 = "jsapi_ticket=" + jsapi_ticket +
                  "&noncestr=" + nonce_str +
                  "&timestamp=" + timestamp +
                  "&url=" + url;
        if(!StringUtils.isEmpty(api_ticket)){
			List<String> cardSignList=new ArrayList<>();
			if(!StringUtils.isEmpty(api_ticket)){
				cardSignList.add(api_ticket);
			}
			cardSignList.add(cardId);
			cardSignList.add(openId);
			cardSignList.add(timestamp);
			cardSignList.add(nonce_str);
			Collections.sort(cardSignList);
			for(String v:cardSignList){
				string2.append(v);
			}
		}

		try
        {	
        	//通过sha1编码
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(string1.getBytes("UTF-8"));
            signature = byteToHex(crypt.digest());
			if(!StringUtils.isEmpty(api_ticket)) {
				crypt.reset();
				crypt.update(string2.toString().getBytes("UTF-8"));
				cardSign = byteToHex(crypt.digest());
			}
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }

        ret.put("url", url);
        ret.put("jsapi_ticket", jsapi_ticket);
        ret.put("nonceStr", nonce_str);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);
		ret.put("app_id",APP_ID);
		if(!StringUtils.isEmpty(api_ticket)) {
			ret.put("cardSign", cardSign);
		}
        return ret;
    }
	/**
	 * 方法名称: byteToHex<br>
	 * 描述：微信签名使用到的sha1编码
	 * 作者: lxj
	 * 修改日期：2016年9月13日下午4:17:45
	 * @param hash
	 * @return String
	 */
    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash)
        {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
    /**
     * 方法名称: create_nonce_str<br>
     * 描述：微信签名使用的随机码
     * 作者: lxj
     * 修改日期：2016年9月13日下午4:14:54
     * @return String
     */
    private static String create_nonce_str() {
        return UUID.randomUUID().toString();
    }
    /**
     * 方法名称: create_timestamp<br>
     * 描述：微信签名使用到的时间码
     * 作者: lxj
     * 修改日期：2016年9月13日下午4:15:46
     * @return String
     */
    private static String create_timestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }



	public static String post(String strURL, String params)throws IOException {
		try {
			URL url = new URL(strURL);// 创建连接
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(true);
			connection.setRequestMethod("POST"); // 设置请求方式
			connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
			connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
			connection.connect();
			connection.getOutputStream().write(params.getBytes("UTF-8"));
			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8"); // utf-8编码
			out.flush();
			out.close();
			// 读取响应
			int length = (int) connection.getContentLength();// 获取长度
			String mess = connection.getResponseMessage();
			InputStream is = connection.getInputStream();
			if (length != -1) {
				byte[] data = new byte[length];
				byte[] temp = new byte[512];
				int readLen = 0;
				int destPos = 0;
				while ((readLen = is.read(temp)) > 0) {
					System.arraycopy(temp, 0, data, destPos, readLen);
					destPos += readLen;
				}
				String result = new String(data, "UTF-8"); // utf-8编码
				hdLog.info("postResult:"+result);
				return result;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "error"; // 自定义错误信息
	}
	public static String sendSignUp() throws IOException {
		//获取accesstonken
		String accesstonkenResult =post(sendAccessTonkenUrlSignUp,"");
		JSONObject obj = JSONObject.fromObject(accesstonkenResult);
		String access_token = obj.get("access_token").toString();
		return access_token;
	}
	public static JSONArray getIsUserCard(String accessToken,String openId,String cardId) throws IOException {
    	/**
    	 *@Author 田伟勋
    	 *@Date 2018/12/27 11:09
    	 *@Description  是否已领会员卡
    	 *@params [accessToken, openId, cardId]
    	 *@return boolean
    	*/
		//获取accesstonken
        boolean isHaveCard=true;
		String wxCardResult =post(wxUserCard+accessToken,"{\"openid\":\""+openId+"\",\"card_id\":\""+cardId+"\"}");

		JSONObject obj = JSONObject.fromObject(wxCardResult);
        JSONArray cardList=obj.getJSONArray("card_list");
		return cardList;
	}
	public static String getWxCardQrCode(String accessToken,String openId,String cardId) throws IOException {
    	/**
    	 *@Author 田伟勋
    	 *@Date 2018/12/27 11:09
    	 *@Description  微信卡券二维码
    	 *@params [accessToken, openId, cardId]
    	 *@return java.lang.String
    	*/
		//获取accesstonken
		String wxCardResult =post(wxCardQrCodeUrl+accessToken,"{\"action_name\":\"QR_CARD\",\"action_info\":{\"card\":{\"openid\":\""+openId+"\",\"card_id\":\""+cardId+"\"}}}");

		JSONObject obj = JSONObject.fromObject(wxCardResult);
		String ticket=obj.getString("show_qrcode_url");
		return ticket;
	}
	/**
	 * post请求（用于请求json格式的参数,返回json）
	 * @param url
	 * @param json
	 * @return json
	 */
	public static JSONObject doPost(String url, JSONObject json){
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);// 创建httpPost
		httpPost.setHeader("Accept", "application/json");
		httpPost.setHeader("Content-Type", "application/json");
		JSONObject response = null ;
		CloseableHttpResponse res = null;
		try {
			StringEntity s = new StringEntity(json.toString());
			s.setContentEncoding("UTF-8");
			s.setContentType("application/json");//发送json数据需要设置contentType
			httpPost.setEntity(s);
			res = httpclient.execute(httpPost);
			StatusLine status = res.getStatusLine();
			int state = status.getStatusCode();
			if(state == HttpStatus.SC_OK){
				String result = EntityUtils.toString(res.getEntity());// 返回json格式：
				response = JSONObject.fromObject(result);
				hdLog.info("doPost:"+response.toString());
				return response;
			}else{
				System.out.println("请求返回:"+state+"("+url+")");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		finally {
			if (res != null) {
				try {
					res.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static JSONObject getWxPaySign(String openId, String orderNo, String couponTitle,String amount,String pct,String url,String callBackUrl) throws Exception {
		/**
		 *@Author 田伟勋
		 *@Date 2018/12/27 11:09
		 *@Description  获取微信支付签名
		 *@params [accessToken, openId, cardId]
		 *@return java.lang.String
		 */
		//获取accesstonken

		InetAddress localhost = InetAddress.getLocalHost();
		JSONObject param=new JSONObject();
		if(!StringUtils.isEmpty(openId)){
			param.put("openId", openId);
		}

		param.put("amount",amount);
		param.put("orderNo",orderNo);
		param.put("paymentId",pct);
		param.put("spbillCreateIp",localhost.getHostAddress());
		param.put("body", new String(couponTitle.getBytes("UTF-8"),"ISO-8859-1"));
		param.put("orderProjectAddress", callBackUrl);
		JSONObject obj = doPost(url,param);
		JSONObject paymentVo=obj.getJSONObject("paymentVo");
		return paymentVo;
	}
	public static Map<String, String> getWxCardSign(String api_ticket,String cardId,String openId) {
		Map<String, String> ret = new HashMap<String, String>();
		String nonce_str = create_nonce_str();
		String timestamp = create_timestamp();
		StringBuffer string2=new StringBuffer();
		String signature = "";
		List<String> cardSignList=new ArrayList<>();
		if(!StringUtils.isEmpty(api_ticket)){
			cardSignList.add(api_ticket);
		}
		if(!StringUtils.isEmpty(openId)){
			cardSignList.add(openId);
		}
		cardSignList.add(cardId);
		cardSignList.add(timestamp);
		cardSignList.add(nonce_str);
		Collections.sort(cardSignList);
		for(String v:cardSignList){
			string2.append(v);
		}

		System.out.println(api_ticket+"---"+timestamp+"---"+nonce_str+"---"+cardId+"---"+openId);
		try
		{
			//通过sha1编码
			MessageDigest crypt = MessageDigest.getInstance("SHA-1");
			crypt.reset();
			crypt.update(string2.toString().getBytes("UTF-8"));
			signature = byteToHex(crypt.digest());

		}
		catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}

		ret.put("nonceStr", nonce_str);
		ret.put("timestamp", timestamp);
		ret.put("signature", signature);
		return ret;
	}
	public static String getWxCardCode(String accessToken,String cardCode) throws IOException {
		/**
		 *@Author 田伟勋
		 *@Date 2018/12/27 11:09
		 *@Description 解码
		 *@params [accessToken, openId, cardId]
		 *@return java.lang.String
		 */
		//获取accesstonken
		String wxCardResult =post(wxCardCode+accessToken,"{\"encrypt_code\":\""+cardCode+"\"}");

		JSONObject obj = JSONObject.fromObject(wxCardResult);
		String code=obj.getString("code");
		return code;
	}
}
