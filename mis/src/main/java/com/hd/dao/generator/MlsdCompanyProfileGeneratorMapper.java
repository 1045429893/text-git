package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdCompanyProfile;
import com.hd.entity.generator.MlsdCompanyProfileExample;
import com.hd.entity.generator.MlsdCompanyProfileKey;

/**
*@author Robot
*/
public interface MlsdCompanyProfileGeneratorMapper
{

	public Integer countByExample(MlsdCompanyProfileExample entity);

    public List<MlsdCompanyProfile> selectByExample(MlsdCompanyProfileExample entity);

	public MlsdCompanyProfile selectByPrimaryKey(MlsdCompanyProfileKey key);

	public MlsdCompanyProfile selectUnDelByPrimaryKey(MlsdCompanyProfileKey key);

    public Integer insertSelective(MlsdCompanyProfile entity);

	public Integer replaceSelective(MlsdCompanyProfile entity);
 
    public Integer deleteByExample(MlsdCompanyProfileExample example);

	public Integer deleteByPrimaryKey(MlsdCompanyProfileKey key);

    public Integer updateAllByExample(@Param("record") MlsdCompanyProfile entity, @Param("example") MlsdCompanyProfileExample example);

	public Integer updateByPrimaryKeySelective(MlsdCompanyProfile entity);

}