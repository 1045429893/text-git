package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdMobileContactUs;
import com.hd.entity.generator.MlsdMobileContactUsExample;
import com.hd.entity.generator.MlsdMobileContactUsKey;

/**
*@author Robot
*/
public interface MlsdMobileContactUsGeneratorMapper
{

	public Integer countByExample(MlsdMobileContactUsExample entity);

    public List<MlsdMobileContactUs> selectByExample(MlsdMobileContactUsExample entity);

	public MlsdMobileContactUs selectByPrimaryKey(MlsdMobileContactUsKey key);

	public MlsdMobileContactUs selectUnDelByPrimaryKey(MlsdMobileContactUsKey key);

    public Integer insertSelective(MlsdMobileContactUs entity);

	public Integer replaceSelective(MlsdMobileContactUs entity);
 
    public Integer deleteByExample(MlsdMobileContactUsExample example);

	public Integer deleteByPrimaryKey(MlsdMobileContactUsKey key);

    public Integer updateAllByExample(@Param("record") MlsdMobileContactUs entity, @Param("example") MlsdMobileContactUsExample example);

	public Integer updateByPrimaryKeySelective(MlsdMobileContactUs entity);

}