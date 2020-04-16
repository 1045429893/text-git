package com.hd.action.system;

import com.alibaba.fastjson.JSONArray;
import com.hd.api.business.SysResourcesService;
import com.hd.common.action.BaseAction;

import com.hd.common.log.hdLog;
import com.hd.common.utils.JsonUtils;
import com.hd.common.utils.ServletUtils;
import com.hd.entity.generator.SysResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/system/sysResources")
public class SysResourcesAction extends BaseAction {
    /**
     * @Author 李小军
     * @Date 2017/8/29 上午10:03
     * @Description 资源配置
     */

    @Autowired
    SysResourcesService sysResourcesService;


    @RequestMapping("/goSysResources")
    public String goSysResources(HttpServletRequest request) {
        /** 
         * @Author 李小军
         * @Date 2017/8/30 上午9:34 
         * @params [request, response]
         * @return java.lang.String 
         * @Description  跳转到资源列表
         */
        JSONArray jsonArray = sysResourcesService.getResourcesList();
        request.setAttribute("resourceTree", jsonArray);
        return "system/resources/sysResources";
    }

    @RequestMapping("/GetMenuListAJAX")
    public void GetMenuListAJAX(HttpServletRequest request,HttpServletResponse response) {
        /** 
         * @Author 李小军
         * @Date 2017/8/29 上午10:03 
         * @params [request, response]
         * @return void 
         * @Description  拉取菜单列表使用的json
         */
        Map<String, Object> map = new HashMap<String, Object>();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
        JSONArray jsonArray = sysResourcesService.getMeunList(basePath);
        if (null != jsonArray) {
            map.put("code", true);
            map.put("data", jsonArray);
        } else {
            map.put("code", false);
            map.put("data", null);
        }
        this.renderJson(JsonUtils.toJson(map).toString(), response);
    }


    @RequestMapping("/goResourceAddOrUpdate")
    public String goResourceAddOrUpdate() {
        /** 
         * @Author 李小军
         * @Date 2017/8/30 下午2:45 
         * @params []
         * @return java.lang.String 
         * @Description  跳转资源添加修改页
         */
        return "system/resources/resource-addOrUpdate";
    }

    @RequestMapping("/deleteResource")
    public void deleteResource(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 李小军
         * @Date 2017/8/30 下午2:47 
         * @params [request, response]
         * @return void 
         * @Description  删除资源
         */
        String resourcesId = request.getParameter("resourcesId");
        boolean flag = sysResourcesService.delById(resourcesId);
        if (flag) {
            hdLog.info("删除资源成功:" + resourcesId);
            renderText("DEL_SUCCESS", response);

        }

    }

    @RequestMapping("/addUpdateResource")
    public void addUpdateResource(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 李小军
         * @Date 2017/8/30 下午3:13 
         * @params [request, response]
         * @return void 
         * @Description   添加，修改资源
         */
        String opeartype = request.getParameter("opeartype");
        SysResources sysResources = new SysResources();
        try {
            sysResources = ServletUtils.objectMethod(SysResources.class, request);
        } catch (Exception e) {
            hdLog.error("addUpdateResource拼装数据异常" + e.getMessage(), e);
            e.printStackTrace();
        }
        if ("ADD".equals(opeartype)) {
            sysResources.setCreateTime(new Date());
            sysResources.setUpdateTime(new Date());
            boolean flag = sysResourcesService.addOrUpdateResource(sysResources, opeartype);
            if (flag) {
                hdLog.info("添加资源成功:" + sysResources.getId());
                renderText("ADD_SUCCESS", response);
            }
        } else {
            sysResources.setId(new BigInteger(request.getParameter("id")));
            sysResources.setUpdateTime(new Date());
            boolean flag = sysResourcesService.addOrUpdateResource(sysResources, opeartype);
            if (flag) {
                hdLog.info("修改资源成功:" + sysResources.getId());
                renderText("UPDATE_SUCCESS", response);

            }

        }

    }


}
