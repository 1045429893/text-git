<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common_mobile.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>门店展示</title>
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
<body id="page" class="show-bg">
<header class="header">

</header>
<section>
    <div class="show-wrap">
        <img src="${picPath}${mlsdMobileStoreDisplay.storeDisplayImgUrl1}" alt="" class="show1">
        <div class="show-text">
            ${mlsdMobileStoreDisplay.storeDisplayText}
        </div>
        <img src="${picPath}${mlsdMobileStoreDisplay.storeDisplayImgUrl2}" class="show2">
        <img src="${picPath}${mlsdMobileStoreDisplay.storeDisplayImgUrl3}" class="show3" >
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
