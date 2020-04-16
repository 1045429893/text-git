package com.hd.api.business;

import com.hd.entity.generator.*;
import org.springframework.stereotype.Service;


/**
*@author Robot
*/
@Service
public  interface MlsdMobileService {
    
	MlsdMobileHomePage getIndex();
    MlsdMobileBrandCulture getBrand();
    MlsdMobileItemAdvantage getAdvantage();
    MlsdMobileJoinInvestment getJoin();
    MlsdMobileProductPresentation getProduct();
    MlsdMobileStoreDisplay getShowShop();
    MlsdMobileStrength getStrength();
    MlsdMobileContactUs getContact();

}