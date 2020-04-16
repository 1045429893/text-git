package com.hd.entity.business.api;

import com.hd.common.utils.TimeUtils;
import com.hd.entity.business.ConstantPoll;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 田伟勋
 * @Date 创建：10:082017/8/29
 * @Description: 系统用户，查询用
 */
public class SysUserInfoVo {

    private static final long serialVersionUID = 1L;
    //用户电子邮箱，由数字、字母、下划线、@组成
    private BigInteger id;
    //姓名（可做归属字段）
    private String username;
    //姓名
    private String compellation;
    //状态(0-停用 1-启用)
    private String userType;
    //0为普通管理员,1为超级管理员
    private String status;
    private String phone;
    //创建时间
    private String createTime;
    //最后一次修改时间
    private String updateTime;
    private String statusStr;

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

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }
}
