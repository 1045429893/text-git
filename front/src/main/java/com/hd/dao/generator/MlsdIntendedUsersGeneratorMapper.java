package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdIntendedUsers;
import com.hd.entity.generator.MlsdIntendedUsersExample;
import com.hd.entity.generator.MlsdIntendedUsersKey;

/**
*@author Robot
*/
public interface MlsdIntendedUsersGeneratorMapper
{

	public Integer countByExample(MlsdIntendedUsersExample entity);

    public List<MlsdIntendedUsers> selectByExample(MlsdIntendedUsersExample entity);

	public MlsdIntendedUsers selectByPrimaryKey(MlsdIntendedUsersKey key);

	public MlsdIntendedUsers selectUnDelByPrimaryKey(MlsdIntendedUsersKey key);

    public Integer insertSelective(MlsdIntendedUsers entity);

	public Integer replaceSelective(MlsdIntendedUsers entity);
 
    public Integer deleteByExample(MlsdIntendedUsersExample example);

	public Integer deleteByPrimaryKey(MlsdIntendedUsersKey key);

    public Integer updateAllByExample(@Param("record") MlsdIntendedUsers entity, @Param("example") MlsdIntendedUsersExample example);

	public Integer updateByPrimaryKeySelective(MlsdIntendedUsers entity);

}