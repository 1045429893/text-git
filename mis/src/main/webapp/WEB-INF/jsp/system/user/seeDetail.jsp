<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>查看用户信息</title>
<style>
    .layui-form-checked i, .layui-form-checked:hover i{ color:#75bbf6; }
    .layui-input-block input{
        width:60%;
    }
</style>
</head>

<body>
<form class="layui-form" action="">
    <div class="layui-form-item"></div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
            <input  type="text" name="username" value="${userInfo.username}" autocomplete="off" class="layui-input" readonly>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">电话</label>
        <div class="layui-input-block">
            <input type="text" name="phone" value="${userInfo.phone}" autocomplete="off" class="layui-input" readonly>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">真实姓名</label>
        <div class="layui-input-block">
            <input type="text" name="compellation"  value="${userInfo.compellation}" autocomplete="off" class="layui-input" readonly>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户类型</label>
        <div class="layui-input-block">
            <c:forEach items="${userTypes}" var="ut">
                <input type="radio" name="userType" value="${ut.key}" title="${ut.value}"
                       <c:if test="${userInfo.userType==ut.key}">checked</c:if> disabled
                >
            </c:forEach>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">角色:</label>
        <div class="layui-input-block">
            <c:if test="${roleList!=null}">
            <c:forEach items="${roleList}" var="role">
                <input type="checkbox" id="role" name="roleids" value="${role.id}" title="${role.name}" checked disabled>
            </c:forEach>
            </c:if>
        </div>
    </div>

</form>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;


    });
</script>
</body>

</html>
