package com.hd.entity.generator;


import java.io.Serializable;
import java.util.Date;

import java.math.BigInteger;

/**

@author Robot
*/
public class SysUserRole implements Serializable {
	private static final long serialVersionUID = 1L;
   //自动编号，唯一，通过UUID产生
   private BigInteger id;
   //用户ID
   private BigInteger sysUserId;
   //角色ID
   private BigInteger sysRoleId;
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
   public void setSysUserId(BigInteger sysUserId){
         this.sysUserId = sysUserId;
   }
   public BigInteger getSysUserId(){
      return this.sysUserId;
   }
   public void setSysRoleId(BigInteger sysRoleId){
         this.sysRoleId = sysRoleId;
   }
   public BigInteger getSysRoleId(){
      return this.sysRoleId;
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