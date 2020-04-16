<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="${path}/common/front/css/system/seller.css" media="all"/>
<script type="text/javascript" src="${path}/oss2/lib/plupload-2.1.2/js/plupload.full.min.js"></script>
<script type="text/javascript" src="${path}/common/js/uuid.js"></script>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <style>

        .layui-upload-list {
            width: 100px;
            height: 100px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        .layui-upload-list img {
            width: 100%;
        }

    </style>
</head>

<body>
<form class="layui-form" action="" id="sform">
    <input type="hidden" id="topicId" name="topicId" value="">
    <%--<h2 class="new-account-title">首页配置</h2>--%>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">首页图1：</label>
            <div class="layui-input-inline">
                <div id="fileDiv01">
                    <input type="hidden" value="${mlsdHomePageVo.banner}" id="picPath01" name="picPath01">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic01" >
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdMobileHomePageVo.banner}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse01">选择文件</button>
                    </div>
                    <div id="uploadInfo01"></div>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">简介：</label>
                <div class="layui-input-inline">
                    <div>
                        <input type="text" value="${mlsdMobileHomePageVo.text}" id="text" name="text" class="layui-input">
                    </div>
                </div>
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">首页图2:</label>
            <div class="layui-input-inline">
                <div id="fileDiv02">
                    <input type="hidden" value="${mlsdHomePageVo.showImage}" id="picPath02" name="picPath02">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic02">
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdMobileHomePageVo.showImage}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse02">选择文件</button>
                    </div>
                    <div id="uploadInfo02"></div>
                </div>
            </div>
        </div>

    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="save">立即提交</button>
            <%--<button type="button" class="layui-btn layui-btn-primary" onclick="history.go(-1)">返回</button>--%>
        </div>
    </div>
</form>

<script>
    //Demo
    layui.use(['form', 'layer', 'laydate'], function () {
        var form = layui.form;
        var layer = layui.layer;
        var laydate = layui.laydate;
        //监听提交
        form.on('submit(save)', function (data) {
            $.post("${path}mlsd/homePage/updateMlsdMobileHomePage.do", data.field, function (cbd) {
                if (cbd.code == "0") {
                    layer.open({
                        title: '提示'
                        , content: '保存成功'
                        , offset: 't', area: ['100px', '160px']
                        , yes: function () {
                            layer.closeAll();
                        }
                    });
                } else {
                    layer.open({
                        title: '提示'
                        , content: cbd.msg
                        , offset: 't', area: ['100px', '160px']
                    });
                }
            }, "json");
            return false;
        });
        $('.layui-upload-img').click(function () {
            console.log($(this).attr('src'))
            var imgSrc = $(this).attr('src')
            layer.open({
                type: 1
                , title: false
                , area: ['500px', '300px']
                ,offset: 't'
                , closeBtn: 0
                , skin: 'layui-layer-nobg'
                , shadeClose: true
                , content: ' <img src=' + imgSrc + ' style="width:100%;height:auto;"/>'
                , scrollbar: false
            })
        })

    });

</script>


<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader1 = new plupload.Uploader({
        browse_button: 'browse01',
        //服务器端的上传地址
        url: '${path}upload/file.do',
        filters: {
            mime_types: [ //只允许上传图片和zip文件
                {title: "Image files", extensions: "jpg,png"},
            ],
            max_file_size: '10mb', //最大只能上传10mb的文件
            prevent_duplicates: true //不允许选取重复文件
        },
    });
    uploader1.init();
    uploader1.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo01').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader1.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader1.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo01").html("<span>" + resultJson.msg + "</span>");
                $("#pic01").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic01").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath01").val(resultJson.fileName);
            $("#uploadInfo01").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader2 = new plupload.Uploader({
        browse_button: 'browse02',
        //服务器端的上传地址
        url: '${path}upload/file.do',
        filters: {
            mime_types: [ //只允许上传图片和zip文件
                {title: "Image files", extensions: "jpg,png"},
            ],
            max_file_size: '10mb', //最大只能上传10mb的文件
            prevent_duplicates: true //不允许选取重复文件
        },
    });
    uploader2.init();
    uploader2.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo02').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader2.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader2.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo02").html("<span>" + resultJson.msg + "</span>");
                $("#pic02").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic02").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath02").val(resultJson.fileName);
            $("#uploadInfo02").append("<span>上传成功</span>");
        }
    );
</script>

</body>

</html>
