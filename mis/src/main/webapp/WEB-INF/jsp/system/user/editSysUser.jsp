<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>系统用户</title>
    <style>
        .layui-form-radio i:hover, .layui-form-radioed i {
            color: #75bbf6;
        }

        .layui-form-checked, .layui-form-checked:hover {
            border-color: #75bbf6;
        }

        .layui-form-checked span, .layui-form-checked:hover span {
            background: #75bbf6;
        }

        .layui-form-checked i, .layui-form-checked:hover i {
            color: #75bbf6;
        }

        .layui-form-radio i:hover, .layui-form-radioed i {
            color: #75bbf6;
        }
        .layui-input-block input{
            width:60%;
        }
    </style>
</head>

<body>
<form class="layui-form" action="" id="sform">
    <div class="layui-form-item"></div>
    <input type="hidden" name="id" value="${userInfo.id}" id="userid">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
            <input type="text" value="${userInfo.username}" maxlength="20" name="username" required  lay-verify="required|rusername" placeholder="请输入用户名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">原密码</label>
        <div class="layui-input-inline">
            <input type="password" id="opassword" name="password1" maxlength="12" required lay-verify="required|oPassword" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>

    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">修改密码</label>
        <div class="layui-input-inline">
            <input type="password" id="fpass" name="password" maxlength="12" required lay-verify="required|passlength" placeholder="请输入密码" autocomplete="off" class="layui-input" onkeyup="check()">
        </div>
        <div class="layui-form-mid layui-word-aux"> <span id = "span" style="color: red" ></span>  </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">确认密码</label>
        <div class="layui-input-inline">
            <input type="password" id="rpass" maxlength="12"  required lay-verify="required|rpassword" placeholder="请再次输入密码" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">电话</label>
        <div class="layui-input-block">
            <input type="text" name="phone" value="${userInfo.phone}" lay-verify="sjh"  placeholder="请输入手机号码" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">真实姓名</label>
        <div class="layui-input-block">
            <input type="text" name="compellation" maxlength="10" value="${userInfo.compellation}"  placeholder="请输入真实姓名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户类型</label>
        <div class="layui-input-block">
            <c:forEach items="${userTypes}" var="ut">
                <input type="radio" name="userType" value="${ut.key}" title="${ut.value}"
                       <c:if test="${userInfo.userType==ut.key}">checked</c:if>
                >
            </c:forEach>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">角色:</label>
        <div class="layui-input-block">
            <c:forEach items="${roleList}" var="role">
                <input type="checkbox" id="role" name="roleids" value="${role.id}" title="${role.name}"
                <c:if test="${uList.size()>0}">
                <c:forEach items="${uList}" var="r">
                       <c:if test="${r.id==role.id}">checked</c:if>

                </c:forEach>
                </c:if>
                >
            </c:forEach>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;
        form.verify({
            oPassword: function(value){
                var opassword=$("#opassword").val();
                var userid=$("#userid").val();

                var flag=true;
                $.ajax({
                    url:"${path}system/user/checkSysUserPass.do",
                    data:{userPass:opassword,userid:userid},
                    async:false,
                    dataType:"json",
                    type:'POST',
                    success:function(cbd) {
                        flag=cbd.code==0;
                    }
                });
                if (!flag) {
                    return "原始密码错误";
                }
            },
            rpassword: function(value){
                var fpass=$("#fpass").val();
                if(value!=fpass){
                    return '两次输入的密码不一致';
                }
            },
            rusername:function(value){
                var userid=$("#userid").val();
                var flag=true;
                $.ajax({
                    url:"${path}system/user/checkSysUsername.do",
                    data:{userName:value,userid:userid},
                    async:false,
                    dataType:"json",
                    type:'POST',
                    success:function(cbd) {
                        flag=cbd.code==0;
                    }
                });
                if (!flag) {
                    return "用户名重复";
                }
                if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                    return '用户名不能有特殊字符';
                }
                if(/(^\_)|(\__)|(\_+$)/.test(value)){
                    return '用户名首尾不能出现下划线\'_\'';
                }
                if(/^\d+\d+\d$/.test(value)){
                    return '用户名不能全为数字';
                }
            },
            sjh:function(value) {
                if (!(/^1[34578]\d{9}$/.test(value))&&value!="") {
                    return "请输入正确的手机号";

                }
            }
        });
        //监听提交
        form.on('submit(formDemo)', function(data){
            $.post("${path}system/user/updateSysUserInfo.do",$("#sform").serialize(),function(cbd){

                if(cbd.code=="0"){
                    layer.alert("保存成功",function(){
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index);
                    });
                }else{
                    layer.alert(cbd.msg);
                }

            },"json");
            return false;
        });
    });
    function check() {
        var mima = document.getElementById("fpass").value;

        var sp = document.getElementById("span");

        if (mima.length == 0) {

            sp.innerHTML = "密码不能为空"

        } else if (mima.length < 8) {

            sp.innerHTML = "密码不能小于8个字符";

        } else if (mima.length >= 8 && mima.length < 16) {

            sp.innerHTML = "";

            var mmzz1 = /^[0-9]{8,16}$|^[a-zA-Z]{8,16}$/;

            var mmzz2 = /^[A-Za-z0-9]{8,16}$/;

            var mmzz3 = /^[ &*！#@A-Za-z0-9]{8,16}$/;

            if (mima.match(mmzz1)) {

                sp.innerHTML = "密码'弱'，建议字母大小写+数字+&*！#@";

            } else if (mima.match(mmzz2)) {

                sp.innerHTML = "密码'中'，建议字母大小写+数字+&*！#";

            } else if (mima.match(mmzz3)) {

                sp.innerHTML = "密码等级'强'";

            }

        } else if (mima.length >= 16) {

            sp.innerHTML = "长度大于16个字符，请重新输入";

        }}
</script>
</body>

</html>
