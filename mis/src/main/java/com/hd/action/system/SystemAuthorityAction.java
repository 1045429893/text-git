package com.hd.action.system;

import com.hd.api.business.SysResourcesService;
import com.hd.api.business.SystemAuthorityService;
import com.hd.common.action.BaseAction;
import com.hd.common.utils.JsonUtils;
import com.hd.entity.business.ResourcesTree;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.SysAuthority;
import com.hd.entity.generator.SysAuthorityResources;
import com.hd.entity.generator.SysResources;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by liujindong on 2017/8/24.
 * 权限管理
 */
@Controller
@RequestMapping("/system/authority")
public class SystemAuthorityAction extends BaseAction {

    @Autowired
    SystemAuthorityService systemAuthorityService;
    @Autowired
    SysResourcesService sysResourcesService;

    @RequestMapping("/goAuthortiyInfo")
    public String toResourcesMessage(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 刘金东 
         * @Date 2017/8/30 上午11:19 
         * @params [request, response] 
         * @return java.lang.String
         * @Description  进入权限管理页面
         */


        return "system/authority/sysAuthority";
    }

    @RequestMapping("/goAddOrUpdate")
    public String addOrUpdateResources(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 刘金东 
         * @Date 2017/8/25 下午2:17 
         * @params [request, response] 
         * @return void
         * @Description 增加或修改资源信息
         */
        try {
            String operate = request.getParameter("operate");
            if (!"ADD".equals(operate)) {
                String id = request.getParameter("id");
                SysAuthority authorityDB = systemAuthorityService.getAuthorityById(new BigInteger(id));
                request.setAttribute("authority", authorityDB);
            }
            request.setAttribute("operate", operate);
            return "system/authority/addOrUpdate";
        } catch (Exception e) {
            e.printStackTrace();
            return "system/authority/addOrUpdate";
        }
    }

    @RequestMapping("/deleteAuthortiy")
    public void deleteResources(HttpServletRequest request, HttpServletResponse response) {
        JSONObject json;
        String id = request.getParameter("id");
        try {
            Object[] deleteAuthorityResult = systemAuthorityService.deleteAuthority(new BigInteger(id));
            json = RetCodeAndMessage.getRetJson(deleteAuthorityResult);
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            e.printStackTrace();
            return;
        }

    }

