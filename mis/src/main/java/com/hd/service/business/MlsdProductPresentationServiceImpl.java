package com.hd.service.business;

import com.hd.api.business.MlsdProductPresentationService;
import com.hd.api.generator.MlsdMobileProductPresentationGeneratorService;
import com.hd.api.generator.MlsdProductPresentationGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdMobileProductPresentationVo;
import com.hd.entity.business.MlsdProductPresentationVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdMobileProductPresentation;
import com.hd.entity.generator.MlsdProductPresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;

@Service
public class MlsdProductPresentationServiceImpl implements MlsdProductPresentationService {

    @Autowired
    MlsdProductPresentationGeneratorService mlsdProductPresentationGeneratorService;
    @Autowired
    MlsdMobileProductPresentationGeneratorService mlsdMobileProductPresentationGeneratorService;

    @Override
    public Object[] getMlsdProductPresentation() {
        MlsdProductPresentationVo mlsdProductPresentationVo = new MlsdProductPresentationVo();
        MlsdProductPresentation mlsdProductPresentationDB = mlsdProductPresentationGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdProductPresentationDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.PRODUCT_PRESENTATION_NOT_EXIST);
        }
        mlsdProductPresentationVo.setId(mlsdProductPresentationDB.getId() == null ? "" : mlsdProductPresentationDB.getId().toString());
        mlsdProductPresentationVo.setBanner1(mlsdProductPresentationDB.getBanner1()==null?"":mlsdProductPresentationDB.getBanner1());
        mlsdProductPresentationVo.setNewRoductsImgUrl1(mlsdProductPresentationDB.getNewRoductsImgUrl1()==null?"":mlsdProductPresentationDB.getNewRoductsImgUrl1());
        mlsdProductPresentationVo.setNewRoductsImgUrl2(mlsdProductPresentationDB.getNewRoductsImgUrl2()==null?"":mlsdProductPresentationDB.getNewRoductsImgUrl2());
        mlsdProductPresentationVo.setNewRoductsImgUrl3(mlsdProductPresentationDB.getNewRoductsImgUrl3()==null?"":mlsdProductPresentationDB.getNewRoductsImgUrl3());
        mlsdProductPresentationVo.setNewRoductsImgUrl4(mlsdProductPresentationDB.getNewRoductsImgUrl4()==null?"":mlsdProductPresentationDB.getNewRoductsImgUrl4());
        mlsdProductPresentationVo.setNewRoductsImgUrl5(mlsdProductPresentationDB.getNewRoductsImgUrl5()==null?"":mlsdProductPresentationDB.getNewRoductsImgUrl5());
        mlsdProductPresentationVo.setNewRoductsImgUrl6(mlsdProductPresentationDB.getNewRoductsImgUrl6()==null?"":mlsdProductPresentationDB.getNewRoductsImgUrl6());
        mlsdProductPresentationVo.setNewRoductsImgUrl7(mlsdProductPresentationDB.getNewRoductsImgUrl7()==null?"":mlsdProductPresentationDB.getNewRoductsImgUrl7());
        mlsdProductPresentationVo.setNewRoductsImgUrl8(mlsdProductPresentationDB.getNewRoductsImgUrl8()==null?"":mlsdProductPresentationDB.getNewRoductsImgUrl8());

        mlsdProductPresentationVo.setNewRoductsTitle1(mlsdProductPresentationDB.getNewRoductsTitle1()==null?"":mlsdProductPresentationDB.getNewRoductsTitle1());
        mlsdProductPresentationVo.setNewRoductsTitle2(mlsdProductPresentationDB.getNewRoductsTitle2()==null?"":mlsdProductPresentationDB.getNewRoductsTitle2());
        mlsdProductPresentationVo.setNewRoductsTitle3(mlsdProductPresentationDB.getNewRoductsTitle3()==null?"":mlsdProductPresentationDB.getNewRoductsTitle3());
        mlsdProductPresentationVo.setNewRoductsTitle4(mlsdProductPresentationDB.getNewRoductsTitle4()==null?"":mlsdProductPresentationDB.getNewRoductsTitle4());
        mlsdProductPresentationVo.setNewRoductsTitle5(mlsdProductPresentationDB.getNewRoductsTitle5()==null?"":mlsdProductPresentationDB.getNewRoductsTitle5());
        mlsdProductPresentationVo.setNewRoductsTitle6(mlsdProductPresentationDB.getNewRoductsTitle6()==null?"":mlsdProductPresentationDB.getNewRoductsTitle6());
        mlsdProductPresentationVo.setNewRoductsTitle7(mlsdProductPresentationDB.getNewRoductsTitle7()==null?"":mlsdProductPresentationDB.getNewRoductsTitle7());
        mlsdProductPresentationVo.setNewRoductsTitle8(mlsdProductPresentationDB.getNewRoductsTitle8()==null?"":mlsdProductPresentationDB.getNewRoductsTitle8());

        mlsdProductPresentationVo.setSignatureCuisineimgUrl1(mlsdProductPresentationDB.getSignatureCuisineimgUrl1()==null?"":mlsdProductPresentationDB.getSignatureCuisineimgUrl1());
        mlsdProductPresentationVo.setSignatureCuisineimgUrl2(mlsdProductPresentationDB.getSignatureCuisineimgUrl2()==null?"":mlsdProductPresentationDB.getSignatureCuisineimgUrl2());
        mlsdProductPresentationVo.setSignatureCuisineimgUrl3(mlsdProductPresentationDB.getSignatureCuisineimgUrl3()==null?"":mlsdProductPresentationDB.getSignatureCuisineimgUrl3());
        mlsdProductPresentationVo.setSignatureCuisineimgUrl4(mlsdProductPresentationDB.getSignatureCuisineimgUrl4()==null?"":mlsdProductPresentationDB.getSignatureCuisineimgUrl4());
        mlsdProductPresentationVo.setSignatureCuisineimgUrl5(mlsdProductPresentationDB.getSignatureCuisineimgUrl5()==null?"":mlsdProductPresentationDB.getSignatureCuisineimgUrl5());
        mlsdProductPresentationVo.setSignatureCuisineimgUrl6(mlsdProductPresentationDB.getSignatureCuisineimgUrl6()==null?"":mlsdProductPresentationDB.getSignatureCuisineimgUrl6());

        mlsdProductPresentationVo.setProductListImgUrl(mlsdProductPresentationDB.getProductListImgUrl()==null?"":mlsdProductPresentationDB.getProductListImgUrl());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdProductPresentationVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdProductPresentation(MlsdProductPresentation mlsdProductPresentation) {
        if (!mlsdProductPresentationGeneratorService.updateByPrimaryKeySelective(mlsdProductPresentation)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.PRODUCT_PRESENTATION_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getMlsdMobileProductPresentation() {
        MlsdMobileProductPresentationVo mlsdMobileProductPresentationVo = new MlsdMobileProductPresentationVo();
        MlsdMobileProductPresentation mlsdMobileProductPresentationDB = mlsdMobileProductPresentationGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdMobileProductPresentationDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.PRODUCT_PRESENTATION_NOT_EXIST);
        }
        mlsdMobileProductPresentationVo.setId(mlsdMobileProductPresentationDB.getId() == null ? "" : mlsdMobileProductPresentationDB.getId().toString());

        mlsdMobileProductPresentationVo.setNewProductsTitleImgUrl(mlsdMobileProductPresentationDB.getNewProductsTitleImgUrl()==null?"":mlsdMobileProductPresentationDB.getNewProductsTitleImgUrl());
        mlsdMobileProductPresentationVo.setSignatureCuisineimgTitleImgUrl(mlsdMobileProductPresentationDB.getSignatureCuisineimgTitleImgUrl()==null?"":mlsdMobileProductPresentationDB.getSignatureCuisineimgTitleImgUrl());

        mlsdMobileProductPresentationVo.setSignatureCuisineimgUrl1(mlsdMobileProductPresentationDB.getSignatureCuisineimgUrl1()==null?"":mlsdMobileProductPresentationDB.getSignatureCuisineimgUrl1());
        mlsdMobileProductPresentationVo.setSignatureCuisineimgUrl2(mlsdMobileProductPresentationDB.getSignatureCuisineimgUrl2()==null?"":mlsdMobileProductPresentationDB.getSignatureCuisineimgUrl2());
        mlsdMobileProductPresentationVo.setSignatureCuisineimgUrl3(mlsdMobileProductPresentationDB.getSignatureCuisineimgUrl3()==null?"":mlsdMobileProductPresentationDB.getSignatureCuisineimgUrl3());
        mlsdMobileProductPresentationVo.setSignatureCuisineimgUrl4(mlsdMobileProductPresentationDB.getSignatureCuisineimgUrl4()==null?"":mlsdMobileProductPresentationDB.getSignatureCuisineimgUrl4());

        mlsdMobileProductPresentationVo.setNewProductsImgUrl1(mlsdMobileProductPresentationDB.getNewProductsImgUrl1()==null?"":mlsdMobileProductPresentationDB.getNewProductsImgUrl1());
        mlsdMobileProductPresentationVo.setNewProductsImgUrl2(mlsdMobileProductPresentationDB.getNewProductsImgUrl2()==null?"":mlsdMobileProductPresentationDB.getNewProductsImgUrl2());
        mlsdMobileProductPresentationVo.setNewProductsImgUrl3(mlsdMobileProductPresentationDB.getNewProductsImgUrl3()==null?"":mlsdMobileProductPresentationDB.getNewProductsImgUrl3());
        mlsdMobileProductPresentationVo.setNewProductsImgUrl4(mlsdMobileProductPresentationDB.getNewProductsImgUrl4()==null?"":mlsdMobileProductPresentationDB.getNewProductsImgUrl4());

        mlsdMobileProductPresentationVo.setProductListImgUrl(mlsdMobileProductPresentationDB.getProductListImgUrl()==null?"":mlsdMobileProductPresentationDB.getProductListImgUrl());
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdMobileProductPresentationVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdMobileProductPresentation(MlsdMobileProductPresentation mlsdMobileProductPresentation) {
        if (!mlsdMobileProductPresentationGeneratorService.updateByPrimaryKeySelective(mlsdMobileProductPresentation)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.PRODUCT_PRESENTATION_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}
