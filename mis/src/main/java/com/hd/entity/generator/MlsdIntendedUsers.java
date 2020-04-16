package com.hd.entity.generator;


import java.io.Serializable;
import java.util.Date;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdIntendedUsers implements Serializable {
	private static final long serialVersionUID = 1L;
   //主键
   private BigInteger id;
   //用户 姓名
   private String userName;
   //手机号
   private String tel;
   //申请时间
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
   public void setTel(String tel){
         this.tel = tel;
   }
   public String getTel(){
      return this.tel;
   }
   public void setCreateTime(Date createTime){
         this.createTime = createTime;
   }
   public Date getCreateTime(){
      return this.createTime;
   }
}