package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class MlsdContactUsVo implements Serializable {

   private String id;
   //横幅广告1
   private String banner1;
   //联系图标
   private String contactIcon;
   //欢迎语第一行
   private String text1;
   //欢迎语第二行
   private String text2;
   //欢迎语第三行
   private String text3;
   //展示图片
   private String imgUrl;

   public void setId(String id){
      this.id = id;
   }
   public String getId(){
      return this.id;
   }
   public void setBanner1(String banner1){
      this.banner1 = banner1;
   }
   public String getBanner1(){
      return this.banner1;
   }
   public void setContactIcon(String contactIcon){
      this.contactIcon = contactIcon;
   }
   public String getContactIcon(){
      return this.contactIcon;
   }
   public void setText1(String text1){
      this.text1 = text1;
   }
   public String getText1(){
      return this.text1;
   }
   public void setText2(String text2){
      this.text2 = text2;
   }
   public String getText2(){
      return this.text2;
   }
   public void setText3(String text3){
      this.text3 = text3;
   }
   public String getText3(){
      return this.text3;
   }
   public void setImgUrl(String imgUrl){
      this.imgUrl = imgUrl;
   }
   public String getImgUrl(){
      return this.imgUrl;
   }
}