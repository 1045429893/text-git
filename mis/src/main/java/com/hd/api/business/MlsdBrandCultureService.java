package com.hd.api.business;

import com.hd.entity.generator.MlsdBrandCulture;
import com.hd.entity.generator.MlsdMobileBrandCulture;

/**
* @Description:    品牌文化
* @Author:         shangYuRen
* @CreateDate:     2019/10/9 11:22
*/
public interface MlsdBrandCultureService {


    Object[] getMlsdBrandCulture();

    Object[] updateMlsdBrandCulture(MlsdBrandCulture mlsdBrandCulture);

    Object[] getMlsdMobileBrandCulture();

    Object[] updateMlsdMobileBrandCulture(MlsdMobileBrandCulture mlsdMobileBrandCulture);

}