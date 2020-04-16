package com.hd.api.business;

import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdMobileProductPresentation;
import com.hd.entity.generator.MlsdProductPresentation;

/**
* @Description:    首页
* @Author:         shangYuRen
* @CreateDate:     2019/10/8 15:01
*/
public interface MlsdProductPresentationService {


    Object[] getMlsdProductPresentation();

    Object[] updateMlsdProductPresentation(MlsdProductPresentation mlsdProductPresentation);

    Object[] getMlsdMobileProductPresentation();

    Object[] updateMlsdMobileProductPresentation(MlsdMobileProductPresentation mlsdMobileProductPresentation);

}