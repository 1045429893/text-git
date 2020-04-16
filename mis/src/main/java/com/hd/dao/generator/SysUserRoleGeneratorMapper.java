package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.SysUserRole;
import com.hd.entity.generator.SysUserRoleExample;
import com.hd.entity.generator.SysUserRoleKey;

/**
*@author Robot
*/
public interface SysUserRoleGeneratorMapper
{

	public Integer countByExample(SysUserRoleExample entity);

    public List<SysUserRole> selectByExample(SysUserRoleExample entity);

	public SysUserRole selectByPrimaryKey(SysUserRoleKey key);

	public SysUserRole selectUnDelByPrimaryKey(SysUserRoleKey key);

    public Integer insertSelective(SysUserRole entity);

	public Integer replaceSelective(SysUserRole entity);
 
    public Integer deleteByExample(SysUserRoleExample example);

	public Integer deleteByPrimaryKey(SysUserRoleKey key);

    public Integer updateAllByExample(@Param("record") SysUserRole entity, @Param("example") SysUserRoleExample example);

	public Integer updateByPrimaryKeySelective(SysUserRole entity);

}