package com.hd.common.utils;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author 马兴亮
 * @Date 2017/9/25 9:30
 * @Description
 */
public class APIHttpClient {


    // 接口地址
    private static final String pattern = "yyyy-MM-dd HH:mm:ss:SSS";
    private HttpClient httpClient = null;
    private HttpPost method = null;
    private long startTime = 0L;
    private long endTime = 0L;
    private int status = 0;


    public static String getUserCenterUrl(){
        return SystemEnvUtil.getSystemEnv("user_center_url");
    }

    public static String getMallMisUrl(){
        return SystemEnvUtil.getSystemEnv("mall_mis_url");
    }

    /**
     * 接口地址
     *
     * @param url
     */
    public APIHttpClient(String url) {
        httpClient = new DefaultHttpClient();
        method = new HttpPost(url);
    }

    /**
     * 调用 API
     *
     * @param parameters
     * @return
     */
    public String post(String parameters) {
        String body = null;
        System.out.println("parameters:" + parameters);

        if (method != null & parameters != null
                && !"".equals(parameters.trim())) {
            try {

                // 建立一个NameValuePair数组，用于存储欲传送的参数
                method.addHeader("Content-type","application/json; charset=utf-8");
                method.setHeader("Accept", "application/json");
                method.setEntity(new StringEntity(parameters, Charset.forName("UTF-8")));
                startTime = System.currentTimeMillis();

                HttpResponse response = httpClient.execute(method);

                endTime = System.currentTimeMillis();
                int statusCode = response.getStatusLine().getStatusCode();

                System.out.println("statusCode:" + statusCode);
                System.out.println("调用API 花费时间(单位：毫秒)：" + (endTime - startTime));
                if (statusCode != HttpStatus.SC_OK) {
                    System.out.println("Method failed:" + response.getStatusLine());
                    status = 1;
                }

                // Read the response body
                body = EntityUtils.toString(response.getEntity());

            } catch (IOException e) {
                // 网络错误
                status = 3;
            } finally {
                System.out.println("调用接口状态：" + status);
            }

        }
        return body;
    }

    /*public static void main(String[] args) {
        APIHttpClient ac = new APIHttpClient(apiURL);
        JsonArray arry = new JsonArray();
        JsonObject j = new JsonObject();
        j.addProperty("token", "中文");
        arry.add(j);
        System.out.println(ac.post(arry.toString()));
    }*/

    /**
     * 0.成功 1.执行方法失败 2.协议错误 3.网络错误
     *
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the startTime
     */
    public long getStartTime() {
        return startTime;
    }

    /**
     * @return the endTime
     */
    public long getEndTime() {
        return endTime;
    }
}

