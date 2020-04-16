package com.hd.redis.util;

import com.hd.redis.data.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;


public class RedisUtil {
    public static RedisStringDao redis;
    public static final String redisIp = RedisUtil.getProperties("redisIp");
    public static final String password = RedisUtil.getProperties("redispw");

    public static final RedisZsetDao redisZsetDao = new RedisZsetDao(redisIp, password);
    private static final RedisObjectDao redisObjectDao=new RedisObjectDao(redisIp,password);
    private static final RedisStringDao redisStringDao = new RedisStringDao(redisIp, password);
    private static final RedisHashDao redisHashDao=new RedisHashDao(redisIp, password);
    private static final RedisStringDao assTokenRedisStringDao = new RedisStringDao(RedisUtil.getProperties("accessTokenRedisIp"), RedisUtil.getProperties("accessTokenPassword"));

    public static RedisStringDao getRedisStringDao(){
        return redisStringDao;
    }
    public static RedisObjectDao getRedisObjectDao(){
        return redisObjectDao;
    }
    public static RedisStringDao getAccessTokenRedisStringDao(){
        return assTokenRedisStringDao;
    }

    public static RedisZsetDao getRedisZsetDao(){
        return redisZsetDao;
    }

    public static RedisHashDao getRedisHashDao(){return redisHashDao;}
    public static String getProperties(String v) {

        RedisUtil hdutil = new RedisUtil();
        Properties properties = hdutil.loadProperty();
        return properties.getProperty(v);
    }

    public Properties loadProperty() {
        Properties prop = new Properties();
        try {
            InputStream is;
            if("product".equals(getSystemEnv("currentEnvironmen"))){
                is = this.getClass().getResourceAsStream("/redisConfig.properties");
            }else{
                 is= this.getClass().getResourceAsStream("/redisDevConfig.properties");
            }
            prop.load(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;

    }
    public static String getSystemEnv(String findKey){
        Map<String, String> map = System.getenv();
        for (Iterator<String> itr = map.keySet().iterator(); itr.hasNext(); ) {
            String key = itr.next();
            if (findKey.equals(key)) {
                return map.get(key);
            }
        }
        return null;
    }
}
