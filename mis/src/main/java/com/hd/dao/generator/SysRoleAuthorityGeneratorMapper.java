package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.SysRoleAuthority;
import com.hd.entity.generator.SysRoleAuthorityExample;
import com.hd.entity.generator.SysRoleAuthorityKey;

/**
*@author Robot
*/
public interface SysRoleAuthorityGeneratorMapper
{

	public Integer countByExample(SysRoleAuthorityExample entity);

    public List<SysRoleAuthority> selectByExample(SysRoleAuthorityExample entity);

	public SysRoleAuthority selectByPrimaryKey(SysRoleAuthorityKey key);

	public SysRoleAuthority selectUnDelByPrimaryKey(SysRoleAuthorityKey key);

    public Integer insertSelective(SysRoleAuthority entity);

	public Integer replaceSelective(SysRoleAuthority entity);
 
    public Integer deleteByExample(SysRoleAuthorityExample example);

	public Integer deleteByPrimaryKey(SysRoleAuthorityKey key);

    public Integer updateAllByExample(@Param("record") SysRoleAuthority entity, @Param("example") SysRoleAuthorityExample example);

	public Integer updateByPrimaryKeySelective(SysRoleAuthority entity);

}