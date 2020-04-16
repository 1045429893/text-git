package com.hd.dao.business;

import java.util.List;
import java.util.Map;

/**
*@author Robot
*/
public interface CleanImageTaskBusinessMapper
{

	public List<Map<String,Object>> findImageNamesById(Map<String, Object> map);

}