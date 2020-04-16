package com.hd.api.business;

import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdMobileHomePage;

/**
* @Description:    首页
* @Author:         shangYuRen
* @CreateDate:     2019/10/8 15:01
*/
public interface MlsdHomePageService {


    Object[] getMlsdHomePage();

    Object[] updateMlsdHomePage(MlsdHomePage mlsdHomePage);


    Object[] getMlsdMobileHomePage();

    Object[] updateMlsdMobileHomePage(MlsdMobileHomePage mlsdMobileHomePage);

}