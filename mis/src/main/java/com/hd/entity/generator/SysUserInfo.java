package com.hd.entity.generator;


import java.io.Serializable;
import java.util.Date;

import java.math.BigInteger;

/**

@author Robot
*/
public class SysUserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
   //用户电子邮箱，由数字、字母、下划线、@组成
   private BigInteger id;
   //姓名（可做归属字段）
   private String username;
   //密码，MD5加密
   private String password;
   //姓名
   private String compellation;
   //手机号
   private String phone;
   //状态(0-停用 1-启用)
   private String userType;
   //0为普通管理员,1为超级管理员
   private String status;
   //创建时间
   private Date createTime;
   //最后一次修改时间
   private Date updateTime;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
      return this.id;
   }
   public void setUsername(String username){
         this.username = username;
   }
   public String getUsername(){
      return this.username;
   }
   public void setPassword(String password){
         this.password = password;
   }
   public String getPassword(){
      return this.password;
   }
   public void setCompellation(String compellation){
         this.compellation = compellation;
   }
   public String getCompellation(){
      return this.compellation;
   }
   public void setPhone(String phone){
         this.phone = phone;
   }
   public String getPhone(){
      return this.phone;
   }
   public void setUserType(String userType){
         this.userType = userType;
   }
   public String getUserType(){
      return this.userType;
   }
   public void setStatus(String status){
         this.status = status;
   }
   public String getStatus(){
      return this.status;
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
}