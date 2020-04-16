package com.hd.common.utils;

import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.apache.commons.lang.*;


public class RequestUtil {
    public static void paserReq(HttpServletRequest request, String requestBody) {
        try {
            // 将字节转换为字符
            if (!org.apache.commons.lang.StringUtils.isEmpty(requestBody)) {
                JSONObject params = JSONObject.fromObject(requestBody);
                Iterator iterator = params.keys();
                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    String value = params.getString(key);
                    request.setAttribute(filterString(key), filterString(value));
                }
            }
        } catch (Exception ignored) {
            // 解析失败的不做任何处理
        }
    }

    public static void paserReqHeader(HttpServletRequest request) throws Exception {
        try {
            String appHeaderStr = request.getHeader("appHeader");
            if (appHeaderStr != null && !"".equals(appHeaderStr)) {
                JSONObject params = JSONObject.fromObject(appHeaderStr);
                Iterator iterator = params.keys();
                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    String value = params.getString(key);
                    request.setAttribute(RequestUtil.filterString(key), RequestUtil.filterString(value));
                }
            }
        }catch (Exception e){

        }

    }


    public static String filterString(String value) {
        if (org.apache.commons.lang.StringUtils.isBlank(value)) {
            return value;
        }
        //因传递的是对象的序列化，值中的双引号未过滤
        String[] search = {"&", "\\(", "\\)", "<", ">", "'"};
        String[] replace = {"", "", "", "&gt", "&lt", "‘"};
        return org.apache.commons.lang.StringUtils.replaceEach(String.valueOf(value), search, replace);
    }

    public static String getRequestAttribute(HttpServletRequest request, String name) {
        return request.getAttribute(name) == null ? null : String.valueOf(request.getAttribute(name));
    }

    public static Integer getRequestAttributeInteger(HttpServletRequest request, String name) {
        if (request.getAttribute(name) == null) {
            return null;
        }
        return Integer.parseInt(String.valueOf(request.getAttribute(name)));
    }

    public static BigInteger getRequestAttributeBigInteger(HttpServletRequest request, String name) {
        if (request.getAttribute(name) == null || "".equals(request.getAttribute(name))) {
            return null;
        }
        return new BigInteger(String.valueOf(request.getAttribute(name)));
    }

    public static ArrayList getRequestAttributeList(HttpServletRequest request, String name) {
        if (request.getAttribute(name) == null || "".equals(request.getAttribute(name))) {
            return null;
        }
        Object list_str = request.getAttribute(name);
        if (list_str == null) {
            return null;
        } else {
            Binding binding = new Binding();
            GroovyShell shell = new GroovyShell(binding);
            return (ArrayList) shell.evaluate("return new groovy.json.JsonSlurper().parseText('" + list_str + "')");
        }
    }

    public static String getContextPath(HttpServletRequest request){
        String contextpath = request.getScheme() +"://" + request.getServerName() + ":" +request.getServerPort() +request.getContextPath();
        return contextpath;
    }


}
