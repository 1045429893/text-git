<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>

<div class="foot-location">
    <div class="location-ab">
        <a href="javascript:;" id="closeTel"></a>
    </div>
    <div class="loction-con">
        <div class="clearfix">
            <p class="consult">立即咨询，迈向成功第一步！</p>
            <div class="consult-wrap clearfix">
                <input type="text" id="userName" value="" maxlength="10" placeholder="请输入您的姓名" class="index-name" />
                <input type="text" id="tel" value="" maxlength="11" placeholder="请输入您的手机号码" class="index-tel" />
                <button  type="button" class="index-message" onclick="submitInfo();">免费获取资料</button>
            </div>
        </div>
        <div class="loction-text clearfix">
            ${mlsdCompanyProfile.companyName} &nbsp;&nbsp;&nbsp;&nbsp;总部地址：${mlsdCompanyProfile.companyAddress}&nbsp;&nbsp;&nbsp;&nbsp;<a style="color: #ffffff" href="http://www.beian.miit.gov.cn">版权所有备案号：黑ICP备16008503号-3</a>
        </div>
    </div>
</div>


<script>
    $("#closeTel").click(function() {   //右面悬浮
        $(".foot-location").hide();
    });
    // $(".kefu").click(function() {    //左面悬浮
    //     $(this).hide();
    // });


    function submitInfo(){
        var userName = $("#userName").val();
        var tel = $("#tel").val();
        if((userName==null||userName==="")||(tel==null||tel==="")){
            alert("请填写姓名和联系电话");
            return false;
        }
        var data = {
            "userName": userName,
            "tel": tel
        };
        $.ajax({
            type: "POST",
            url: "${path}/addUserInfo.do",
            data: data,
            success: function (data) {
                if(data.retcode==='0'){
                    alert("姓名手机号上传成功");
                    window.open("${path}/pdf/${mlsdCompanyProfile.downloadLink}");
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

