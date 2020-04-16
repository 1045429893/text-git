package com.hd.common.payment;

import java.util.ResourceBundle;

/**
 * Created by WangLiMing on 2017/6/29.
 */
public class ConfigurationAli {
    private static Object lock = new Object();
    private static ConfigurationAli config = null;
    private static ResourceBundle rb = null;
    private static final String CONFIG_FILE = "aliPayResource";

    private ConfigurationAli() {
        rb = ResourceBundle.getBundle(CONFIG_FILE);
    }

    public static ConfigurationAli getInstance() {
        synchronized (lock) {
            if (null == config) {
                config = new ConfigurationAli();
            }
        }
        return (config);
    }

    public String getValue(String key) {
        return (rb.getString(key)) == null ? "" : (rb.getString(key));
    }
}
