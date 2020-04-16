package com.hd.dao.business;


import java.util.List;
import java.util.Map;

/**
*@author Robot
*/
public interface SysRoleBusinessMapper
{
    /**
     *@Author 田伟勋
     *@Date 2017/9/8 17:10
     *@Description 查询系统用户关联的角色
    */
	public List<Map<String,Object>> findSysRoleByUserid(Map<String,Object> map);
	/**
	 *@Author 田伟勋
	 *@Date 2017/9/8 17:10
	 *@Description 查询商家关联的角色
	*/
    public List<Map<String,Object>> findSysRoleBySellerId(Map<String,Object> map);
}