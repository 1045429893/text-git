package com.hd.api.business;

import com.hd.entity.generator.MlsdJoinInvestment;
import com.hd.entity.generator.MlsdMobileStoreDisplay;
import com.hd.entity.generator.MlsdStoreDisplay;

/**
* @Description:     门店展示
* @Author:         shangYuRen
* @CreateDate:     2019/10/9 15:47
*/
public interface MlsdStoreDisplayService {


    Object[] getMlsdStoreDisplay();

    Object[] updateMlsdStoreDisplay(MlsdStoreDisplay mlsdStoreDisplay);

    Object[] getMlsdMobileStoreDisplay();

    Object[] updateMlsdMobileStoreDisplay(MlsdMobileStoreDisplay mlsdMobileStoreDisplay);
}