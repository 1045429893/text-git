package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdBrandCulture;
import com.hd.entity.generator.MlsdBrandCultureExample;
import com.hd.entity.generator.MlsdBrandCultureKey;

/**
*@author Robot
*/
public interface MlsdBrandCultureGeneratorMapper
{

	public Integer countByExample(MlsdBrandCultureExample entity);

    public List<MlsdBrandCulture> selectByExample(MlsdBrandCultureExample entity);

	public MlsdBrandCulture selectByPrimaryKey(MlsdBrandCultureKey key);

	public MlsdBrandCulture selectUnDelByPrimaryKey(MlsdBrandCultureKey key);

    public Integer insertSelective(MlsdBrandCulture entity);

	public Integer replaceSelective(MlsdBrandCulture entity);
 
    public Integer deleteByExample(MlsdBrandCultureExample example);

	public Integer deleteByPrimaryKey(MlsdBrandCultureKey key);

    public Integer updateAllByExample(@Param("record") MlsdBrandCulture entity, @Param("example") MlsdBrandCultureExample example);

	public Integer updateByPrimaryKeySelective(MlsdBrandCulture entity);

}