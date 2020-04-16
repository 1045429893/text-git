package com.hd.Filter;


import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionFilter implements Filter {

    /**
     * 需要排除的页面
     */

    private String excludedPages;
    private String[] excludedPageArray;

    private String smsExcludedPages;
    private String[] smsExcludedPageArray;


    /**
     * 方法名称：doFilterInternal <br>
     * 描述： <br>
     * 作者：liuJinDong <br>
     * 修改日期：2016年10月9日上午10:25:21
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @see org.springframework.web.filter.OncePerRequestFilter#doFilterInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        String url = httpRequest.getRequestURI();
        if(url.matches(".*(/sms/.*\\.do).*")){
            filterSms(request,response,chain);
        }else{
            filterHd(request,response,chain);
        }

    }

    private void filterHd(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        boolean isExcludedPage = true;
        for (String page : excludedPageArray) {// 判断是否在过滤url之外
            if (((HttpServletRequest) request).getServletPath().equals(page)) {
                isExcludedPage = false;
                break;
            }
        }
        HttpSession session = httpRequest.getSession();
        // 登陆url
        String loginUrl = httpRequest.getContextPath() + "/mall/payUser/wxIndex.do";
        String url = httpRequest.getRequestURI();
        String path = url.substring(url.lastIndexOf("/"));
        // 超时处理，ajax请求超时设置超时状态，页面请求超时则返回提示并重定向
        if (!isExcludedPage && session.getAttribute("hdUserInfo") == null&&path.indexOf(".do") != -1 ) {
            loginUrl=session.getAttribute("lastUrl")!=null?loginUrl+"?callBackUrl="+session.getAttribute("lastUrl").toString():loginUrl;
            System.out.println("loginUrl:"+loginUrl);
            // 判断是否为ajax请求
            if (httpRequest.getHeader("x-requested-with") != null && httpRequest.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
                httpResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
                httpResponse.addHeader("REDIRECT", "REDIRECT");
                httpResponse.addHeader("loginPath", loginUrl);
                return ;
                // chain.doFilter(request, response);// 不可少，否则请求会出错
            } else {
                String str = "<script language='javascript'>;"
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
        } else{
            if(isExcludedPage && session.getAttribute("hdUserInfo") == null&&path.indexOf(".do") != -1&&httpRequest.getHeader("x-requested-with") == null) {
                String  param = "";
                Enumeration paramNames = request.getParameterNames();
                while (paramNames.hasMoreElements()) {
                    String paramName = (String) paramNames.nextElement();
                    String[] paramValues = request.getParameterValues(paramName);
                    if (paramValues.length == 1) {
                        String paramValue = paramValues[0];
                        if (paramValue.length() != 0) {
                            if(StringUtils.isEmpty(param)){
                                param+="?"+paramName+"="+paramValue;
                            }else{
                                param+="&"+paramName+"="+paramValue;
                            }

                        }
                    }
                }
                session.setAttribute("lastUrl",url+param);
            }
            chain.doFilter(request, response);
        }
    }

    private void filterSms(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        boolean isExcludedPage = false;

        System.out.println("httpRequest.getServletPath()="+httpRequest.getServletPath());
        for (String page : smsExcludedPageArray) {// 判断是否在过滤url之外
            System.out.println("page="+page);
            if (httpRequest.getServletPath().equals(page)) {
                isExcludedPage = true;
                break;
            }
        }
        HttpSession session = httpRequest.getSession();
        // 登陆url
        String loginUrl = httpRequest.getContextPath() + "/sms/user/goSmsUserLogin.do";
        String url = httpRequest.getRequestURI();
        String path = url.substring(url.lastIndexOf("/"));
        // 超时处理，ajax请求超时设置超时状态，页面请求超时则返回提示并重定向
        if (!isExcludedPage && session.getAttribute("smsUserDetailVo") == null&&path.indexOf(".do") != -1 ) {
            // 判断是否为ajax请求
            if (httpRequest.getHeader("x-requested-with") != null && httpRequest.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
                httpResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
                httpResponse.addHeader("REDIRECT", "REDIRECT");
                httpResponse.addHeader("loginPath", loginUrl);
                return ;
                // chain.doFilter(request, response);// 不可少，否则请求会出错
            } else {
                String str = "<script language='javascript'>;"
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
                return;
            }

        } else{
            chain.doFilter(request, response);
        }
    }

    /**
     * 方法名称：init <br>
     * 描述： 初始化<br>
     * 作者：liuJinDong <br>
     * 修改日期：2016年10月9日上午11:28:35
     *
     * @param fConfig
     * @throws ServletException
     * @see org.springframework.web.filter.GenericFilterBean#init(javax.servlet.FilterConfig)
     */
    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        excludedPages = fConfig.getInitParameter("excludedPages");
        smsExcludedPages = fConfig.getInitParameter("smsExcludedPages");
        if (excludedPages != null) {
            excludedPageArray = excludedPages.split(",");
        }
        if (smsExcludedPages != null) {
            smsExcludedPageArray = smsExcludedPages.split(",");
        }
        return;
    }


    /**
     * 方法名称：destroy <br>
     * 描述： <br>
     * 作者：liuJinDong <br>
     * 修改日期：2016年10月9日上午11:37:35
     *
     * @see javax.servlet.Filter#destroy()
     */
    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

}
