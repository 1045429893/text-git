<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html>

<html>

<head>
    <meta charset="utf-8">
    <title></title>

    <link rel="stylesheet" type="text/css" href="${path }/common/css/easyui.css">
    <script type="text/javascript" src="${path }/common/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${path }/common/js/easyui-extend.js"></script>
    <script type="text/javascript" src="${path }/system/js/sysResourceTreeConvert.js"></script>
    <style>
        .layui-input{ width: 75%; }
        .margin-15{ margin-top: 15px;}
        .tree-title{ line-height: normal;}
    </style>
</head>

<body >
<form class="layui-form" action="">

    <div class="layui-form-item margin-15">
        <label class="layui-form-label">权限名称</label>
        <div class="layui-input-block">
            <input type="text" value="${authority.name}" name="name" id="name" lay-verify="required|exist" placeholder="请输入"
                   autocomplete="off"
                   class="layui-input">

            <input type="hidden" value="${operate}" name="operate" id="operate">
            <input type="hidden" value="${authority.id}" name="authorityId" id="authorityId">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">权限描述</label>
        <div class="layui-input-block">
            <input type="text" value="${authority.note}" name="note" id="note" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">权限描述</label>
        <div class="layui-input-block">
            <ul style="text-align: left;" id="resourceTree"></ul>
        </div>
    </div>


    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" type="button" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>

</form>
<script>
    layui.use('form', function () {
        var form = layui.form;

        //自定义验证规则
        form.verify({
            exist: function (value) {//判断权限名称是否存在
                var operate = $("#operate").val();
                var authorityId = $("#authorityId").val();

                var data = {"name": value,"operate":operate,"authorityId":authorityId};
                var flag = true;
                $.ajax({
                    type: "POST",
                    url: "${path}/system/authority/checkAuthoritName.do",
                    data: data,
                    async: false,
                    success: function (data) {
                        flag = data.flag
                    }, error: function (XMLHttpRequest, textStatus, errorThrown) {
                        $.messager.alert('系统异常', '系统异常,请稍后再试');
                    }
                });
                if (!flag) {
                    return "权限名称已存在";
                }
            }

        });

        //监听提交
        form.on('submit(demo1)', function (data) {
                var operate = $("#operate").val();
                var name = $("#name").val();
                var note = $("#note").val();
                var authorityId = $("#authorityId").val();
                var resources = $("#resourceTree").tree('getCheckedExt');
                var resourcesIds = "";
                for (var i = 0; i < resources.length; i++) {
                    if (i == resources.length - 1) {
                        resourcesIds = resourcesIds + resources[i].resourcesId;
                    } else {
                        resourcesIds = resourcesIds + resources[i].resourcesId + ",";
                    }
                }
                var data = {
                    "operate": operate,
                    "name": name,
                    "note": note,
                    "authorityId": authorityId,
                    "resourcesIds": resourcesIds
                };
                $.ajax({
                    type: "POST",
                    url: "${path}system/authority/addOrUpdateAuthortiy.do",
                    data: data,
                    success: function (data) {
                        layer.msg(data.msg);
                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        $.messager.alert('系统异常', '系统异常,请稍后再试');
                    }
                });
                return false;
            }
        );


    });

    $("document").ready(function () {
        var operate = $("#operate").val();
        var authorityId = $("#authorityId").val();
        var data = "operate=" + operate + "&authorityId=" + authorityId + "&date=" + new Date();
        $.ajax({
            type: "POST",
            url: "${path}system/authority/getResourceTree.do",
            data: data,
            success: function (data) {
                $('#resourceTree').tree({
                    data: convert(data),
                    animate: true,
                    lines: true,
                    checkbox: (operate != 'VIEW')
                });
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                $.messager.alert('系统异常', '系统异常,请稍后再试');
            }
        });
    });

</script>
</body>


</html>