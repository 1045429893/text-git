package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdMobileItemAdvantage;
import com.hd.entity.generator.MlsdMobileItemAdvantageExample;
import com.hd.entity.generator.MlsdMobileItemAdvantageKey;

/**
*@author Robot
*/
public interface MlsdMobileItemAdvantageGeneratorMapper
{

	public Integer countByExample(MlsdMobileItemAdvantageExample entity);

    public List<MlsdMobileItemAdvantage> selectByExample(MlsdMobileItemAdvantageExample entity);

	public MlsdMobileItemAdvantage selectByPrimaryKey(MlsdMobileItemAdvantageKey key);

	public MlsdMobileItemAdvantage selectUnDelByPrimaryKey(MlsdMobileItemAdvantageKey key);

    public Integer insertSelective(MlsdMobileItemAdvantage entity);

	public Integer replaceSelective(MlsdMobileItemAdvantage entity);
 
    public Integer deleteByExample(MlsdMobileItemAdvantageExample example);

	public Integer deleteByPrimaryKey(MlsdMobileItemAdvantageKey key);

    public Integer updateAllByExample(@Param("record") MlsdMobileItemAdvantage entity, @Param("example") MlsdMobileItemAdvantageExample example);

	public Integer updateByPrimaryKeySelective(MlsdMobileItemAdvantage entity);

}