package com.hd.api.business;

import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdJoinInvestment;
import com.hd.entity.generator.MlsdMobileJoinInvestment;

/**
* @Description:    招商加盟
* @Author:         shangYuRen
* @CreateDate:     2019/10/9 15:47
*/
public interface MlsdJoinInvestmentService {


    Object[] getMlsdJoinInvestment();

    Object[] updateMlsdJoinInvestment(MlsdJoinInvestment mlsdJoinInvestment);
    Object[] getMlsdMobileJoinInvestment();

    Object[] updateMlsdMobileJoinInvestment(MlsdMobileJoinInvestment mlsdMobileJoinInvestment);

}