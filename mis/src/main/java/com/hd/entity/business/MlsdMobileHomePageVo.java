package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class MlsdMobileHomePageVo implements Serializable {

   //
   private String id;
   //横幅广告1
   private String banner;
   //介绍
   private String text;
   //图片展示
   private String showImage;

   public void setId(String id){
      this.id = id;
   }
   public String getId(){
      return this.id;
   }
   public void setBanner(String banner){
      this.banner = banner;
   }
   public String getBanner(){
      return this.banner;
   }
   public void setText(String text){
      this.text = text;
   }
   public String getText(){
      return this.text;
   }
   public void setShowImage(String showImage){
      this.showImage = showImage;
   }
   public String getShowImage(){
      return this.showImage;
   }
}