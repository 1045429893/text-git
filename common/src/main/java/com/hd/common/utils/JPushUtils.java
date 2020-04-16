package com.hd.common.utils;


import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;

/**
 * Created by liujindong on 2017/6/23.
 */
public class JPushUtils {

    public static final String APPkey = "440e4d697a6e78f0a9a40a62";
    public static final String Secret = "15d659fa3a80801c6d648000";

    public static final String[] INCOMPLETE_PARAMETER = {String.valueOf(2), "请求参数不全"};


    public static final String[] SUCCESS = {String.valueOf(200), "成功"};


    public static final String[] FAIL_404 = {String.valueOf(404), "连接错误,应该稍后重试"};
    public static final String[] SERVER_ERROR = {String.valueOf(500), "系统异常"};

    public static Object[] pushPlatformAll(String message) {
        /** 
         * @Author 刘金东 
         * @Date 2017/6/23 下午8:30 
         * @params [] 
         * @return java.lang.Object[]
         * @Description 推送所有平台(安卓,IOS,WIN)
         */

        if (message == null || message.isEmpty() || "".equals(message)) {
            return ServiceRetCode.returnCode(INCOMPLETE_PARAMETER);
        }

        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())//推送到所有设备
                .setAudience(Audience.all())
                .setNotification(Notification.alert(message))
                .build();
        return ServiceRetCode.returnCode(JPushUtils.sendPush(payload));
    }

    public static Object[] pushPlatformAndroid(String message) {
        /** 
         * @Author 刘金东 
         * @Date 2017/6/23 下午8:30 
         * @params [] 
         * @return java.lang.Object[]
         * @Description 推送安卓平台
         */
        if (message == null || message.isEmpty() || "".equals(message)) {
            return ServiceRetCode.returnCode(INCOMPLETE_PARAMETER);
        }

        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.android())//推送到Android
                .setAudience(Audience.all())
                .setNotification(Notification.alert(message))
                .build();
        return ServiceRetCode.returnCode(JPushUtils.sendPush(payload));
    }

    public static Object[] pushPlatformIOS(String message) {
        /** 
         * @Author 刘金东 
         * @Date 2017/6/23 下午8:30 
         * @params [] 
         * @return java.lang.Object[]
         * @Description 推送IOS所有用户
         */
        if (message == null || message.isEmpty() || "".equals(message)) {
            return ServiceRetCode.returnCode(INCOMPLETE_PARAMETER);
        }

        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.ios())//推送到IOS
                .setAudience(Audience.all())
                .setNotification(Notification.alert(message))
                .build();
        return ServiceRetCode.returnCode(JPushUtils.sendPush(payload));
    }

    public static Object[] pushByRegistrationId(String message, String... registrationIds) {
        /** 
         * @Author 刘金东 
         * @Date 2017/6/24 上午10:18 
         * @params [message 消息, registrationIds 用户ID] 
         * @return java.lang.Object[]
         * @Description 根据RegistrationId进行推送,范围:所有平台
         */
        if (message == null || message.isEmpty() || "".equals(message) || registrationIds == null || registrationIds.length == 0) {
            return ServiceRetCode.returnCode(INCOMPLETE_PARAMETER);
        }

        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())//推送到所有设备
                .setAudience(Audience.registrationId(registrationIds))//一个或一组用户
                .setNotification(Notification.alert(message))
                .build();
        return ServiceRetCode.returnCode(JPushUtils.sendPush(payload));
    }

    public static Object[] pushByAliasId(String message, String... aliasIds) {
        /** 
         * @Author 刘金东 
         * @Date 2017/6/24 上午10:18 
         * @params [message 消息, registrationIds 用户ID] 
         * @return java.lang.Object[]
         * @Description 根据RegistrationId进行推送,范围:所有平台
         */
        if (message == null || message.isEmpty() || "".equals(message) || aliasIds == null || aliasIds.length == 0) {
            return ServiceRetCode.returnCode(INCOMPLETE_PARAMETER);
        }

        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())//推送到所有设备
                .setAudience(Audience.alias(aliasIds))//一个或一组用户
                .setNotification(Notification.alert(message))
                .build();
        return ServiceRetCode.returnCode(JPushUtils.sendPush(payload));
    }


    public static Object[] pushByTag(String message, String... tag) {
        /** 
         * @Author 刘金东 
         * @Date 2017/6/24 上午10:18 
         * @params [message 消息, tag 标签] 
         * @return java.lang.Object[]
         * @Description 根据tag标签推送,范围:所有平台
         */
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())//推送到所有设备
                .setAudience(Audience.tag(tag))//一个或一组用户
                .setNotification(Notification.alert(message))
                .build();
        return ServiceRetCode.returnCode(JPushUtils.sendPush(payload));
    }


    private static Object[] sendPush(PushPayload payload) {
        /** 
         * @Author 刘金东 
         * @Date 2017/6/23 下午6:06 
         * @params [payload]  推送载体(内容)
         * @return java.lang.Object[]
         * @Description 调用极光推送
         */
        try {
            JPushClient jpushClient = new JPushClient(Secret, APPkey);
            System.out.println("开始调用极光服务jpushClient.sendPush");
            PushResult result = jpushClient.sendPush(payload);
            System.out.println("请求成功:Got result - " + result.msg_id + ";" + result.sendno);
            String[] returnMessage = {result.sendno + "", result.msg_id + ""};
            return ServiceRetCode.returnCode(returnMessage);
        } catch (APIConnectionException e) {
            System.out.println("连接错误,应该稍后重试");
            e.printStackTrace();
            return ServiceRetCode.returnCode(FAIL_404);
        } catch (APIRequestException e) {
            String jPushMessage = "Error Code:[" + e.getErrorCode() + "],Error Message: [" + e.getErrorMessage() + "]";
            System.out.println(e.getStatus() + "----" + jPushMessage);
            String[] returnMessage = {e.getStatus() + "", jPushMessage};
            return ServiceRetCode.returnCode(returnMessage);
        }

    }
}
