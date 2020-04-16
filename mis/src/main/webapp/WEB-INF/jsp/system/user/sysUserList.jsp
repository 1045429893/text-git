<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>
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
    <style>
        body{ background: #fff;}
        .layui-table-header .layui-table{ width:100%;}
        .layui-table-main  .layui-table{ width:100%;}
        .layui-table-cell .layui-form-checkbox{ top:5px;}
        .layui-form-checked[lay-skin=primary] i{     border-color: #75bbf6;
            background-color: #75bbf6;}

    </style>
</head>

<body >
<div style="margin:0px; background-color: white;">
    <blockquote class="layui-elem-quote">
        <form >
            <a href="javascript:;" class="layui-btn layui-btn-small" id="add">
            <i class="layui-icon">&#xe608;</i> 添加
            </a>
            <a href="javascript:;" class="layui-btn layui-btn-small" data-type="all_update">
                <i class="fa fa-pencil-square-o fa-lg"></i> 修改
            </a>

            <div style="margin-left: 20px; display: inline-block;">
                <label style="line-height: 30px; display: inline-block;">用户名称：</label>
                <input id="search_info_input_id" autocomplete="off" class="search-query span2" name="" placeholder="" value="" type="text" style="line-height: 28px; position: relative; top:2px; padding-left: 2px;">
                <button class="layui-btn layui-btn-small" data-type="search_info" type="button"><i class="layui-icon"></i> 查询
                </button>
            </div>
        </form>
    </blockquote>
    <div id="content" style="width: 100%;height: 533px;">
    <table id="test" lay-filter="test"></table>
    </div>
</div>

<script>
    layui.use(['table','layer'], function() {
        var $ = layui.jquery,
            layer = layui.layer;
        var table = layui.table;
        var tableIns=table.render({
            elem:'#test'
            ,url: '${path}system/user/findSysUserInfoList.do'
            ,method:'post'
            ,cols: [[
                {checkbox:true}
                ,{field:'username', width:200,title:"用户名"}
                ,{field:'compellation', width:200, title:"真实姓名"}
                ,{field:'statusStr', width:150,title:"状态"}
                ,{field:'userType', width:150,templet:'#fmtUserType',title:"用户类型"}
                ,{field:'createTime', width:200, title:"创建时间"}
                ,{field:'updateTime', width:200, title:"最后修改时间"}
                ,{width:180,toolbar:'#fmtBtn',title:"操作"}
            ]]
            ,page: true
            ,height: 480
            ,limit:10
            ,id:"test"

        });

        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值
            var tr = obj.tr; //获得当前行 tr 的DOM对象

            if(layEvent === 'updateStatus'){ //修改状态
                //do somehing
                var status=data.status==0?1:0;
                $.post("${path}system/user/updateSysUserInfo.do",{id:data.id,status:status},function(cbd) {
                    if(cbd.code=="0"){
                        layer.alert("修改成功",function(){
                            $(".layui-laypage-btn").click();
                        });
                    }else{
                        layer.alert(cbd.msg);
                    }

                },"json");


            } else if(layEvent === 'detail'){ //
                var uid=data.id;
                layer.open({
                    title: '查看用户',
                    maxmin: true,
                    type: 2,
                    skin: 'layui-layer-rim',
                    content: '${path}system/user/goSeeSysUserInfo.do?id='+uid,
                    area: ['600px', '500px'], //宽高
                    btn: [ '关闭'],
                    shade: false

                });

            }
        });
        $('#add').on('click', function() {
            layer.open({
                title: '添加新用户',
                maxmin: true,
                type: 2,
                skin: 'layui-layer-rim',
                content: '${path}system/user/goAddSysUserInfo.do',
                area: ['600px', '500px'], //宽高
                btn: [ '关闭'],
                shade: false,
                end: function(index, layero){
                    $(".layui-laypage-btn").click();
                }
            });
        });

        var $ = layui.$, active = {

            all_update: function(){
                var checkStatus = table.checkStatus('test')
                    ,data = checkStatus.data;
                if(data===null || data.length===0){
                    layer.alert("请选中数据");
                    return;
                }else if(data.length>1){
                    layer.alert("只能选中一条数据");
                    return;
                }
                var update_id = data[0].id;
                //处理修改操作 ajax
                layer.open({
                    title: '修改用户',
                    maxmin: true,
                    type: 2,
                    skin: 'layui-layer-rim',
                    content: '${path}system/user/goUpdateSysUserInfo.do?id='+update_id,
                    area: ['600px', '500px'], //宽高
                    btn: [ '关闭'],
                    shade: false,
                    end: function(index, layero){
                        $(".layui-laypage-btn").click();
                    }
                });


            },
            search_info: function(){
                var search_info = $("#search_info_input_id").val();
                if(search_info===null||""===search_info){
                    layer.alert("搜索内容不能为空");
                    return;
                }
                tableIns.reload({
                    where:{
                        userName: $("#search_info_input_id").val()

                    }
                });
            }
        };
        $('.layui-btn-small').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });


</script>
<script type="text/html" id="fmtStatus">
{{#if(d.status==0){}}
<span style="color:red">停用</span>
{{#  } else { }}
<span style="color:blue">启用</span>
{{#  } }}
</script>
<script type="text/html" id="fmtUserType">
    {{#if(d.userType==0){}}
    <span style="color:red">普通管理员</span>
    {{#  } else { }}
    <span style="color:blue">超级管理员</span>
    {{#  } }}
</script>
<script type="text/html" id="fmtBtn">
    {{#if(d.status==1){}}
    <a class="layui-btn layui-btn-mini" lay-event="updateStatus">启用</a>
    {{#  } else { }}
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="updateStatus">停用</a>
    {{#  } }}
    <a class="layui-btn  layui-btn-mini" lay-event="detail">查看</a>
</script>
</body>

</html>
