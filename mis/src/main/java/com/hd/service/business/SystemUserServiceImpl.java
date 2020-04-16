package com.hd.service.business;

import com.hd.api.business.SystemUserService;
import com.hd.api.generator.*;
import com.hd.common.cipher.Md5Utils;
import com.hd.common.page.PageCondition;
import com.hd.common.utils.ServiceRetCode;
import com.hd.common.utils.TimeUtils;
import com.hd.dao.business.SysAuthorityBusinessMapper;
import com.hd.dao.business.SysRoleBusinessMapper;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.business.api.LoginUserInfo;
import com.hd.entity.business.api.SysRoleVo;
import com.hd.entity.business.api.SysUserInfoVo;
import com.hd.entity.generator.*;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.util.*;

/**
 * @Author 田伟勋
 * @Date 创建：15:142017/8/25
 * @Description:
 */
@Service
public class SystemUserServiceImpl implements SystemUserService {
    @Autowired
    SysUserInfoGeneratorService sysUserInfoGeneratorService;
    @Autowired
    SysUserRoleGeneratorService sysUserRoleGeneratorService;
    @Autowired
    SysRoleGeneratorService sysRoleGeneratorService;
    @Autowired
    SysRoleBusinessMapper sysRoleBusinessMapper;
    @Autowired
    SysAuthorityGeneratorService sysAuthorityGeneratorService;
    @Autowired
    SysAuthorityBusinessMapper sysAuthorityBusinessMapper;
    @Autowired
    SysRoleAuthorityGeneratorService sysRoleAuthorityGeneratorService;
    @Autowired
    SysAuthorityResourcesGeneratorService sysAuthorityResourcesGeneratorService;
    @Autowired
    SysResourcesGeneratorService sysResourcesGeneratorService;

