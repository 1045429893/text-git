/**
 * File Name:JsonUtils.java
 * @Description: 
 * Copyright 2013 China Life Insurance Company Ltd.
 * @author:liuJinDong
 * @version:v1.0
 * Createdate:2016年09月20日11:31:06
 */
package com.hd.common.utils;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
import net.sf.json.util.CycleDetectionStrategy;
import net.sf.json.util.JSONUtils;
import net.sf.json.util.PropertyFilter;

/**描述：json工具类<br>
 * 作者：liuJinDong <br>
 * 修改日期：2016年09月20日11:31:00 <br>
 */
public class HDJsonUtils {
	private static final Logger  logger = Logger.getLogger(HDJsonUtils.class);
	/**
	 * 方法名称: convertObject<br>
	 * 描述：把对象类型转换成json格式<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 * @return
	 */
	public static String convertObject(Object object){
		JSONObject json = JSONObject.fromObject(object);
		return json.toString();
	}
	

	/**
	 * 方法名称: convertObject<br>
	 * 描述：把对象类型转换成json格式<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 * @param object<br>
	 * @param jsonConfig<br>
	 * @return
	 */
	public static String convertObject(Object object,JsonConfig jsonConfig){
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT); 
		JSONObject json = JSONObject.fromObject(object,jsonConfig);
		return json.toString();
	}
	
	
	/**
	 * 方法名称: convertArray<br>
	 * 描述：把对象类型转换成数组json<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 * @param object<br>
	 * @return
	 */
	public static String convertArray(Object object){
		JSONArray jsonArray =  JSONArray.fromObject(object);
		return jsonArray.toString();
	}
	
	/**
	 * 方法名称: convertArray<br>
	 * 描述：把对象类型转换成数组json<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 * @param object<br>
	 * @param jsonConfig<br>
	 * @return
	 */
	public static String convertArray(Object object,JsonConfig jsonConfig){
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT); 
		JSONArray jsonArray =  JSONArray.fromObject(object,jsonConfig);
		return jsonArray.toString();
	}
	
	/**
	 * 方法名称: convertObjectIncludeDate<br>
	 * 描述：转换对象，包换日期格式<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 * @param object<br>
	 * @param dateFormat<br>
	 * @return
	 */
	public static String convertJsonIncludeDate(Object object,String dateFormat){
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT); 
		JsonDateProcessor jd = new HDJsonUtils.JsonDateProcessor(dateFormat);
		jsonConfig.registerJsonValueProcessor(Date.class , jd); 
		JSONObject json = JSONObject.fromObject(object,jsonConfig);
		return json.toString();
	}
	

	/**
	 * 方法名称: convertArrayIncludeDate<br>
	 * 描述：把对象类型转换成数组json 包含日期类型<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 * @param object 待转换的对象<br>
	 * @param dateFormat 日期格式<br>
	 * @return json字符串<br>
	 */
	public static String convertArrayIncludeDate(Object object,String dateFormat){
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT); 
		JsonDateProcessor jd = new HDJsonUtils.JsonDateProcessor(dateFormat);
		jsonConfig.registerJsonValueProcessor(Date.class , jd); 
		JSONArray jsonArray =  JSONArray.fromObject(object,jsonConfig);
		return jsonArray.toString();
	}
	
	/**
	 * 方法名称: convertObject<br>
	 * 描述：JSON字符串转换对象<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 * @param val 名称<br>
	 * @param clazz 转换的类型<br>
	 * @param map 类描述<br>
	 * @return
	 */
	public static <T> T convertObject(String val,Class<T> clazz,Map<String, Class> map){
		 T t=(T)JSONObject.toBean(JSONObject.fromObject(val),clazz , map);
	        return t;
	}
	
	
	/**
	 * 方法名称: convertObject<br>
	 * 描述：JSON字符串转换对象包含Date类型，这需要针对日期类型提供format<br>
	 * 例如：SONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[] {"MM/dd/yyyy HH:mm:ss"}) )<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 * @param clazz
	 * @param map
	 * @param dateMorpher
	 * @return
	 */
	public static <T> T convertObjectIncludeDate(String val,Class<T> clazz,Map<String, Class> map,String[] dateMorpher){
		JSONUtils.getMorpherRegistry().registerMorpher(
		          new DateMorpher(dateMorpher));
		 T t=(T)JSONObject.toBean(JSONObject.fromObject(val),clazz , map);
	        return t;
	}
	
	
	
	/**
	 * 描述：日期格式转换处理器<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 */
	public static class JsonDateProcessor implements JsonValueProcessor{
		private String format ="yyyy-MM-dd"; 
		public JsonDateProcessor(){}
	    public JsonDateProcessor(String format){
	    	this.format = format;
	    }
		public Object processArrayValue(Object value, JsonConfig config) {
			return process(value);  
		}

		public Object processObjectValue(String key, Object value,
				JsonConfig config) {
			return process(value);  
		}
		private Object process(Object value){  
	        if(value instanceof Date){  
	            SimpleDateFormat sdf = new SimpleDateFormat(format,Locale.UK);  
	            return sdf.format(value);  
	        }  
	        return value == null ? "" : value.toString();  
		}  
		
	}
	
	
	/**
	 * 描述：忽略某个字段处理器<br>
	 * 作者: liuJinDong<br>
	 * 修改日期：2016年09月20日11:29:20<br>
	 * E-mail:  <br>
	 */
	public static class IgnoreFieldProcessor implements PropertyFilter{
		 /** 
	     * 忽略的属性名称 
	     */  
	    private List<String> fields; 
	    /** 
	     * 是否忽略集合 
	     */  
	    private boolean ignoreColl = false; 
	    
	    public IgnoreFieldProcessor(List<String> fields) {  
	        this.fields = fields;   
	    }  
	    
	    public IgnoreFieldProcessor(boolean ignoreColl, List<String> fields) {  
	        this.fields = fields;  
	        this.ignoreColl = ignoreColl;   
	    }
	    public IgnoreFieldProcessor(boolean ignoreColl) {  
	        this.ignoreColl = ignoreColl;   
	    }
	    
	    
	    
		public boolean apply(Object source, String name, Object value) {
			Field declaredField = null;  
	        //忽略值为null的属性  
	        if(value == null){
	        	 return true;  
	        }
	        
	           
	        //剔除自定义属性，获取属性声明类型  
	        if(!"data".equals(name) && "data"!=name && !"totalSize".equals(name) && "totalSize"!=name ){  
	            try {  
	                declaredField = source.getClass().getDeclaredField(name);  
	            } catch (NoSuchFieldException e) {
	            	logger.warn("json转换时没有找到属性" + name);
	            }  
	        }  
	        
	        // 忽略集合  
	        if (declaredField != null) {  
	            if(ignoreColl) {  
	                if(declaredField.getType() == Collection.class || declaredField.getType() == Set.class) {  
	                    return true;  
	                }  
	            }  
	        }  
	   
	        // 忽略设定的属性  
	        if(fields != null && fields.size() > 0) {  
	            if(juge(fields,name)) {    
	                return true;    
	            } else {    
	                return false;    
	            }   
	        }  
	           
			return false;
		}
		
		/** 
	     * 过滤忽略的属性 
	     * @param fields  需要忽略的属性名称集合
	     * @param name 需要转换的属性名称
	     * @return 
	     */  
	     public boolean juge(List<String> fields ,String name){    
	         boolean b = false;    
	         for(String field : fields){    
	             if(name.equals(field)){    
	                 b=true;    
	             }    
	         }    
	         return b;    
	     }  
	   
	   
	   
	    public boolean isIgnoreColl() {  
	        return ignoreColl;  
	    }  
	   
	    /** 
	     * 设置是否忽略集合类 
	     * @param ignoreColl 
	     */  
	    public void setIgnoreColl(boolean ignoreColl) {  
	        this.ignoreColl = ignoreColl;  
	    }  
	    
		
	}
	
	
}
