package com.hd.api.business;

import com.alibaba.fastjson.JSONArray;
import com.hd.entity.generator.SysResources;

import java.util.List;


/**
*@author Robot
*/
public  interface SysResourcesService {
    /** 
    * @Author 李小军 
    * @Date 2017/8/30 下午2:44 
    * @Description 资源服务接口
    */

    public JSONArray getMeunList(String basePath);

    public List<SysResources> getAll();

    List<SysResources> findByResourcesIds(List<String> strs);

    public JSONArray getResourcesList();

    public boolean addOrUpdateResource(SysResources sysResources,String opeartype);

    public  boolean delById(String id);
}