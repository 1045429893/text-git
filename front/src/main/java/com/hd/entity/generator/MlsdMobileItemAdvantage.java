package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdMobileItemAdvantage implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //介绍第1段文字
   private String text1;
   //介绍第2段文字
   private String text2;
   //图片展示1
   private String showImage1;
   //图片展示2
   private String showImage2;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
      return this.id;
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
   public void setShowImage1(String showImage1){
         this.showImage1 = showImage1;
   }
   public String getShowImage1(){
      return this.showImage1;
   }
   public void setShowImage2(String showImage2){
         this.showImage2 = showImage2;
   }
   public String getShowImage2(){
      return this.showImage2;
   }
}