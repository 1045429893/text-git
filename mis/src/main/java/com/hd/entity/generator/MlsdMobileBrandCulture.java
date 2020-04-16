package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdMobileBrandCulture implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //介绍文字图片
   private String introduceTextImgUrl;
   //介绍产品图片
   private String introduceProductImgUrl;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
      return this.id;
   }
   public void setIntroduceTextImgUrl(String introduceTextImgUrl){
         this.introduceTextImgUrl = introduceTextImgUrl;
   }
   public String getIntroduceTextImgUrl(){
      return this.introduceTextImgUrl;
   }
   public void setIntroduceProductImgUrl(String introduceProductImgUrl){
         this.introduceProductImgUrl = introduceProductImgUrl;
   }
   public String getIntroduceProductImgUrl(){
      return this.introduceProductImgUrl;
   }
}