package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class ContactMessageVo implements Serializable {

   private String contactMessageId;
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
   private String isRead;
   private String isReadStr;
   //
   private String createTime;

   public String getContactMessageId() {
      return contactMessageId;
   }

   public void setContactMessageId(String contactMessageId) {
      this.contactMessageId = contactMessageId;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getTel() {
      return tel;
   }

   public void setTel(String tel) {
      this.tel = tel;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getIsRead() {
      return isRead;
   }

   public void setIsRead(String isRead) {
      this.isRead = isRead;
   }

   public String getIsReadStr() {
      return isReadStr;
   }

   public void setIsReadStr(String isReadStr) {
      this.isReadStr = isReadStr;
   }

   public String getCreateTime() {
      return createTime;
   }

   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }
}