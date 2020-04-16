<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta content="text/html;charset=utf-8" http-equiv="content-type">
    <meta name="Keywords" content="" />
    <meta name="Description" content="" />
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" name="viewport">
    <meta content="yes" name="apple-mobile-web-app-capable">
    <meta content="black" name="apple-mobile-web-app-status-bar-style">
    <meta content="telephone=no" name="format-detection">
    <meta content="email=no" name="format-detection">
    <title>505</title>

    <script>
        (function () {
            var html = document.documentElement;
            var hWidth = html.getBoundingClientRect().width;
            html.style.fontSize = hWidth / 15 + "px";
        })()
    </script>
    <style type="text/css">
        .box{ width: 100%; text-align: center;}
        .box img{  margin:75px auto 0; }
        p{ text-align: center; font-size: 26px; color: #415079; margin:0; }
        a{  height: 60px; line-height: 60px; border-radius: 4px;  background: #fff; border:1px solid #415079; color: #536084;text-decoration:none ; font-size: 24px; display: inline-block;  background: url(${path}common/images/refresh.png) no-repeat; padding-left: 82px; padding-right: 36px; background-position: 28px 15px; margin:0 auto; }
        .btn{ width: 100%; text-align: center; font-size: 24px; padding-top: 46px; }
    </style>
</head>
<body>
<div class="box">
    <img src="${path}common/images/505.png">
</div>
<p>${message}</p>
<div class="btn"><a href="javascript:void(0);" onclick="javascript:location.reload();">刷新</a></div>
</body>
</html>
