<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>门店展示</title>
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
        .menum ul li:nth-child(7) a{ color: #AF004F;
            font-weight: bold;}
    </style>
</head>
<body id="page" class="show-bg">
<div class="header"></div>
<div class="show-banner">
    <img src="${picPath}${mlsdStoreDisplay.banner1}" alt="">
</div>
<div class="show-wrap">
    <div class="show-img1"><img src="${path}/mlsd/images/show/title.png" alt=""></div>
    <div class="w939">
        <div class="show-img2  wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdStoreDisplay.storeDisplayImgUrl1}"
                                                                                               alt=""></div>
        <div class="show-img3 wow  fadeIn" data-wow-duration="1.5s" data-wow-delay="0.4s"><img src="${picPath}${mlsdStoreDisplay.storeDisplayImgUrl2}"
                                                                                               alt=""></div>
        <div class="show-img4 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.5s"><img src="${picPath}${mlsdStoreDisplay.storeDisplayImgUrl3}"
                                                                                              alt=""></div>
        <div class="show-img5 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.6s"><img src="${picPath}${mlsdStoreDisplay.storeDisplayImgUrl4}"
                                                                                              alt=""></div>
        <div class="show-img6"><img src="${picPath}${mlsdStoreDisplay.makeShowTitleImgUrl}" alt=""></div>
        <div class="img78 clearfix">
            <div class="show-img7 wow flipInY" data-wow-duration="1.2s" data-wow-delay="0.1s"><img src="${picPath}${mlsdStoreDisplay.makeShowImgUrl1}"
                                                                                                   alt=""></div>
            <div class="show-img8 wow fadeIn" data-wow-duration="1.2s" data-wow-delay="0.3s"><img src="${picPath}${mlsdStoreDisplay.makeShowImgUrl2}"
                                                                                                  alt=""></div>
        </div>
    </div>
    <div class="show-img9 "><img src="${picPath}${mlsdStoreDisplay.makeShowImgUrl3}" alt=""></div>
</div>
<div class="footer"></div>>
<script src="${path}/mlsd/js/backtop.js"></script>
<script>
    $(document).ready(function() {
        $(".header").load("${path}/goHeader.do");
        $(".footer").load("${path}/goFooter.do");
    });
</script>

</body>
</html>
