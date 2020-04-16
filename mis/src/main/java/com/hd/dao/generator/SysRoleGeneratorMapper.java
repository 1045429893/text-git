package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.SysRole;
import com.hd.entity.generator.SysRoleExample;
import com.hd.entity.generator.SysRoleKey;

/**
*@author Robot
*/
public interface SysRoleGeneratorMapper
{

	public Integer countByExample(SysRoleExample entity);

    public List<SysRole> selectByExample(SysRoleExample entity);

	public SysRole selectByPrimaryKey(SysRoleKey key);

	public SysRole selectUnDelByPrimaryKey(SysRoleKey key);

    public Integer insertSelective(SysRole entity);

	public Integer replaceSelective(SysRole entity);
 
    public Integer deleteByExample(SysRoleExample example);

	public Integer deleteByPrimaryKey(SysRoleKey key);

    public Integer updateAllByExample(@Param("record") SysRole entity, @Param("example") SysRoleExample example);

	public Integer updateByPrimaryKeySelective(SysRole entity);

}