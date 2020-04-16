package com.hd.service.business;

import com.hd.api.business.MlsdContactUsService;
import com.hd.api.generator.MlsdContactUsGeneratorService;
import com.hd.api.generator.MlsdMobileContactUsGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdContactUsVo;
import com.hd.entity.business.MlsdMobileContactUsVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdContactUs;
import com.hd.entity.generator.MlsdMobileContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;

@Service
public class MlsdContactUsServiceImpl implements MlsdContactUsService {

    @Autowired
    MlsdContactUsGeneratorService mlsdContactUsGeneratorService;

    @Autowired
    MlsdMobileContactUsGeneratorService mlsdMobileContactUsGeneratorService;

    @Override
    public Object[] getMlsdContactUs() {
        MlsdContactUsVo mlsdContactUsVo = new MlsdContactUsVo();
        MlsdContactUs mlsdContactUsDB = mlsdContactUsGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdContactUsDB == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.CONTACT_US_NOT_EXIST);
        }
        mlsdContactUsVo.setId(mlsdContactUsDB.getId() == null ? "" : mlsdContactUsDB.getId().toString());
        mlsdContactUsVo.setBanner1(mlsdContactUsDB.getBanner1() == null ? "" : mlsdContactUsDB.getBanner1());
        mlsdContactUsVo.setContactIcon(mlsdContactUsDB.getContactIcon() == null ? "" : mlsdContactUsDB.getContactIcon());
        mlsdContactUsVo.setImgUrl(mlsdContactUsDB.getImgUrl() == null ? "" : mlsdContactUsDB.getImgUrl());
        mlsdContactUsVo.setText1(mlsdContactUsDB.getText1() == null ? "" : mlsdContactUsDB.getText1());
        mlsdContactUsVo.setText2(mlsdContactUsDB.getText2() == null ? "" : mlsdContactUsDB.getText2());
        mlsdContactUsVo.setText3(mlsdContactUsDB.getText3() == null ? "" : mlsdContactUsDB.getText3());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdContactUsVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdContactUs(MlsdContactUs mlsdContactUs) {
        if (!mlsdContactUsGeneratorService.updateByPrimaryKeySelective(mlsdContactUs)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.CONTACT_US_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getMlsdMbileContactUs() {
        MlsdMobileContactUsVo mlsdMobileContactUsVo = new MlsdMobileContactUsVo();
        MlsdMobileContactUs mlsdMobileContactUsDB = mlsdMobileContactUsGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdMobileContactUsDB == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.CONTACT_US_NOT_EXIST);
        }
        mlsdMobileContactUsVo.setId(mlsdMobileContactUsDB.getId() == null ? "" : mlsdMobileContactUsDB.getId().toString());
        mlsdMobileContactUsVo.setImgUrl(mlsdMobileContactUsDB.getImgUrl() == null ? "" : mlsdMobileContactUsDB.getImgUrl());
        mlsdMobileContactUsVo.setText1(mlsdMobileContactUsDB.getText1() == null ? "" : mlsdMobileContactUsDB.getText1());
        mlsdMobileContactUsVo.setText2(mlsdMobileContactUsDB.getText2() == null ? "" : mlsdMobileContactUsDB.getText2());
        mlsdMobileContactUsVo.setText3(mlsdMobileContactUsDB.getText3() == null ? "" : mlsdMobileContactUsDB.getText3());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdMobileContactUsVo);
    }

    @Override
    public Object[] updateMlsdMobileContactUs(MlsdMobileContactUs mlsdMobileContactUs) {
        if (!mlsdMobileContactUsGeneratorService.updateByPrimaryKeySelective(mlsdMobileContactUs)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.CONTACT_US_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}
