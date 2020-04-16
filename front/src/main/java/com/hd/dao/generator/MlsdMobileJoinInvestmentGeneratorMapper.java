package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdMobileJoinInvestment;
import com.hd.entity.generator.MlsdMobileJoinInvestmentExample;
import com.hd.entity.generator.MlsdMobileJoinInvestmentKey;

/**
*@author Robot
*/
public interface MlsdMobileJoinInvestmentGeneratorMapper
{

	public Integer countByExample(MlsdMobileJoinInvestmentExample entity);

    public List<MlsdMobileJoinInvestment> selectByExample(MlsdMobileJoinInvestmentExample entity);

	public MlsdMobileJoinInvestment selectByPrimaryKey(MlsdMobileJoinInvestmentKey key);

	public MlsdMobileJoinInvestment selectUnDelByPrimaryKey(MlsdMobileJoinInvestmentKey key);

    public Integer insertSelective(MlsdMobileJoinInvestment entity);

	public Integer replaceSelective(MlsdMobileJoinInvestment entity);
 
    public Integer deleteByExample(MlsdMobileJoinInvestmentExample example);

	public Integer deleteByPrimaryKey(MlsdMobileJoinInvestmentKey key);

    public Integer updateAllByExample(@Param("record") MlsdMobileJoinInvestment entity, @Param("example") MlsdMobileJoinInvestmentExample example);

	public Integer updateByPrimaryKeySelective(MlsdMobileJoinInvestment entity);

}