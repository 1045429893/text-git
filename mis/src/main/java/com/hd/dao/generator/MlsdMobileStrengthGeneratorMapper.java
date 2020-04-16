package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdMobileStrength;
import com.hd.entity.generator.MlsdMobileStrengthExample;
import com.hd.entity.generator.MlsdMobileStrengthKey;

/**
*@author Robot
*/
public interface MlsdMobileStrengthGeneratorMapper
{

	public Integer countByExample(MlsdMobileStrengthExample entity);

    public List<MlsdMobileStrength> selectByExample(MlsdMobileStrengthExample entity);

	public MlsdMobileStrength selectByPrimaryKey(MlsdMobileStrengthKey key);

	public MlsdMobileStrength selectUnDelByPrimaryKey(MlsdMobileStrengthKey key);

    public Integer insertSelective(MlsdMobileStrength entity);

	public Integer replaceSelective(MlsdMobileStrength entity);
 
    public Integer deleteByExample(MlsdMobileStrengthExample example);

	public Integer deleteByPrimaryKey(MlsdMobileStrengthKey key);

    public Integer updateAllByExample(@Param("record") MlsdMobileStrength entity, @Param("example") MlsdMobileStrengthExample example);

	public Integer updateByPrimaryKeySelective(MlsdMobileStrength entity);

}