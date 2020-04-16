<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp"%>

<div class="header">
    <div class=" header-infor w1200 prelat clearfix">
        <div class="company">
            <p>${mlsdCompanyProfile.companyName}<br>总部地址：${mlsdCompanyProfile.companyAddress}</p>
        </div>
        <div class="tel clearfix">
            <p>品牌加盟<br>咨询热线</p>
            <span>${mlsdCompanyProfile.hotLine}</span>
        </div>
    </div>
</div>
<div class="menu">
    <div class="w1200">
        <div class="menum">
            <ul class="clearfix">
                <li><a href="${path}" class="active">首页</a></li>
                <li><a href="${path}/goBrand.do" >品牌文化</a></li>
                <li><a href="${path}/goAdvantage.do" >项目优势</a></li>
                <li><a href="${path}/goJoin.do" >招商加盟</a></li>
                <li class="nav-logo"><a href="${path}"  class="logo"><img src="${path}/mlsd/images/index/logo.png" alt=""></a></li>
                <li><a href="${path}/goProduct.do" >产品介绍</a></li>
                <li><a href="${path}/goShowShop.do" >门店展示</a></li>
                <li><a href="${path}/goStrength.do" >实力后台</a></li>
                <li><a href="${path}/goContact.do" >联系我们</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="kefu">
    <a href="javascript:;" style="	width: 136px;height: 380px;display: block;background: url(${picPath}${mlsdOnlineService.onlineIconRight}) no-repeat;"></a>
    <%--<a href="javascript:;" id="kefu" style="width: 107px;height: 107px;display: block;background: url(${picPath}${mlsdOnlineService.onlineIconLeft}) no-repeat;"> </a>--%>
</div>
<div class="ketel">
    <%--<a href="javascript:;" style="	width: 136px;height: 380px;display: block;background: url(${picPath}${mlsdOnlineService.onlineIconRight}) no-repeat;"></a>--%>
</div>

<script>
    var _hmt = _hmt || [];
    (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?65bbed356d5d17667c0b6ea8c2c9e4b0";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
<script>(function() {var _53code = document.createElement("script");_53code.src = "https://tb.53kf.com/code/code/10170004/1";var s = document.getElementsByTagName("script")[0]; s.parentNode.insertBefore(_53code, s);})();</script>