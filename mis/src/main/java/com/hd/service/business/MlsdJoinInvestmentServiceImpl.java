package com.hd.service.business;

import com.hd.api.business.MlsdJoinInvestmentService;
import com.hd.api.generator.MlsdJoinInvestmentGeneratorService;
import com.hd.api.generator.MlsdMobileJoinInvestmentGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdJoinInvestmentVo;
import com.hd.entity.business.MlsdMobileJoinInvestmentVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdJoinInvestment;
import com.hd.entity.generator.MlsdMobileJoinInvestment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;

@Service
public class MlsdJoinInvestmentServiceImpl implements MlsdJoinInvestmentService {

    @Autowired
    MlsdJoinInvestmentGeneratorService mlsdJoinInvestmentGeneratorService;
    @Autowired
    MlsdMobileJoinInvestmentGeneratorService mlsdMobileJoinInvestmentGeneratorService;

    @Override
    public Object[] getMlsdJoinInvestment() {
        MlsdJoinInvestmentVo mlsdJoinInvestmentVo = new MlsdJoinInvestmentVo();
        MlsdJoinInvestment mlsdJoinInvestmentDB = mlsdJoinInvestmentGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdJoinInvestmentDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.JOIN_INVESTMENT_NOT_EXIST);
        }
        mlsdJoinInvestmentVo.setId(mlsdJoinInvestmentDB.getId() == null ? "" : mlsdJoinInvestmentDB.getId().toString());
        mlsdJoinInvestmentVo.setBanner1(mlsdJoinInvestmentDB.getBanner1()==null?"":mlsdJoinInvestmentDB.getBanner1());
        mlsdJoinInvestmentVo.setPartnershipImgUrl(mlsdJoinInvestmentDB.getPartnershipImgUrl()==null?"":mlsdJoinInvestmentDB.getPartnershipImgUrl());
        mlsdJoinInvestmentVo.setPartnershipImgUrl1(mlsdJoinInvestmentDB.getPartnershipImgUrl1()==null?"":mlsdJoinInvestmentDB.getPartnershipImgUrl1());
        mlsdJoinInvestmentVo.setPartnershipImgUrl2(mlsdJoinInvestmentDB.getPartnershipImgUrl2()==null?"":mlsdJoinInvestmentDB.getPartnershipImgUrl2());
        mlsdJoinInvestmentVo.setPartnershipImgUrl3(mlsdJoinInvestmentDB.getPartnershipImgUrl3()==null?"":mlsdJoinInvestmentDB.getPartnershipImgUrl3());
        mlsdJoinInvestmentVo.setImgUrl1(mlsdJoinInvestmentDB.getImgUrl1()==null?"":mlsdJoinInvestmentDB.getImgUrl1());
        mlsdJoinInvestmentVo.setImgUrl2(mlsdJoinInvestmentDB.getImgUrl2()==null?"":mlsdJoinInvestmentDB.getImgUrl2());
        mlsdJoinInvestmentVo.setImgUrl3(mlsdJoinInvestmentDB.getImgUrl3()==null?"":mlsdJoinInvestmentDB.getImgUrl3());
        mlsdJoinInvestmentVo.setImgUrl4(mlsdJoinInvestmentDB.getImgUrl4()==null?"":mlsdJoinInvestmentDB.getImgUrl4());
        mlsdJoinInvestmentVo.setImgUrl5(mlsdJoinInvestmentDB.getImgUrl5()==null?"":mlsdJoinInvestmentDB.getImgUrl5());
        mlsdJoinInvestmentVo.setImgUrl6(mlsdJoinInvestmentDB.getImgUrl6()==null?"":mlsdJoinInvestmentDB.getImgUrl6());
        mlsdJoinInvestmentVo.setImgUrl7(mlsdJoinInvestmentDB.getImgUrl7()==null?"":mlsdJoinInvestmentDB.getImgUrl7());
        mlsdJoinInvestmentVo.setImgUrl8(mlsdJoinInvestmentDB.getImgUrl8()==null?"":mlsdJoinInvestmentDB.getImgUrl8());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdJoinInvestmentVo);
    }

    @Override
    public Object[] updateMlsdJoinInvestment(MlsdJoinInvestment mlsdJoinInvestment) {
        if (!mlsdJoinInvestmentGeneratorService.updateByPrimaryKeySelective(mlsdJoinInvestment)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.JOIN_INVESTMENT_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getMlsdMobileJoinInvestment() {
        MlsdMobileJoinInvestmentVo mlsdMobileJoinInvestmentVo = new MlsdMobileJoinInvestmentVo();
        MlsdMobileJoinInvestment mlsdMobileJoinInvestmentDB = mlsdMobileJoinInvestmentGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdMobileJoinInvestmentDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.JOIN_INVESTMENT_NOT_EXIST);
        }
        mlsdMobileJoinInvestmentVo.setId(mlsdMobileJoinInvestmentDB.getId()==null?"":mlsdMobileJoinInvestmentDB.getId().toString());
        mlsdMobileJoinInvestmentVo.setImgUrl1(mlsdMobileJoinInvestmentDB.getImgUrl1()==null?"":mlsdMobileJoinInvestmentDB.getImgUrl1());
        mlsdMobileJoinInvestmentVo.setImgUrl2(mlsdMobileJoinInvestmentDB.getImgUrl2()==null?"":mlsdMobileJoinInvestmentDB.getImgUrl2());
        mlsdMobileJoinInvestmentVo.setImgUrl3(mlsdMobileJoinInvestmentDB.getImgUrl3()==null?"":mlsdMobileJoinInvestmentDB.getImgUrl3());
        mlsdMobileJoinInvestmentVo.setImgUrl4(mlsdMobileJoinInvestmentDB.getImgUrl4()==null?"":mlsdMobileJoinInvestmentDB.getImgUrl4());
        mlsdMobileJoinInvestmentVo.setImgUrl5(mlsdMobileJoinInvestmentDB.getImgUrl5()==null?"":mlsdMobileJoinInvestmentDB.getImgUrl5());
        mlsdMobileJoinInvestmentVo.setImgUrl6(mlsdMobileJoinInvestmentDB.getImgUrl6()==null?"":mlsdMobileJoinInvestmentDB.getImgUrl6());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdMobileJoinInvestmentVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdMobileJoinInvestment(MlsdMobileJoinInvestment mlsdMobileJoinInvestment) {
        if (!mlsdMobileJoinInvestmentGeneratorService.updateByPrimaryKeySelective(mlsdMobileJoinInvestment)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.JOIN_INVESTMENT_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}
