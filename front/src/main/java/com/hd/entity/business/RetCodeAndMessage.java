package com.hd.entity.business;

import net.sf.json.JSONObject;

/**
 * Created by Administrator on 2017/6/5.
 */
public class RetCodeAndMessage {
    public static final String[] SERVER_ERROR = {String.valueOf(500),"系统异常"};
    public static final int BASE = 0;
    public static final String[] SUCCESS = {String.valueOf(0),"成功"};
    public static final String[] SUCCESS_NEWUSER = {String.valueOf(2),"成功创建新用户"};

    public static final String[] FORMAT_ERROR = {String.valueOf(BASE + 1),"请求参数格式错误"};
    public static final String[] INCOMPLETE_PARAMETER = {String.valueOf(BASE + 2),"请求参数不全"};
    public static final String[] DATETIME_FORMAT_ERROR = {String.valueOf(BASE + 3),"时间格式错误"};
    public static final String[] FAIL = {String.valueOf(BASE + 4),"失败"};
    public static final String[] NET = {String.valueOf(BASE + 5),"网络问题，请重试"};

    public static final int USERINFO = 100000;
    public static final String[] USERINFO_NULL = {String.valueOf(USERINFO + 1),"请填写姓名和手机号码"};
    public static final String[] USERINFO_NULL_2 = {String.valueOf(USERINFO + 2),"请填写姓名、地址、手机、邮箱"};

    public static JSONObject getRetJson(Object[] objList,String responseKey){
        JSONObject json = new JSONObject();
        json.put("retcode", objList[0]);
        json.put("msg", objList[1]);
        if(objList.length>2){
            json.put(responseKey, objList[2]);
        }
        return json;
    }

    public static JSONObject getRetJson(Object[] objList){
        JSONObject json = new JSONObject();
        json.put("retcode", objList[0]);
        json.put("msg", objList[1]);
        return json;
    }

    public static JSONObject getRetJson(String retCode,String msg){
        JSONObject json = new JSONObject();
        json.put("retcode", retCode);
        json.put("msg", msg);
        return json;
    }

}


