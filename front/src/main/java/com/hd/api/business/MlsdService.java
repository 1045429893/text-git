package com.hd.api.business;

import com.hd.entity.generator.*;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;


/**
*@author Robot
*/
@Service
public  interface MlsdService {
    
	MlsdHomePage getIndex();
    MlsdBrandCulture getBrand();
    MlsdItemAdvantage getAdvantage();
    MlsdJoinInvestment getJoin();
    MlsdProductPresentation getProduct();
    MlsdStoreDisplay getShowShop();
    MlsdStrength getStrength();
    MlsdContactUs getContact();
    MlsdCompanyProfile getCompanyProfile();
    MlsdOnlineService getMlsdOnlineService();
    Object[] addUserInfo(MlsdIntendedUsers mlsdIntendedUsers);
    Object[] addContactMessage(MlsdContactMessage mlsdContactMessage);
}