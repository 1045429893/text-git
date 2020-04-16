package com.hd.entity.business;

import net.sf.json.JSONObject;

/**
 * Created by Administrator on 2017/6/5.
 */
public class RetCodeAndMessage {
    public static final String[] SERVER_ERROR = {String.valueOf(500),"系统异常"};
    public static final int BASE = 0;
    public static final String[] SUCCESS = {String.valueOf(0),"成功"};

    public static final String[] FORMAT_ERROR = {String.valueOf(BASE + 1),"请求参数格式错误"};
    public static final String[] INCOMPLETE_PARAMETER = {String.valueOf(BASE + 2),"请求参数不全"};
    public static final String[] DATETIME_FORMAT_ERROR = {String.valueOf(BASE + 3),"时间格式错误"};
    public static final String[] FAIL = {String.valueOf(BASE + 4),"失败"};
    public static final String[] NET = {String.valueOf(BASE + 5),"网络问题，请重试"};

    public static final int SYS_USER_INFO=10200;
    public static final String[] SYS_USER_NOT_EXIST={String.valueOf(SYS_USER_INFO+1),"用户不存在"};
    public static final String[] SYS_USER_ADD_FAIL={String.valueOf(SYS_USER_INFO+2),"添加用户失败"};
    public static final String[] SYS_USER_UPDATE_FAIL={String.valueOf(SYS_USER_INFO+3),"修改用户失败"};
    public static final String[] SYS_USER_BIND_ROLE_FAIL={String.valueOf(SYS_USER_INFO+4),"绑定角色失败"};
    public static final String[] SYS_USER_REPEATED={String.valueOf(SYS_USER_INFO+5),"用户名已存在"};
    public static final String[] USER_AUTHENTICATION_FAILED={String.valueOf(SYS_USER_INFO+6),"用户名或密码错误"};
    public static final String[] USER_STOP={String.valueOf(SYS_USER_INFO+7),"此用户已被停用"};
    public static final String[] USER_NO_AUTHORITY_INFO={String.valueOf(SYS_USER_INFO+8),"用户未绑定角色权限"};


    public static final int SYS_ROLE=10300;
    public static final String[] SYS_ROLE_NOT_EXIST={String.valueOf(SYS_ROLE+1),"角色不存在"};
    public static final String[] SYS_ROLE_ADD_FAIL={String.valueOf(SYS_ROLE+2),"添加角色失败"};
    public static final String[] SYS_ROLE_UPDATE_FAIL={String.valueOf(SYS_ROLE+3),"修改角色失败"};
    public static final String[] SYS_ROLE_BIND_AUTH_FAIL={String.valueOf(SYS_ROLE+4),"绑定权限失败"};
    public static final String[] SYS_ROLE_HAVING_EXIST_USER={String.valueOf(SYS_ROLE+5),"存在绑定的用户，不能删除"};
    public static final String[] SYS_ROLE_DELETE_FAIL={String.valueOf(SYS_ROLE+6),"删除角色失败"};
    public static final String[] SYS_ROLE_REPEATED={String.valueOf(SYS_ROLE+6),"角色名称已存在"};
    public static final int COMPANY_BASE=20100;
    public static final String[] COMPANY_BASE_NOT_EXIST={String.valueOf(COMPANY_BASE+1),"公司简介不存在"};
    public static final String[] COMPANY_UPDATE_FAIL={String.valueOf(COMPANY_BASE+2),"公司简介修改失败"};
    public static final int MLSD_BASE=20200;
    public static final String[] HOME_PAGE_NOT_EXIST={String.valueOf(MLSD_BASE+1),"首页信息不存在"};
    public static final String[] HOME_PAGE_UPDATE_FAIL={String.valueOf(MLSD_BASE+2),"首页信息修改失败"};
    public static final String[] BAND_CULTURE_NOT_EXIST={String.valueOf(MLSD_BASE+3),"品牌文化不存在"};
    public static final String[] BAND_CULTURE_UPDATE_FAIL={String.valueOf(MLSD_BASE+4),"品牌文化修改失败"};
    public static final String[] ITEM_ADVANTAGE_NOT_EXIST={String.valueOf(MLSD_BASE+5),"项目优势不存在"};
    public static final String[] ITEM_ADVANTAGE_UPDATE_FAIL={String.valueOf(MLSD_BASE+6),"项目优势修改失败"};
    public static final String[] JOIN_INVESTMENT_NOT_EXIST={String.valueOf(MLSD_BASE+5),"项目优势不存在"};
    public static final String[] JOIN_INVESTMENT_UPDATE_FAIL={String.valueOf(MLSD_BASE+6),"项目优势修改失败"};
    public static final String[] PRODUCT_PRESENTATION_NOT_EXIST={String.valueOf(MLSD_BASE+5),"项目优势不存在"};
    public static final String[] PRODUCT_PRESENTATION_UPDATE_FAIL={String.valueOf(MLSD_BASE+6),"项目优势修改失败"};
    public static final String[] STROE_DISPLAY_NOT_EXIST={String.valueOf(MLSD_BASE+5),"门店展示不存在"};
    public static final String[] STROE_DISPLAY_UPDATE_FAIL={String.valueOf(MLSD_BASE+6),"门店展示修改失败"};
    public static final String[] STRENGTH_NOT_EXIST={String.valueOf(MLSD_BASE+5),"门店展示不存在"};
    public static final String[] STRENGTH_UPDATE_FAIL={String.valueOf(MLSD_BASE+6),"门店展示修改失败"};
    public static final String[] CONTACT_US_NOT_EXIST={String.valueOf(MLSD_BASE+5),"门店展示不存在"};
    public static final String[] CONTACT_US_UPDATE_FAIL={String.valueOf(MLSD_BASE+6),"门店展示修改失败"};
    public static final String[] ONLINE_SERVICE_NOT_EXIST={String.valueOf(MLSD_BASE+5),"热线图片不存在"};
    public static final String[] ONLINE_SERVICE_UPDATE_FAIL={String.valueOf(MLSD_BASE+6),"热线图片修改失败"};
    public static JSONObject getRetJson(Object[] objList,String responseKey){
        JSONObject json = new JSONObject();
        json.put("code", objList[0]);
        json.put("msg", objList[1]);
        if(objList.length>2){
            json.put(responseKey, objList[2]);
        }
        return json;
    }

    public static JSONObject getRetJson(Object[] objList){
        JSONObject json = new JSONObject();
        json.put("code", objList[0]);
        json.put("msg", objList[1]);
        return json;
    }

    public static JSONObject getRetJson(String retCode,String msg){
        JSONObject json = new JSONObject();
        json.put("code", retCode);
        json.put("msg", msg);
        return json;
    }

}


