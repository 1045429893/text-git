<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!-- JSTL标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- 项目路径 -->
<%String path = request.getContextPath();String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;%>
<c:set var="path" value="<%=basePath %>"></c:set>
<c:set var="picPath" value="http://140.143.37.102/pic/"></c:set>
<link rel="stylesheet" type="text/css" href="${path}/mlsd/css/reset.css">
<link rel="stylesheet" type="text/css" href="${path}/mlsd/css/style.css">
<link rel="stylesheet" type="text/css" href="${path}/mlsd/css/animate.css">







