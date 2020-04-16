package com.hd.dao.business;

import java.util.List;
import java.util.Map;

/**
*@author Robot
*/
public interface SysAuthorityBusinessMapper
{

	public List<Map<String,Object>> findSysAuthorityByRoleId(Map<String,Object> map);

}