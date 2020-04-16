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
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">店面展示1：</label>
            <div class="layui-input-inline">
                <div id="fileDiv05">
                    <input type="hidden" value="${mlsdMobileJoinInvestmentVo.imgUrl1}" id="picPath05" name="picPath05">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic05">
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdMobileJoinInvestmentVo.imgUrl1}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse05">选择文件</button>
                    </div>
                    <div id="uploadInfo05"></div>
                </div>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">店面展示2：</label>
            <div class="layui-input-inline">
                <div id="fileDiv06">
                    <input type="hidden" value="${mlsdMobileJoinInvestmentVo.imgUrl2}" id="picPath06" name="picPath06">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic06">
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdMobileJoinInvestmentVo.imgUrl2}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse06">选择文件</button>
                    </div>
                    <div id="uploadInfo06"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">店面展示3：</label>
            <div class="layui-input-inline">
                <div id="fileDiv07">
                    <input type="hidden" value="${mlsdMobileJoinInvestmentVo.imgUrl3}" id="picPath07" name="picPath07">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic07">
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdMobileJoinInvestmentVo.imgUrl3}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse07">选择文件</button>
                    </div>
                    <div id="uploadInfo07"></div>
                </div>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">店面展示4：</label>
            <div class="layui-input-inline">
                <div id="fileDiv08">
                    <input type="hidden" value="${mlsdMobileJoinInvestmentVo.imgUrl4}" id="picPath08" name="picPath08">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic08">
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdMobileJoinInvestmentVo.imgUrl4}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse08">选择文件</button>
                    </div>
                    <div id="uploadInfo08"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">店面展示5：</label>
            <div class="layui-input-inline">
                <div id="fileDiv09">
                    <input type="hidden" value="${mlsdMobileJoinInvestmentVo.imgUrl5}" id="picPath09" name="picPath09">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic09">
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdMobileJoinInvestmentVo.imgUrl5}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse09">选择文件</button>
                    </div>
                    <div id="uploadInfo09"></div>
                </div>
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">店面展示6：</label>
            <div class="layui-input-inline">
                <div id="fileDiv10">
                    <input type="hidden" value="${mlsdMobileJoinInvestmentVo.imgUrl6}" id="picPath10" name="picPath10">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic10">
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdMobileJoinInvestmentVo.imgUrl6}" style='width: 100px;height: 100px'/>

                    </div>
                    <div>
                        <button id="browse10">选择文件</button>
                    </div>
                    <div id="uploadInfo10"></div>
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
            $.post("${path}mlsd/joinInvestment/updateMlsdMobileJoinInvestment.do", data.field, function (cbd) {
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
    var uploader5 = new plupload.Uploader({
        browse_button: 'browse05',
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
    uploader5.init();
    uploader5.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo05').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader5.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader5.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo05").html("<span>" + resultJson.msg + "</span>");
                $("#pic05").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic05").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath05").val(resultJson.fileName);
            $("#uploadInfo05").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader6 = new plupload.Uploader({
        browse_button: 'browse06',
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
    uploader6.init();
    uploader6.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo06').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader6.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader6.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo06").html("<span>" + resultJson.msg + "</span>");
                $("#pic06").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic06").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath06").val(resultJson.fileName);
            $("#uploadInfo06").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader7 = new plupload.Uploader({
        browse_button: 'browse07',
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
    uploader7.init();
    uploader7.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo07').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader7.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader7.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo07").html("<span>" + resultJson.msg + "</span>");
                $("#pic07").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic07").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath07").val(resultJson.fileName);
            $("#uploadInfo07").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader8 = new plupload.Uploader({
        browse_button: 'browse08',
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
    uploader8.init();
    uploader8.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo08').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader8.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader8.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo08").html("<span>" + resultJson.msg + "</span>");
                $("#pic08").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic08").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath08").val(resultJson.fileName);
            $("#uploadInfo08").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader9 = new plupload.Uploader({
        browse_button: 'browse09',
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
    uploader9.init();
    uploader9.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo09').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader9.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader9.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo09").html("<span>" + resultJson.msg + "</span>");
                $("#pic09").html("");
                //下面把自己的隐藏域再置空
                return;
            }
            $("#pic09").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath09").val(resultJson.fileName);
            $("#uploadInfo09").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader10 = new plupload.Uploader({
        browse_button: 'browse10',
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
    uploader10.init();
    uploader10.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo10').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader10.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader10.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo10").html("<span>" + resultJson.msg + "</span>");
                $("#pic10").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic10").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath10").val(resultJson.fileName);
            $("#uploadInfo10").append("<span>上传成功</span>");
        }
    );
</script>

</body>

</html>
