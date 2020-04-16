package com.hd.entity.business.api;

import com.hd.common.utils.TimeUtils;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 田伟勋
 * @Date 创建：16:152017/8/31
 * @Description:
 */
public class SysRoleVo {
    //角色编号，唯一，通过UUID产生
    private BigInteger id;
    //角色名称
    private String name;
    //备注
    private String note;
    //创建时间
    private String createTime;
    //最后一次修改时间
    private String updateTime;
    //角色类型
    private String roleType;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
}
