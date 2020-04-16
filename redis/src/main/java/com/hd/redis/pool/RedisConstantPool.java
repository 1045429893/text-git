package com.hd.redis.pool;

/**
 * Created by Administrator on 2017/6/6.
 */
public class RedisConstantPool {
    public static final int SECOND_10 = 10;
    public static final int SECOND_30 = 30;
    public static final int MINUTE = 60;
    public static final int HOUR = 60*60;
    public static final int DAY = 60*60*24;
    public static final int MOUTH = 60*60*24*30;
    public static final int YEAR = 60*60*24*30*12;
    public static final int SECOND_600 = 60*10;
    public static final int SECOND_1200 = 60*20;
    //最后一个：后面接 page
    public static final String LIVE_GET_HEART = "LIVE:GET_HEART:";
    public static final String LIVE_GET_HEART_COMMENT = "LIVE:GET_HEART_COMMENT:";

    public static final String LIVE_BACK_ARTICLE_COMMENT = "LIVE:BACK_ARTICLE_COMMENT:";

    //第三个参数是topicId 第四个参数是页数
    public static final String LIVE_BACK_ARTICLE = "LIVE:BACK_ARTICLE:";

    public static final String LIVE_SOON_RUN_LIVE_ARTICLE = "LIVE:SOON_RUN_LIVE_ARTICLE";

    public static final String LIVE_TOPIC_LIST = "LIVE:TOPIC_LIST";

    public static final String LIVE_RUNNING_ARTICLE = "LIVE:RUNNING_ARTICLE";

    public static final String LIVE_ON_HOME_BACK_ARTICLE = "LIVE:ON_HOME:BACK_ARTICLE";

    public static final String LIVE_ON_HOME_GET_HEART = "LIVE:ON_HOME:GET_HEART:";

    public static final String LIVE_CURRENT_TIME_LEVEL = "LIVE:CURRENT_TIME_LEVEL";

    public static final String LIVE_TOPIC_ID = "LIVE:TOPIC_ID:";

}
