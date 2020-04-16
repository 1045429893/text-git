package com.hd.entity.generator;


import java.io.Serializable;
import java.util.Date;

import java.math.BigInteger;

/**

@author Robot
*/
public class SysResources implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //资源名称
   private String name;
   //资源编码
   private String code;
   //资源父级编码
   private String parent;
   //资源类型
   private String type;
   //资源连接
   private String link;
   //资源图标地址
   private String img;
   //资源简介
   private String note;
   //排序
   private String rank;
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
   public void setCode(String code){
         this.code = code;
   }
   public String getCode(){
      return this.code;
   }
   public void setParent(String parent){
         this.parent = parent;
   }
   public String getParent(){
      return this.parent;
   }
   public void setType(String type){
         this.type = type;
   }
   public String getType(){
      return this.type;
   }
   public void setLink(String link){
         this.link = link;
   }
   public String getLink(){
      return this.link;
   }
   public void setImg(String img){
         this.img = img;
   }
   public String getImg(){
      return this.img;
   }
   public void setNote(String note){
         this.note = note;
   }
   public String getNote(){
      return this.note;
   }
   public void setRank(String rank){
         this.rank = rank;
   }
   public String getRank(){
      return this.rank;
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