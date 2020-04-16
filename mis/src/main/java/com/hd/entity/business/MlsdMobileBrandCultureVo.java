package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class MlsdMobileBrandCultureVo implements Serializable {
   private String id;
   //介绍文字图片
   private String introduceTextImgUrl;
   //介绍产品图片
   private String introduceProductImgUrl;

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
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
}