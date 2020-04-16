<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>项目优势</title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge，chrome=1">
    <meta name="keywords" content="哈尔滨麻辣速递苕粉餐饮有限公司_酸辣苕粉餐饮加盟连锁_麻辣烫加盟_酸辣薯粉加盟
      麻辣速递加盟，酸辣苕粉加盟，餐饮连锁加盟，麻辣烫加盟，麻辣烫免费加盟，酸辣薯粉加盟，酸辣薯粉免费加盟，
      免费项目加盟，酸辣苕粉免费加盟，麻辣苕粉加盟，麻辣薯粉加盟，麻辣烫加盟，餐饮项目加盟">
    <meta name="description" content="哈尔滨麻辣速递苕粉餐饮管理有限公司，全国加盟1000余家，分布在全国各个城市中，
        麻辣速递品牌产品有酸辣苕粉加盟，酸辣薯粉加盟，大碗麻辣烫加盟，苕粉加盟连锁，餐饮企业连锁加盟，酸辣薯粉免费加盟，苕粉免费加盟，酸辣苕粉免费加盟。">
    <script type="text/javascript" src="${path}/mlsd/js/jquery-1.10.1.min.js"></script>
    <script type="text/javascript" src="${path}/mlsd/js/wow.min.js"></script>
    <script type="text/javascript">
        new WOW().init();
    </script>
    <style>
        .menum ul li:nth-child(3) a {
            color: #AF004F;
            font-weight: bold;
        }
    </style>
</head>

<body id="page" class="advantage-bg">
    <div class="header"></div>
    <div class="advantage-banner ">
        <img src="${picPath}${mlsdItemAdvantage.banner1}" alt="">
        <%--<img src="${path}/mlsd/images/advantage/banner-small.png" alt="">--%>
    </div>
    <div class="advantage-content">
        <div class="tage-title mb1"><img src="${path}/mlsd/images/advantage/title.png"></div>
        <div class="tage-content ">
            <div class="wow animated flipInX">
                <img src="${picPath}${mlsdItemAdvantage.companyShowsTextImgUrl}">

            </div>
        </div>
        <div class="eight-title">
            <img src="${picPath}${mlsdItemAdvantage.companyShowsTitleImgUrl}">
        </div>
        <div class="xs clearfix">
            <div class="xs-left wow flipInX" data-wow-duration="1.5s" data-wow-delay="0.2s"><img
                    src="${picPath}${mlsdItemAdvantage.companyShowsImgUrl}"></div>
            <div class="xs-right">
                <div class=" wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.6s">
                    <img src="${picPath}${mlsdItemAdvantage.companyShowsAdvantageImgUrl}">
                </div>
            </div>
        </div>
        <div class="tage-title"><img src="${path}/mlsd/images/advantage/title2.png"></div>
    </div>
    <div class="tage-foot">
        <div
            style="	width: 765px;height: 255px;margin: 0 auto 0;background: url(${picPath}${mlsdItemAdvantage.supportImgUrl})">
        </div>
    </div>
    <div class="footer"></div>
    <script src="${path}/mlsd/js/backtop.js"></script>
    <script>
        $(document).ready(function () {
            $(".header").load("${path}/goHeader.do");
            $(".footer").load("${path}/goFooter.do");
        });
    </script>
</body>

</html>