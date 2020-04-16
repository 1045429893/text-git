package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdContactMessage;
import com.hd.entity.generator.MlsdContactMessageExample;
import com.hd.entity.generator.MlsdContactMessageKey;

/**
*@author Robot
*/
public interface MlsdContactMessageGeneratorMapper
{

	public Integer countByExample(MlsdContactMessageExample entity);

    public List<MlsdContactMessage> selectByExample(MlsdContactMessageExample entity);

	public MlsdContactMessage selectByPrimaryKey(MlsdContactMessageKey key);

	public MlsdContactMessage selectUnDelByPrimaryKey(MlsdContactMessageKey key);

    public Integer insertSelective(MlsdContactMessage entity);

	public Integer replaceSelective(MlsdContactMessage entity);
 
    public Integer deleteByExample(MlsdContactMessageExample example);

	public Integer deleteByPrimaryKey(MlsdContactMessageKey key);

    public Integer updateAllByExample(@Param("record") MlsdContactMessage entity, @Param("example") MlsdContactMessageExample example);

	public Integer updateByPrimaryKeySelective(MlsdContactMessage entity);

}