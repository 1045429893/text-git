package com.hd.service.business;

import com.hd.api.business.MlsdStrengthService;
import com.hd.api.generator.MlsdMobileStrengthGeneratorService;
import com.hd.api.generator.MlsdStrengthGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdMobileStrengthVo;
import com.hd.entity.business.MlsdStrengthVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdMobileStrength;
import com.hd.entity.generator.MlsdStrength;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;

@Service
public class MlsdStrengthServiceImpl implements MlsdStrengthService {

    @Autowired
    MlsdStrengthGeneratorService mlsdStrengthGeneratorService;
    @Autowired
    MlsdMobileStrengthGeneratorService mlsdMobileStrengthGeneratorService;

    @Override
    public Object[] getMlsdStrength() {
        MlsdStrengthVo mlsdStrengthVo=new MlsdStrengthVo();
        MlsdStrength mlsdStrengthDB = mlsdStrengthGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdStrengthDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.STRENGTH_NOT_EXIST);
        }
        mlsdStrengthVo.setId(mlsdStrengthDB.getId() == null ? "" : mlsdStrengthDB.getId().toString());
        mlsdStrengthVo.setBanner1(mlsdStrengthDB.getBanner1()==null?"":mlsdStrengthDB.getBanner1());
        mlsdStrengthVo.setStrengthImgUrl1(mlsdStrengthDB.getStrengthImgUrl1()==null?"":mlsdStrengthDB.getStrengthImgUrl1());
        mlsdStrengthVo.setStrengthImgUrl2(mlsdStrengthDB.getStrengthImgUrl2()==null?"":mlsdStrengthDB.getStrengthImgUrl2());
        mlsdStrengthVo.setStrengthImgUrl3(mlsdStrengthDB.getStrengthImgUrl3()==null?"":mlsdStrengthDB.getStrengthImgUrl3());
        mlsdStrengthVo.setStrengthImgUrl4(mlsdStrengthDB.getStrengthImgUrl4()==null?"":mlsdStrengthDB.getStrengthImgUrl4());
        mlsdStrengthVo.setStrengthImgUrl5(mlsdStrengthDB.getStrengthImgUrl5()==null?"":mlsdStrengthDB.getStrengthImgUrl5());
        mlsdStrengthVo.setStrengthImgUrl6(mlsdStrengthDB.getStrengthImgUrl6()==null?"":mlsdStrengthDB.getStrengthImgUrl6());

        mlsdStrengthVo.setIntegrityShowImgUrl1(mlsdStrengthDB.getIntegrityShowImgUrl1()==null?"":mlsdStrengthDB.getIntegrityShowImgUrl1());
        mlsdStrengthVo.setIntegrityShowImgUrl2(mlsdStrengthDB.getIntegrityShowImgUrl2()==null?"":mlsdStrengthDB.getIntegrityShowImgUrl2());
        mlsdStrengthVo.setSignUpCaseImgUrl(mlsdStrengthDB.getSignUpCaseImgUrl()==null?"":mlsdStrengthDB.getSignUpCaseImgUrl());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdStrengthVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdStrength(MlsdStrength mlsdStrength) {
        if (!mlsdStrengthGeneratorService.updateByPrimaryKeySelective(mlsdStrength)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.STRENGTH_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getMlsdMobileStrength() {
        MlsdMobileStrengthVo mlsdMobileStrengthVo=new MlsdMobileStrengthVo();
        MlsdMobileStrength mlsdMobileStrengthDB = mlsdMobileStrengthGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdMobileStrengthDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.STRENGTH_NOT_EXIST);
        }
        mlsdMobileStrengthVo.setId(mlsdMobileStrengthDB.getId() == null ? "" : mlsdMobileStrengthDB.getId().toString());
        mlsdMobileStrengthVo.setStrengthImgUrl1(mlsdMobileStrengthDB.getStrengthImgUrl1()==null?"":mlsdMobileStrengthDB.getStrengthImgUrl1());
        mlsdMobileStrengthVo.setStrengthImgUrl2(mlsdMobileStrengthDB.getStrengthImgUrl2()==null?"":mlsdMobileStrengthDB.getStrengthImgUrl2());
        mlsdMobileStrengthVo.setStrengthImgUrl3(mlsdMobileStrengthDB.getStrengthImgUrl3()==null?"":mlsdMobileStrengthDB.getStrengthImgUrl3());
        mlsdMobileStrengthVo.setStrengthImgUrl4(mlsdMobileStrengthDB.getStrengthImgUrl4()==null?"":mlsdMobileStrengthDB.getStrengthImgUrl4());
        mlsdMobileStrengthVo.setStrengthImgUrl5(mlsdMobileStrengthDB.getStrengthImgUrl5()==null?"":mlsdMobileStrengthDB.getStrengthImgUrl5());
        mlsdMobileStrengthVo.setStrengthImgUrl6(mlsdMobileStrengthDB.getStrengthImgUrl6()==null?"":mlsdMobileStrengthDB.getStrengthImgUrl6());
        mlsdMobileStrengthVo.setStrengthImgUrl7(mlsdMobileStrengthDB.getStrengthImgUrl7()==null?"":mlsdMobileStrengthDB.getStrengthImgUrl7());
        mlsdMobileStrengthVo.setStrengthImgUrl8(mlsdMobileStrengthDB.getStrengthImgUrl8()==null?"":mlsdMobileStrengthDB.getStrengthImgUrl8());

        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdMobileStrengthVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdMobileStrength(MlsdMobileStrength mlsdMobileStrength) {
        if (!mlsdMobileStrengthGeneratorService.updateByPrimaryKeySelective(mlsdMobileStrength)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.STRENGTH_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}
