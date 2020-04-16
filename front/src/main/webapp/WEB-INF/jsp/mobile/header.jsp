<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common_mobile.jsp"%>




<div class="header-con clearfix">
    <div class="header-wrap">
        <span class="header-name">${mlsdCompanyProfile.companyName}</span>
        <span class="header-add">总部地址：${mlsdCompanyProfile.companyAddress}</span>
    </div>
    <div class="header-tel">
        ${mlsdCompanyProfile.hotLine}
    </div>
</div>


