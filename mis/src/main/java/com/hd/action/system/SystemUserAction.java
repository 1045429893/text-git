package com.hd.action.system;


import com.hd.api.business.SystemUserService;
import com.hd.common.action.BaseAction;
import com.hd.common.log.hdLog;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.generator.SysRole;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hd.common.page.PageCondition;
import com.hd.common.utils.ServletUtils;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.SysUserInfo;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by liujindong on 2017/8/24.
 * 系统用户
 */
@Controller
@RequestMapping("/system")
public class SystemUserAction extends BaseAction {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @Autowired
    SystemUserService systemUserService;
    public void sysUserLogin (){

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/25 14:59
     *@Description 进入用户管理
     */
    @RequestMapping("user/goSysUserInfoPage")
    public String goSysUserInfoPage(HttpServletRequest request, HttpServletResponse response){

        try {
            request.setAttribute("userTypes",ConstantPoll.getUserTypeList());
            response.setContentType("text/xml;charset=utf-8");
            return "system/user/sysUserList";
        } catch (Exception e) {
            e.printStackTrace();
            return "500";
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/31 11:27
     *@Description  进入角色管理
     */
    @RequestMapping("role/goSysRolePage")
    public String goSysRolePage(HttpServletRequest request, HttpServletResponse response){
        try {
            response.setContentType("text/xml;charset=utf-8");
            return "system/role/sysRoleList";
        } catch (Exception e) {
            e.printStackTrace();
            return "500";
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/25 15:10
     *@描述 分页查询用户信息
     */
    @RequestMapping("user/findSysUserInfoList")
    public void findSysUserInfoList(HttpServletRequest request, HttpServletResponse response){
        JSONObject json=new JSONObject();

        try {
            PageCondition condition = ServletUtils.objectMethod(PageCondition.class, request);
            String userName=request.getParameter("userName");
            Object[] ret=systemUserService.findSysUserInfoByPage(userName,condition);
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                json.put("code",0);
                json.put("msg","");
                json.put("data",ret[2]);
                json.put("count",ret[3]);
                json.put("pageSize",condition.getPageSize());
            }else{
                json.put("code",0);
                json.put("msg",ret[1]);
            }
            this.renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            return;
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 11:02
     *@Description  进入添加用户
     */
    @RequestMapping("user/goAddSysUserInfo")
    public String goAddSysUserInfo(HttpServletRequest request, HttpServletResponse response){

        try {
            Object[] ret=systemUserService.findSysRoleList(ConstantPoll.SYS_ROLE);
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("roleList",ret[2]);
            }
            request.setAttribute("userTypes",ConstantPoll.getUserTypeList());
            response.setContentType("text/xml;charset=utf-8");
            return "system/user/addSysUser";
        } catch (Exception e) {
            e.printStackTrace();
            return "500";
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 11:02
     *@Description  进入修改用户
     */
    @RequestMapping("user/goUpdateSysUserInfo")
    public String goUpdateSysUserInfo(HttpServletRequest request, HttpServletResponse response){

        try {
            String id=request.getParameter("id");
            Object[] ret=systemUserService.getSysUserInfo(id);
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("userInfo",ret[2]);
            }
            Object[] ret1=systemUserService.findSysRoleList(ConstantPoll.SYS_ROLE);
            Object[] ret2=systemUserService.findSysRoleByUserId(id);

            if(ret1[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("roleList",ret1[2]);
            }
            if(ret2[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("uList",ret2[2]);
            }
            request.setAttribute("userTypes",ConstantPoll.getUserTypeList());
            response.setContentType("text/xml;charset=utf-8");
            return "system/user/editSysUser";
        } catch (Exception e) {
            e.printStackTrace();
            return "500";
        }

    }
    @RequestMapping("user/goSeeSysUserInfo")
    public String goSeeSysUserInfo(HttpServletRequest request, HttpServletResponse response){

        try{
            String id=request.getParameter("id");
            Object[] ret=systemUserService.getSysUserInfo(id);
            Object[] ret1=systemUserService.findSysRoleByUserId(id);
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("userInfo",ret[2]);
            }
            if(ret1[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("roleList",ret1[2]);
            }
            request.setAttribute("userTypes",ConstantPoll.getUserTypeList());
            response.setContentType("text/xml;charset=utf-8");
            return "system/user/seeDetail";
        } catch (Exception e) {
            e.printStackTrace();
            return "500";
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 11:36
     *@Description  添加用户
     */
    @RequestMapping("user/addSysUserInfo")
    public void addSysUserInfo(@RequestParam(required = false) String[] roleids,HttpServletRequest request, HttpServletResponse response){
        JSONObject json;
        try{
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String compellation=request.getParameter("compellation");
            String phone=request.getParameter("phone");
            String userType=request.getParameter("userType");

            Object[] ret=systemUserService.insertSysUserInfo( username,password,compellation,phone,userType,roleids);
            if(!ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                json=RetCodeAndMessage.getRetJson(ret);
                this.renderJson(json.toString(), response);
                return;
            }
            json=RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
            renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            return;
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 11:36
     *@Description  修改用户信息
     */
    @RequestMapping("user/updateSysUserInfo")
    public void updateSysUserInfo(@RequestParam(required = false) String[] roleids, HttpServletRequest request, HttpServletResponse response){
        JSONObject json;
        try{
            String id=request.getParameter("id");
            String username=request.getParameter("username");
            String compellation=request.getParameter("compellation");
            String phone=request.getParameter("phone");
            String userType=request.getParameter("userType");
            String status=request.getParameter("status");
            String password=request.getParameter("password");
            Object[] ret=systemUserService.updateSysUserInfo(id,username,compellation,phone,userType,status,roleids,password);
            json=RetCodeAndMessage.getRetJson(ret);
            renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            return;
        }
    }

    /**
     *@Author 田伟勋
     *@Date 2017/8/28 15:50
     *@Description  用户关联角色
     */
    @RequestMapping("user/updateSysUserRole")
    public void updateSysUserRole(HttpServletRequest request, HttpServletResponse response, @RequestParam(required = false) String[] roleids){
        JSONObject json;
        try{

            String userid=request.getParameter("userid");
            Object[] ret=systemUserService.updateSysUserRole(userid,roleids);
            json=RetCodeAndMessage.getRetJson(ret);
            renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            return;
        }
    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/29 14:03
     *@Description  分页查询角色
     */
    @RequestMapping("role/findSysRoleByPage")
    public void findSysRoleByPage(HttpServletRequest request, HttpServletResponse response){
        JSONObject json=new JSONObject();
        try {

            PageCondition condition = ServletUtils.objectMethod(PageCondition.class, request);
            String roleName=request.getParameter("roleName");
            String roleType=request.getParameter("roleType");
            Object[] ret=systemUserService.findSysRoleByPage(roleName,roleType,condition);
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                json.put("code",0);
                json.put("msg","");
                json.put("data",ret[2]);
                json.put("count",ret[3]);
            }else{
                json.put("code",0);
                json.put("msg",ret[1]);
            }
            this.renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            json = RetCodeAndMessage.getRetJson(RetCodeAndMessage.SERVER_ERROR);
            this.renderJson(json.toString(), response);
            return;
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/29 14:03
     *@Description  进入添加角色
     */
    @RequestMapping("role/goAddSysRole")
    public String goAddSysRole(HttpServletRequest request, HttpServletResponse response){

        try {
            Object[] ret=systemUserService.findSysAuthority();
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("authList",ret[2]);
            }
            request.setAttribute("roleTypes",ConstantPoll.getRoleTypeList());
            response.setContentType("text/xml;charset=utf-8");
            return "system/role/addSysRole";
        } catch (Exception e) {
            e.printStackTrace();
            return "500";
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/29 14:03
     *@Description  添加角色
     */
    @RequestMapping("role/addSysRole")
    public void addSysRole(@RequestParam(required = false)String[] authIds, HttpServletRequest request, HttpServletResponse response){
        JSONObject json;
        try{
            String name=request.getParameter("name");
            String note=request.getParameter("note");
            String roleType=request.getParameter("roleType");
            Object[] ret=systemUserService.insertSysRole(name,note,roleType,authIds);
            if(!ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                json=RetCodeAndMessage.getRetJson(ret);
                this.renderJson(json.toString(), response);
                return;
            }
            json=RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
            renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/29 14:03
     *@Description  进入修改角色
     */
    @RequestMapping("role/goUpdateSysRole")
    public String goUpdateSysRole(HttpServletRequest request, HttpServletResponse response){

        try {
            String id=request.getParameter("id");
            Object[] ret=systemUserService.getSysRole(id);
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("role",ret[2]);
            }
            Object[] ret1=systemUserService.findSysAuthority();
            if(ret1[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("authList",ret1[2]);
            }
            Object[] ret2=systemUserService.findSysAuthorityByRole(id);
            if(ret2[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("uList",ret2[2]);
            }
            request.setAttribute("roleTypes",ConstantPoll.getRoleTypeList());
            response.setContentType("text/xml;charset=utf-8");
            return "system/role/editSysRole";
        } catch (Exception e) {
            return "system/classify/classifyList";
        }

    }
    @RequestMapping("role/goSeeSysRole")
    public String goSeeSysRole(HttpServletRequest request, HttpServletResponse response){

        try {
            String id=request.getParameter("id");
            Object[] ret=systemUserService.getSysRole(id);
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("role",ret[2]);
            }
            Object[] ret1=systemUserService.findSysAuthority();
            if(ret1[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("authList",ret1[2]);
            }
            Object[] ret2=systemUserService.findSysAuthorityByRole(id);
            if(ret2[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("uList",ret2[2]);
            }
            request.setAttribute("roleTypes",ConstantPoll.getRoleTypeList());
            response.setContentType("text/xml;charset=utf-8");
            return "system/role/seeSysRole";
        } catch (Exception e) {
            return "system/classify/classifyList";
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/30 9:07
     *@Description  修改角色
     */
    @RequestMapping("role/updateSysRole")
    public void updateSysRole(@RequestParam(required = false)String[] authIds,HttpServletRequest request, HttpServletResponse response){
        JSONObject json;
        try{
            String id=request.getParameter("id");
            String name=request.getParameter("name");
            String note=request.getParameter("note");
            String roleType=request.getParameter("roleType");
            Object[] ret=systemUserService.updateSysRole(id,name,note,roleType,authIds);
            if(!ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                json=RetCodeAndMessage.getRetJson(ret);
                this.renderJson(json.toString(), response);
                return;
            }
            json=RetCodeAndMessage.getRetJson(RetCodeAndMessage.SUCCESS);
            renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/30 9:12
     *@Description  进入修改用户和角色关联
     */
    @RequestMapping("user/goUpdateSysUserRole")
    public String goUpdateSysUserRole(HttpServletRequest request, HttpServletResponse response){

        try {
            String userid=request.getParameter("userid");
            Object[] ret=systemUserService.getSysUserInfo(userid);
            Object[] ret1=systemUserService.findSysRoleList(ConstantPoll.SYS_ROLE);
            Object[] ret2=systemUserService.findSysRoleByUserId(userid);
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("userInfo",ret[2]);
            }
            if(ret1[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("roleList",ret1[2]);
            }
            if(ret2[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("uList",ret2[2]);
            }
            response.setContentType("text/xml;charset=utf-8");
            return "system/user/sysUserBindRole";
        } catch (Exception e) {
            return "system/classify/classifyList";
        }

    }

    /**
     *@Author 田伟勋
     *@Date 2017/8/30 9:35
     *@Description  进入修改系统用户密码
     */
    @RequestMapping("user/goUpdateSysUserPassword")
    public String goUpdateSysUserPassword(HttpServletRequest request, HttpServletResponse response){

        try {
            String id=request.getParameter("id");
            Object[] ret=systemUserService.getSysUserInfo(id);
            if(ret[0].equals(RetCodeAndMessage.SUCCESS[0])){
                request.setAttribute("userInfo",ret[2]);
            }
            response.setContentType("text/xml;charset=utf-8");
            return "system/user/updateSysUserPassword";
        } catch (Exception e) {
            return "system/classify/classifyList";
        }

    }
    /**
     *@Author 田伟勋
     *@Date 2017/8/30 9:35
     *@Description  修改系统用户密码
     */
    @RequestMapping("user/updateSysUserPassword")
    public void updateSYsUserPassword(HttpServletRequest request, HttpServletResponse response){
        JSONObject json;
        try{
            String userid=request.getParameter("userid");
            String opd=request.getParameter("opd");
            String npd=request.getParameter("npd");
            Object[] ret=systemUserService.updateSysUserPassword(userid,opd,npd);
            json=RetCodeAndMessage.getRetJson(ret);
            this.renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            return ;
        }
    }
    /**
     *@Author 田伟勋
     *@Date 2017/9/1 11:05
     *@Description 验证系统用户名重复
     */
    @RequestMapping("user/checkSysUsername")
    public void checkSysUsername(HttpServletRequest request, HttpServletResponse response){
        JSONObject json;
        try{
            String userName=request.getParameter("userName");
            String userid=request.getParameter("userid");
            Object[] ret=systemUserService.checkSysUsername(userName,userid);
            json=RetCodeAndMessage.getRetJson(ret);
            this.renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            return ;
        }
    }
    /**
     *@Author 田伟勋
     *@Date 2017/9/1 11:04
     *@Description 验证角色名重复
     */
    @RequestMapping("role/checkSysRolename")
    public void checkSysRolename(HttpServletRequest request, HttpServletResponse response){
        JSONObject json;
        try{
            String roleName=request.getParameter("roleName");
            String roleid=request.getParameter("roleid");
            Object[] ret=systemUserService.checkSysRolename(roleName,roleid);
            json=RetCodeAndMessage.getRetJson(ret);
            this.renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            return ;
        }
    }
    /**
     *@Author 田伟勋
     *@Date 2017/9/1 11:04
     *@Description 删除角色
     */
    @RequestMapping("role/delSysRole")
    public void delSysRole(HttpServletRequest request, HttpServletResponse response){
        JSONObject json;
        try{

            String roleid=request.getParameter("roleid");
            Object[] ret=systemUserService.delSysRole(roleid);
            json=RetCodeAndMessage.getRetJson(ret);
            this.renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            return ;
        }
    }



    @RequestMapping("user/checkSysUserPass")
    public void checkSysUserPass(HttpServletRequest request, HttpServletResponse response){
        JSONObject json;
        try{
            String userPass=request.getParameter("userPass");
            String userid=request.getParameter("userid");
            Object[] ret=systemUserService.checkSysUserPass(userPass,userid);
            json=RetCodeAndMessage.getRetJson(ret);
            this.renderJson(json.toString(),response);
            return;
        }catch(Exception e){
            e.printStackTrace();
            return ;
        }
    }
}
