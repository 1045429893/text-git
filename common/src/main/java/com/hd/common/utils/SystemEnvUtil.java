package com.hd.common.utils;

import java.util.Iterator;
import java.util.Map;

/**
 * @Author 马兴亮
 * @Date 2017/10/11 10:41
 * @Description
 */
public class SystemEnvUtil {
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
