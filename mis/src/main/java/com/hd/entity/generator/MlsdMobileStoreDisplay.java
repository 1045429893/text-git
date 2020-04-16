package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdMobileStoreDisplay implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //门店展示图片1
   private String storeDisplayImgUrl1;
   //门店展示图片2
   private String storeDisplayImgUrl2;
   //门店展示图片3
   private String storeDisplayImgUrl3;
   //门店介绍
   private String storeDisplayText;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
      return this.id;
   }
   public void setStoreDisplayImgUrl1(String storeDisplayImgUrl1){
         this.storeDisplayImgUrl1 = storeDisplayImgUrl1;
   }
   public String getStoreDisplayImgUrl1(){
      return this.storeDisplayImgUrl1;
   }
   public void setStoreDisplayImgUrl2(String storeDisplayImgUrl2){
         this.storeDisplayImgUrl2 = storeDisplayImgUrl2;
   }
   public String getStoreDisplayImgUrl2(){
      return this.storeDisplayImgUrl2;
   }
   public void setStoreDisplayImgUrl3(String storeDisplayImgUrl3){
         this.storeDisplayImgUrl3 = storeDisplayImgUrl3;
   }
   public String getStoreDisplayImgUrl3(){
      return this.storeDisplayImgUrl3;
   }
   public void setStoreDisplayText(String storeDisplayText){
         this.storeDisplayText = storeDisplayText;
   }
   public String getStoreDisplayText(){
      return this.storeDisplayText;
   }
}