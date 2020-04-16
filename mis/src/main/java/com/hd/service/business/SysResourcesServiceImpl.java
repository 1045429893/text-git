package com.hd.service.business;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hd.api.business.SysResourcesService;
import com.hd.api.generator.SysResourcesGeneratorService;
import com.hd.entity.generator.SysResources;
import com.hd.entity.generator.SysResourcesExample;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class SysResourcesServiceImpl implements SysResourcesService {
    /**
     * @Author 李小军
     * @Date 2017/8/30 下午3:39
     * @Description 资源服务
     */

    @Autowired
    SysResourcesGeneratorService sysResourcesGeneratorService;

    @Override
    public JSONArray getMeunList(String basePath) {
        /** 
         * @Author 李小军
         * @Date 2017/8/30 下午2:35 
         * @params []
         * @return com.alibaba.fastjson.JSONArray 
         * @Description  拉取菜单列表
         */
        //拉取一级菜单
        SysResourcesExample sysResourcesExample = new SysResourcesExample();
        sysResourcesExample.setOrderByClause("rank asc");
        SysResourcesExample.Criteria criteria = sysResourcesExample.createCriteria();
        criteria.andParentEqualTo("0");
        SysResources sysResources2 = sysResourcesGeneratorService.selectByPrimaryKey(new BigInteger("1"));

        List<SysResources> list = sysResourcesGeneratorService.selectByExample(sysResourcesExample);
        if (!CollectionUtils.isEmpty(list)) {
            JSONArray jsonArray = new JSONArray();
            for (SysResources sysResources : list) {
                JSONObject json = new JSONObject();
                json.put("title", sysResources.getName());
                //接取二级叶子菜单
                SysResourcesExample sysResourcesExample1 = new SysResourcesExample();
                sysResourcesExample1.setOrderByClause("rank asc");
                SysResourcesExample.Criteria criteria1 = sysResourcesExample1.createCriteria();
                criteria1.andParentEqualTo(sysResources.getCode());
                List<SysResources> list1 = sysResourcesGeneratorService.selectByExample(sysResourcesExample1);
                if (!CollectionUtils.isEmpty(list1)) {
                    JSONArray jsonArray1 = new JSONArray();
                    for (SysResources sysResources1 : list1) {
                        JSONObject json1 = new JSONObject();
                        json1.put("title", sysResources1.getName());
                        json1.put("href", basePath + sysResources1.getLink());
                        jsonArray1.add(json1);
                    }
                    json.put("children", jsonArray1);
                }
                jsonArray.add(json);
            }
            if (null != jsonArray) {
                return jsonArray;
            }
        }

        return null;
    }

    @Override
    public JSONArray getResourcesList() {
        /** 
         * @Author 李小军
         * @Date 2017/8/30 下午2:36 
         * @params []
         * @return com.alibaba.fastjson.JSONArray 
         * @Description  拉取资源列表
         */
        //拉取一级菜单
        SysResourcesExample sysResourcesExample = new SysResourcesExample();
        sysResourcesExample.setOrderByClause("rank asc");
        SysResourcesExample.Criteria criteria = sysResourcesExample.createCriteria();
        criteria.andParentEqualTo("0");
        List<SysResources> list = sysResourcesGeneratorService.selectByExample(sysResourcesExample);
        if (!CollectionUtils.isEmpty(list)) {
            JSONArray jsonArray = new JSONArray();
            for (SysResources sysResources : list) {
                JSONObject json = new JSONObject();
                json.put("id", sysResources.getId());
                json.put("name", sysResources.getName());
                json.put("code", sysResources.getCode());
                json.put("parent", sysResources.getParent());
                json.put("link", sysResources.getLink());
                json.put("note", sysResources.getNote());
                json.put("rank", sysResources.getRank());
                //接取二级叶子菜单
                SysResourcesExample sysResourcesExample1 = new SysResourcesExample();
                sysResourcesExample1.setOrderByClause("rank asc");
                SysResourcesExample.Criteria criteria1 = sysResourcesExample1.createCriteria();
                criteria1.andParentEqualTo(sysResources.getCode());
                List<SysResources> list1 = sysResourcesGeneratorService.selectByExample(sysResourcesExample1);
                if (!CollectionUtils.isEmpty(list1)) {
                    JSONArray jsonArray1 = new JSONArray();
                    for (SysResources sysResources1 : list1) {
                        JSONObject json1 = new JSONObject();
                        json1.put("id", sysResources1.getId());
                        json1.put("name", sysResources1.getName());
                        json1.put("code", sysResources1.getCode());
                        json1.put("parent", sysResources1.getParent());
                        json1.put("link", sysResources1.getLink());
                        json1.put("note", sysResources1.getNote());
                        json1.put("rank", sysResources1.getRank());
                        //拉取三级按钮菜单
                        SysResourcesExample sysResourcesExample2 = new SysResourcesExample();
                        sysResourcesExample2.setOrderByClause("rank asc");
                        SysResourcesExample.Criteria criteria2 = sysResourcesExample2.createCriteria();
                        criteria2.andParentEqualTo(sysResources1.getCode());
                        List<SysResources> list2 = sysResourcesGeneratorService.selectByExample(sysResourcesExample2);
                        if (!CollectionUtils.isEmpty(list2)) {
                            JSONArray jsonArray2 = new JSONArray();
                            for (SysResources sysResources2 : list2) {
                                JSONObject json2 = new JSONObject();
                                json2.put("id", sysResources2.getId());
                                json2.put("name", sysResources2.getName());
                                json2.put("code", sysResources2.getCode());
                                json2.put("parent", sysResources2.getParent());
                                json2.put("link", sysResources2.getLink());
                                json2.put("note", sysResources2.getNote());
                                json2.put("rank", sysResources2.getRank());
                                jsonArray2.add(json2);
                            }
                            json1.put("children", jsonArray2);
                        }

                        jsonArray1.add(json1);
                    }
                    json.put("children", jsonArray1);
                }
                jsonArray.add(json);
            }
            if (null != jsonArray) {
                return jsonArray;
            }
        }

        return null;
    }


    @Override
    public boolean addOrUpdateResource(SysResources sysResources, String opeartype) {
        /** 
         * @Author 李小军
         * @Date 2017/8/30 下午3:11 
         * @params [sysResources]
         * @return boolean 
         * @Description  添加，修改资源
         */
        if ("ADD".equals(opeartype)) {
            boolean b = sysResourcesGeneratorService.insertSelective(sysResources);
            if (b) return true;
        } else {
            boolean b = sysResourcesGeneratorService.updateByPrimaryKeySelective(sysResources);
            if (b) return true;
        }
        return false;
    }

    @Override
    public boolean delById(String id) {
        /** 
         * @Author 李小军
         * @Date 2017/8/30 下午2:50 
         * @params [id]
         * @return boolean 
         * @Description  通过ID删除资源
         */
        return sysResourcesGeneratorService.physicalDeleteByPrimaryKey(new BigInteger(id));
    }

    @Override
    public List<SysResources> getAll() {
        SysResourcesExample example = new SysResourcesExample();
        return sysResourcesGeneratorService.selectByExample(example);

    }

    @Override
    public List<SysResources> findByResourcesIds(List<String> strs) {
        SysResourcesExample example = new SysResourcesExample();
        SysResourcesExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(strs);
        return sysResourcesGeneratorService.selectByExample(example);
    }


}
