<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>联系我们</title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="keywords" content="哈尔滨麻辣速递苕粉餐饮有限公司_酸辣苕粉餐饮加盟连锁_麻辣烫加盟_酸辣薯粉加盟
      麻辣速递加盟，酸辣苕粉加盟，餐饮连锁加盟，麻辣烫加盟，麻辣烫免费加盟，酸辣薯粉加盟，酸辣薯粉免费加盟，
      免费项目加盟，酸辣苕粉免费加盟，麻辣苕粉加盟，麻辣薯粉加盟，麻辣烫加盟，餐饮项目加盟">
    <meta name="description"
        content="哈尔滨麻辣速递苕粉餐饮管理有限公司，全国加盟1000余家，分布在全国各个城市中，
        麻辣速递品牌产品有酸辣苕粉加盟，酸辣薯粉加盟，大碗麻辣烫加盟，苕粉加盟连锁，餐饮企业连锁加盟，酸辣薯粉免费加盟，苕粉免费加盟，酸辣苕粉免费加盟。">
    <link rel="stylesheet" href="${path}/mlsd/css/idangerous.swiper2.7.6.css">
    <script type="text/javascript" src="${path}/mlsd/js/jquery-1.10.1.min.js"></script>
    <script type="text/javascript" src="${path}/mlsd/js/wow.min.js"></script>
    <script type="text/javascript">
        new WOW().init();
    </script>
    <style>
        .menum ul li:nth-child(9) a{ color: #AF004F;
            font-weight: bold;}
    </style>
</head>
<body id="page" class="contact-bg">
<div class="header"></div>
<div class="div1 prelat ">
    <div class="index-banner contact-banner">
        <img src="${picPath}${mlsdContactUs.banner1}" alt="">
    </div>
    <div class="scroll_arrow">
        <div class="arrow">
            <span class="arrow_img "></span>
            <span class="arrow_img"></span>
        </div>
    </div>
</div>
<div class="main">
    <div class="w1200 prelat">
        <div class="contacttit wow zoomIn" data-wow-duration="1.5s" data-wow-delay="0.1s"><img src="${path}/mlsd/images/contact/contact_tit.png"
                                                                                               alt=""></div>
        <div class="contact-wx"><img src="${picPath}${mlsdContactUs.contactIcon}"></div>
        <div class="contain_tit wow fadeIn" data-wow-duration="1.2s" data-wow-delay="0.3s">${mlsdContactUs.text1}<br>
            ${mlsdContactUs.text2}<br>${mlsdContactUs.text3}
            <div class="three"><img src="${path}/mlsd/images/contact/three.png"></div>
        </div>
        <div class="contact-arr"><img src="${path}/mlsd/images/contact/arr.png"></div>
        <div class="contact_us_info clearfix">
            <p> ${mlsdCompanyProfile.companyName} <br>总部地址：${mlsdCompanyProfile.companyAddress}</p>
            <p>电话热线:<br>${mlsdCompanyProfile.hotLine} </p>
            <p>${mlsdCompanyProfile.companyName}<br>
                网址:<span>${mlsdCompanyProfile.url}</span></p>
        </div>
        <div class="contact-line"><img src="${path}/mlsd/images/contact/line.png"></div>
        <div class="white-bg">

            <div class=" wow zoomIn c-map" data-wow-duration="1.5s" data-wow-delay="0.4s">
                <img src="${picPath}${mlsdContactUs.imgUrl}">
            </div>
            <div class="contact_from">
                <form id="lxwm clearfix">
                    <div class="foot_c2 clearfix">
                        <div class="foot_c2_inp fl"><span>*</span>姓名:<input id="book_username" name="book_username" type="text"></div>
                        <div class="foot_c2_inp fl"><span>*</span>加盟城市:<input id="book_address" name="book_address" type="text"></div>
                        <div class="foot_c2_inp fl"><span>*</span>手机:<input id="book_telephone" name="book_telephone" type="text"></div>
                        <%--<div class="foot_c2_inp fl"><span></span>加盟邮箱:<input id="book_email" name="book_email" type="text"></div>--%>
                    </div>
                    <div class="foot_c2 clearfix">

                        <div class="foot_c2_inp2 fl">留言:<textarea name="" name="book_content" id="book_content" type="text"></textarea></div>
                    </div>
                    <div class="clear"></div>
                    <div class="w1200 foot-btn-wrap clearfix"><input type="button" class="foot_but" value="提交" id="save" onclick="submitContactMessage()"></div>
                </form>
            </div>
            <div class="clear"></div>
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

    function submitContactMessage(){
        var userName = $("#book_username").val();
         var address = $("#book_address").val();
        var telephone = $("#book_telephone").val();
         var email = $("#book_email").val();
        var content = $("#book_content").val();
        if((userName==null||userName==="")||(telephone==null||telephone==="")||(address==null||address==="")){
            alert("请填写姓名、手机、地址");
            return false;
        }
        var data = {
            "userName": userName,
            "address": address,
            "tel":telephone,
            "email":"",
            "content":content
        };
        $.ajax({
            type: "POST",
            url: "${path}/addContactMessage.do",
            data: data,
            success: function (data) {
                if(data.retcode==='0'){
                    alert("提交信息成功");
                }else{
                    alert(data.msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert('网络异常');
            }
        });
    }
</script>
</body>
</html>