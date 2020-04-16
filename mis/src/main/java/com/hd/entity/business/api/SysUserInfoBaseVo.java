package com.hd.entity.business.api;

/**
* @Description:    SysUserInfoBaseVo
* @Author:         shangYuRen
* @CreateDate:     2019/3/13 15:43
*/
public class SysUserInfoBaseVo {
    //主键
    private String id;
    //市
    private String institutionLevel1Id;
    //区/县
    private String institutionLevel2Id;
    //乡/镇
    private String institutionLevel3Id;
    //村/街道
    private String institutionLevel4Id;
    //
    private String sysUserInfoId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstitutionLevel1Id() {
        return institutionLevel1Id;
    }

    public void setInstitutionLevel1Id(String institutionLevel1Id) {
        this.institutionLevel1Id = institutionLevel1Id;
    }

    public String getInstitutionLevel2Id() {
        return institutionLevel2Id;
    }

    public void setInstitutionLevel2Id(String institutionLevel2Id) {
        this.institutionLevel2Id = institutionLevel2Id;
    }

    public String getInstitutionLevel3Id() {
        return institutionLevel3Id;
    }

    public void setInstitutionLevel3Id(String institutionLevel3Id) {
        this.institutionLevel3Id = institutionLevel3Id;
    }

    public String getInstitutionLevel4Id() {
        return institutionLevel4Id;
    }

    public void setInstitutionLevel4Id(String institutionLevel4Id) {
        this.institutionLevel4Id = institutionLevel4Id;
    }

    public String getSysUserInfoId() {
        return sysUserInfoId;
    }

    public void setSysUserInfoId(String sysUserInfoId) {
        this.sysUserInfoId = sysUserInfoId;
    }
}
