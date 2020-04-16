package com.hd.service.business;

import com.hd.api.business.MlsdHomePageService;
import com.hd.api.generator.MlsdHomePageGeneratorService;
import com.hd.api.generator.MlsdMobileHomePageGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdHomePageVo;
import com.hd.entity.business.MlsdMobileHomePageVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdHomePageExample;
import com.hd.entity.generator.MlsdMobileHomePage;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;
import java.util.List;

@Service
public class MlsdHomePageServiceImpl implements MlsdHomePageService {

    @Autowired
    MlsdHomePageGeneratorService mlsdHomePageGeneratorService;
    @Autowired
    MlsdMobileHomePageGeneratorService mlsdMobileHomePageGeneratorService;

    @Override
    public Object[] getMlsdHomePage() {
        MlsdHomePageVo mlsdHomePageVo = new MlsdHomePageVo();
        MlsdHomePage mlsdHomePageDB = mlsdHomePageGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdHomePageDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.HOME_PAGE_NOT_EXIST);
        }
        mlsdHomePageVo.setId(mlsdHomePageDB.getId() == null ? "" : mlsdHomePageDB.getId().toString());
        mlsdHomePageVo.setBanner1(mlsdHomePageDB.getBanner1()==null?"":mlsdHomePageDB.getBanner1());
        mlsdHomePageVo.setBanner21(mlsdHomePageDB.getBanner21()==null?"":mlsdHomePageDB.getBanner21());
        mlsdHomePageVo.setBanner22(mlsdHomePageDB.getBanner22()==null?"":mlsdHomePageDB.getBanner22());
        mlsdHomePageVo.setBanner23(mlsdHomePageDB.getBanner23()==null?"":mlsdHomePageDB.getBanner23());
        mlsdHomePageVo.setBanner31(mlsdHomePageDB.getBanner31()==null?"":mlsdHomePageDB.getBanner31());
        mlsdHomePageVo.setBanner32(mlsdHomePageDB.getBanner32()==null?"":mlsdHomePageDB.getBanner32());

        mlsdHomePageVo.setIntroduceTextImgUrl(mlsdHomePageDB.getIntroduceTextImgUrl()==null?"":mlsdHomePageDB.getIntroduceTextImgUrl());
        mlsdHomePageVo.setIntroduceProductImgUrl(mlsdHomePageDB.getIntroduceProductImgUrl()==null?"":mlsdHomePageDB.getIntroduceProductImgUrl());
        mlsdHomePageVo.setIntroduceIntroImgUrl(mlsdHomePageDB.getIntroduceIntroImgUrl()==null?"":mlsdHomePageDB.getIntroduceIntroImgUrl());

        mlsdHomePageVo.setProfitImgUrl(mlsdHomePageDB.getProfitImgUrl()==null?"":mlsdHomePageDB.getProfitImgUrl());
        mlsdHomePageVo.setProfitTextImgUrl(mlsdHomePageDB.getProfitTextImgUrl()==null?"":mlsdHomePageDB.getProfitTextImgUrl());

        mlsdHomePageVo.setShopSign1(mlsdHomePageDB.getShopSign1()==null?"":mlsdHomePageDB.getShopSign1());
        mlsdHomePageVo.setShopSign2(mlsdHomePageDB.getShopSign2()==null?"":mlsdHomePageDB.getShopSign2());
        mlsdHomePageVo.setShopSign3(mlsdHomePageDB.getShopSign3()==null?"":mlsdHomePageDB.getShopSign3());
        mlsdHomePageVo.setShopSign4(mlsdHomePageDB.getShopSign4()==null?"":mlsdHomePageDB.getShopSign4());

        mlsdHomePageVo.setShopSignBackground1(mlsdHomePageDB.getShopSignBackground1()==null?"":mlsdHomePageDB.getShopSignBackground1());
        mlsdHomePageVo.setShopSignBackground2(mlsdHomePageDB.getShopSignBackground2()==null?"":mlsdHomePageDB.getShopSignBackground2());
        mlsdHomePageVo.setShopSignBackground3(mlsdHomePageDB.getShopSignBackground3()==null?"":mlsdHomePageDB.getShopSignBackground3());
        mlsdHomePageVo.setShopSignBackground4(mlsdHomePageDB.getShopSignBackground4()==null?"":mlsdHomePageDB.getShopSignBackground4());

        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdHomePageVo);
    }


    @Override
    @Transactional
    public Object[] updateMlsdHomePage(MlsdHomePage mlsdHomePage) {
        if (!mlsdHomePageGeneratorService.updateByPrimaryKeySelective(mlsdHomePage)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.HOME_PAGE_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getMlsdMobileHomePage() {
        MlsdMobileHomePageVo mlsdMobileHomePageVo = new MlsdMobileHomePageVo();
        MlsdMobileHomePage mlsdHomePageDB = mlsdMobileHomePageGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdHomePageDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.HOME_PAGE_NOT_EXIST);
        }
        mlsdMobileHomePageVo.setId(mlsdHomePageDB.getId() == null ? "" : mlsdHomePageDB.getId().toString());
        mlsdMobileHomePageVo.setBanner(mlsdHomePageDB.getBanner()==null?"":mlsdHomePageDB.getBanner());
        mlsdMobileHomePageVo.setShowImage(mlsdHomePageDB.getShowImage()==null?"":mlsdHomePageDB.getShowImage());
        mlsdMobileHomePageVo.setText(mlsdHomePageDB.getText()==null?"":mlsdHomePageDB.getText());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdMobileHomePageVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdMobileHomePage(MlsdMobileHomePage mlsdMobileHomePage) {
        if (!mlsdMobileHomePageGeneratorService.updateByPrimaryKeySelective(mlsdMobileHomePage)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.HOME_PAGE_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }


}
