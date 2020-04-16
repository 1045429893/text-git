package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdMobileContactUs implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //欢迎语第一行
   private String text1;
   //欢迎语第二行
   private String text2;
   //欢迎语第三行
   private String text3;
   //展示图片
   private String imgUrl;

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