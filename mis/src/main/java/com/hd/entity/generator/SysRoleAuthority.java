package com.hd.entity.generator;


import java.io.Serializable;
import java.util.Date;

import java.math.BigInteger;

/**

@author Robot
*/
public class SysRoleAuthority implements Serializable {
	private static final long serialVersionUID = 1L;
   //自动编号，唯一，通过UUID产生
   private BigInteger id;
   //角色ID
   private BigInteger sysRoleId;
   //权限ID
   private BigInteger sysAuthorityId;
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
   public void setSysRoleId(BigInteger sysRoleId){
         this.sysRoleId = sysRoleId;
   }
   public BigInteger getSysRoleId(){
      return this.sysRoleId;
   }
   public void setSysAuthorityId(BigInteger sysAuthorityId){
         this.sysAuthorityId = sysAuthorityId;
   }
   public BigInteger getSysAuthorityId(){
      return this.sysAuthorityId;
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