package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdItemAdvantage;
import com.hd.entity.generator.MlsdItemAdvantageExample;
import com.hd.entity.generator.MlsdItemAdvantageKey;

/**
*@author Robot
*/
public interface MlsdItemAdvantageGeneratorMapper
{

	public Integer countByExample(MlsdItemAdvantageExample entity);

    public List<MlsdItemAdvantage> selectByExample(MlsdItemAdvantageExample entity);

	public MlsdItemAdvantage selectByPrimaryKey(MlsdItemAdvantageKey key);

	public MlsdItemAdvantage selectUnDelByPrimaryKey(MlsdItemAdvantageKey key);

    public Integer insertSelective(MlsdItemAdvantage entity);

	public Integer replaceSelective(MlsdItemAdvantage entity);
 
    public Integer deleteByExample(MlsdItemAdvantageExample example);

	public Integer deleteByPrimaryKey(MlsdItemAdvantageKey key);

    public Integer updateAllByExample(@Param("record") MlsdItemAdvantage entity, @Param("example") MlsdItemAdvantageExample example);

	public Integer updateByPrimaryKeySelective(MlsdItemAdvantage entity);

}