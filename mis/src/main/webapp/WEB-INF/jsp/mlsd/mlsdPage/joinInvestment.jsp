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
            <label class="layui-form-label">首页轮播图：</label>
            <div class="layui-input-inline">
                <div id="fileDiv01">
                    <input type="hidden" value="${mlsdJoinInvestmentVo.banner1}" id="picPath01" name="picPath01">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic01" >
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdJoinInvestmentVo.banner1}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse01">选择文件</button>
                    </div>
                    <div id="uploadInfo01"></div>
                </div>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">合作加盟图1:</label>
            <div class="layui-input-inline">
                <div id="fileDiv02">
                    <input type="hidden" value="${mlsdJoinInvestmentVo.partnershipImgUrl1}" id="picPath02" name="picPath02">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic02">
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdJoinInvestmentVo.partnershipImgUrl1}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse02">选择文件</button>
                    </div>
                    <div id="uploadInfo02"></div>
                </div>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">合作加盟图2：</label>
            <div class="layui-input-inline">
                <div id="fileDiv03">
                    <input type="hidden" value="${mlsdJoinInvestmentVo.partnershipImgUrl2}" id="picPath03" name="picPath03">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic03">
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdJoinInvestmentVo.partnershipImgUrl2}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse03">选择文件</button>
                    </div>
                    <div id="uploadInfo03"></div>
                </div>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">合作加盟图片3：</label>
            <div class="layui-input-inline">
                <div id="fileDiv04">
                    <input type="hidden" value="${mlsdJoinInvestmentVo.partnershipImgUrl3}" id="picPath04" name="picPath04">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic04">
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdJoinInvestmentVo.partnershipImgUrl3}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse04">选择文件</button>
                    </div>
                    <div id="uploadInfo04"></div>
                </div>
            </div>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">店面展示1：</label>
            <div class="layui-input-inline">
                <div id="fileDiv05">
                    <input type="hidden" value="${mlsdJoinInvestmentVo.imgUrl1}" id="picPath05" name="picPath05">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic05">
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdJoinInvestmentVo.imgUrl1}" style='width: 100px;height: 100px'/>
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
                    <input type="hidden" value="${mlsdJoinInvestmentVo.imgUrl2}" id="picPath06" name="picPath06">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic06">
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdJoinInvestmentVo.imgUrl2}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse06">选择文件</button>
                    </div>
                    <div id="uploadInfo06"></div>
                </div>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">店面展示3：</label>
            <div class="layui-input-inline">
                <div id="fileDiv07">
                    <input type="hidden" value="${mlsdJoinInvestmentVo.imgUrl3}" id="picPath07" name="picPath07">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic07">
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdJoinInvestmentVo.imgUrl3}" style='width: 100px;height: 100px'/>
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
                    <input type="hidden" value="${mlsdJoinInvestmentVo.imgUrl4}" id="picPath08" name="picPath08">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic08">
                        <img class="layui-upload-img" src="${frontPicPath}${mlsdJoinInvestmentVo.imgUrl4}" style='width: 100px;height: 100px'/>
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
                    <input type="hidden" value="${mlsdJoinInvestmentVo.imgUrl5}" id="picPath09" name="picPath09">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic09">
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdJoinInvestmentVo.imgUrl5}" style='width: 100px;height: 100px'/>
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
                    <input type="hidden" value="${mlsdJoinInvestmentVo.imgUrl6}" id="picPath10" name="picPath10">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic10">
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdJoinInvestmentVo.imgUrl6}" style='width: 100px;height: 100px'/>

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
        <div class="layui-inline">
            <label class="layui-form-label">店面展示7：</label>
            <div class="layui-input-inline">
                <div id="fileDiv11">
                    <input type="hidden" value="${mlsdJoinInvestmentVo.imgUrl7}" id="picPath11" name="picPath11">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic11">
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdJoinInvestmentVo.imgUrl7}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse11">选择文件</button>
                    </div>
                    <div id="uploadInfo11"></div>
                </div>
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">店面展示8：</label>
            <div class="layui-input-inline">
                <div id="fileDiv12">
                    <input type="hidden" value="${mlsdJoinInvestmentVo.imgUrl8}" id="picPath12" name="picPath12">
                    <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic12">
                        <img class="layui-upload-img"  src="${frontPicPath}${mlsdJoinInvestmentVo.imgUrl8}" style='width: 100px;height: 100px'/>
                    </div>
                    <div>
                        <button id="browse12">选择文件</button>
                    </div>
                    <div id="uploadInfo12"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">合作流程图：</label>
        <div class="layui-input-inline">
            <div id="fileDiv13">
                <input type="hidden" value="${mlsdJoinInvestmentVo.partnershipImgUrl}" id="picPath13" name="picPath13">
                <div class="layui-upload-list" style="width: 100px;height: 100px" id="pic13">
                    <img class="layui-upload-img"  src="${frontPicPath}${mlsdJoinInvestmentVo.partnershipImgUrl}" style='width: 100px;height: 100px'/>
                </div>
                <div>
                    <button id="browse13">选择文件</button>
                </div>
                <div id="uploadInfo13"></div>
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
            $.post("${path}mlsd/joinInvestment/updateMlsdJoinInvestment.do", data.field, function (cbd) {
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

<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader3 = new plupload.Uploader({
        browse_button: 'browse03',
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
    uploader3.init();
    uploader3.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo03').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader3.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader3.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo03").html("<span>" + resultJson.msg + "</span>");
                $("#pic03").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic03").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath03").val(resultJson.fileName);
            $("#uploadInfo03").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader4 = new plupload.Uploader({
        browse_button: 'browse04',
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
    uploader4.init();
    uploader4.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo04').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader4.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader4.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo04").html("<span>" + resultJson.msg + "</span>");
                $("#pic04").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic04").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath04").val(resultJson.fileName);
            $("#uploadInfo04").append("<span>上传成功</span>");
        }
    );
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
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader11 = new plupload.Uploader({
        browse_button: 'browse11',
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
    uploader11.init();
    uploader11.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo11').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader11.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader11.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo11").html("<span>" + resultJson.msg + "</span>");
                $("#pic11").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic11").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath11").val(resultJson.fileName);
            $("#uploadInfo11").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader12 = new plupload.Uploader({
        browse_button: 'browse12',
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
    uploader12.init();
    uploader12.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo12').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader12.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader12.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo12").html("<span>" + resultJson.msg + "</span>");
                $("#pic12").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic12").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath12").val(resultJson.fileName);
            $("#uploadInfo12").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader13 = new plupload.Uploader({
        browse_button: 'browse13',
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
    uploader13.init();
    uploader13.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo13').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader13.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader13.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo13").html("<span>" + resultJson.msg + "</span>");
                $("#pic13").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic13").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath13").val(resultJson.fileName);
            $("#uploadInfo13").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader14 = new plupload.Uploader({
        browse_button: 'browse14',
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
    uploader14.init();
    uploader14.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo14').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader14.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader14.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo14").html("<span>" + resultJson.msg + "</span>");
                $("#pic14").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic14").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath14").val(resultJson.fileName);
            $("#uploadInfo14").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader15 = new plupload.Uploader({
        browse_button: 'browse15',
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
    uploader15.init();
    uploader15.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo15').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader15.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader15.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo15").html("<span>" + resultJson.msg + "</span>");
                $("#pic15").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic15").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath15").val(resultJson.fileName);
            $("#uploadInfo15").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader16 = new plupload.Uploader({
        browse_button: 'browse16',
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
    uploader16.init();
    uploader16.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo16').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader16.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader16.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo12").html("<span>" + resultJson.msg + "</span>");
                $("#pic12").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic16").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath16").val(resultJson.fileName);
            $("#uploadInfo16").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader17 = new plupload.Uploader({
        browse_button: 'browse17',
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
    uploader17.init();
    uploader17.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo17').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader17.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader17.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo17").html("<span>" + resultJson.msg + "</span>");
                $("#pic17").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic17").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath17").val(resultJson.fileName);
            $("#uploadInfo17").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader18 = new plupload.Uploader({
        browse_button: 'browse18',
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
    uploader18.init();
    uploader18.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo18').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader18.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader18.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo18").html("<span>" + resultJson.msg + "</span>");
                $("#pic18").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic18").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath18").val(resultJson.fileName);
            $("#uploadInfo18").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader19 = new plupload.Uploader({
        browse_button: 'browse19',
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
    uploader19.init();
    uploader19.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo19').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader19.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader19.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo19").html("<span>" + resultJson.msg + "</span>");
                $("#pic19").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic19").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#picPath19").val(resultJson.fileName);
            $("#uploadInfo19").append("<span>上传成功</span>");
        }
    );
</script>
<script type="text/javascript">
    //实例化一个plupload上传对象
    var uploader20 = new plupload.Uploader({
        browse_button: 'browse20',
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
    uploader20.init();
    uploader20.bind('FilesAdded',
        function (uploader, files) {
            if (files != null && files.length > 0) {
                //在页面迭代显示
                $('#uploadInfo20').html('<span>' + files[0].name + ' (' + plupload.formatSize(files[0].size) + ')</span><span id="' + files[0].id + '"></span></br>');
                uploader.start();
            }
        }
    );
    uploader20.bind('UploadProgress',
        function (uploader, file) {
            $('#' + file.id).html("   " + file.percent + "%");
        }
    );
    uploader20.bind('FileUploaded',
        function (up, file, result) {
            var resultJson = eval('(' + result.response + ')');
            if (resultJson.code != '0') {
                alert(resultJson.msg);
                $("#uploadInfo20").html("<span>" + resultJson.msg + "</span>");
                $("#pic20").html("");
                //下面把自己的隐藏域再置空
                return;
            }

            $("#pic20").html("<img src=\"" + resultJson.fileUrl + "\" style='width: 100px;height: 100px'/>");
            $("#uploadInfo20").append("<span>上传成功</span>");
        }
    );
</script>
</body>

</html>
