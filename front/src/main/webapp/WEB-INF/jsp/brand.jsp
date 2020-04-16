<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>品牌文化</title>
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
    <script type="text/javascript" src="${path}/mlsd/js/wow.min.js"></script>
    <script type="text/javascript">
        new WOW().init();
    </script>
    <style>
        .menum ul li:nth-child(2) a{ color: #AF004F;
            font-weight: bold;}
    </style>
</head>
<body  id="page" class="brand-bg">
<div class="header"></div>
<div class="div1 prelat ">
    <div class="index-banner brand-banner">
        <img src="${picPath}${mlsdBrandCulture.banner1}" alt="">
    </div>
    <div class="scroll_arrow">
        <div class="arrow">
            <span class="arrow_img "></span>
            <span class="arrow_img"></span>
        </div>
    </div>
</div>
<div class="brand-con">
    <div class="b-con1">
        <div class="b-con1-inner clearfix">
            <div class="b-con-left">
                <img src="${picPath}${mlsdBrandCulture.introduceProductImgUrl}" class="wow animated flipInX ">
            </div>
            <div class="b-con-right">
                <img src="${picPath}${mlsdBrandCulture.introduceTextImgUrl}" class="img1" >
                <div class="b-con-p  wow animated bounce ">
                    <img src="${picPath}${mlsdBrandCulture.introduceIntroImgUrl}" alt="">
                </div>
            </div>
        </div>
    </div>
    <div class="b-tit2">
        <img src="${path}/mlsd/images/brand/title2.png" >
    </div>
</div>
<div class="b-foot">
    <div class="b-foot-inner">
        <div class="foot-inner-wrap clearfix">
            <img src="${picPath}${mlsdBrandCulture.productPositioningImgUrl}" alt=""  class="f-inner-right wow animated swing">
            <img src="${picPath}${mlsdBrandCulture.productPositioningTextImgUrl}" alt="" class="f-inner-left wow animated pulse  ">
        </div>
        <div class="foot-inner-last">
            <img src="${picPath}${mlsdBrandCulture.productFeatureImgUrl}" alt="" class="wow animated pulse ">
        </div>
    </div>
</div>
<div class="footer"></div>
<script src="${path}/mlsd/js/backtop.js"></script>
<script>
    $(document).ready(function() {
        $(".header").load("${path}/goHeader.do");
        $(".footer").load("${path}/goFooter.do");
    });
</script>
</body>
</html>

