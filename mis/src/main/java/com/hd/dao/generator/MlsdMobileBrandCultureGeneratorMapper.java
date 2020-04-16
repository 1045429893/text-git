package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdMobileBrandCulture;
import com.hd.entity.generator.MlsdMobileBrandCultureExample;
import com.hd.entity.generator.MlsdMobileBrandCultureKey;

/**
*@author Robot
*/
public interface MlsdMobileBrandCultureGeneratorMapper
{

	public Integer countByExample(MlsdMobileBrandCultureExample entity);

    public List<MlsdMobileBrandCulture> selectByExample(MlsdMobileBrandCultureExample entity);

	public MlsdMobileBrandCulture selectByPrimaryKey(MlsdMobileBrandCultureKey key);

	public MlsdMobileBrandCulture selectUnDelByPrimaryKey(MlsdMobileBrandCultureKey key);

    public Integer insertSelective(MlsdMobileBrandCulture entity);

	public Integer replaceSelective(MlsdMobileBrandCulture entity);
 
    public Integer deleteByExample(MlsdMobileBrandCultureExample example);

	public Integer deleteByPrimaryKey(MlsdMobileBrandCultureKey key);

    public Integer updateAllByExample(@Param("record") MlsdMobileBrandCulture entity, @Param("example") MlsdMobileBrandCultureExample example);

	public Integer updateByPrimaryKeySelective(MlsdMobileBrandCulture entity);

}