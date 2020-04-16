package com.hd.service.business;

import com.hd.api.business.MlsdHomePageService;
import com.hd.api.business.MlsdStoreDisplayService;
import com.hd.api.generator.MlsdHomePageGeneratorService;
import com.hd.api.generator.MlsdStoreDisplayGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.*;
import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdJoinInvestment;
import com.hd.entity.generator.MlsdMobileStoreDisplay;
import com.hd.entity.generator.MlsdStoreDisplay;
import com.hd.service.generator.MlsdMobileStoreDisplayGeneratorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;

@Service
public class MlsdStoreDisplayServiceImpl implements MlsdStoreDisplayService {

    @Autowired
    MlsdStoreDisplayGeneratorService mlsdStoreDisplayGeneratorService;

    @Autowired
    MlsdMobileStoreDisplayGeneratorServiceImpl mlsdMobileStoreDisplayGeneratorService;

    @Override
    public Object[] getMlsdStoreDisplay() {
        MlsdStoreDisplayVo mlsdStoreDisplayVo = new MlsdStoreDisplayVo();
        MlsdStoreDisplay mlsdStoreDisplayDB = mlsdStoreDisplayGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdStoreDisplayDB == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.STROE_DISPLAY_NOT_EXIST);
        }
        mlsdStoreDisplayVo.setId(mlsdStoreDisplayDB.getId() == null ? "" : mlsdStoreDisplayDB.getId().toString());
        mlsdStoreDisplayVo.setBanner1(mlsdStoreDisplayDB.getBanner1() == null ? "" : mlsdStoreDisplayDB.getBanner1());

        mlsdStoreDisplayVo.setMakeShowImgUrl1(mlsdStoreDisplayDB.getMakeShowImgUrl1() == null ? "" : mlsdStoreDisplayDB.getMakeShowImgUrl1());
        mlsdStoreDisplayVo.setMakeShowImgUrl2(mlsdStoreDisplayDB.getMakeShowImgUrl2() == null ? "" : mlsdStoreDisplayDB.getMakeShowImgUrl2());
        mlsdStoreDisplayVo.setMakeShowImgUrl3(mlsdStoreDisplayDB.getMakeShowImgUrl3() == null ? "" : mlsdStoreDisplayDB.getMakeShowImgUrl3());
        mlsdStoreDisplayVo.setMakeShowTitleImgUrl(mlsdStoreDisplayDB.getMakeShowTitleImgUrl() == null ? "" : mlsdStoreDisplayDB.getMakeShowTitleImgUrl());

        mlsdStoreDisplayVo.setStoreDisplayImgUrl1(mlsdStoreDisplayDB.getStoreDisplayImgUrl1() == null ? "" : mlsdStoreDisplayDB.getStoreDisplayImgUrl1());
        mlsdStoreDisplayVo.setStoreDisplayImgUrl2(mlsdStoreDisplayDB.getStoreDisplayImgUrl2() == null ? "" : mlsdStoreDisplayDB.getStoreDisplayImgUrl2());
        mlsdStoreDisplayVo.setStoreDisplayImgUrl3(mlsdStoreDisplayDB.getStoreDisplayImgUrl3() == null ? "" : mlsdStoreDisplayDB.getStoreDisplayImgUrl3());
        mlsdStoreDisplayVo.setStoreDisplayImgUrl4(mlsdStoreDisplayDB.getStoreDisplayImgUrl4() == null ? "" : mlsdStoreDisplayDB.getStoreDisplayImgUrl4());

        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdStoreDisplayVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdStoreDisplay(MlsdStoreDisplay mlsdStoreDisplay) {
        if (!mlsdStoreDisplayGeneratorService.updateByPrimaryKeySelective(mlsdStoreDisplay)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.STROE_DISPLAY_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getMlsdMobileStoreDisplay() {
        MlsdMobileStoreDisplayVo mlsdMobileStoreDisplayVo = new MlsdMobileStoreDisplayVo();
        MlsdMobileStoreDisplay mlsdMobileStoreDisplayDb = mlsdMobileStoreDisplayGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdMobileStoreDisplayDb == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.STROE_DISPLAY_NOT_EXIST);
        }
        mlsdMobileStoreDisplayVo.setId(mlsdMobileStoreDisplayDb.getId() == null ? "" : mlsdMobileStoreDisplayDb.getId().toString());
        mlsdMobileStoreDisplayVo.setStoreDisplayImgUrl1(mlsdMobileStoreDisplayDb.getStoreDisplayImgUrl1() == null ? "" : mlsdMobileStoreDisplayDb.getStoreDisplayImgUrl1());
        mlsdMobileStoreDisplayVo.setStoreDisplayImgUrl2(mlsdMobileStoreDisplayDb.getStoreDisplayImgUrl2() == null ? "" : mlsdMobileStoreDisplayDb.getStoreDisplayImgUrl2());
        mlsdMobileStoreDisplayVo.setStoreDisplayImgUrl3(mlsdMobileStoreDisplayDb.getStoreDisplayImgUrl3() == null ? "" : mlsdMobileStoreDisplayDb.getStoreDisplayImgUrl3());
        mlsdMobileStoreDisplayVo.setStoreDisplayText(mlsdMobileStoreDisplayDb.getStoreDisplayText() == null ? "" : mlsdMobileStoreDisplayDb.getStoreDisplayText());

        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdMobileStoreDisplayVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdMobileStoreDisplay(MlsdMobileStoreDisplay mlsdMobileStoreDisplay) {
        if (!mlsdMobileStoreDisplayGeneratorService.updateByPrimaryKeySelective(mlsdMobileStoreDisplay)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.STROE_DISPLAY_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}
