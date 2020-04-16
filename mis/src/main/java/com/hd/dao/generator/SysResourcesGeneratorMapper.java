package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.SysResources;
import com.hd.entity.generator.SysResourcesExample;
import com.hd.entity.generator.SysResourcesKey;

/**
*@author Robot
*/
public interface SysResourcesGeneratorMapper
{

	public Integer countByExample(SysResourcesExample entity);

    public List<SysResources> selectByExample(SysResourcesExample entity);

	public SysResources selectByPrimaryKey(SysResourcesKey key);

	public SysResources selectUnDelByPrimaryKey(SysResourcesKey key);

    public Integer insertSelective(SysResources entity);

	public Integer replaceSelective(SysResources entity);
 
    public Integer deleteByExample(SysResourcesExample example);

	public Integer deleteByPrimaryKey(SysResourcesKey key);

    public Integer updateAllByExample(@Param("record") SysResources entity, @Param("example") SysResourcesExample example);

	public Integer updateByPrimaryKeySelective(SysResources entity);

}