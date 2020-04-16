<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html>

<html>

<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">

</head>
<style>
    .layui-table-cell {
        height: auto;
        line-height: inherit;
        white-space: pre-wrap
    }
</style>
<body>
<div style="margin:0px; background-color: white;">
    <blockquote class="layui-elem-quote">
        <form>

            <div style="margin-left: 20px; display: inline-block;">
                <label style="line-height: 30px; display: inline-block;">姓名：</label>
                <input id="userName" autocomplete="off" class="search-query span2" name="userName"
                       placeholder=""  type="text">
                <label style="line-height: 30px; display: inline-block;">电话：</label>
                <input id="tel" autocomplete="off" class="search-query span2" name="tel"
                       placeholder=""  type="text">

                <label class="label-text">阅读状态：</label>
                <select id="isRead">
                    <option value="" selected>请选择</option>
                    <option value="0">未读</option>
                    <option value="1">已读</option>
                </select>

                <a href="javascript:;" class="layui-btn layui-btn-small" data-type="search_info">
                    <i class="fa fa-eye fa-lg"></i> 查询
                </a>
            </div>

        </form>
    </blockquote>

    <div id="content" style="width: 100%;height: 533px;">
        <table id="test" lay-filter="test"></table>
    </div>
</div>


<script>
    layui.use('table', function () {
        var $ = layui.jquery,
            layer = layui.layer;
        var table = layui.table;
        var form = layui.form;
        var tableIns = table.render({
            elem: '#test'
            , url: '${path}/mlsd/contactMessage/getContactMessageList.do'
            , cols: [[
                {field: 'contactMessageId', width: 60, align: 'center', title: 'ID'}
                , {field: 'userName', width: 100, align: 'center', title: '姓名'}
                , {field: 'address', width: 200, align: 'center', title: '地址'}
                , {field: 'tel', width: 100, align: 'center', title: '电话'}
                , {field: 'email', width: 100, align: 'center', title: '邮箱'}
                , {field: 'isReadStr', width: 100, align: 'center', title: '状态'}
                , {field: 'createTime', width: 150, align: 'center', title: '创建时间'}
                , {fixed: 'right', field: 'content', width: 300, align: 'center', title: '留言内容'}
                , {fixed: 'right', width: 200, align: 'center', title: '操作', toolbar: '#barDemo'}

            ]]
            , page: true
            , height: 400
            , limit: 20
            , id: "test"
            , method: 'post'
            , done: function (res, curr, count) {
            }
        });
        var $ = layui.$, active = {
            search_info: function () {
                var userName = $("#userName").val();
                var tel = $("#tel").val();
                var isRead = $("#isRead").val();
                tableIns.reload({
                    where: {
                        userName: userName,
                        tel: tel,
                        isRead:isRead
                    }
                });
            },
        };
        $('.layui-btn-small').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        table.on('tool(test)', function (obj) {
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            if (layEvent === 'update') { //修改
                $.post("${path}/mlsd/contactMessage/updateCompanyProfileIsRead.do", {id: data.contactMessageId,isReader:1}, function (cbd) {
                    if (cbd.code == "0") {
                        layer.alert("操作成功",{icon: 0,offset: '100px'}, function () {
                            $(".layui-laypage-btn").click();
                            layer.closeAll();
                        });
                    } else {
                        layer.alert(cbd.msg,{icon: 0,offset: '100px'});
                    }
                }, "json")
            }
        });

    });
</script>

<script type="text/html" id="barDemo">
    {{# if(d.isRead=='0'){ }}
    <a class="layui-btn layui-btn-mini" lay-event="update">已读</a>
    {{# } }}

</script>
</body>

</html>