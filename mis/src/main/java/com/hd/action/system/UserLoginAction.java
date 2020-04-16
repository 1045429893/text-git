package com.hd.action.system;


import com.alibaba.fastjson.JSONArray;
import com.hd.api.business.SystemUserService;
import com.hd.common.action.BaseAction;
import com.hd.common.utils.TimeUtils;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.business.api.LoginUserInfo;
import com.hd.entity.generator.SysResources;
import com.hd.entity.generator.SysUserInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;


/**
 * Created by liujindong on 2017/8/24.
 * 系统用户
 */
@Controller
@RequestMapping("/system")
public class UserLoginAction extends BaseAction {
    @Autowired
    SystemUserService systemUserService;

    @RequestMapping("/pullOut")
    public String pullOut(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/15 上午9:05 
         * @params [] 
         * @return java.lang.String
         * @Description  系统用户登陆
         */
        LoginUserInfo loginUserInfo = (LoginUserInfo) request.getSession().getAttribute("loginUserInfo");
        String userType = loginUserInfo.getUserType();
        String returnUrl = "system/login/login_seller";
        if(ConstantPoll.SYS_ROLE.equals(userType)){
            returnUrl = "system/login/login_system";
        }
        request.getSession().removeAttribute("loginUserInfo");
        return returnUrl;
    }
    @RequestMapping("/goSysLogin")
    public String goSysLogin(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/15 上午9:05 
         * @params [] 
         * @return java.lang.String
         * @Description  系统用户登陆
         */
        return "system/login/login_system";
    }

    @RequestMapping("/goSellerLogin")
    public String goSellerLogin(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/15 上午9:06 
         * @params [] 
         * @return java.lang.String
         * @Description 商家用户登陆
         */

        return "system/login/login_seller";
    }


    @RequestMapping("/sysLoginVerify")
    public void sysLoginVerify(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/15 上午9:06 
         * @params [] 
         * @return java.lang.String
         * @Description 系统用户登陆验证
         */

        JSONObject json;
        try {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            Object[] checkSystemUserResult = systemUserService.checkSystemUser(userName, password);
            if (checkSystemUserResult[0] != RetCodeAndMessage.SUCCESS[0]) {
                json = RetCodeAndMessage.getRetJson(checkSystemUserResult);
                this.renderJson(json.toString(), response);
                return;
            }
            SysUserInfo sysUserInfo = (SysUserInfo) checkSystemUserResult[2];
            LoginUserInfo loginUserInfo = new LoginUserInfo();
            loginUserInfo.setId(sysUserInfo.getId());
            loginUserInfo.setUsername(sysUserInfo.getUsername());
            loginUserInfo.setCompellation(sysUserInfo.getCompellation());
            loginUserInfo.setPhone(sysUserInfo.getPhone());
            loginUserInfo.setUserType(ConstantPoll.SYS_ROLE);//代表商家,与角色编码一致
            loginUserInfo.setStatus(sysUserInfo.getStatus());
            loginUserInfo.setUpdateTime(TimeUtils.convertDateToString(sysUserInfo.getUpdateTime(), TimeUtils.FORMAT1));
            loginUserInfo.setCreateTime(TimeUtils.convertDateToString(sysUserInfo.getCreateTime(), TimeUtils.FORMAT1));
            Object[] resourcesByLoginUserInfo = systemUserService.getResourcesByLoginUserInfo(loginUserInfo);
            if (resourcesByLoginUserInfo[0] != RetCodeAndMessage.SUCCESS[0]) {
                json = RetCodeAndMessage.getRetJson(resourcesByLoginUserInfo);
                this.renderJson(json.toString(), response);
                return;
            }
            List<SysResources> sysResourcesList = (List<SysResources>) resourcesByLoginUserInfo[2];
            StringBuilder sysResourcesStr = new StringBuilder();
            for(int i=0;i<sysResourcesList.size();i++){
                sysResourcesStr.append(sysResourcesList.get(i).getLink()).append(";");
            }
            loginUserInfo.setSysResourcesList((List<SysResources>) resourcesByLoginUserInfo[2]);
            loginUserInfo.setSysResourcesStr(sysResourcesStr.toString());
            request.getSession().setAttribute("loginUserInfo", loginUserInfo);
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            e.printStackTrace();
            return;
        }
    }

    @RequestMapping("/goMain")
    public String goMain(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/15 上午9:06 
         * @params [] 
         * @return java.lang.String
         * @Description 进入主页面
         */
        try {
            LoginUserInfo loginUserInfo = (LoginUserInfo) request.getSession().getAttribute("loginUserInfo");
            String compellation = loginUserInfo.getCompellation();
            request.setAttribute("compellation", compellation);
            request.setAttribute("homeDate", TimeUtils.convertDateToString(new Date(),TimeUtils.FORMAT8));
            return "index";
        } catch (Exception e) {
            e.printStackTrace();
            return "index";
        }
    }


    private JSONObject getJSONObject(String contextPath, String parent, SysResources sysResources) {
        JSONObject jsonObject = new JSONObject();
        if (parent.equals(sysResources.getParent())) {
            jsonObject.put("title", sysResources.getName());
            jsonObject.put("icon", sysResources.getImg());
            jsonObject.put("href", sysResources.getLink());
            if (sysResources.getLink().startsWith("http")) {
                jsonObject.put("href", sysResources.getLink());
            } else {
                jsonObject.put("href", contextPath + sysResources.getLink());
            }
        }
        return jsonObject;
    }


    @RequestMapping("/getAuthority")
    public void getAuthority(HttpServletRequest request, HttpServletResponse response) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/15 上午9:06 
         * @params [] 
         * @return java.lang.String
         * @Description 获取用户权限,拼装菜单树
         */
        JSONObject json;
        try {
            request.getSession().getServletContext().getRealPath("/");
            String contextPath = request.getSession().getServletContext().getContextPath();
            LoginUserInfo loginUserInfo = (LoginUserInfo) request.getSession().getAttribute("loginUserInfo");
            JSONArray navJSONArray = new JSONArray();
            if (loginUserInfo != null && loginUserInfo.getSysResourcesList() != null && loginUserInfo.getSysResourcesList().size() > 0) {
                List<SysResources> sysResourcesList = loginUserInfo.getSysResourcesList();
                for (SysResources sysResourcesParent : sysResourcesList) {
                    if ("0".equals(sysResourcesParent.getParent())) {
                        JSONObject jsonObjectParent = this.getJSONObject(contextPath, "0", sysResourcesParent);
                        JSONArray jsonArray = new JSONArray();
                        for (SysResources sysResources : sysResourcesList) {
                            JSONObject jsonObject = this.getJSONObject(contextPath, sysResourcesParent.getCode(), sysResources);
                            if (jsonObject != null && !jsonObject.isEmpty()) {
                                jsonArray.add(jsonObject);
                            }
                        }
                        if (jsonArray != null && jsonArray.size() > 0) {
                            jsonObjectParent.put("spread", false);
                            jsonObjectParent.put("children", jsonArray);
                        }
                        navJSONArray.add(jsonObjectParent);
                    }
                }
                json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
                json.put("navJSONArray", navJSONArray);
                this.renderJson(json.toString(), response);
                return;
            }
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.USER_NO_AUTHORITY_INFO);
            this.renderJson(json.toString(), response);
            return;
        } catch (Exception e) {
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            e.printStackTrace();
            return;
        }
    }


}
