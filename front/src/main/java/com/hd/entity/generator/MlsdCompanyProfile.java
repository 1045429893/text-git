package com.hd.entity.generator;


import java.io.Serializable;
import java.util.Date;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdCompanyProfile implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
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
   private Date createTime;
   //
   private Date updateTime;
   //公司简介下载地址
   private String downloadLink;
   //0 展示 1 不展示
   private Integer isShow;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
      return this.id;
   }
   public void setCompanyName(String companyName){
         this.companyName = companyName;
   }
   public String getCompanyName(){
      return this.companyName;
   }
   public void setCompanyAddress(String companyAddress){
         this.companyAddress = companyAddress;
   }
   public String getCompanyAddress(){
      return this.companyAddress;
   }
   public void setHotLine(String hotLine){
         this.hotLine = hotLine;
   }
   public String getHotLine(){
      return this.hotLine;
   }
   public void setEmail(String email){
         this.email = email;
   }
   public String getEmail(){
      return this.email;
   }
   public void setUrl(String url){
         this.url = url;
   }
   public String getUrl(){
      return this.url;
   }
   public void setCreateTime(Date createTime){
         this.createTime = createTime;
   }
   public Date getCreateTime(){
      return this.createTime;
   }
   public void setUpdateTime(Date updateTime){
         this.updateTime = updateTime;
   }
   public Date getUpdateTime(){
      return this.updateTime;
   }
   public void setDownloadLink(String downloadLink){
         this.downloadLink = downloadLink;
   }
   public String getDownloadLink(){
      return this.downloadLink;
   }
   public void setIsShow(Integer isShow){
         this.isShow = isShow;
   }
   public Integer getIsShow(){
      return this.isShow;
   }
}