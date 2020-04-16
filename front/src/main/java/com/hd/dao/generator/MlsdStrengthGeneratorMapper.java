package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdStrength;
import com.hd.entity.generator.MlsdStrengthExample;
import com.hd.entity.generator.MlsdStrengthKey;

/**
*@author Robot
*/
public interface MlsdStrengthGeneratorMapper
{

	public Integer countByExample(MlsdStrengthExample entity);

    public List<MlsdStrength> selectByExample(MlsdStrengthExample entity);

	public MlsdStrength selectByPrimaryKey(MlsdStrengthKey key);

	public MlsdStrength selectUnDelByPrimaryKey(MlsdStrengthKey key);

    public Integer insertSelective(MlsdStrength entity);

	public Integer replaceSelective(MlsdStrength entity);
 
    public Integer deleteByExample(MlsdStrengthExample example);

	public Integer deleteByPrimaryKey(MlsdStrengthKey key);

    public Integer updateAllByExample(@Param("record") MlsdStrength entity, @Param("example") MlsdStrengthExample example);

	public Integer updateByPrimaryKeySelective(MlsdStrength entity);

}