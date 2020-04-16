package com.hd.service.business;

import com.hd.api.business.MlsdItemAdvantageService;
import com.hd.api.generator.MlsdItemAdvantageGeneratorService;
import com.hd.api.generator.MlsdMobileItemAdvantageGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdItemAdvantageVo;
import com.hd.entity.business.MlsdMobileItemAdvantageVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdItemAdvantage;
import com.hd.entity.generator.MlsdMobileItemAdvantage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;

@Service
public class MlsdItemAdvantageServiceImpl implements MlsdItemAdvantageService {

    @Autowired
    MlsdItemAdvantageGeneratorService mlsdItemAdvantageGeneratorService;
    @Autowired
    MlsdMobileItemAdvantageGeneratorService mlsdMobileItemAdvantageGeneratorService;
    @Override
    public Object[] getMlsdItemAdvantage() {
        MlsdItemAdvantageVo mlsdItemAdvantageVo = new MlsdItemAdvantageVo();
        MlsdItemAdvantage mlsdItemAdvantageDB = mlsdItemAdvantageGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdItemAdvantageDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.ITEM_ADVANTAGE_NOT_EXIST);
        }
        mlsdItemAdvantageVo.setId(mlsdItemAdvantageDB.getId() == null ? "" : mlsdItemAdvantageDB.getId().toString());
        mlsdItemAdvantageVo.setBanner1(mlsdItemAdvantageDB.getBanner1()==null?"":mlsdItemAdvantageDB.getBanner1());
        mlsdItemAdvantageVo.setCompanyShowsAdvantageImgUrl(mlsdItemAdvantageDB.getCompanyShowsAdvantageImgUrl()==null?"":mlsdItemAdvantageDB.getCompanyShowsAdvantageImgUrl());
        mlsdItemAdvantageVo.setCompanyShowsImgUrl(mlsdItemAdvantageDB.getCompanyShowsImgUrl()==null?"":mlsdItemAdvantageDB.getCompanyShowsImgUrl());
        mlsdItemAdvantageVo.setCompanyShowsTextImgUrl(mlsdItemAdvantageDB.getCompanyShowsTextImgUrl()==null?"":mlsdItemAdvantageDB.getCompanyShowsTextImgUrl());
        mlsdItemAdvantageVo.setCompanyShowsTitleImgUrl(mlsdItemAdvantageDB.getCompanyShowsTitleImgUrl()==null?"":mlsdItemAdvantageDB.getCompanyShowsTitleImgUrl());
        mlsdItemAdvantageVo.setSupportImgUrl(mlsdItemAdvantageDB.getSupportImgUrl()==null?"":mlsdItemAdvantageDB.getSupportImgUrl());

        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdItemAdvantageVo);
    }


    @Override
    @Transactional
    public Object[] updateMlsdItemAdvantage(MlsdItemAdvantage mlsdItemAdvantage) {
        if (!mlsdItemAdvantageGeneratorService.updateByPrimaryKeySelective(mlsdItemAdvantage)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.ITEM_ADVANTAGE_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getMlsdMobileItemAdvantage() {
        MlsdMobileItemAdvantageVo mlsdMobileItemAdvantageVo = new MlsdMobileItemAdvantageVo();
        MlsdMobileItemAdvantage mlsdItemAdvantageDB = mlsdMobileItemAdvantageGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdItemAdvantageDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.ITEM_ADVANTAGE_NOT_EXIST);
        }
        mlsdMobileItemAdvantageVo.setId(mlsdItemAdvantageDB.getId() == null ? "" : mlsdItemAdvantageDB.getId().toString());
        mlsdMobileItemAdvantageVo.setShowImage1(mlsdItemAdvantageDB.getShowImage1()==null?"":mlsdItemAdvantageDB.getShowImage1());
        mlsdMobileItemAdvantageVo.setShowImage2(mlsdItemAdvantageDB.getShowImage2()==null?"":mlsdItemAdvantageDB.getShowImage2());
        mlsdMobileItemAdvantageVo.setText1(mlsdItemAdvantageDB.getText1()==null?"":mlsdItemAdvantageDB.getText1());
        mlsdMobileItemAdvantageVo.setText2(mlsdItemAdvantageDB.getText2()==null?"":mlsdItemAdvantageDB.getText2());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdMobileItemAdvantageVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdMobileItemAdvantage(MlsdMobileItemAdvantage mlsdMobileItemAdvantage) {
        if (!mlsdMobileItemAdvantageGeneratorService.updateByPrimaryKeySelective(mlsdMobileItemAdvantage)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.ITEM_ADVANTAGE_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}
