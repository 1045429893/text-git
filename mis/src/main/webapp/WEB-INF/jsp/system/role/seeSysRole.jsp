<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>角色信息</title>
    <style>
        .layui-form-checked i, .layui-form-checked:hover i{ color:#66b4f5;}
        .layui-input-block input{
            width:60%;
        }
    </style>
</head>

<body>
<form class="layui-form" action="" id="sform">
    <input type="hidden" name="id" id="roleid" value="${role.id}">
    <div class="layui-form-item"></div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
            <input type="text" name="name" value="${role.name}" autocomplete="off" class="layui-input" readonly>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-block">
            <input type="text" name="note"  value="${role.note}" autocomplete="off" class="layui-input" readonly>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">角色类型</label>
        <div class="layui-input-block">
            <c:forEach items="${roleTypes}" var="rt">
                <input type="radio" name="roleType" value="${rt.key}" title="${rt.value}"
                       <c:if test="${role.roleType==rt.key}">checked</c:if>
                 disabled>
            </c:forEach>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">权限:</label>
        <div class="layui-input-block">
            <c:forEach items="${authList}" var="auth">
                <input type="checkbox" id="auth" name="authIds" value="${auth.id}" title="${auth.name}"
                <c:if test="${uList.size()>0}">
                <c:forEach items="${uList}" var="r">
                       <c:if test="${r.id==auth.id}">checked</c:if>
                </c:forEach>
                </c:if>
                 disabled>
            </c:forEach>
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
