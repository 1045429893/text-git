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
    <link rel="stylesheet" href=${path }common/front/css/system/btable.css/>
    <script type="text/javascript" src="${path }/common/front/layui/lay/modules/form.js"></script>
    <style>
        body{ background: #fff;}
        .layui-table-header .layui-table{ width:100%;}
        .layui-table-main  .layui-table{ width:100%;}
        .layui-table-cell .layui-form-checkbox{ top:5px;}
    </style>
</head>


<body >
<div style="height: 100%; margin:0px; background-color: white;">
    <blockquote class="layui-elem-quote">
        <form accept-charset="UTF-8" action="search.html" method="get" style="">
            <a href="javascript:;" class="layui-btn layui-btn-small" id="add">
                <i class="layui-icon">&#xe608;</i> 添加
            </a>
            <div style="margin-left: 20px; display: inline-block;">
                <label style="line-height: 30px; display: inline-block;">权限名称：</label>
                <input id="search_info_input_id" autocomplete="off" class="search-query span2" name="" placeholder=""
                       value="" type="text" style="line-height: 28px; position: relative; top:2px; padding-left: 2px;">
                <%--<button class="layui-btn layui-btn-small" name="button" type="submit" id="search"><i class="layui-icon"></i> 查询--%>
                <a href="javascript:;" class="layui-btn layui-btn-small" data-type="search_info">
                    <i class="fa fa-eye fa-lg"></i> 查询
                </a>
                </button>
            </div>
        </form>
    </blockquote>

    <div id="content" style="width: 100%;height: 100%;">
        <table class="layui-table" id="layui-table-id" lay-filter="authority" width="100%"></table>
    </div>
</div>
<script>
    layui.use('table', function () {
        var table = layui.table;
        var ins1 = table.render({
            elem: '#layui-table-id'
            , url: '${path}system/authority/getAuthortiyPage.do'
            , cols: [[
                {checkbox: true}
                , {field: 'id', width: 80, sort: true, title: 'ID'}
                , {field: 'name', width: 200, title: '权限名称'}
                , {field: 'note', width: 200, title: '描述'}
                , {field: 'createTime', width: 200, title: '创建时间'}
                , {field: 'updateTime', width: 200, title: '更新时间'}
                , {fixed: 'right', width: 150, align: 'center', toolbar: '#barDemo'}
            ]]
            , page: true
            , height: 450
            , id: "authority"
        });


        table.on('tool(authority)', function (obj) { //注：tool是工具条事件名，authority是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值
            var tr = obj.tr; //获得当前行 tr 的DOM对象

            if (layEvent === 'detail') { //查看
                //do somehing
                var aid = data.id;
                layer.open({
                    title: '查看权限',
                    maxmin: true,
                    type: 2,
                    skin: 'layui-layer-rim',
                    content: '${path}/system/authority/goAddOrUpdate.do?id=' + aid + '&operate=VIEW',
                    area: ['600px', '500px'], //宽高
                    btn: ['关闭'],
                    shade: false
//                    end: function(index, layero){
//                        $(".layui-laypage-btn").click();
//                    }
                });


            } else if (layEvent === 'del') { //删除
                layer.confirm('真的删除行么', function (index) {
                    //向服务端发送删除指令
                    var flag = true;
                    var postData = {"id": data.id};
                    $.ajax({
                        type: "POST",
                        url: "${path}/system/authority/deleteAuthortiy.do",
                        data: postData,
                        async: false,
                        success: function (data) {
                            if (data.code == "0") {
                                layer.alert("操作成功", function () {
                                    $(".layui-laypage-btn").click();
                                });
                            } else {
                                layer.alert("错误信息" + data.msg);
                            }

                        }, error: function (XMLHttpRequest, textStatus, errorThrown) {
                            $.messager.alert('系统异常', '系统异常,请稍后再试');
                        }
                    });
//                    ins1.reload({});
                });
            } else if (layEvent === 'edit') { //编辑
                //do something

                var data = obj.data; //获得当前行数据
                var layEvent = obj.event; //获得 lay-event 对应的值
                var tr = obj.tr; //获得当前行 tr 的DOM对象

                //do somehing
                var aid = data.id;
                layer.open({
                    title: '编辑权限',
                    maxmin: true,
                    type: 2,
                    skin: 'layui-layer-rim',
                    content: '${path}/system/authority/goAddOrUpdate.do?id=' + aid + '&operate=UPDATE',
                    area: ['600px', '500px'], //宽高
                    btn: ['关闭'],
                    shade: false
//                    end: function(index, layero){
//                        $(".layui-laypage-btn").click();
//                    }
                });
//
//                //同步更新缓存对应的值
//                obj.update({
//                    username: '123'
//                    , title: 'xxx'
//                });
            }
        });

        var $ = layui.$, active = {
            search_info: function () {
                var search_info = $("#search_info_input_id").val();
                if (search_info === null || "" === search_info) {
                    layer.alert("搜索内容不能为空");
                    return;
                }
                ins1.reload({
                    where: {
                        key: {
                            search_info: $("#search_info_input_id").val()
                        }
                    }
                });
            },
        };
        $('.layui-btn-small').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        $('#add').on('click', function () {
            layer.open({
                title: '添加',
                maxmin: true,
                type: 2,
                skin: 'layui-layer-rim',
                content: '${path}system/authority/goAddOrUpdate.do?operate=ADD',
                area: ['500px', '450px'], //宽高
                btn: ['关闭'],
                shade: false,
            });
        });
    });


</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-mini" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">删除</a>
</script>
</body>

</html>