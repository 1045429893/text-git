package com.hd.common.log;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.config.AppenderRef;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.layout.PatternLayout;


/**
 * @Author 田伟勋
 * @Date 创建：10:212018/11/5
 * @Description:
 */
public class CustomLog {

    // 私有构造
    private CustomLog() {}

    private static Logger userLog = null;
    private static Logger commodityLog = null;

    public static Logger getUserLog() {
        /**
         *@Author 田伟勋
         *@Date 2018/11/6 15:59
         *@Description  获取日志
         *@params [logName, filePath]
         *@return org.apache.log4j.Logger
         */
        if(userLog == null){
            synchronized (CustomLog.class) {
                if (userLog == null) {
                    userLog= LogManager.getLogger("friend_front_log");
                }
            }
        }
        return userLog;
    }











}
