package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.SysUserInfo;
import com.hd.entity.generator.SysUserInfoExample;
import com.hd.entity.generator.SysUserInfoKey;

/**
*@author Robot
*/
public interface SysUserInfoGeneratorMapper
{

	public Integer countByExample(SysUserInfoExample entity);

    public List<SysUserInfo> selectByExample(SysUserInfoExample entity);

	public SysUserInfo selectByPrimaryKey(SysUserInfoKey key);

	public SysUserInfo selectUnDelByPrimaryKey(SysUserInfoKey key);

    public Integer insertSelective(SysUserInfo entity);

	public Integer replaceSelective(SysUserInfo entity);
 
    public Integer deleteByExample(SysUserInfoExample example);

	public Integer deleteByPrimaryKey(SysUserInfoKey key);

    public Integer updateAllByExample(@Param("record") SysUserInfo entity, @Param("example") SysUserInfoExample example);

	public Integer updateByPrimaryKeySelective(SysUserInfo entity);

}