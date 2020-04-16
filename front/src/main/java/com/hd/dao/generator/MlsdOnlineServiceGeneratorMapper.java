package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdOnlineService;
import com.hd.entity.generator.MlsdOnlineServiceExample;
import com.hd.entity.generator.MlsdOnlineServiceKey;

/**
*@author Robot
*/
public interface MlsdOnlineServiceGeneratorMapper
{

	public Integer countByExample(MlsdOnlineServiceExample entity);

    public List<MlsdOnlineService> selectByExample(MlsdOnlineServiceExample entity);

	public MlsdOnlineService selectByPrimaryKey(MlsdOnlineServiceKey key);

	public MlsdOnlineService selectUnDelByPrimaryKey(MlsdOnlineServiceKey key);

    public Integer insertSelective(MlsdOnlineService entity);

	public Integer replaceSelective(MlsdOnlineService entity);
 
    public Integer deleteByExample(MlsdOnlineServiceExample example);

	public Integer deleteByPrimaryKey(MlsdOnlineServiceKey key);

    public Integer updateAllByExample(@Param("record") MlsdOnlineService entity, @Param("example") MlsdOnlineServiceExample example);

	public Integer updateByPrimaryKeySelective(MlsdOnlineService entity);

}