    @RequestMapping("/addOrUpdateAuthortiy")
    public void addOrUpdateAuthortiy(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/6 上午10:08 
         * @params [request, response] 
         * @return void
         * @Description 添加和修改权限,根据operate参数判断类型
         */
        JSONObject json;
        try {
            String resourcesIds = request.getParameter("resourcesIds");
            String operate = request.getParameter("operate");
            String name = request.getParameter("name");
            String note = request.getParameter("note");
            String authorityId = request.getParameter("authorityId");
            Date dateTime = new Date();
            if (("UPDATE".equals(operate) && StringUtils.isEmpty(authorityId)) || (!"UPDATE".equals(operate) && StringUtils.isEmpty(name))) {
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.INCOMPLETE_PARAMETER);
                this.renderJson(json.toString(), response);
                return;
            }
            SysAuthority sysAuthority = new SysAuthority();
            if ("UPDATE".equals(operate)) {//不是修改update就是添加add,不支持其他情况
                sysAuthority.setId(new BigInteger(authorityId));
//                if (!StringUtils.isEmpty(name)) {
//                    sysAuthority.setName(name);
//                }
                if (!StringUtils.isEmpty(note)) {
                    sysAuthority.setNote(note);
                }
                sysAuthority.setUpdateTime(dateTime);
                Object[] updateAuthorityResult = systemAuthorityService.updateAuthority(sysAuthority, resourcesIds);
                json = RetCodeAndMessage.getRetJson(updateAuthorityResult);
            } else {
                sysAuthority.setName(name);
                sysAuthority.setNote(note);
                sysAuthority.setCreateTime(dateTime);
                sysAuthority.setUpdateTime(dateTime);
                Object[] addAuthorityResult = systemAuthorityService.addAuthority(sysAuthority, resourcesIds);
                json = RetCodeAndMessage.getRetJson(addAuthorityResult);
            }
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            e.printStackTrace();
            return;
        }

    }

    @RequestMapping("/checkAuthoritName")
    public void checkAuthoritName(HttpServletRequest request, HttpServletResponse response) {
        JSONObject json;
        try {
            String name = request.getParameter("name");
            String authorityId = request.getParameter("authorityId");
            String operate = request.getParameter("operate");
            boolean flag = systemAuthorityService.checkAuthoritName(name,operate,authorityId);
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
            json.put("flag", flag);
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            e.printStackTrace();
            return;
        }

    }


    @RequestMapping("/getAuthortiyPage")
    public void getAuthortiyPage(HttpServletRequest request, HttpServletResponse response) {
        JSONObject json;
        try {
            Integer page = StringUtils.isEmpty(request.getParameter("page")) ? 1 : Integer.parseInt(request.getParameter("page"));
            Integer pageSize = StringUtils.isEmpty(request.getParameter("limit")) ? 20 : Integer.parseInt(request.getParameter("limit"));
            String name = request.getParameter("name");

            Object[] getAuthorityPageResult = systemAuthorityService.getAuthorityPage(page, pageSize, name);
            if (getAuthorityPageResult[0] != RetCodeAndMessage.SUCCESS[0]) {
                json = RetCodeAndMessage.getRetJson(getAuthorityPageResult);
                this.renderJson(json.toString(), response);
                return;
            }
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
            json.put("data", getAuthorityPageResult[2]);
            json.put("count", getAuthorityPageResult[3]);
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            e.printStackTrace();
            return;
        }
    }

    @RequestMapping("/getResourceTree")
    public void getResourceTree(HttpServletRequest request, HttpServletResponse response) {
        List<ResourcesTree> resourcesTrees = new ArrayList<>();
        try {
            String authorityId = request.getParameter("authorityId");
            String operate = request.getParameter("operate");

            List<SysResources> sysResourcesList;
            List<SysAuthorityResources> sysAuthorityResourceslist = new ArrayList<>();
            if (!"ADD".equals(operate)) {
                sysAuthorityResourceslist = systemAuthorityService
                        .getSysAuthorityResourcesByAuthorityId(authorityId);
            }
            if ("VIEW".equals(operate) && sysAuthorityResourceslist != null && sysAuthorityResourceslist.size() > 0) {
                List<String> strs = new ArrayList<>();
                for (SysAuthorityResources sysAuthorityResources : sysAuthorityResourceslist) {
                    strs.add(sysAuthorityResources.getSysResourcesId().toString());
                }
                sysResourcesList = sysResourcesService.findByResourcesIds(strs);
            } else {
                sysResourcesList = sysResourcesService.getAll();
            }
            for (SysResources resource : sysResourcesList) {
                ResourcesTree tree = new ResourcesTree();
//                BeanUtils.copyProperties(resource, tree);// 同样的字段直接复制
                tree.setId(resource.getCode());
                tree.setParentId(resource.getParent());
                tree.setText(resource.getName());
                tree.setIconCls(resource.getImg());
                tree.setResourcesId(resource.getId().toString());
                tree.setResourcesName(resource.getName());
                tree.setRank(resource.getRank());
                if ("UPDATE".equals(operate) && sysAuthorityResourceslist != null && sysAuthorityResourceslist.size() > 0) {
                    if (isExistResource(sysAuthorityResourceslist, resource.getId().toString())) {
                        tree.setChecked(true);
                    } else {
                        tree.setChecked(false);
                    }
                }
//            String contextPath = request.getSession().getServletContext().getContextPath();
//            Attribute attribute = new Attribute();
//            attribute.setUrl(contextPath + resource.getLink());
//            tree.setAttributes(attribute);
                resourcesTrees.add(tree);
            }
            renderJson(JsonUtils.toJson(resourcesTrees).toString(), response);
        } catch (Exception e) {
            renderJson("异常", response);
            e.printStackTrace();
        }
    }


    private boolean isExistResource(List<SysAuthorityResources> geResources, String resourceid) {
        Iterator<SysAuthorityResources> iterator = geResources.iterator();
        while (iterator.hasNext()) {
            if (resourceid.equals(iterator.next().getSysResourcesId().toString())) {
                return true;
            }
        }
        return false;
    }


}
