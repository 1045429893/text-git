package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class IntendedUsersVo implements Serializable {

   private String id;
   //用户 姓名
   private String userName;
   //手机号
   private String tel;
   //申请时间
   private String createTime;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getTel() {
      return tel;
   }

   public void setTel(String tel) {
      this.tel = tel;
   }

   public String getCreateTime() {
      return createTime;
   }

   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }
}