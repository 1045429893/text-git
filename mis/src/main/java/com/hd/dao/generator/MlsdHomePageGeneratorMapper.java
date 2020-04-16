package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdHomePageExample;
import com.hd.entity.generator.MlsdHomePageKey;

/**
*@author Robot
*/
public interface MlsdHomePageGeneratorMapper
{

	public Integer countByExample(MlsdHomePageExample entity);

    public List<MlsdHomePage> selectByExample(MlsdHomePageExample entity);

	public MlsdHomePage selectByPrimaryKey(MlsdHomePageKey key);

	public MlsdHomePage selectUnDelByPrimaryKey(MlsdHomePageKey key);

    public Integer insertSelective(MlsdHomePage entity);

	public Integer replaceSelective(MlsdHomePage entity);
 
    public Integer deleteByExample(MlsdHomePageExample example);

	public Integer deleteByPrimaryKey(MlsdHomePageKey key);

    public Integer updateAllByExample(@Param("record") MlsdHomePage entity, @Param("example") MlsdHomePageExample example);

	public Integer updateByPrimaryKeySelective(MlsdHomePage entity);

}