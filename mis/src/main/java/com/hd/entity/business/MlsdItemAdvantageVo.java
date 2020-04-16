package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class MlsdItemAdvantageVo implements Serializable {
   private String id;
   //横幅广告1
   private String banner1;
   //公司展示文字图片
   private String companyShowsTextImgUrl;
   //公司展示标题图片
   private String companyShowsTitleImgUrl;
   //公司展示图片
   private String companyShowsImgUrl;
   //公司展示优势图片
   private String companyShowsAdvantageImgUrl;
   //加盟支持图片
   private String supportImgUrl;

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

   public String getCompanyShowsTextImgUrl() {
      return companyShowsTextImgUrl;
   }

   public void setCompanyShowsTextImgUrl(String companyShowsTextImgUrl) {
      this.companyShowsTextImgUrl = companyShowsTextImgUrl;
   }

   public String getCompanyShowsTitleImgUrl() {
      return companyShowsTitleImgUrl;
   }

   public void setCompanyShowsTitleImgUrl(String companyShowsTitleImgUrl) {
      this.companyShowsTitleImgUrl = companyShowsTitleImgUrl;
   }

   public String getCompanyShowsImgUrl() {
      return companyShowsImgUrl;
   }

   public void setCompanyShowsImgUrl(String companyShowsImgUrl) {
      this.companyShowsImgUrl = companyShowsImgUrl;
   }

   public String getCompanyShowsAdvantageImgUrl() {
      return companyShowsAdvantageImgUrl;
   }

   public void setCompanyShowsAdvantageImgUrl(String companyShowsAdvantageImgUrl) {
      this.companyShowsAdvantageImgUrl = companyShowsAdvantageImgUrl;
   }

   public String getSupportImgUrl() {
      return supportImgUrl;
   }

   public void setSupportImgUrl(String supportImgUrl) {
      this.supportImgUrl = supportImgUrl;
   }
}