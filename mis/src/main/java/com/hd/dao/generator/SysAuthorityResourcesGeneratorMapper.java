package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.SysAuthorityResources;
import com.hd.entity.generator.SysAuthorityResourcesExample;
import com.hd.entity.generator.SysAuthorityResourcesKey;

/**
*@author Robot
*/
public interface SysAuthorityResourcesGeneratorMapper
{

	public Integer countByExample(SysAuthorityResourcesExample entity);

    public List<SysAuthorityResources> selectByExample(SysAuthorityResourcesExample entity);

	public SysAuthorityResources selectByPrimaryKey(SysAuthorityResourcesKey key);

	public SysAuthorityResources selectUnDelByPrimaryKey(SysAuthorityResourcesKey key);

    public Integer insertSelective(SysAuthorityResources entity);

	public Integer replaceSelective(SysAuthorityResources entity);
 
    public Integer deleteByExample(SysAuthorityResourcesExample example);

	public Integer deleteByPrimaryKey(SysAuthorityResourcesKey key);

    public Integer updateAllByExample(@Param("record") SysAuthorityResources entity, @Param("example") SysAuthorityResourcesExample example);

	public Integer updateByPrimaryKeySelective(SysAuthorityResources entity);

}