<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common_mobile.jsp"%>

<ul class="footer-list clearfix">
    <li><a href="${path}/mobile/index.do" class="active">首页</a></li>
    <li><a href="${path}/mobile/goBrand.do" >品牌</a></li>
    <li><a href="${path}/mobile/goAdvantage.do" >项目</a></li>
    <li><a href="${path}/mobile/goJoin.do" >招商</a></li>
    <li><a href="${path}/mobile/goProduct.do" >产品</a></li>
    <li><a href="${path}/mobile/goShowShop.do" >门店</a></li>
    <li><a href="${path}/mobile/goStrength.do" >实力</a></li>
    <li><a href="${path}/mobile/goContact.do" >服务</a></li>
</ul>
<div class="footer-wrap clearfix">
    <div class="footer-address">
        <span>品牌加盟热线：${mlsdCompanyProfile.hotLine}</span>
        <span>总部地址：${mlsdCompanyProfile.companyAddress}</span>
    </div>
    <div class="footer-web">
        <span>邮箱：${mlsdCompanyProfile.email}</span>
        <span>网址：${mlsdCompanyProfile.url}</span>
        <span><a style="color: #ffffff" href="http://www.beian.miit.gov.cn"> 版权所有备案号：黑ICP备16008503号-3</a></span>
    </div>
</div>

