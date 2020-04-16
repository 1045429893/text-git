package com.hd.api.business;

import com.hd.entity.generator.MlsdMobileStrength;
import com.hd.entity.generator.MlsdStrength;

/**
 * @Description: 实力后台
 * @Author: shangYuRen
 * @CreateDate: 2019/10/9 15:47
 */
public interface MlsdStrengthService {


    Object[] getMlsdStrength();

    Object[] updateMlsdStrength(MlsdStrength mlsdStrength);

    Object[] getMlsdMobileStrength();

    Object[] updateMlsdMobileStrength(MlsdMobileStrength mlsdMobileStrength);


}