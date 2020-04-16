package com.hd.entity.business;


import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**

@author Robot
*/
public class CompanyProfileVo implements Serializable {

   private String id;
   //公司名称
   private String companyName;
   //公司地址
   private String companyAddress;
   //加盟热线电话
   private String hotLine;
   //邮箱
   private String email;
   //公司网址
   private String url;
   //
   private String createTime;
   //
   private String updateTime;
   //公司简介下载地址
   private String downloadLink;
   //0 展示 1 不展示
   private String isShow;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getCompanyName() {
      return companyName;
   }

   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   public String getCompanyAddress() {
      return companyAddress;
   }

   public void setCompanyAddress(String companyAddress) {
      this.companyAddress = companyAddress;
   }

   public String getHotLine() {
      return hotLine;
   }

   public void setHotLine(String hotLine) {
      this.hotLine = hotLine;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
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

   public String getDownloadLink() {
      return downloadLink;
   }

   public void setDownloadLink(String downloadLink) {
      this.downloadLink = downloadLink;
   }

   public String getIsShow() {
      return isShow;
   }

   public void setIsShow(String isShow) {
      this.isShow = isShow;
   }
}