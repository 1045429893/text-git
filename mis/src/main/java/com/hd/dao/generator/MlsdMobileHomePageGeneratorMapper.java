package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdMobileHomePage;
import com.hd.entity.generator.MlsdMobileHomePageExample;
import com.hd.entity.generator.MlsdMobileHomePageKey;

/**
*@author Robot
*/
public interface MlsdMobileHomePageGeneratorMapper
{

	public Integer countByExample(MlsdMobileHomePageExample entity);

    public List<MlsdMobileHomePage> selectByExample(MlsdMobileHomePageExample entity);

	public MlsdMobileHomePage selectByPrimaryKey(MlsdMobileHomePageKey key);

	public MlsdMobileHomePage selectUnDelByPrimaryKey(MlsdMobileHomePageKey key);

    public Integer insertSelective(MlsdMobileHomePage entity);

	public Integer replaceSelective(MlsdMobileHomePage entity);
 
    public Integer deleteByExample(MlsdMobileHomePageExample example);

	public Integer deleteByPrimaryKey(MlsdMobileHomePageKey key);

    public Integer updateAllByExample(@Param("record") MlsdMobileHomePage entity, @Param("example") MlsdMobileHomePageExample example);

	public Integer updateByPrimaryKeySelective(MlsdMobileHomePage entity);

}