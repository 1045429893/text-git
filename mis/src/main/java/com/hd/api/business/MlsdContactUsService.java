package com.hd.api.business;

import com.hd.entity.generator.MlsdContactUs;
import com.hd.entity.generator.MlsdMobileContactUs;
import com.hd.entity.generator.MlsdStrength;

/**
* @Description:     实力后台
* @Author:         shangYuRen
* @CreateDate:     2019/10/9 15:47
*/
public interface MlsdContactUsService {


    Object[] getMlsdContactUs();

    Object[] updateMlsdContactUs(MlsdContactUs mlsdContactUs);


    Object[] getMlsdMbileContactUs();

    Object[] updateMlsdMobileContactUs(MlsdMobileContactUs mlsdMobileContactUs);

}