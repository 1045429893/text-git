package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdJoinInvestment;
import com.hd.entity.generator.MlsdJoinInvestmentExample;
import com.hd.entity.generator.MlsdJoinInvestmentKey;

/**
*@author Robot
*/
public interface MlsdJoinInvestmentGeneratorMapper
{

	public Integer countByExample(MlsdJoinInvestmentExample entity);

    public List<MlsdJoinInvestment> selectByExample(MlsdJoinInvestmentExample entity);

	public MlsdJoinInvestment selectByPrimaryKey(MlsdJoinInvestmentKey key);

	public MlsdJoinInvestment selectUnDelByPrimaryKey(MlsdJoinInvestmentKey key);

    public Integer insertSelective(MlsdJoinInvestment entity);

	public Integer replaceSelective(MlsdJoinInvestment entity);
 
    public Integer deleteByExample(MlsdJoinInvestmentExample example);

	public Integer deleteByPrimaryKey(MlsdJoinInvestmentKey key);

    public Integer updateAllByExample(@Param("record") MlsdJoinInvestment entity, @Param("example") MlsdJoinInvestmentExample example);

	public Integer updateByPrimaryKeySelective(MlsdJoinInvestment entity);

}