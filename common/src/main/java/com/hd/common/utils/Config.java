package com.hd.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hd.common.log.hdLog;

/**
 * 获取当前项目的配置信息
 * 
 */
public class Config {

	/**
	 * 方法名称: getProperties<br>
	 * 描述：获取配置文件wxConfig中的配置 作者: lxj 修改日期：2016年9月14日上午9:01:11
	 * 
	 * @param key
	 * @param configName 可以是名字，和路径，以/分开
	 * @return String
	 */
	public static String getProperties(String v,String configName) {

		Config config = new Config();
		Properties properties = config.loadProperty(configName);
		return properties.get(v).toString();
	}

	/**
	 * 通过名称读取配置文件
	 * 
	 * @param configName
	 * @return
	 */
	public Properties loadProperty(String configName) {
		Properties prop = new Properties();
		try {
			InputStream is = this.getClass().getResourceAsStream(
					"/" + configName + ".properties");
			prop.load(is);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}

}