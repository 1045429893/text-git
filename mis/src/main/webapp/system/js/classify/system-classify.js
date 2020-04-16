var Classify = function () {
};
Classify.checkRow = null; //鼠标选择表格那一项
Classify.prototype.ctx = null;



/**
 * 创建品类表格树
 * @param jsonData json类型数据
 */
Classify.prototype.createClassifyTreeGrid = function () {
    var that = this;
    $('#classifyList').treegrid({
        url:that.ctx+'system/sysClassify/findClassifyList.do',
        idField: 'id',
        treeField: 'classifyName',
        title: "",
        fitColumns: true,
        loadMsg:'正在加载数据...',
        columns: [[
            {field: 'classifyName', title: '品类名称', width: ($('#classifyList').width() * 0.5), align: 'left',
                formatter: function (value,row,index) {
                    return '<input type=\'text\' value=\''+row.orderNumber+'\' onblur=\'classify.updateSort('+row.id+',this)\' style=\'width:10%\'>'+value;
                }
            },
            {field: 'orderNumber', title: '操作', width: ($('#classifyList').width() * 0.1), align: 'right',
                formatter:function(value,row,index){
                    var ht= '<a href=\'javascript:void(0);\' onclick=\'classify.goUpdate('+row.id+')\'><i class=\'layui-icon\' style=\'color: #009688;\'>&#xe642;</i></a>' +
                        '<a href=\'javascript:void(0);\' onclick=\'classify.delClassify('+row.id+')\'><i class=\'layui-icon\' style=\'color: #FF5722;\'>&#xe640;</i></a>' +
                        '<a href=\'javascript:void(0);\' onclick=\'classify.goSeeClassify('+row.id+')\'><i class=\'layui-icon\' style=\'color: #009688;\'>&#xe60a;</i></a>';

                    if(row.level<3){
                        ht='<a href=\'javascript:void(0);\' onclick=\'classify.goAdd('+row.id+','+row.level+')\'><i class=\'layui-icon\' style=\'color: #1E9FFF;\'>&#xe654;</i></a>'+ht;
                    }
                    return ht;
                }
            }
        ]]
    });
};
Classify.prototype.updateSort=function(id,obj){
    var that=this;
    var orderNumber=$(obj).val();
    var reg = /^[1-9]\d*$/;
    if(!reg.test(orderNumber)){
        layer.alert('请输入有效的数字',function(index){
            $(obj).focus();
            $(obj).select();
            layer.close(index);
        });
        return false;
    }
    $.ajax({
        url:that.ctx+'system/sysClassify/updateClassify.do',
        data:{id:id,orderNumber:orderNumber},
        type:'POST',
        async:false,
        success:function(data){
            if(data.code==0){
                layer.alert('排序成功',{offset:'200px',area: ['100px', '150px']});
            }else{
                layer.alert(data.msg,{offset:'200px',area: ['100px', '150px']});
            }
        },
        error : function(XMLHttpRequest, textStatus, errorThrown) {
            alert( '系统异常,请稍后再试');
        }
    });

    $('#classifyList').treegrid('reload');
}
Classify.prototype.goAdd=function(id,level){
    var that=this;
    var lvl=parseInt(level)+1;
    layer.open({
        title: '添加商品品类',
        maxmin: true,
        type: 2,
        skin: 'layui-layer-rim',
        content: that.ctx+'system/sysClassify/goAddClassify.do?parentId='+id+'&level='+lvl,
        area: ['600px', '500px'], //宽高
        offset:'100px',
        btn: [ '关闭'],
        shade: false,
        move:false,
        end: function(index, layero){
            $('#classifyList').treegrid('reload');
        }
    });
}
Classify.prototype.goUpdate=function(id){
    var that=this;
    layer.open({
        title: '修改商品品类',
        maxmin: true,
        type: 2,
        skin: 'layui-layer-rim',
        content: that.ctx+'system/sysClassify/goUpdateClassify.do?id='+id,
        area: ['600px', '500px'], //宽高
        offset:'100px',
        btn: [ '关闭'],
        shade: false,
        move:false,
        end: function(index, layero){
            $('#classifyList').treegrid('reload');
        }
    });
}
Classify.prototype.goSeeClassify=function(id){
    var that=this;
    layer.open({
        title: '查看商品品类',
        maxmin: true,
        type: 2,
        skin: 'layui-layer-rim',
        content: that.ctx+'system/sysClassify/goSeeMallClassify.do?id='+id,
        area: ['650px', '500px'], //宽高
        offset:'100px',
        btn: [ '关闭'],
        shade: false,
        move:false,
        end: function(index, layero){
            $('#classifyList').treegrid('reload');
        }
    });
}
Classify.prototype.delClassify=function(id){
    var that=this;
    layer.confirm('确定删除这个品类么？', function(index){
        var flag=true;
        $.ajax({
            url:that.ctx+'system/sysClassify/checkDelClassify.do',
            data:{id:id},
            type:'POST',
            async:false,
            success:function(data){
                if(data.code!=0){
                    layer.alert(data.msg,{offset:'200px',area: ['100px', '150px']});
                    flag=false;
                }
            },
            error : function(XMLHttpRequest, textStatus, errorThrown) {
                alert( '系统异常,请稍后再试');
            }
        });
        if(!flag){
            return false;
        }
        $.ajax({
            url:that.ctx+'system/sysClassify/deleteClassify.do',
            data:{id:id},
            type:'POST',
            async:false,
            success:function(data){
                if(data.code==0){
                    layer.alert('删除成功',{offset:'200px',area: ['100px', '150px']});
                    $('#classifyList').treegrid('reload');
                }else{
                    layer.alert(data.msg,{offset:'200px',area: ['100px', '150px']});
                }
            },
            error : function(XMLHttpRequest, textStatus, errorThrown) {
                alert( '系统异常,请稍后再试');
            }
        });
        layer.close(index);
    });
}
var classify = new Classify();
