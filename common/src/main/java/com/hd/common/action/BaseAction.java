package com.hd.common.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.hd.common.editor.DateEditor;
import com.hd.common.editor.StringEditor;

/**
 * 所有action的父类
 *
 */
public abstract class BaseAction
{

    @InitBinder
    public void InitBinder(WebDataBinder dataBinder)
    {
        dataBinder.registerCustomEditor(Date.class, new DateEditor());
        dataBinder.registerCustomEditor(String.class, new StringEditor());
    }
    
	
	/**
	 * 方法名称: render<br>
	 * 描述：返回给浏览器
	 * 作者: liujindong
	 * 修改日期：2016年09月07日16:56:05
	 * @param text
	 * @param contentType
	 */
	public void render(String text, String contentType,HttpServletResponse response){
	    try{
	      response.setContentType(contentType);
	      response.getWriter().write(text);
	      response.getWriter().flush();
	    } 
	    catch (IOException e) {
	      throw new IllegalStateException(e);
	    }
	}
	
	
	
	/**
	 * 方法名称: renderText<br>
	 * 描述：返回普通文本浏览器
	 * 作者: liuJinDong
	 * 修改日期：2016年9月7日下午5:12:46
	 * @param text
	 * @param response
	 */
	public void renderText(String text,HttpServletResponse response){
	    render(text, "text/plain;charset=UTF-8",response);
	}
	
	/**
	 * 方法名称: renderHtml<br>
	 * 描述：返回HTML格式浏览器
	 * 作者: liuJinDong
	 * 修改日期：2016年9月7日下午5:13:00
	 * @param text
	 * @param response
	 */
	public void renderHtml(String text,HttpServletResponse response){
	    render(text, "text/html;charset=UTF-8",response);
	}

	/**
	 * 方法名称: renderXML<br>
	 * 描述：返回XML格式浏览器
	 * 作者: liuJinDong
	 * 修改日期：2016年9月7日下午5:13:39
	 * @param text
	 * @param response
	 */
	public void renderXML(String text,HttpServletResponse response){
	    render(text, "text/xml;charset=UTF-8",response);
	}
	
	
	/**
	 * 方法名称: renderJson<br>
	 * 描述：返回JSON格式数据
	 * 作者: liuJinDong
	 * 修改日期：2016年9月7日下午5:13:49
	 * @param text
	 * @param response
	 */
	public void renderJson(String text,HttpServletResponse response){
		render(text,"text/json;charset=UTF-8",response);
	}
    
}