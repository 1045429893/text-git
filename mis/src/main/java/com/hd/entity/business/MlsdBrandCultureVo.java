package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class MlsdBrandCultureVo implements Serializable {
   private String id;
   //横幅广告1
   private String banner1;
   //介绍文字图片
   private String introduceTextImgUrl;
   //介绍产品图片
   private String introduceProductImgUrl;
   //介绍简介图片
   private String introduceIntroImgUrl;
   //品牌定位图片
   private String productPositioningImgUrl;
   //品牌定位文字图片
   private String productPositioningTextImgUrl;
   //品牌特色图片
   private String productFeatureImgUrl;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getBanner1() {
      return banner1;
   }

   public void setBanner1(String banner1) {
      this.banner1 = banner1;
   }

   public String getIntroduceTextImgUrl() {
      return introduceTextImgUrl;
   }

   public void setIntroduceTextImgUrl(String introduceTextImgUrl) {
      this.introduceTextImgUrl = introduceTextImgUrl;
   }

   public String getIntroduceProductImgUrl() {
      return introduceProductImgUrl;
   }

   public void setIntroduceProductImgUrl(String introduceProductImgUrl) {
      this.introduceProductImgUrl = introduceProductImgUrl;
   }

   public String getIntroduceIntroImgUrl() {
      return introduceIntroImgUrl;
   }

   public void setIntroduceIntroImgUrl(String introduceIntroImgUrl) {
      this.introduceIntroImgUrl = introduceIntroImgUrl;
   }

   public String getProductPositioningImgUrl() {
      return productPositioningImgUrl;
   }

   public void setProductPositioningImgUrl(String productPositioningImgUrl) {
      this.productPositioningImgUrl = productPositioningImgUrl;
   }

   public String getProductPositioningTextImgUrl() {
      return productPositioningTextImgUrl;
   }

   public void setProductPositioningTextImgUrl(String productPositioningTextImgUrl) {
      this.productPositioningTextImgUrl = productPositioningTextImgUrl;
   }

   public String getProductFeatureImgUrl() {
      return productFeatureImgUrl;
   }

   public void setProductFeatureImgUrl(String productFeatureImgUrl) {
      this.productFeatureImgUrl = productFeatureImgUrl;
   }
}