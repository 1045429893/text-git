package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdBrandCulture implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //横幅广告1
   private String banner1;
   //介绍文字图片
   private String introduceTextImgUrl;
   //介绍产品图片
   private String introduceProductImgUrl;
   //介绍简介图片
   private String introduceIntroImgUrl;
   //品牌定位文字图片
   private String productPositioningTextImgUrl;
   //品牌特色图片
   private String productFeatureImgUrl;
   //品牌定位图片
   private String productPositioningImgUrl;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
      return this.id;
   }
   public void setBanner1(String banner1){
         this.banner1 = banner1;
   }
   public String getBanner1(){
      return this.banner1;
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
   public void setIntroduceIntroImgUrl(String introduceIntroImgUrl){
         this.introduceIntroImgUrl = introduceIntroImgUrl;
   }
   public String getIntroduceIntroImgUrl(){
      return this.introduceIntroImgUrl;
   }
   public void setProductPositioningTextImgUrl(String productPositioningTextImgUrl){
         this.productPositioningTextImgUrl = productPositioningTextImgUrl;
   }
   public String getProductPositioningTextImgUrl(){
      return this.productPositioningTextImgUrl;
   }
   public void setProductFeatureImgUrl(String productFeatureImgUrl){
         this.productFeatureImgUrl = productFeatureImgUrl;
   }
   public String getProductFeatureImgUrl(){
      return this.productFeatureImgUrl;
   }
   public void setProductPositioningImgUrl(String productPositioningImgUrl){
         this.productPositioningImgUrl = productPositioningImgUrl;
   }
   public String getProductPositioningImgUrl(){
      return this.productPositioningImgUrl;
   }
}