    @Override
    public Object[] findSysUserInfoByPage(String userName, PageCondition condition) {
        /**
         *@Author 田伟勋
         *@Date 2017/9/21 14:45
         *@Description  分页查询用户信息
         *@params [userName, condition]
         *@return java.lang.Object[]
         */
        //分页查询用户信息
        SysUserInfoExample sysUserInfoExample = new SysUserInfoExample();
        sysUserInfoExample.setOrderByClause("create_time desc");
        if (userName != null && !"".equals(userName) && !"null".equals(userName)) {
            SysUserInfoExample.Criteria cc = sysUserInfoExample.createCriteria();
            cc.andCompellationLike("%" + userName + "%");
        }
        //一共有多少条
        int count = sysUserInfoGeneratorService.countByExample(sysUserInfoExample);
        sysUserInfoExample.setPage(condition.getPage(), condition.getPageSize());
        List<SysUserInfoVo> voList = new ArrayList<SysUserInfoVo>();
        List<SysUserInfo> list = this.sysUserInfoGeneratorService.selectByExample(sysUserInfoExample);
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                SysUserInfoVo vo = new SysUserInfoVo();
                vo.setId(list.get(i).getId());
                vo.setCompellation(list.get(i).getCompellation());
                vo.setCreateTime(TimeUtils.convertDateToString(list.get(i).getCreateTime(), TimeUtils.FORMAT1));
                vo.setPhone(list.get(i).getPhone());
                vo.setUsername(list.get(i).getUsername());
                vo.setUserType(list.get(i).getUserType());
                vo.setUpdateTime(TimeUtils.convertDateToString(list.get(i).getUpdateTime(), TimeUtils.FORMAT1));
                vo.setStatus(list.get(i).getStatus());
                vo.setStatusStr(ConstantPoll.getStartOrStopShow(list.get(i).getStatus()));
                voList.add(vo);
            }
        }

        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, voList, count);
    }

    @Override
    @Transactional
    public Object[] insertSysUserInfo(String username,String password,String compellation,String phone,String userType, String[] roleids) {
        /**
         *@Author 田伟勋
         *@Date 2017/9/21 14:45
         *@Description  保存系统用户
         *@params [username, password, compellation, phone, userType, roleids]
         *@return java.lang.Object[]
         */
        //判断参数不全
        if (StringUtil.isNullOrEmpty(username)||StringUtil.isNullOrEmpty(password)){
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        SysUserInfo userInfo=new SysUserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        if(!StringUtil.isNullOrEmpty(compellation)){
            userInfo.setCompellation(compellation);
        }if(!StringUtil.isNullOrEmpty(phone)){
            userInfo.setPhone(phone);
        }
        if(!StringUtil.isNullOrEmpty(userType)){
            userInfo.setUserType(userType);
        }
        //赋值
        userInfo.setStatus(ConstantPoll.START);
        userInfo.setCreateTime(new Date());
        userInfo.setUpdateTime(new Date());
        userInfo.setPassword(Md5Utils.encrypt(userInfo.getPassword()));
        //保存
        boolean isInsertSuccess = sysUserInfoGeneratorService.insertSelective(userInfo);
        //失败回滚
        if (!isInsertSuccess) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_USER_ADD_FAIL);
        }
        if (roleids == null || roleids.length == 0) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
        }
        boolean isUpdateSuccess;
        for (String roleid : roleids) {
            SysUserRole userRole = new SysUserRole();
            userRole.setCreateTime(new Date());
            userRole.setUpdateTime(new Date());
            userRole.setSysRoleId(new BigInteger(roleid));
            userRole.setSysUserId(userInfo.getId());
            isUpdateSuccess = sysUserRoleGeneratorService.insertSelective(userRole);
            if (!isUpdateSuccess) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_USER_BIND_ROLE_FAIL);
            }
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    @Transactional
    public Object[] updateSysUserInfo(String id, String username, String compellation, String phone, String userType, String status, String[] roleids, String password) {
        /**
         *@Author 田伟勋
         *@Date 2017/9/21 14:46
         *@Description  修改系统用户
         *@params [id, username, compellation, phone, userType, roleids]
         *@return java.lang.Object[]
         */
        //判断参数
        SysUserInfo userInfo=new SysUserInfo();
        if(!StringUtil.isNullOrEmpty(id)){
            userInfo.setId(new BigInteger(id));
        }
        if(!StringUtil.isNullOrEmpty(username)){
            userInfo.setUsername(username);
        }
        if(!StringUtil.isNullOrEmpty(status)){
            userInfo.setStatus(status);
        }
        if(!StringUtil.isNullOrEmpty(compellation)){
            userInfo.setCompellation(compellation);
        }
        if(!StringUtil.isNullOrEmpty(phone)){
            userInfo.setPhone(phone);
        }
        if(!StringUtil.isNullOrEmpty(userType)){
            userInfo.setUserType(userType);
        }
        if(!StringUtil.isNullOrEmpty(password)){
            userInfo.setPassword(Md5Utils.encrypt(password));
        }
        //最后修改时间
        userInfo.setUpdateTime(new Date());
        //修改
        boolean isUpdateSuccess = sysUserInfoGeneratorService.updateByPrimaryKeySelective(userInfo);
        //失败回滚
        if (!isUpdateSuccess) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_USER_UPDATE_FAIL);
        }
        SysUserRoleExample example = new SysUserRoleExample();
        SysUserRoleExample.Criteria cc = example.createCriteria();
        cc.andSysUserIdEqualTo(userInfo.getId().toString());
        sysUserRoleGeneratorService.physicalDeleteByExample(example);
        if (roleids == null || roleids.length == 0) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
        }
        boolean isInsertSuccess;
        for (String roleid : roleids) {
            SysUserRole userRole = new SysUserRole();
            userRole.setCreateTime(new Date());
            userRole.setUpdateTime(new Date());
            userRole.setSysRoleId(new BigInteger(roleid));
            userRole.setSysUserId(userInfo.getId());
            isInsertSuccess = sysUserRoleGeneratorService.insertSelective(userRole);
            if (!isInsertSuccess) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_USER_BIND_ROLE_FAIL);
            }
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getSysUserInfo(String id) {
        /**
         *@Author 田伟勋
         *@Date 2017/9/21 14:46
         *@Description  主键查询用户信息
         *@params [id]
         *@return java.lang.Object[]
         */
        if (StringUtil.isNullOrEmpty(id)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        BigInteger userid = new BigInteger(id);
        SysUserInfo userInfo = sysUserInfoGeneratorService.selectByPrimaryKey(userid);
        SysUserInfoVo vo = new SysUserInfoVo();
        vo.setId(userInfo.getId());
        vo.setCompellation(userInfo.getCompellation());
        vo.setCreateTime(TimeUtils.convertDateToString(userInfo.getCreateTime(), TimeUtils.FORMAT1));
        vo.setPhone(userInfo.getPhone());
        vo.setUsername(userInfo.getUsername());
        vo.setUserType(userInfo.getUserType());
        vo.setUpdateTime(TimeUtils.convertDateToString(userInfo.getUpdateTime(), TimeUtils.FORMAT1));
        vo.setStatus(userInfo.getStatus());
        vo.setStatusStr(ConstantPoll.getStartOrStopShow(userInfo.getStatus()));
        if (userInfo == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_USER_NOT_EXIST);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, vo);
    }


    @Override
    public Object[] findSysRoleByPage(String roleName, String roleType, PageCondition condition) {
        /**
         *@Author 田伟勋
         *@Date 2017/9/21 14:46
         *@Description  分页查询角色信息
         *@params [roleName, roleType, condition]
         *@return java.lang.Object[]
         */
        SysRoleExample sysRoleExample = new SysRoleExample();
        sysRoleExample.setOrderByClause("create_time desc");//排序
        SysRoleExample.Criteria cc = sysRoleExample.createCriteria();
        if (roleName != null && !"".equals(roleName) && !"null".equals(roleName)) {
            cc.andNameLike("%" + roleName + "%");
        }
        if (roleType != null && !"".equals(roleType) && !"null".equals(roleType)) {
            cc.andRoleTypeEqualTo(roleType);
        }
        int count = sysRoleGeneratorService.countByExample(sysRoleExample);
        sysRoleExample.setPage(condition.getPage(), condition.getPageSize());
        Integer total = this.sysRoleGeneratorService.countByExample(sysRoleExample);
        List<SysRole> list = new ArrayList<SysRole>();
        List<SysRoleVo> voList = new ArrayList<SysRoleVo>();
        list = this.sysRoleGeneratorService.selectByExample(sysRoleExample);
        for (int i = 0; i < list.size(); i++) {
            SysRoleVo vo = new SysRoleVo();
            vo.setId(list.get(i).getId());
            vo.setName(list.get(i).getName());
            vo.setNote(list.get(i).getNote());
            vo.setCreateTime(TimeUtils.convertDateToString(list.get(i).getCreateTime(), TimeUtils.FORMAT1));
            vo.setUpdateTime(TimeUtils.convertDateToString(list.get(i).getUpdateTime(), TimeUtils.FORMAT1));
            voList.add(vo);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, voList, count);
    }

    @Override
    @Transactional
    public Object[] insertSysRole(String name,String note,String roleType, String[] authIds) {
        /**
         *@Author 田伟勋
         *@Date 2017/9/21 14:46
         *@Description  保存角色信息
         *@params [name, note, roleType, authIds]
         *@return java.lang.Object[]
         */
        if (StringUtil.isNullOrEmpty(name)||StringUtil.isNullOrEmpty(roleType)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        SysRole role=new SysRole();
        role.setName(name);
        if(!StringUtil.isNullOrEmpty(note)){
            role.setNote(note);
        }
        role.setRoleType(roleType);
        Date date = new Date();
        role.setCreateTime(date);
        role.setUpdateTime(date);
        boolean isInsertSuccess = sysRoleGeneratorService.insertSelective(role);
        if (!isInsertSuccess) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_ROLE_ADD_FAIL);
        }
        boolean isUpdateSuccess;
        if (authIds != null && authIds.length > 0) {
            for (String authId : authIds) {
                SysRoleAuthority sr = new SysRoleAuthority();
                sr.setCreateTime(date);
                sr.setUpdateTime(date);
                sr.setSysAuthorityId(new BigInteger(authId));
                sr.setSysRoleId(role.getId());
                isUpdateSuccess = sysRoleAuthorityGeneratorService.insertSelective(sr);
                if (!isUpdateSuccess) {
                    return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_ROLE_BIND_AUTH_FAIL);
                }
            }
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    @Transactional
    public Object[] updateSysRole(String id,String name,String note,String roleType, String[] authIds) {
        /**
         *@Author 田伟勋
         *@Date 2017/9/21 14:49
         *@Description  修改角色信息
         *@params [id, name, note, roleType, authIds]
         *@return java.lang.Object[]
         */
        if (StringUtil.isNullOrEmpty(id)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        SysRole role=new SysRole();
        role.setId(new BigInteger(id));
        if(!StringUtil.isNullOrEmpty(name)){
            role.setName(name);
        }
        if(!StringUtil.isNullOrEmpty(note)){
            role.setNote(note);
        }
        if(!StringUtil.isNullOrEmpty(roleType)){
            role.setRoleType(roleType);
        }
        SysRole sysRole=sysRoleGeneratorService.selectByPrimaryKey(role.getId());
        if(!sysRole.getRoleType().equals(role.getRoleType())){
            if(sysRole.getRoleType().equals(ConstantPoll.SYS_ROLE)){
                SysUserRoleExample roleExample=new SysUserRoleExample();
                SysUserRoleExample.Criteria c1=roleExample.createCriteria();
                c1.andSysRoleIdEqualTo(sysRole.getId().toString());
                sysUserRoleGeneratorService.physicalDeleteByExample(roleExample);

            }
        }
        Date date = new Date();
        role.setUpdateTime(date);
        boolean isUpdateSuccess = sysRoleGeneratorService.updateByPrimaryKeySelective(role);
        if (!isUpdateSuccess) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_ROLE_UPDATE_FAIL);
        }
        SysRoleAuthorityExample example = new SysRoleAuthorityExample();
        example.createCriteria().andSysRoleIdEqualTo(role.getId().toString());
        sysRoleAuthorityGeneratorService.physicalDeleteByExample(example);
        boolean isInsertSuccess;
        if (authIds != null && authIds.length > 0) {
            for (String authId : authIds) {
                SysRoleAuthority sr = new SysRoleAuthority();
                sr.setCreateTime(date);
                sr.setUpdateTime(date);
                sr.setSysAuthorityId(new BigInteger(authId));
                sr.setSysRoleId(role.getId());
                isInsertSuccess = sysRoleAuthorityGeneratorService.insertSelective(sr);
                if (!isInsertSuccess) {
                    TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                    return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_ROLE_BIND_AUTH_FAIL);
                }
            }
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] getSysRole(String roleid) {
        if (roleid == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        BigInteger id = new BigInteger(roleid);
        SysRole role = sysRoleGeneratorService.selectByPrimaryKey(id);
        if (role == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_ROLE_NOT_EXIST);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, role);
    }

    @Override
    public Object[] findSysRoleByUserId(String userid) {
        if (StringUtil.isNullOrEmpty(userid)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        BigInteger id = new BigInteger(userid);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid", id);
        List<Map<String, Object>> list = sysRoleBusinessMapper.findSysRoleByUserid(map);
        List<SysRole> roleList = new ArrayList<SysRole>();
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                SysRole role = new SysRole();
                if (list.get(i).get("id") != null) {
                    role.setId(new BigInteger(list.get(i).get("id").toString()));
                }
                if (list.get(i).get("name") != null) {
                    role.setName(list.get(i).get("name").toString());
                }
                roleList.add(role);
            }
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, roleList);
    }

    @Override
    @Transactional
    public Object[] updateSysUserRole(String userid, String[] roleids) {
        if (StringUtil.isNullOrEmpty(userid)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        SysUserRoleExample example = new SysUserRoleExample();
        SysUserRoleExample.Criteria cc = example.createCriteria();
        cc.andSysUserIdEqualTo(userid);
        sysUserRoleGeneratorService.physicalDeleteByExample(example);
        if (roleids == null || roleids.length == 0) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
        }
        boolean isInsertSuccess;
        for (String roleid : roleids) {
            SysUserRole userRole = new SysUserRole();
            userRole.setCreateTime(new Date());
            userRole.setUpdateTime(new Date());
            userRole.setSysRoleId(new BigInteger(roleid));
            userRole.setSysUserId(new BigInteger(userid));
            isInsertSuccess = sysUserRoleGeneratorService.insertSelective(userRole);
            if (!isInsertSuccess) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_USER_BIND_ROLE_FAIL);
            }
        }

        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    @Transactional
    public Object[] updateSysUserPassword(String userid, String opd, String npd) {
        if (StringUtil.isNullOrEmpty(userid) || StringUtil.isNullOrEmpty(opd) || StringUtil.isNullOrEmpty(npd)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        //查询用户
        SysUserInfo userInfo = sysUserInfoGeneratorService.selectByPrimaryKey(new BigInteger(userid));
        //用户未查到
        if (userInfo == null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_USER_NOT_EXIST);
        }
        String opdmd = Md5Utils.encrypt(opd);
        //原密码不对
        if (!opdmd.equals(userInfo.getPassword())) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        //修改密码
        SysUserInfo nUser = new SysUserInfo();
        nUser.setPassword(npd);
        nUser.setUpdateTime(new Date());
        nUser.setId(userInfo.getId());
        boolean isUpdateSuccess = sysUserInfoGeneratorService.updateByPrimaryKeySelective(nUser);
        //修改失败
        if (!isUpdateSuccess) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] checkSysUsername(String userName, String userid) {
        if (StringUtil.isNullOrEmpty(userName)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        SysUserInfoExample example = new SysUserInfoExample();
        SysUserInfoExample.Criteria cc = example.createCriteria();
        cc.andUsernameEqualTo(userName);
        if (!StringUtil.isNullOrEmpty(userid)) {
            cc.andIdNotEqualTo(userid);
        }
        int count = sysUserInfoGeneratorService.countByExample(example);
        if (count > 0) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_USER_REPEATED);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    @Transactional
    public Object[] delSysRole(String roleid) {
        if (roleid == null || roleid.isEmpty()) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        SysUserRoleExample example = new SysUserRoleExample();
        SysUserRoleExample.Criteria cc = example.createCriteria();
        cc.andSysRoleIdEqualTo(roleid);
        int count = sysUserRoleGeneratorService.countByExample(example);
        if (count > 0) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_ROLE_HAVING_EXIST_USER);
        }

        boolean isDelSuccess = sysRoleGeneratorService.physicalDeleteByPrimaryKey(new BigInteger(roleid));
        if (!isDelSuccess) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_ROLE_DELETE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }


    @Override
    public Object[] checkSysRolename(String roleName, String roleid) {
        if (StringUtil.isNullOrEmpty(roleName)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        SysRoleExample example = new SysRoleExample();
        SysRoleExample.Criteria cc = example.createCriteria();
        cc.andNameEqualTo(roleName);
        if (!StringUtil.isNullOrEmpty(roleid)) {
            cc.andIdNotEqualTo(roleid);
        }
        int count = sysRoleGeneratorService.countByExample(example);
        if (count > 0) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.SYS_ROLE_REPEATED);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

    @Override
    public Object[] findSysRoleList(String roleType) {
        SysRoleExample example = new SysRoleExample();
        SysRoleExample.Criteria cc = example.createCriteria();
        cc.andRoleTypeEqualTo(roleType);
        List<SysRole> list = sysRoleGeneratorService.selectByExample(example);
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, list);
    }

    @Override
    public Object[] findSysAuthority() {
        SysAuthorityExample example = new SysAuthorityExample();
        example.setOrderByClause("create_time desc");
        List<SysAuthority> list = sysAuthorityGeneratorService.selectByExample(example);
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, list);
    }

    @Override
    public Object[] findSysAuthorityByRole(String roleId) {
        if (StringUtil.isNullOrEmpty(roleId)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("roleId", new BigInteger(roleId));
        List<Map<String, Object>> list = sysAuthorityBusinessMapper.findSysAuthorityByRoleId(map);
        List<SysAuthority> authList = new ArrayList<SysAuthority>();
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                SysAuthority auth = new SysAuthority();
                if (list.get(i).get("id") != null) {
                    auth.setId(new BigInteger(list.get(i).get("id").toString()));
                }
                if (list.get(i).get("name") != null) {
                    auth.setName(list.get(i).get("name").toString());
                }
                authList.add(auth);
            }
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, authList);
    }

    @Override
    public Object[] checkSystemUser(String userName, String password) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/19 上午10:41 
         * @params [userName, password] 
         * @return java.lang.Object[]
         * @Description 验证系统用户,用户名-密码
         */
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            return ServiceRetCode.returnCode(RetCodeAndMessage.USER_STOP, null);
        }
        SysUserInfoExample userExample = new SysUserInfoExample();
        SysUserInfoExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        criteria.andPasswordEqualTo(Md5Utils.encrypt(password));
        List<SysUserInfo> sysUserInfos = sysUserInfoGeneratorService.selectByExample(userExample);
        if (sysUserInfos != null && sysUserInfos.size() > 0) {
            SysUserInfo sysUserInfo = sysUserInfos.get(0);
            String status = sysUserInfo.getStatus();
            if ("1".equals(status)) {
                return ServiceRetCode.returnCode(RetCodeAndMessage.USER_STOP, null);
            }
            return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, sysUserInfo);
        } else {
            return ServiceRetCode.returnCode(RetCodeAndMessage.USER_AUTHENTICATION_FAILED, null);
        }
    }

    @Override
    public Object[] getResourcesByLoginUserInfo(LoginUserInfo loginUserInfo) {
        /** 
         * @Author 刘金东 
         * @Date 2017/9/20 上午9:20 
         * @params [loginUserInfo] 
         * @return java.lang.Object[]
         * @Description 根据用户ID获取资源列表
         */
        List<String> sysRoleIds = new ArrayList();

        String userId = loginUserInfo.getId().toString();
        String userType = loginUserInfo.getUserType();
        String userStatus = loginUserInfo.getStatus();//是否为超级管理员,商家用户不可为超级管理

        //判断是否为系统用户
            SysUserRoleExample userRoleExample = new SysUserRoleExample();
            SysUserRoleExample.Criteria userRoleCriteria = userRoleExample.createCriteria();
            userRoleCriteria.andSysUserIdEqualTo(userId);
            //系统用户获取角色sysRoleIds信息
            List<SysUserRole> sysUserRoles = sysUserRoleGeneratorService.selectByExample(userRoleExample);
            if (sysUserRoles != null && sysUserRoles.size() > 0) {
                for (SysUserRole sysUserRole : sysUserRoles) {
                    BigInteger sysRoleId = sysUserRole.getSysRoleId();
                    sysRoleIds.add(sysRoleId.toString());
                }
            }


        //判断角色是否为空,不为空继续
        if (sysRoleIds != null && sysRoleIds.size() > 0) {
            SysRoleAuthorityExample roleAuthorityExample = new SysRoleAuthorityExample();
            SysRoleAuthorityExample.Criteria roleAuthorityCriteria = roleAuthorityExample.createCriteria();
            roleAuthorityCriteria.andSysRoleIdIn(sysRoleIds);
            List<SysRoleAuthority> sysRoleAuthorities = sysRoleAuthorityGeneratorService.selectByExample(roleAuthorityExample);
            if (sysRoleAuthorities != null && sysRoleAuthorities.size() > 0) {
                List<String> sysAuthorityIds = new ArrayList();
                for (SysRoleAuthority sysRoleAuthority : sysRoleAuthorities) {
                    BigInteger sysAuthorityId = sysRoleAuthority.getSysAuthorityId();
                    sysAuthorityIds.add(sysAuthorityId.toString());
                }
                SysAuthorityResourcesExample authorityResourcesExample = new SysAuthorityResourcesExample();
                SysAuthorityResourcesExample.Criteria authorityResourcescriteria = authorityResourcesExample.createCriteria();
                authorityResourcescriteria.andSysAuthorityIdIn(sysAuthorityIds);
                List<SysAuthorityResources> sysAuthorityResources = sysAuthorityResourcesGeneratorService.selectByExample(authorityResourcesExample);
                if (sysAuthorityResources != null && sysAuthorityResources.size() > 0) {
                    List<String> sysResourcesIds = new ArrayList();
                    for (SysAuthorityResources sysAuthorityResource : sysAuthorityResources) {
                        BigInteger sysResourcesId = sysAuthorityResource.getSysResourcesId();
                        sysResourcesIds.add(sysResourcesId.toString());
                    }
                    SysResourcesExample sysResourcesExample = new SysResourcesExample();
                    sysResourcesExample.setOrderByClause("rank ASC");
                    SysResourcesExample.Criteria sysResourcescriteria = sysResourcesExample.createCriteria();
                    sysResourcescriteria.andIdIn(sysResourcesIds);
                    List<SysResources> sysResources = sysResourcesGeneratorService.selectByExample(sysResourcesExample);
                    return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, sysResources);
                }
            }
        }
        //未查询到信息标记为失败USER_NO_AUTHORITY_INFO
        return ServiceRetCode.returnCode(RetCodeAndMessage.USER_NO_AUTHORITY_INFO, null);
    }

    @Override
    public Object[] checkSysUserPass(String userPass, String userid) {
        /**
         * 方法名称: checkSysUserPass
         * 描述： 查看是否是当前密码
         * 作者: shangyuren
         * 修改日期： 2019/1/21 16:41
         * @param  [userName, userid] <br>
         */


        if (StringUtil.isNullOrEmpty(userPass)) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.INCOMPLETE_PARAMETER);
        }
        SysUserInfoExample example = new SysUserInfoExample();
        SysUserInfoExample.Criteria cc = example.createCriteria();
        String md5=Md5Utils.encrypt(userPass);
        cc.andPasswordEqualTo(Md5Utils.encrypt(userPass));
        cc.andIdEqualTo(userid);
        int count = sysUserInfoGeneratorService.countByExample(example);
        if (count !=1) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.USER_AUTHENTICATION_FAILED);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

}
