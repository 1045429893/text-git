package com.hd.entity.generator;


import java.io.Serializable;
import java.util.Date;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdContactMessage implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //姓名
   private String userName;
   //地址
   private String address;
   //
   private String tel;
   //
   private String email;
   //留言neirong
   private String content;
   //0 已读 1未读
   private Integer isRead;
   //
   private Date createTime;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
      return this.id;
   }
   public void setUserName(String userName){
         this.userName = userName;
   }
   public String getUserName(){
      return this.userName;
   }
   public void setAddress(String address){
         this.address = address;
   }
   public String getAddress(){
      return this.address;
   }
   public void setTel(String tel){
         this.tel = tel;
   }
   public String getTel(){
      return this.tel;
   }
   public void setEmail(String email){
         this.email = email;
   }
   public String getEmail(){
      return this.email;
   }
   public void setContent(String content){
         this.content = content;
   }
   public String getContent(){
      return this.content;
   }
   public void setIsRead(Integer isRead){
         this.isRead = isRead;
   }
   public Integer getIsRead(){
      return this.isRead;
   }
   public void setCreateTime(Date createTime){
         this.createTime = createTime;
   }
   public Date getCreateTime(){
      return this.createTime;
   }
}