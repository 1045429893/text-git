package com.hd.common.payment;

import com.alipay.api.internal.util.WebUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Created by WangLiMing on 2017/6/28.
 */
public class AliPayUtil {

    public static final String AliPay ="1";

    /**
     * 支付宝提供给开发者的应用ID
     */
    public static String getAliPayAppId(){return ConfigurationAli.getInstance().getValue("app_id");}
    /**
     * 支付宝提供给商户的服务接入网关URL(接口名称)
     */
    public static String getAliPayGateway() {
        return ConfigurationAli.getInstance().getValue("gateway");
    }

    /**
     *支付宝支持的格式(仅支持JSON)
     */
    public static String getAliPayFormat(){return ConfigurationAli.getInstance().getValue("format");}
    /**
     * 编码格式
     */
    public static String getCharset() {
        return ConfigurationAli.getInstance().getValue("charset");
    }

    /**
     * 签名方式
     */
    public static String getSignType() {
        return ConfigurationAli.getInstance().getValue("sign_type");
    }

    /**
     *获取调用接口版本号
     */
    public static String getAliPayVersion(){
        return ConfigurationAli.getInstance().getValue("version");
    }

    /**
     * 支付类型
     */
    public static String getPaymentType() {
        return ConfigurationAli.getInstance().getValue("payment_type");
    }

    /**
     * 支付主题
     */
    public static String getSubject() {
        return ConfigurationAli.getInstance().getValue("subject");
    }

    /**
     * 超时时间
     */
    public static String getTimeOutExpress() {
        return ConfigurationAli.getInstance().getValue("timeout_express");
    }

    /**
     * 通知url
     */
    public static String getNotifyUrl() {
        return ConfigurationAli.getInstance().getValue("notify_url");
    }

    /**
     *
     * 获取销售产品码
     */
    public static String getAlPayProductCode(){return ConfigurationAli.getInstance().getValue("product_code");}

    /**
     *获取私钥
     */
    public static String getAliPayPrivateKey(){return ConfigurationAli.getInstance().getValue("private_key"); }

    /**
     * 获取公钥
     */
    public static String getAliPayPublicKey(){return ConfigurationAli.getInstance().getValue("public_key");}

    /**
     * 把所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     *
     * @param params 需要排序并参与字符拼接的参数组
     * @return 拼接后字符串
     */
    public static String createLinkString(Map<String, String> params, boolean isSort) {

        List<String> keys = new ArrayList<String>(params.keySet());
        if (isSort) {
            Collections.sort(keys);
        }
        String prestr = "";

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);

            if (i == keys.size() - 1) {// 拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + WebUtils.encode(value,"utf-8");
            } else {
                prestr = prestr + key + "=" + WebUtils.encode(value,"utf-8") + "&";
            }
        }

        return prestr;
    }
}
