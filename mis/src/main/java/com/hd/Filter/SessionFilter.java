package com.hd.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionFilter implements Filter{
	
	/**
	 * 需要排除的页面
	 */

	private String excludedPages;
	private String[] excludedPageArray;

	

	/**方法名称：doFilterInternal <br>
	 * 描述： <br>
	 * 作者：liuJinDong <br>
	 * 修改日期：2016年10月9日上午10:25:21 
	 * @see org.springframework.web.filter.OncePerRequestFilter#doFilterInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain) 
	 * @param request
	 * @param response
	 * @param chain
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		  	HttpServletRequest httpRequest = (HttpServletRequest) request;
	        HttpServletResponse httpResponse = (HttpServletResponse) response;
	        
			boolean isExcludedPage = true;
			for (String page : excludedPageArray) {// 判断是否在过滤url之外
				String ljd = ((HttpServletRequest) request).getServletPath();
				if (((HttpServletRequest) request).getServletPath().equals(page)) {
					isExcludedPage = false;
					break;
				}
			}
	        HttpSession session = httpRequest.getSession();
	        // 登陆url
	        String loginUrl = httpRequest.getContextPath() + "/system/goSysLogin.do";
	        String url = httpRequest.getRequestURI();
	        String path = url.substring(url.lastIndexOf("/"));
	        // 超时处理，ajax请求超时设置超时状态，页面请求超时则返回提示并重定向
	        if (isExcludedPage && path.indexOf(".do") != -1 && session.getAttribute("loginUserInfo") == null) {
	        	System.out.println("=====会话过期,请重新登录======");

	            // 判断是否为ajax请求
	            if (httpRequest.getHeader("x-requested-with") != null && httpRequest.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
	                httpResponse.addHeader("sessionstatus", "timeOut");
	                httpResponse.addHeader("loginPath", loginUrl);
	                chain.doFilter(request, response);// 不可少，否则请求会出错
	            } else {
	                String str = "<script language='javascript'>alert('会话过期,请重新登录');"
	                        + "window.top.location.href='"
	                        + loginUrl
	                        + "';</script>";
	                response.setContentType("text/html;charset=UTF-8");// 解决中文乱码
	                try {
	                    PrintWriter writer = response.getWriter();
	                    writer.write(str);
	                    writer.flush();
	                    writer.close();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        } else {
	        	chain.doFilter(request, response);
	        }	
	} 
	
	/**
	 * 方法名称：init <br>
	 * 描述： 初始化<br>
	 * 作者：liuJinDong <br>
	 * 修改日期：2016年10月9日上午11:28:35 
	 * @see org.springframework.web.filter.GenericFilterBean#init(javax.servlet.FilterConfig) 
	 * @param fConfig
	 * @throws ServletException
	 */
	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		excludedPages = fConfig.getInitParameter("excludedPages");
		if (excludedPages!=null) {
			excludedPageArray = excludedPages.split(",");
		}
		return;
	}


	/**方法名称：destroy <br>
	 * 描述： <br>
	 * 作者：liuJinDong <br>
	 * 修改日期：2016年10月9日上午11:37:35 
	 * @see javax.servlet.Filter#destroy() 
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
