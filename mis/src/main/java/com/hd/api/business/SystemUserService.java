package com.hd.api.business;

import com.hd.common.page.PageCondition;
import com.hd.entity.business.api.LoginUserInfo;
import org.springframework.stereotype.Service;

/**
 * @Author 田伟勋
 * @Date 创建：15:132017/8/25
 * @Description:
 */
@Service
public interface SystemUserService {
    /**
     *@Author 田伟勋
     *@Date 2017/8/25 16:59
     *@Description 分页查询用户信息
     */
    public Object[] findSysUserInfoByPage(String userName, PageCondition condition);
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 9:54
     *@Description  添加用户
     */
    public Object[] insertSysUserInfo(String username,String password,String compellation,String phone,String userType,String[] roleids);
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 10:15
     *@Description  修改用户
     */
    public Object[] updateSysUserInfo(String id, String username, String compellation, String phone, String userType, String status, String[] roleids, String password);
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 10:16
     *@Description  主键查询用户信息
     */
    public Object[] getSysUserInfo(String id);


    /**
     *@Author 田伟勋
     *@Date 2017/8/28 14:36
     *@Description 分页查询角色
     */
    public Object[] findSysRoleByPage(String roleName ,String roleType,PageCondition pageCondition);
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 14:36
     *@Description  添加角色
     */
    public Object[] insertSysRole(String name,String note,String roleType,String[] authIds);
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 14:37
     *@Description  修改角色
     */
    public Object[] updateSysRole(String id,String name,String note,String roleType,String[] authIds);
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 14:37
     *@Description  查看角色信息
     */
    public Object[] getSysRole(String roleid);
    /**
     *@Author 田伟勋
     *@Date 2017/8/28 14:37
     *@Description  查询用户关联的角色
     */
    public Object[] findSysRoleByUserId(String userid);

    /**
     *@Author 田伟勋
     *@Date 2017/8/28 14:40
     *@Description  添加修改用户和角色的关联
     */
    public Object[] updateSysUserRole(String userid,String[] roleids);

    /**
     *@Author 田伟勋
     *@Date 2017/8/29 16:01
     *@Description  修改系统用户密码
     */
    public Object[] updateSysUserPassword(String userid,String opd,String npd);

    /**
     *@Author 田伟勋
     *@Date 2017/8/30 17:05
     *@Description  检查用户名是否重复
     */
    public Object[] checkSysUsername(String userName,String userid);
    /**
     *@Author 田伟勋
     *@Date 2017/9/1 11:03
     *@Description 删除角色
     */
    public Object[] delSysRole(String roleid);
    /**
     *@Author 田伟勋
     *@Date 2017/9/1 11:04
     *@Description 验证角色名重复
     */
    public Object[] checkSysRolename(String roleName,String roleid);
    /**
     *@Author 田伟勋
     *@Date 2017/9/1 11:04
     *@Description 查询所有角色
     */
    public Object[] findSysRoleList(String roleType);
    /**
     *@Author 田伟勋
     *@Date 2017/9/8 15:44
     *@Description 查询权限
     */
    public Object[] findSysAuthority();
    /**
     *@Author 田伟勋
     *@Date 2017/9/8 15:44
     *@Description 根据角色查询权限
     */
    public Object[] findSysAuthorityByRole(String roleId);

    public Object[] checkSystemUser(String userName,String password);

    public Object[] getResourcesByLoginUserInfo(LoginUserInfo loginUserInfo);


    public Object[] checkSysUserPass(String userPass, String userid);
}
