<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>系统用户</title>
    <style>
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

        .layui-input-block input {
            width: 60%;
        }
    </style>
</head>

<body>
<form class="layui-form" action="" id="sform">
    <div class="layui-form-item"></div>
    <div class="layui-form-item">
        <label class="layui-form-label">角色名</label>
        <div class="layui-input-block">
            <input type="text" name="name" required maxlength="20" lay-verify="required|rrolename" placeholder="请输入角色名称"
                   autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-block">
            <input type="text" name="note" maxlength="40" placeholder="请输入备注信息" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">角色类型</label>
        <div class="layui-input-block">
            <c:forEach items="${roleTypes}" var="roleType" varStatus="s">
                <input type="radio" name="roleType" value="${roleType.key}" title="${roleType.value}"
                       <c:if test="${s.index==0}">checked</c:if>
                >
            </c:forEach>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">权限:</label>
        <div class="layui-input-block">
            <c:forEach items="${authList}" var="auth">
                <input type="checkbox" id="auth" name="authIds" value="${auth.id}" title="${auth.name}">
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
    layui.use('form', function () {
        var form = layui.form;
        form.verify({

            rrolename: function (value) {
                var flag = true;
                $.ajax({
                    url: "${path}system/role/checkSysRolename.do",
                    data: {roleName: value},
                    async: false,
                    dataType: "json",
                    type: "POST",
                    success: function (cbd) {
                        flag = cbd.code == 0;
                    }
                });
                if (!flag) {
                    return "角色名重复";
                }
            }

        });
        //监听提交
        form.on('submit(formDemo)', function (data) {
            $.post("${path}system/role/addSysRole.do", $("#sform").serialize(), function (cbd) {

                if (cbd.code == "0") {
                    layer.alert("保存成功", function () {
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index);
                    });
                } else {
                    layer.alert(cbd.msg);
                }

            }, "json");
            return false;
        });
    });
</script>
</body>

</html>
