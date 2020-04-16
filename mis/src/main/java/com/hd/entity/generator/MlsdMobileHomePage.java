package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdMobileHomePage implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //横幅广告1
   private String banner;
   //介绍
   private String text;
   //图片展示
   private String showImage;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
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