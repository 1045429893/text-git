<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!-- JSTL标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- 项目路径 -->
<%String path = request.getContextPath();String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<c:set var="path" value="<%=basePath %>"></c:set>

<%--时间插件--%>
<script type="text/javascript" src="${path }/common/js/My97DatePicker/WdatePicker.js"></script>
<%--jquery--%>
<script type="text/javascript" src="${path }/common/js/jquery.min.js"></script>
<script type="text/javascript" src="${path }/common/front/layui/layui.js"></script>
<script type="text/javascript" src="${path }/common/js/base64.js"></script>
<link rel="stylesheet" href="${path}/common/front/layui/css/layui.css" media="all"/>
<link rel="stylesheet" type="text/css" href="${path}/common/front/font/font-awesome-4.7.0/css/font-awesome.css">







