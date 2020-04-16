package com.hd.service.business;

import com.hd.api.business.CompanyProfileService;
import com.hd.api.generator.MlsdCompanyProfileGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.common.utils.TimeUtils;
import com.hd.entity.business.CompanyProfileVo;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdCompanyProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;

@Service
public class CompanyProfileServiceImpl implements CompanyProfileService {

    @Autowired
    MlsdCompanyProfileGeneratorService mlsdCompanyProfileGeneratorService;

    @Override
    public Object[] getCompanyProfile() {
        CompanyProfileVo companyProfileVo = new CompanyProfileVo();
        MlsdCompanyProfile companyProfileDB = mlsdCompanyProfileGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.COMPANY_PROFILE_ID));
        if (companyProfileDB == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.COMPANY_BASE_NOT_EXIST);
        }
        companyProfileVo.setId(companyProfileDB.getId() == null ? "" : companyProfileDB.getId().toString());
        companyProfileVo.setUrl(companyProfileDB.getUrl() == null ? "" : companyProfileDB.getUrl());
        companyProfileVo.setEmail(companyProfileDB.getEmail() == null ? "" : companyProfileDB.getEmail());
        companyProfileVo.setIsShow(companyProfileDB.getIsShow() == null ? "" : companyProfileDB.getIsShow().toString());
        companyProfileVo.setHotLine(companyProfileDB.getHotLine() == null ? "" : companyProfileDB.getHotLine());
        companyProfileVo.setCompanyName(companyProfileDB.getCompanyName() == null ? "" : companyProfileDB.getCompanyName());
        companyProfileVo.setDownloadLink(companyProfileDB.getDownloadLink() == null ? "" : companyProfileDB.getDownloadLink());
        companyProfileVo.setCompanyAddress(companyProfileDB.getCompanyAddress() == null ? "" : companyProfileDB.getCompanyAddress());
        companyProfileVo.setCreateTime(companyProfileDB.getCreateTime() == null ? "" : TimeUtils.convertDateToString(companyProfileDB.getCreateTime(), TimeUtils.FORMAT1));
        companyProfileVo.setUpdateTime(companyProfileDB.getUpdateTime() == null ? "" : TimeUtils.convertDateToString(companyProfileDB.getUpdateTime(), TimeUtils.FORMAT1));
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, companyProfileVo);
    }


    @Override
    @Transactional
    public Object[] updateCompanyProfile(MlsdCompanyProfile mlsdCompanyProfile) {
        if (!mlsdCompanyProfileGeneratorService.updateByPrimaryKeySelective(mlsdCompanyProfile)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.COMPANY_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}
