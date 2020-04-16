package com.hd.service.business;

import com.hd.api.business.MlsdService;
import com.hd.api.generator.*;
import com.hd.common.utils.ServiceRetCode;
import com.hd.dao.generator.MlsdBrandCultureGeneratorMapper;
import com.hd.dao.generator.MlsdJoinInvestmentGeneratorMapper;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdHomePageVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;


/**
*@author Robot
*/
@Service
public  class MlsdServiceImpl implements MlsdService {
	@Autowired
	MlsdHomePageGeneratorService mlsdHomePageGeneratorService;
	@Autowired
    MlsdBrandCultureGeneratorService mlsdBrandCultureGeneratorService;
	@Autowired
    MlsdItemAdvantageGeneratorService mlsdItemAdvantageGeneratorService;
	@Autowired
    MlsdJoinInvestmentGeneratorService mlsdJoinInvestmentGeneratorService;
	@Autowired
    MlsdProductPresentationGeneratorService mlsdProductPresentationGeneratorService;
	@Autowired
    MlsdStoreDisplayGeneratorService mlsdStoreDisplayGeneratorService;
	@Autowired
    MlsdStrengthGeneratorService mlsdStrengthGeneratorService;
	@Autowired
    MlsdContactUsGeneratorService mlsdContactUsGeneratorService;
	@Autowired
    MlsdIntendedUsersGeneratorService mlsdIntendedUsersGeneratorService;
	@Autowired
    MlsdContactMessageGeneratorService mlsdContactMessageGeneratorService;
	@Autowired
    MlsdCompanyProfileGeneratorService mlsdCompanyProfileGeneratorService;
	@Autowired
    MlsdOnlineServiceGeneratorService mlsdOnlineServiceGeneratorService;

	@Override
	public MlsdHomePage getIndex() {
		MlsdHomePage mlsdHomePageDB = mlsdHomePageGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
		return mlsdHomePageDB;
	}

    @Override
    public MlsdBrandCulture getBrand() {
        MlsdBrandCulture mlsdBrandCultureDB = mlsdBrandCultureGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdBrandCultureDB;
    }

    @Override
    public MlsdItemAdvantage getAdvantage() {
        MlsdItemAdvantage mlsdItemAdvantageDB = mlsdItemAdvantageGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdItemAdvantageDB;
    }

    @Override
    public MlsdJoinInvestment getJoin() {
        MlsdJoinInvestment mlsdJoinInvestmentDB = mlsdJoinInvestmentGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdJoinInvestmentDB;
    }

    @Override
    public MlsdProductPresentation getProduct() {
        MlsdProductPresentation mlsdProductPresentationDB = mlsdProductPresentationGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdProductPresentationDB;
    }

    @Override
    public MlsdStoreDisplay getShowShop() {
        MlsdStoreDisplay mlsdStoreDisplayDB = mlsdStoreDisplayGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdStoreDisplayDB;
    }

    @Override
    public MlsdStrength getStrength() {
        MlsdStrength mlsdStrengthDB = mlsdStrengthGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdStrengthDB;
    }

    @Override
    public MlsdContactUs getContact() {
        MlsdContactUs mlsdContactUsDB = mlsdContactUsGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdContactUsDB;
    }

    @Override
    public MlsdCompanyProfile getCompanyProfile() {
        MlsdCompanyProfile mlsdCompanyProfileDB = mlsdCompanyProfileGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdCompanyProfileDB;
    }

    @Override
    public MlsdOnlineService getMlsdOnlineService() {

        MlsdOnlineService mlsdOnlineServiceDB = mlsdOnlineServiceGeneratorService.selectByPrimaryKey(ConstantPoll.MLSD);
        return mlsdOnlineServiceDB;
    }

    @Override
    @Transactional
    public Object[] addUserInfo(MlsdIntendedUsers mlsdIntendedUsers) {
        mlsdIntendedUsersGeneratorService.insertSelective(mlsdIntendedUsers);
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    @Transactional
    public Object[] addContactMessage(MlsdContactMessage mlsdContactMessage) {
        mlsdContactMessageGeneratorService.insertSelective(mlsdContactMessage);
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}