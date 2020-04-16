package com.hd.api.business;

import com.hd.entity.generator.MlsdBrandCulture;
import com.hd.entity.generator.MlsdItemAdvantage;
import com.hd.entity.generator.MlsdMobileItemAdvantage;

/**
* @Description:    项目优势
* @Author:         shangYuRen
* @CreateDate:     2019/10/9 11:22
*/
public interface MlsdItemAdvantageService {


    Object[] getMlsdItemAdvantage();

    Object[] updateMlsdItemAdvantage(MlsdItemAdvantage mlsdItemAdvantage);

    Object[] getMlsdMobileItemAdvantage();

    Object[] updateMlsdMobileItemAdvantage(MlsdMobileItemAdvantage mlsdMobileItemAdvantage);

}