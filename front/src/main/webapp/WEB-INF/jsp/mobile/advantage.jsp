<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common_mobile.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>项目优势</title>
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
<body id="page" class="advantage-bg">
<header class="header"></header>
<section>
    <div class="advantage-content">
        <div class="advantage-desc">
            <p> ${mlsdMobileItemAdvantage.text1}</p>
            <p> ${mlsdMobileItemAdvantage.text2}</p>
        </div>
        <img src="${picPath}${mlsdMobileItemAdvantage.showImage1}" class="ad1">
        <img src="${picPath}${mlsdMobileItemAdvantage.showImage2}" alt="" class="ad2">
    </div>
</section>
<footer class="footer"></footer>
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





