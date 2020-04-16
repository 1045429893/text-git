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

<body>
<div style="margin:0px; background-color: white;">
    <blockquote class="layui-elem-quote">
        <form>

            <div style="margin-left: 20px; display: inline-block;">
                <div class="layui-form-item">
                    <label class="layui-form-label">开始时间：</label>
                    <div class="layui-input-inline">
                        <%--<input type="checkbox" name="option1CheckBox" lay-skin="switch" lay-text="正确|错误"  style="float:left;">--%>
                        <input id="startTime" autocomplete="off" class="search-query span2" name="startTime" placeholder="" value=""
                               type="text" style="line-height: 28px; position: relative; top:2px; padding-left: 2px;" lay-verify="required">
                    </div>

                    <label class="layui-form-label">结束时间：</label>
                    <div class="layui-input-inline">
                        <%--           <input type="checkbox" name="option2CheckBox" lay-skin="switch" lay-text="正确|错误"  style="float:left;">--%>
                        <input id="endTime" autocomplete="off" class="search-query span2" name="endTime" placeholder="" value=""
                               type="text" style="line-height: 28px; position: relative; top:2px; padding-left: 2px;" lay-verify="required">
                    </div>

                    <a href="javascript:;" class="layui-btn layui-btn-small" data-type="search_info">
                        <i class="fa fa-eye fa-lg"></i> 查询
                    </a>
                </div>


            </div>

        </form>
    </blockquote>

    <div id="content" style="width: 100%;height: 533px;">
        <table id="test" lay-filter="test"></table>
    </div>
</div>


<script>
    layui.use(['form','layer','table','laydate'], function () {
        var $ = layui.jquery,
            layer = layui.layer;
        var table = layui.table;
        var laydate = layui.laydate;
        var form = layui.form;

        laydate.render({
            elem: '#startTime',
            type: 'datetime'
        });
        laydate.render({
            elem: '#endTime',
            type: 'datetime'
        });
        var tableIns = table.render({
            elem: '#test'
            , url: '${path}/mlsd/intendedUsers/getIntendedUsersList.do'
            , cols: [[
                {field: 'id', width: 60, align: 'center', title: 'ID'}
                , {field: 'userName', width: 100, align: 'center', title: '姓名'}
                , {field: 'tel', width: 200, align: 'center', title: '电话'}
                , {field: 'createTime', width: 200, align: 'center', title: '创建时间'}
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
                var startTime = $("#startTime").val();
                var endTime = $("#endTime").val();
                tableIns.reload({
                    where: {
                        startTime: startTime,
                        endTime: endTime,
                    }
                });
            },
        };
        $('.layui-btn-small').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });



    });
</script>
</body>

</html>