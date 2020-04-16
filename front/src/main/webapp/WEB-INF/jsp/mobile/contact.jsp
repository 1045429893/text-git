<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common_mobile.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>联系我们</title>
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
<body id="page" class="contact-bg">
<header class="header"></header>
<section>
    <div class="contact-wrap">
        <form action="" method="">
            <div class="message">
                <p class="clearfix"><label for=""><i>*</i>姓名：</label><input type="text" id="book_username" name="book_username"value="" placeholder="请输入姓名"></p>
                <p class="clearfix"><label for=""><i>*</i>电话：</label><input type="text" id="book_telephone" name="book_telephone" value="" placeholder="请输入电话"></p>
                <p class="clearfix"><label for=""><i>*</i>地址：</label><input type="text" id="book_address" name="book_address"value="" placeholder="请输入地址"></p>
                <p class="clearfix"><label for=""><i>*</i>邮箱：</label><input type="text" id="book_email" name="book_email"value="" placeholder="请输入邮箱"></p>
                <p class="clearfix"><label for=""><i></i>留言：</label><textarea rows=""   id="book_content" name="book_content"cols="" placeholder="请输入留言"></textarea></p>
                <p class="message-last clearfix"><button type="button" onclick="submitContactMessage()">提交</button></p>
            </div>
        </form>
        <div class="contact-text">
            <p>${mlsdMobileContactUs.text1}</p>
            <p>${mlsdMobileContactUs.text2}</p>
            <p>${mlsdMobileContactUs.text3}</p>
        </div>
        <img src="${picPath}${mlsdMobileContactUs.imgUrl}" alt="" class="contact-img">
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
    function submitContactMessage(){
        var userName = $("#book_username").val();
        var address = $("#book_address").val();
        var telephone = $("#book_telephone").val();
        var email = $("#book_email").val();
        var content = $("#book_content").val();
        if((userName==null||userName==="")||(address==null||address==="")||(telephone==null||telephone==="")||(email==null||email==="")){
            alert("请填写姓名、地址、手机、邮箱");
            return false;
        }
        var data = {
            "userName": userName,
            "address": address,
            "tel":telephone,
            "email":email,
            "content":content
        };
        $.ajax({
            type: "POST",
            url: "${path}/addContactMessage.do",
            data: data,
            success: function (data) {
                // alert(JSON.stringify(data));
                if(data.retcode==='0'){
                    alert("提交信息成功");
                }else{
                    alert(data.msg);
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                console.log("XMLHttpRequest:"+XMLHttpRequest);
                console.log("textStatus:"+textStatus);
                console.log("errorThrown:"+errorThrown);
                alert('网络异常');
            }
        });
    }
</script>
</body>
</html>
