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
    <link rel="stylesheet" href="${path }/common/front/css/system/seller.css" media="all"/>
    <script type="text/javascript" src="${path}/oss2/lib/plupload-2.1.2/js/plupload.full.min.js"></script>
    <script type="text/javascript" src="${path}/common/js/uuid.js"></script>
</head>

<body>
<h1>上传文件</h1>

<div id="fileDiv">
    <div class="layui-upload-list" style="width: 200px;height: 200px" id="picDivId"></div>
    <div><button id="browse">选择文件</button></div>
    <div id="uploadInfo"></div>
</div>
<%--<button id="start_upload">开始上传</button>--%>

</body>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader = new plupload.Uploader({
        //这个是选择文件的button
        browse_button : 'browse',
        //服务器端的上传地址
        url : '${path}upload/file.do',

        filters: {
            mime_types : [ //只允许上传图片和zip文件
                { title : "Image files", extensions : "jpg,png" },
            ],
            max_file_size : '10mb', //最大只能上传10mb的文件
            prevent_duplicates : true //不允许选取重复文件
        },
    });
    //在实例对象上调用init()方法进行初始化
    uploader.init();

    //文件添加时，在容器里显示待上传的文件列表
    uploader.bind('FilesAdded',
        function(uploader, files) {
            if(files != null &&files.length>0){
                //在页面迭代显示
                $('#uploadInfo').html('<span>'+files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="'+files[0].id+'"></span></br>');
                uploader.start();
            }
        }
    );
    //文件上传进度显示
    uploader.bind('UploadProgress',
        function(uploader, file) {
            $('#'+file.id).html("   "+file.percent + "%");
        }
    );
    //单个文件上完成后事件
    uploader.bind('FileUploaded',
        function(up, file,result) {
            var resultJson = eval('(' + result.response + ')');
            if(resultJson.code!='0'){
                alert(resultJson.msg);
                $("#uploadInfo").html("<span>"+resultJson.msg+"</span>");
                $("#picDivId").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#picDivId").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 200px;height: 200px'/>");
            $("#uploadInfo").append("<span>上传成功</span>");
        }
    );

</script>



</html>
