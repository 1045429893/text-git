<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge，chrome=1">
    <meta name="keywords" content="哈尔滨麻辣速递苕粉餐饮有限公司_酸辣苕粉餐饮加盟连锁_麻辣烫加盟_酸辣薯粉加盟
      麻辣速递加盟，酸辣苕粉加盟，餐饮连锁加盟，麻辣烫加盟，麻辣烫免费加盟，酸辣薯粉加盟，酸辣薯粉免费加盟，
      免费项目加盟，酸辣苕粉免费加盟，麻辣苕粉加盟，麻辣薯粉加盟，麻辣烫加盟，餐饮项目加盟">
    <meta name="description"
        content="哈尔滨麻辣速递苕粉餐饮管理有限公司，全国加盟1000余家，分布在全国各个城市中，
        麻辣速递品牌产品有酸辣苕粉加盟，酸辣薯粉加盟，大碗麻辣烫加盟，苕粉加盟连锁，餐饮企业连锁加盟，酸辣薯粉免费加盟，苕粉免费加盟，酸辣苕粉免费加盟。">
    <script type="text/javascript" src="${path}/mlsd/js/jquery-1.10.1.min.js"></script>
    <link rel="stylesheet" href="${path}/mlsd/css/idangerous.swiper2.7.6.css">
    <link rel="stylesheet" href="${path}/mlsd/css/swiper.css">
    <script type="text/javascript" src="${path}/mlsd/js/wow.min.js"></script>
    <script type="text/javascript">
        new WOW().init();
    </script>
    <style>
        .menum ul li:nth-child(1) a{ color: #AF004F;
            font-weight: bold;}

        .banner1{
            background: url(${picPath}${mlsdHomePage.banner1}) no-repeat center center;
        }
        .banner31{
            background: url(${picPath}${mlsdHomePage.banner31}) no-repeat center center;
        }


    </style>
</head>
<body id="page" class="home-bg">
<div class="header"></div>
<div id="wrapper">
    <div class="swiper-container">
        <div class="swiper-wrapper">
            <div class="swiper-slide banner1">
            </div>
            <div class="swiper-slide slide2">
                <a href="" class="inner clearfix">
                    <img src="${picPath}${mlsdHomePage.banner21}" class="ani img zh-a-1" swiper-animate-effect="flipInY" swiper-animate-duration="2s"
                         swiper-animate-delay="0.5s">
                    <img src="${picPath}${mlsdHomePage.banner22}" class="ani img zh-a-2">
                    <img src="${picPath}${mlsdHomePage.banner23}" alt="" class="ani img zh-a-3" swiper-animate-effect="zoomIn"
                         swiper-animate-duration="2s" swiper-animate-delay="0s">
                </a>
            </div>
            <div class="swiper-slide banner31">
                <div class="inner">
                    <img src="${picPath}${mlsdHomePage.banner32}" class="ani img b-1" swiper-animate-effect="bounceInLeft" swiper-animate-duration="1.5s"
                         swiper-animate-delay="0s">
                </div>
            </div>
        </div>
        <div class="pagination"></div>
    </div>

    <div id="" class="main-content">
        <div class="con-in clearfix">
            <div class="con-in-left"><img src="${picPath}${mlsdHomePage.introduceTextImgUrl}" class="hostory wow flipInY" alt="历史悠久 底蕴深厚"></div>
            <div class="con-in-right">
                <img src="${picPath}${mlsdHomePage.introduceProductImgUrl}" alt="">
                <div class="saofen">

                    <img src="${picPath}${mlsdHomePage.introduceIntroImgUrl}" alt="苕粉介绍">
                </div>
            </div>
        </div>
        <div class="o2o  wow fadeIn " data-wow-duration="1.5s" data-wow-delay="0.4s">
            <img src="${picPath}${mlsdHomePage.profitImgUrl}" alt="">
        </div>
        <div class="con-o2o wow animated fadeIn " data-wow-duration="1.5s" data-wow-delay="0.3s">
            <img src="${picPath}${mlsdHomePage.profitTextImgUrl}" alt="020">
        </div>

        <div class="zpms">
            <img src="${path}/mlsd/images/index/tit4.png" alt="招牌美食">
        </div>
    </div>
    <div  class="food-bg">
        <div class="food-con">
            <div class="sign-food clearfix">
                <div class="row-food1 " style="background: url(${picPath}${mlsdHomePage.shopSignBackground1});width: 350px;
                        height: 393px;float: left;background-size: 100% 100%; position: relative; margin-right: 77px;">
                    <img src="${picPath}${mlsdHomePage.shopSign1}" alt="" class="wow zoomInDown  " data-wow-duration="1.5s" data-wow-delay="0.1s">
                </div>
                <div class="row-food2 " style="background: url(${picPath}${mlsdHomePage.shopSignBackground2});width: 350px;
                        height: 393px;float: left;background-size: 100% 100%; position: relative; ">
                    <img src="${picPath}${mlsdHomePage.shopSign2}" alt="" class="wow zoomInDown  " data-wow-duration="1.5s" data-wow-delay="0.1s">
                </div>
            </div>
            <div class="sign-food1 clearfix">

                <div class="row-food3"style="background: url(${picPath}${mlsdHomePage.shopSignBackground3});width: 350px;
                        height: 393px;float: right;background-size: 100% 100%; position: relative; ">
                    <img src="${picPath}${mlsdHomePage.shopSign3}" alt="" class="wow zoomInDown  " data-wow-duration="1.5s" data-wow-delay="0.2s">
                </div>
                <div class="row-food4" style="background: url(${picPath}${mlsdHomePage.shopSignBackground4});width: 350px;
                        height: 393px;float: right;background-size: 100% 100%; position: relative; margin-right: 54px;">
                    <img src="${picPath}${mlsdHomePage.shopSign4}" alt="" class="wow zoomInDown  " data-wow-duration="1.5s" data-wow-delay="0.2s">
                </div>
            </div>
        </div>
    </div>
