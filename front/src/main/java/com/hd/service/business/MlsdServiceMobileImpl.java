package com.hd.service.business;

import com.hd.api.business.MlsdMobileService;
import com.hd.api.generator.*;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.generator.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
*@author Robot
*/
@Service
public  class MlsdServiceMobileImpl implements MlsdMobileService {
	@Autowired
	MlsdMobileHomePageGeneratorService mlsdMobileHomePageGeneratorService;
	@Autowired
    MlsdMobileBrandCultureGeneratorService mlsdMobileBrandCultureGeneratorService;
	@Autowired
    MlsdMobileItemAdvantageGeneratorService mlsdMobileItemAdvantageGeneratorService;
	@Autowired
    MlsdMobileJoinInvestmentGeneratorService mlsdMobileJoinInvestmentGeneratorService;
	@Autowired
    MlsdMobileProductPresentationGeneratorService mlsdMobileProductPresentationGeneratorService;
	@Autowired
    MlsdMobileStoreDisplayGeneratorService mlsdMobileStoreDisplayGeneratorService;
	@Autowired
    MlsdMobileStrengthGeneratorService mlsdMobileStrengthGeneratorService;
	@Autowired
    MlsdMobileContactUsGeneratorService mlsdMobileContactUsGeneratorService;

	@Override
	public MlsdMobileHomePage getIndex() {
        MlsdMobileHomePage mlsdMobileHomePage = mlsdMobileHomePageGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
		return mlsdMobileHomePage;
	}

    @Override
    public MlsdMobileBrandCulture getBrand() {
        MlsdMobileBrandCulture mlsdMobileBrandCultureDB = mlsdMobileBrandCultureGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdMobileBrandCultureDB;
    }

    @Override
    public MlsdMobileItemAdvantage getAdvantage() {
        MlsdMobileItemAdvantage mlsdMobileItemAdvantageDB = mlsdMobileItemAdvantageGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdMobileItemAdvantageDB;
    }

    @Override
    public MlsdMobileJoinInvestment getJoin() {
        MlsdMobileJoinInvestment mlsdMobileJoinInvestmentDB = mlsdMobileJoinInvestmentGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdMobileJoinInvestmentDB;
    }

    @Override
    public MlsdMobileProductPresentation getProduct() {
        MlsdMobileProductPresentation mlsdMobileProductPresentationDB = mlsdMobileProductPresentationGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdMobileProductPresentationDB;
    }

    @Override
    public MlsdMobileStoreDisplay getShowShop() {
        MlsdMobileStoreDisplay mlsdMobileStoreDisplayDB = mlsdMobileStoreDisplayGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdMobileStoreDisplayDB;
    }

    @Override
    public MlsdMobileStrength getStrength() {
        MlsdMobileStrength mlsdMobileStrengthDB = mlsdMobileStrengthGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdMobileStrengthDB;
    }

    @Override
    public MlsdMobileContactUs getContact() {
        MlsdMobileContactUs mlsdMobileContactUsDB = mlsdMobileContactUsGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdMobileContactUsDB;
    }


}