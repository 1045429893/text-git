package com.hd.entity.business.api;

import com.hd.entity.generator.SysResources;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author 刘金东
 * @Date 创建：10:082017/8/29
 * @Description: 登陆后储存到session的用户信息, 适用于系统管理员登陆与商家登陆
 */
public class LoginUserInfo {

    private static final long serialVersionUID = 1L;
    private BigInteger id;
    //登陆用户名
    private String username;
    //姓名(系统管理员姓名 或  商家公司名称)
    private String compellation;
    //状态(0为系统管理员,1位商家用户)
    private String userType;
    //0:正常 1：已关闭
    private String status;
    //管理员手机号,或商家联系人电话
    private String phone;
    //创建时间
    private String createTime;
    //最后一次修改时间
    private String updateTime;
    //资源信息
    private List<SysResources> sysResourcesList;
    //资源拼接字符串 以分号分割
    private String sysResourcesStr;

    private String roleId;
    private String InstitutionLevel1Id;
    private String InstitutionLevel2Id;
    private String InstitutionLevel3Id;
    private String InstitutionLevel4Id;




    public String getSysResourcesStr() {
        return sysResourcesStr;
    }

    public void setSysResourcesStr(String sysResourcesStr) {
        this.sysResourcesStr = sysResourcesStr;
    }

    public List<SysResources> getSysResourcesList() {
        return sysResourcesList;
    }

    public void setSysResourcesList(List<SysResources> sysResourcesList) {
        this.sysResourcesList = sysResourcesList;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompellation() {
        return compellation;
    }

    public void setCompellation(String compellation) {
        this.compellation = compellation;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getInstitutionLevel1Id() {
        return InstitutionLevel1Id;
    }

    public void setInstitutionLevel1Id(String institutionLevel1Id) {
        InstitutionLevel1Id = institutionLevel1Id;
    }

    public String getInstitutionLevel2Id() {
        return InstitutionLevel2Id;
    }

    public void setInstitutionLevel2Id(String institutionLevel2Id) {
        InstitutionLevel2Id = institutionLevel2Id;
    }

    public String getInstitutionLevel3Id() {
        return InstitutionLevel3Id;
    }

    public void setInstitutionLevel3Id(String institutionLevel3Id) {
        InstitutionLevel3Id = institutionLevel3Id;
    }

    public String getInstitutionLevel4Id() {
        return InstitutionLevel4Id;
    }

    public void setInstitutionLevel4Id(String institutionLevel4Id) {
        InstitutionLevel4Id = institutionLevel4Id;
    }
}
