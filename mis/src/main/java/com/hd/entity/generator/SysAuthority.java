package com.hd.entity.generator;


import java.io.Serializable;
import java.util.Date;

import java.math.BigInteger;

/**

@author Robot
*/
public class SysAuthority implements Serializable {
	private static final long serialVersionUID = 1L;
   //权限ID
   private BigInteger id;
   //权限名称
   private String name;
   //备注
   private String note;
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
   public void setName(String name){
         this.name = name;
   }
   public String getName(){
      return this.name;
   }
   public void setNote(String note){
         this.note = note;
   }
   public String getNote(){
      return this.note;
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