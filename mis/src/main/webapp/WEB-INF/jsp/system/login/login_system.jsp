<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>麻辣速递管理登录</title>
    <link rel="stylesheet" href="${path}/common/front/css/system/login.css"/>
</head>

<body class="beg-login-bg">
<div class="beg-login-big-box">
    <header>
        <h1>麻辣速递管理登录</h1>
    </header>
    <div class="beg-login-box">
        <div class="beg-login-main">
            <form action="${path}/system/goMain.do" name="loginForm" class="layui-form" method="post">
                <input name="__RequestVerificationToken" type="hidden" value=""/>
                <label class="login-user">用户名</label>
                <div class="layui-form-item">
                    <label class="beg-login-icon">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
                    <input type="text" id="userName" name="userName" lay-verify="required" autocomplete="off"
                           placeholder="请输入用户名" class="layui-input">
                </div>
                <label class="login-password">密码</label>
                <div class="layui-form-item">
                    <label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
                    <input type="password" id="password" name="password" lay-verify="required" autocomplete="off"
                           placeholder="请输入密码" class="layui-input">
                </div>
                <div class="layui-form-item">
                    <div class="beg-pull-right">
                        <button class="layui-btn layui-btn-primary" lay-submit lay-filter="login">
                            登录
                        </button>
                    </div>
                    <div class="beg-clear"></div>
                </div>
            </form>
        </div>

    </div>
    <footer>
        <p>麻辣速递管理登录</p>
    </footer>
</div>

<script>
    layui.use(['layer', 'form'], function () {

        var layer = layui.layer,
            $ = layui.jquery,
            form = layui.form;

        form.on('submit(login)', function (data) {
            var userName = $("#userName").val();
            var password = $("#password").val();
            var postData = {
                "userName": userName,
                "password": password
            };
            $.ajax({
                type: "POST",
                url: "${path}system/sysLoginVerify.do",
                data: postData,
                success: function (retdata) {
                    if (retdata.code == 0) {
                        document.loginForm.submit();
                    } else {
                        layer.msg(retdata.msg);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                }
            });
            return false;
        });
    });


</script>
</body>

</html>