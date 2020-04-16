package com.hd.util;

import org.springframework.web.context.ContextLoader;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * @Author 马兴亮
 * @Date 2017/8/11 16:25
 * @Description
 */
public class SystemListener extends ContextLoader implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String currentEnvironmen = "dev";
        Map<String, String> map = System.getenv();
        for (Iterator<String> itr = map.keySet().iterator(); itr.hasNext(); ) {
            String key = itr.next();
            System.out.println("key="+key);
            if ("currentEnvironmen".equals(key)) {
                currentEnvironmen = map.get(key);
            }
        }
        if ("product".equals(currentEnvironmen)) {
            System.setProperty("current_application_context", "classpath:productMysql.properties");
        } else {
            System.setProperty("current_application_context", "classpath:developMysql.properties");
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
