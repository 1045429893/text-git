package com.hd.service.business;

import com.hd.api.business.MlsdBrandCultureService;
import com.hd.api.business.MlsdHomePageService;
import com.hd.api.generator.MlsdBrandCultureGeneratorService;
import com.hd.api.generator.MlsdHomePageGeneratorService;
import com.hd.api.generator.MlsdMobileBrandCultureGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.*;
import com.hd.entity.generator.MlsdBrandCulture;
import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdMobileBrandCulture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;

@Service
public class MlsdBrandCiltureServiceImpl implements MlsdBrandCultureService {

    @Autowired
    MlsdBrandCultureGeneratorService mlsdBrandCultureGeneratorService;
    @Autowired
    MlsdMobileBrandCultureGeneratorService mlsdMobileBrandCultureGeneratorService;

    @Override
    public Object[] getMlsdBrandCulture() {
        MlsdBrandCultureVo mlsdBrandCultureVo = new MlsdBrandCultureVo();
        MlsdBrandCulture mlsdBrandCultureDB = mlsdBrandCultureGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdBrandCultureDB == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.BAND_CULTURE_NOT_EXIST);
        }
        mlsdBrandCultureVo.setId(mlsdBrandCultureDB.getId() == null ? "" : mlsdBrandCultureDB.getId().toString());
        mlsdBrandCultureVo.setBanner1(mlsdBrandCultureDB.getBanner1() == null ? "" : mlsdBrandCultureDB.getBanner1());
        mlsdBrandCultureVo.setIntroduceIntroImgUrl(mlsdBrandCultureDB.getIntroduceIntroImgUrl() == null ? "" : mlsdBrandCultureDB.getIntroduceIntroImgUrl());
        mlsdBrandCultureVo.setIntroduceProductImgUrl(mlsdBrandCultureDB.getIntroduceProductImgUrl() == null ? "" : mlsdBrandCultureDB.getIntroduceProductImgUrl());
        mlsdBrandCultureVo.setProductFeatureImgUrl(mlsdBrandCultureDB.getProductFeatureImgUrl() == null ? "" : mlsdBrandCultureDB.getProductFeatureImgUrl());
        mlsdBrandCultureVo.setProductPositioningImgUrl(mlsdBrandCultureDB.getProductPositioningImgUrl() == null ? "" : mlsdBrandCultureDB.getProductPositioningImgUrl());
        mlsdBrandCultureVo.setIntroduceTextImgUrl(mlsdBrandCultureDB.getIntroduceTextImgUrl() == null ? "" : mlsdBrandCultureDB.getIntroduceTextImgUrl());
        mlsdBrandCultureVo.setProductPositioningTextImgUrl(mlsdBrandCultureDB.getProductPositioningTextImgUrl() == null ? "" : mlsdBrandCultureDB.getProductPositioningTextImgUrl());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdBrandCultureVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdBrandCulture(MlsdBrandCulture mlsdBrandCulture) {
        if (!mlsdBrandCultureGeneratorService.updateByPrimaryKeySelective(mlsdBrandCulture)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.BAND_CULTURE_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getMlsdMobileBrandCulture() {
        MlsdMobileBrandCultureVo mlsdMobileBrandCultureVo = new MlsdMobileBrandCultureVo();
        MlsdMobileBrandCulture mlsdMobileBrandCulture = mlsdMobileBrandCultureGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdMobileBrandCulture == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.BAND_CULTURE_NOT_EXIST);
        }
        mlsdMobileBrandCultureVo.setId(mlsdMobileBrandCulture.getId() == null ? "" : mlsdMobileBrandCulture.getId().toString());
        mlsdMobileBrandCultureVo.setIntroduceProductImgUrl(mlsdMobileBrandCulture.getIntroduceProductImgUrl() == null ? "" : mlsdMobileBrandCulture.getIntroduceProductImgUrl());
        mlsdMobileBrandCultureVo.setIntroduceTextImgUrl(mlsdMobileBrandCulture.getIntroduceTextImgUrl() == null ? "" : mlsdMobileBrandCulture.getIntroduceTextImgUrl());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdMobileBrandCultureVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdMobileBrandCulture(MlsdMobileBrandCulture mlsdMobileBrandCulture) {
        if (!mlsdMobileBrandCultureGeneratorService.updateByPrimaryKeySelective(mlsdMobileBrandCulture)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.BAND_CULTURE_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}
