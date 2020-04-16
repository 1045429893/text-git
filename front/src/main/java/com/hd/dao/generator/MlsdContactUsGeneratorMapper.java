package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdContactUs;
import com.hd.entity.generator.MlsdContactUsExample;
import com.hd.entity.generator.MlsdContactUsKey;

/**
*@author Robot
*/
public interface MlsdContactUsGeneratorMapper
{

	public Integer countByExample(MlsdContactUsExample entity);

    public List<MlsdContactUs> selectByExample(MlsdContactUsExample entity);

	public MlsdContactUs selectByPrimaryKey(MlsdContactUsKey key);

	public MlsdContactUs selectUnDelByPrimaryKey(MlsdContactUsKey key);

    public Integer insertSelective(MlsdContactUs entity);

	public Integer replaceSelective(MlsdContactUs entity);
 
    public Integer deleteByExample(MlsdContactUsExample example);

	public Integer deleteByPrimaryKey(MlsdContactUsKey key);

    public Integer updateAllByExample(@Param("record") MlsdContactUs entity, @Param("example") MlsdContactUsExample example);

	public Integer updateByPrimaryKeySelective(MlsdContactUs entity);

}