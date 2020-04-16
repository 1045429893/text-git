package com.hd.common.utils;

import io.netty.util.internal.StringUtil;

/**
 * @Author 田伟勋
 * @Date 创建：9:032017/9/29
 * @Description:生成订单号
 */
public class MallOrderNumberUtil {

    public static String getOrderNumber(String payUserId){
        if(StringUtil.isNullOrEmpty(payUserId)){
            return null;
        }
        String orderNumber="MALL"+ TimeUtils.getNowTimeStamp();
        int len=8-payUserId.length();
        for(int i=0;i<len;i++){
            orderNumber+="0";
        }
        orderNumber+=payUserId;
        return orderNumber;
    }
}
