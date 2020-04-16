package com.hd.common.payment;

import java.util.ResourceBundle;

/**
 * Created by WangLiMing on 2017/6/29.
 */
public class ConfigurationWx {
    private static Object lock = new Object();
    private static ConfigurationWx config = null;
    private static ResourceBundle rb = null;
    private static final String CONFIG_FILE = "wxPayResource";

    private ConfigurationWx() {
        rb = ResourceBundle.getBundle(CONFIG_FILE);
    }

    public static ConfigurationWx getInstance() {
        synchronized (lock) {
            if (null == config) {
                config = new ConfigurationWx();
            }
        }
        return (config);
    }

    public String getValue(String key) {
        return (rb.getString(key)) == null ? "" : (rb.getString(key));
    }
}
