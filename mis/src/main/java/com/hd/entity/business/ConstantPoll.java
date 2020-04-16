package com.hd.entity.business;


import io.netty.util.internal.StringUtil;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 李小军
 * @Date 2017/6/8 11:15
 * @Description 常量池
 */
public class ConstantPoll {
    /**
     * 删除
     */
    public static final String DELETE = "1";
    /**
     * 未删除
     */
    public static final String NO_DELETE = "0";

    /**
     * 启用
     */
    public static final String START = "0";
    public static final int START_INT = 0;
    public static final String START_SHOW = "启用";
    /**
     * 停用
     */
    public static final String STOP = "1";
    public static final int STOP_INT = 1;
    public static final String STOP_SHOW = "停用";

    /**
     * 开启
     **/
    public static final String OPEN = "0";
    public static final String OPEN_SHOW = "开启";
    /**
     * 关闭
     */
    public static final String CLOSE = "1";
    public static final String CLOSE_SHOW = "关闭";

    /**
     * 不在主页展示
     */
    public static final String NOT_ON_HOME = "0";
    /**
     * 在主页展示
     */
    public static final String ON_HOME = "1";
    /**
     * 系统角色
     **/
    public static final String SYS_ROLE = "0";
    public static final String SYS_ROLE_SHOW = "系统角色";

    /**
     * 普通管理员
     **/
    public static final String NOMAL_USER = "0";
    public static final String NOMAL_USER_SHOW = "普通管理员";
    /**
     * 超级管理员
     */
    public static final String SUP_USER = "1";
    public static final String SUP_USER_SHOW = "超级管理员";

    public static final String COMPANY_PROFILE_ID = "1";
    public static String getStartOrStopShow(String dbValue) {
        /**
         * @Author 马兴亮
         * @Date 2017/8/31 10:58
         * @params [dbValue]
         * @return java.lang.String
         * @Description 根据数据库状态 获取是否停用 或者启用
         */
        if (START.equals(dbValue)) {
            return START_SHOW;
        } else if (STOP.equals(dbValue)) {
            return STOP_SHOW;
        } else {
            return "";
        }
    }

    public static String getOpenOrCloseShow(String dbValue) {
        if (OPEN.equals(dbValue)) {
            return OPEN_SHOW;
        } else if (CLOSE.equals(dbValue)) {
            return CLOSE_SHOW;
        } else {
            return "";
        }
    }

    /**
     * @Author 田伟勋
     * @Date 2017/9/8 16:12
     * @Description 获取角色类型
     */
    public static Map<String, String> getRoleTypeList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put(SYS_ROLE, SYS_ROLE_SHOW);
//        map.put(SELLER_ROLE, SELLER_ROLE_SHOW);
        return map;
    }


    /**
     * 方法名称:
     * 描述： 获取角色
     * 作者: shangyuren
     * 修改日期： 2019/3/12 10:57
     *
     * @param
     */
    public static Map<String, String> getUserTypeList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put(NOMAL_USER, NOMAL_USER_SHOW);
        map.put(SUP_USER, SUP_USER_SHOW);
        return map;
    }

    /**
     * 留言阅读状态 0 ：未读； 1 ：已读
     **/
    public static final String IS_READER_ZERO= "0";
    public static final String IS_READER_ZERO_STR = "未读";
    public static final String IS_READER_ONE= "1";
    public static final String IS_READER_ONE_STR = "已读";
    public static String getIsReaderStr(String dbValue) {
        if (IS_READER_ZERO.equals(dbValue)) {
            return IS_READER_ZERO_STR;
        } else if (IS_READER_ONE.equals(dbValue)) {
            return IS_READER_ONE_STR;
        } else {
            return "";
        }
    }
    /**
     * 麻辣速递 默认数据库ID
     *
     **/
    public static final String MLSD_ID= "1";
}


