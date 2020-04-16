package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class MlsdMobileContactUsVo implements Serializable {

   private String id;
   //欢迎语第一行
   private String text1;
   //欢迎语第二行
   private String text2;
   //欢迎语第三行
   private String text3;
   //展示图片
   private String imgUrl;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getText1() {
      return text1;
   }

   public void setText1(String text1) {
      this.text1 = text1;
   }

   public String getText2() {
      return text2;
   }

   public void setText2(String text2) {
      this.text2 = text2;
   }

   public String getText3() {
      return text3;
   }

   public void setText3(String text3) {
      this.text3 = text3;
   }

   public String getImgUrl() {
      return imgUrl;
   }

   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }
}