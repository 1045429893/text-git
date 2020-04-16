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
            ,method:'post'
            ,url: '${path}system/role/findSysRoleByPage.do'
            ,cols: [[
                {checkbox:true}
                ,{field:'name', width:200,title:"角色名称"}
                ,{field:'note', width:200,title:"备注"}
                ,{field:'createTime', width:200, sort: true,title:"创建时间"}
                ,{field:'updateTime', width:200, sort: true,title:"最后修改时间"}
                ,{width:150,toolbar:'#fmtBtn',title:"操作"}
            ]]
            ,page: true
            ,height: 480
            ,limit:10
            ,id:"test"

        });


        $('#add').on('click', function() {
            layer.open({
                title: '添加新角色',
                maxmin: true,
                type: 2,
                skin: 'layui-layer-rim',
                content: '${path}system/role/goAddSysRole.do',
                area: ['500px', '450px'], //宽高
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
                    title: '修改角色',
                    maxmin: true,
                    type: 2,
                    skin: 'layui-layer-rim',
                    content: '${path}system/role/goUpdateSysRole.do?id='+update_id,
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
                        roleName: $("#search_info_input_id").val()

                    }
                });
            }
        };

        $('.layui-btn-small').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值
            var tr = obj.tr; //获得当前行 tr 的DOM对象

            if(layEvent === 'delete'){ //查看
                layer.confirm('确定删除这个角色么？', function(index){
                //do somehing
                $.ajax({
                    url:"${path}system/role/delSysRole.do",
                    data:{roleid:data.id},
                    async:false,
                    dataType:"json",
                    type:'POST',
                    success:function(cbd) {
                        if(cbd.code==0){
                            layer.alert("删除成功",function(){
                                $(".layui-laypage-btn").click();
                            });
                        }else{
                            layer.alert(cbd.msg);
                        }
                    }
                });
                });
            }else if(layEvent === 'detail'){
                layer.open({
                    title: '查看角色',
                    maxmin: true,
                    type: 2,
                    skin: 'layui-layer-rim',
                    content: '${path}system/role/goSeeSysRole.do?id='+data.id,
                    area: ['600px', '500px'], //宽高
                    btn: [ '关闭'],
                    shade: false
                });
            }
        });
    });


</script>
<script type="text/html" id="fmtBtn">
    <a class="layui-btn  layui-btn-mini" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="delete">删除</a>

</script>

</body>

</html>
