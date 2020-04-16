package com.hd.entity.generator;


import java.io.Serializable;
import java.util.Date;

import java.math.BigInteger;

/**

@author Robot
*/
public class SysAuthorityResources implements Serializable {
	private static final long serialVersionUID = 1L;
   //自动编号，唯一，通过UUID产生
   private BigInteger id;
   //资源ID
   private BigInteger sysResourcesId;
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
   public void setSysResourcesId(BigInteger sysResourcesId){
         this.sysResourcesId = sysResourcesId;
   }
   public BigInteger getSysResourcesId(){
      return this.sysResourcesId;
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