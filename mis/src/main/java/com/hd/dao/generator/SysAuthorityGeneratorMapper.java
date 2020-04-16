package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.SysAuthority;
import com.hd.entity.generator.SysAuthorityExample;
import com.hd.entity.generator.SysAuthorityKey;

/**
*@author Robot
*/
public interface SysAuthorityGeneratorMapper
{

	public Integer countByExample(SysAuthorityExample entity);

    public List<SysAuthority> selectByExample(SysAuthorityExample entity);

	public SysAuthority selectByPrimaryKey(SysAuthorityKey key);

	public SysAuthority selectUnDelByPrimaryKey(SysAuthorityKey key);

    public Integer insertSelective(SysAuthority entity);

	public Integer replaceSelective(SysAuthority entity);
 
    public Integer deleteByExample(SysAuthorityExample example);

	public Integer deleteByPrimaryKey(SysAuthorityKey key);

    public Integer updateAllByExample(@Param("record") SysAuthority entity, @Param("example") SysAuthorityExample example);

	public Integer updateByPrimaryKeySelective(SysAuthority entity);

}