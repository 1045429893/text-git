package com.hd.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import sun.misc.BASE64Decoder;

/**
 * 描述：发送手机短信<br>
 * 作者：lxj <br>
 * 修改日期：2016年9月21日下午3:35:36 <br>
 * E-mail: <br>
 */
public class PhoneMessage {
	/**
	 * 方法名称: sendMessage2<br>
	 * 描述：短信发送接口
	 * 作者: lxj
	 * 修改日期：2016年9月22日上午10:40:26
	 * @param corpId
	 * @param password
	 * @param sender
	 * @param content
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static String sendMessage(String corpId, String password, String sender, String content){
		String str="";
		String url = "http://www.e-fast.cn/ws/Send.aspx";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		List formparams = new ArrayList<>();
		formparams.add(new BasicNameValuePair("CorpID", corpId));
		formparams.add(new BasicNameValuePair("Pwd", password));
		formparams.add(new BasicNameValuePair("Mobile", sender));
		formparams.add(new BasicNameValuePair("Content", content));
		UrlEncodedFormEntity uefEntity;
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
			post.setEntity(uefEntity);
			CloseableHttpResponse response = httpClient.execute(post);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				String stv = EntityUtils.toString(entity, "UTF-8");			
				if(stv!=""||stv!=null){
					if("0".equals(stv)){str="发送成功";}
					if("-1".equals(stv)){str="账号未注册";}
					if("–2".equals(stv)){str="其他错误";}
					if("-3".equals(stv)){str="密码错误";}
					if("-4".equals(stv)){str="手机号格式不对";}
					if("-5".equals(stv)){str="余额不足";}
					if("-6".equals(stv)){str="定时发送时间不是有效的时间格式";}
					if("-7".equals(stv)){str="短信未加签名（接口检查签名时有效）";}
					if("-8".equals(stv)){str="短信内容字数大于500或小于1（短信字数应在1-500之间）";}
					if("-100".equals(stv)){str="限制此IP访问";}
					if("-101".equals(stv)){str="调用接口速度太快";}
				}else{
					str="接口调用失败";
				}
			}
			
			response.close();
		} catch (Exception e) {
			str="接口程序调用异常";
		}
		return str;
	}

	public static void main(String[] args) {
		// 18501270729 18600193359
				String str=PhoneMessage.sendMessage("HFYX00093", "sun060810", "18745025504", "内容112,汉字测试");
				System.out.println(str);

	

	}

}
