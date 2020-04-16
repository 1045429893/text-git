package com.hd.api.business;

import com.hd.entity.generator.MlsdCompanyProfile;

/**
*@author Robot
*/
public  interface CompanyProfileService {


    Object[] getCompanyProfile();

    Object[] updateCompanyProfile(MlsdCompanyProfile mlsdCompanyProfile);

}