</div>

<div class="footer"></div>

<script src="${path}/mlsd/js/idangerous.swiper2.7.6.min.js"></script>
<script src="${path}/mlsd/js/swiper.animate1.0.2.min.js"></script>
<script>
    var mySwiper = new Swiper('.swiper-container', {
        pagination: '.pagination',
        paginationClickable: true,
        autoplay: 5000,
        speed: 1,
        loop: true,
        onInit: function(swiper) { //Swiper2.x的初始化是onFirstInit
            swiperAnimateCache(swiper); //隐藏动画元素
            swiperAnimate(swiper); //初始化完成开始动画
        },
        onSlideChangeEnd: function(swiper) {
            swiperAnimate(swiper); //每个slide切换结束时也运行当前slide动画
        }
    })

</script>
<script src="${path}/mlsd/js/backtop.js"></script>
<script>
    $(document).ready(function() {
        $(".header").load("${path}/goHeader.do");
        $(".footer").load("${path}/goFooter.do");
    });
</script>
<script type="text/javascript">
    $(function() {
        browserRedirect();  //待调用的函数
    });
    function browserRedirect() {
        var sUserAgent = navigator.userAgent.toLowerCase();
        var bIsIpad = sUserAgent.match(/ipad/i) == "ipad";
        var bIsIphoneOs = sUserAgent.match(/iphone os/i) == "iphone os";
        var bIsMidp = sUserAgent.match(/midp/i) == "midp";
        var bIsUc7 = sUserAgent.match(/rv:1.2.3.4/i) == "rv:1.2.3.4";
        var bIsUc = sUserAgent.match(/ucweb/i) == "ucweb";
        var bIsAndroid = sUserAgent.match(/android/i) == "android";
        var bIsCE = sUserAgent.match(/windows ce/i) == "windows ce";
        var bIsWM = sUserAgent.match(/windows mobile/i) == "windows mobile";
        if (bIsIpad || bIsIphoneOs || bIsMidp || bIsUc7 || bIsUc || bIsAndroid || bIsCE || bIsWM) {
            window.location.href="${path}/mobile/index.do";
        }
    }

    browserRedirect();
</script>
</body>
</html>

