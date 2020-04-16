<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common_mobile.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>实力后台</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8" />
    <meta name="viewport" content="width=device-width,user-scalable=no,initial-scale=1,minimum-scale=1,maximum-scale=1" />
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no, minimal-ui" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <script>
        (function() {
            var html = document.documentElement;
            var hWidth = html.getBoundingClientRect().width;
            html.style.fontSize = hWidth / 15 + "px";
        })()
    </script>
</head>
<body id="page" class="strength-bg">
<header class="header">

</header>
<section>
    <div class="strength-wrap">
        <img src="${picPath}${mlsdMobileStrength.strengthImgUrl1}" class="stren1">
    </div>
    <div class="row-integrity clearfix">
        <div class="col-integrity-text">
            <span>诚信企业</span>
        </div>
        <div class="col-integrity-img">
            <img src="${picPath}${mlsdMobileStrength.strengthImgUrl2}" alt="">
            <img src="${picPath}${mlsdMobileStrength.strengthImgUrl3}" alt="">
        </div>
    </div>
    <div class="row-case">
        <div class="row clearfix">
            <div class="col-case-left">
                <img src="${picPath}${mlsdMobileStrength.strengthImgUrl4}" alt="">
                <img src="${picPath}${mlsdMobileStrength.strengthImgUrl5}" alt="" class="case-last">
            </div>
            <div class="col-case-right">
                <span>签约案例</span>
            </div>
        </div>
        <div class="row clearfix">
            <div class="col-case-left">
                <img src="${picPath}${mlsdMobileStrength.strengthImgUrl6}" alt="">
                <img src="${picPath}${mlsdMobileStrength.strengthImgUrl7}" alt="">
                <img src="${picPath}${mlsdMobileStrength.strengthImgUrl8}" alt="">
            </div>
            <div class="col-case-right">
                <span>团队实力展现</span>
            </div>
        </div>
    </div>

</section>
<footer class="footer">

</footer>
<script src="${path}/mlsd/js/jquery-1.10.1.min.js" type="text/javascript" charset="utf-8"></script>
<script src="${path}/mlsd/js/backtop.js" type="text/javascript" charset="utf-8"></script>
<script>
    $(document).ready(function() {
        $(".header").load("${path}/mobile/goHeader.do");
        $(".footer").load("${path}/mobile/goFooter.do");
    });
</script>
</body>
</html>

