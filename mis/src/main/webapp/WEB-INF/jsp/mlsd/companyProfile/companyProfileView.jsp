<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="${path}/common/front/css/system/seller.css" media="all"/>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style>

        .layui-upload-list {
            width: 100px;
            height: 100px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        .layui-upload-list img {
            width: 100%;
        }

    </style>
</head>

<body>
<form class="layui-form" action="" id="sform">
    <input type="hidden" id="topicId" name="topicId" value="">
    <h2 class="new-account-title">公司简介</h2>
    <%--<div class="layui-form-item">--%>
        <%--<label class="layui-form-label">公司名称：</label>--%>
        <%--<div class="layui-input-inline">--%>
            <%--&lt;%&ndash;<select name="authorUserId" lay-filter="" lay-verify="required">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<option value=""></option>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<c:forEach items="${userCenterVoList}" var="userCenterVo">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<option value="${userCenterVo.userBaseId}">ID:${userCenterVo.userBaseId}    &nbsp;&nbsp;&nbsp; 昵称：${userCenterVo.nickName} </option>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</c:forEach>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</select>&ndash;%&gt;--%>
        <%--</div>--%>
        <%--<span class="no-void">*</span>--%>
    <%--</div>--%>
    <div class="layui-form-item">
        <label class="layui-form-label">公司名称：</label>
        <input type="hidden" id="id" value="${companyProfileVo.id}">
        <div class="layui-input-inline">
            <input type="text" id="companyName" maxlength="40" name="companyName" lay-verify="required"
                   placeholder="公司名称" autocomplete="off" class="layui-input" value="${companyProfileVo.companyName}">
        </div>
        <span class="no-void">*</span>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">公司地址：</label>
        <div class="layui-input-inline">
            <input type="text" id="companyAddress" maxlength="40" name="companyAddress" lay-verify="required"
                   placeholder="公司名称" autocomplete="off" class="layui-input" value="${companyProfileVo.companyAddress}">
        </div>
        <span class="no-void">*</span>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">加盟热线：</label>
        <div class="layui-input-inline">
            <input type="text" id="hotLine" maxlength="40" name="hotLine" lay-verify="required"
                   placeholder="hotLine" autocomplete="off" class="layui-input" value="${companyProfileVo.hotLine}">
        </div>
        <span class="no-void">*</span>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">邮箱：</label>
        <div class="layui-input-inline">
            <input type="text" id="email" maxlength="40" name="email" lay-verify="required"
                   placeholder="hotLine" autocomplete="off" class="layui-input" value="${companyProfileVo.email}">
        </div>
        <span class="no-void">*</span>
    </div>  <div class="layui-form-item">
        <label class="layui-form-label">公司网站：</label>
        <div class="layui-input-inline">
            <input type="text" id="url" maxlength="40" name="url" lay-verify="required"
                   placeholder="hotLine" autocomplete="off" class="layui-input" value="${companyProfileVo.url}">
        </div>
        <span class="no-void">*</span>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="save">立即提交</button>
            <%--<button type="button" class="layui-btn layui-btn-primary" onclick="history.go(-1)">返回</button>--%>
        </div>
    </div>
</form>

<script>
    //Demo
    layui.use(['form', 'layer', 'laydate'], function () {
        var form = layui.form;
        var layer = layui.layer;
        var laydate = layui.laydate;
        //监听提交
        form.on('submit(save)', function (data) {
            $.post("${path}mlsd/companyProfile/updateCompanyProfile.do?id=${companyProfileVo.id}", data.field, function (cbd) {
                if (cbd.code == "0") {
                    layer.open({
                        title: '提示'
                        , content: '保存成功'
                        , offset: 't', area: ['100px', '160px']
                        , yes:function(){
                            layer.closeAll();
                        }
                    });
                } else {
                    layer.open({
                        title: '提示'
                        , content: cbd.msg
                        , offset: 't', area: ['100px', '160px']
                    });
                }
            }, "json");
            return false;
        });


    });

</script>
</body>

</html>
