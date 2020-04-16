<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>招商加盟</title>
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
        .menum ul li:nth-child(4) a{ color: #AF004F;
            font-weight: bold;}
    </style>
</head>
<body id="page" class="join-bg">
<div class="header"></div>
<div class="show-banner">
    <img src="${picPath}${mlsdJoinInvestment.banner1}" alt="">
</div>
<div class="join-content">
    <div class="join-title"><img src="${path}/mlsd/images/join/join_title.png"></div>
    <div class="vs-wrap clearfix">
        <div class="vs1 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.partnershipImgUrl1}" alt=""></div>
        <div class="vs2 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.partnershipImgUrl3}" alt=""></div>
        <div class="vs wow flipInX " data-wow-delay="0.5s"><img src="${picPath}${mlsdJoinInvestment.partnershipImgUrl2}" alt=""></div>
    </div>
    <div class="two-person"><img src="${path}/mlsd/images/join/two.png" alt=""></div>
    <div class="join-img1 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.imgUrl1}" alt=""></div>
    <div class="join-img2 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.imgUrl2}" alt=""></div>
    <div class="join-img3 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.imgUrl3}" alt=""></div>
    <div class="join-img4 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.imgUrl4}" alt=""></div>
    <div class="join-img5 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.imgUrl5}" alt=""></div>
    <div class="join-img6 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.imgUrl6}" alt=""></div>
    <div class="w757 clearfix">
        <div class="join-img7 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.imgUrl7}"
                                                                                              alt=""></div>
        <div class="join-img8 wow fadeIn" data-wow-duration="1.5s" data-wow-delay="0.2s"><img src="${picPath}${mlsdJoinInvestment.imgUrl8}"
                                                                                              alt=""></div>
    </div>
    <div class="join-img9"><img src="${path}/mlsd/images/join/img9.png" alt=""></div>
    <div class="join-img10 ">

        <img src="${picPath}${mlsdJoinInvestment.partnershipImgUrl}" >

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




