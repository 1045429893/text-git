<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>用户绑定角色</title>
    <style>

        .layui-input-block input{
            width:60%;
        }
    </style>
</head>

<body>
<form class="layui-form" action="" id="sform">
    <div class="layui-form-item">
    <input type="hidden" value="${userInfo.id}" name="userid">
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户名:</label>
        <div class="layui-input-block">
            <input type="text" value="${userInfo.username}" readonly class="layui-input">
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


        //监听提交
        form.on('submit(formDemo)', function(data){

            $.post("${path}system/user/updateSysUserRole.do",$("#sform").serialize(),function(cbd) {

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
</script>
</body>
</html>
