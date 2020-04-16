package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdItemAdvantage implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
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
   public void setCompanyShowsTextImgUrl(String companyShowsTextImgUrl){
         this.companyShowsTextImgUrl = companyShowsTextImgUrl;
   }
   public String getCompanyShowsTextImgUrl(){
      return this.companyShowsTextImgUrl;
   }
   public void setCompanyShowsTitleImgUrl(String companyShowsTitleImgUrl){
         this.companyShowsTitleImgUrl = companyShowsTitleImgUrl;
   }
   public String getCompanyShowsTitleImgUrl(){
      return this.companyShowsTitleImgUrl;
   }
   public void setCompanyShowsImgUrl(String companyShowsImgUrl){
         this.companyShowsImgUrl = companyShowsImgUrl;
   }
   public String getCompanyShowsImgUrl(){
      return this.companyShowsImgUrl;
   }
   public void setCompanyShowsAdvantageImgUrl(String companyShowsAdvantageImgUrl){
         this.companyShowsAdvantageImgUrl = companyShowsAdvantageImgUrl;
   }
   public String getCompanyShowsAdvantageImgUrl(){
      return this.companyShowsAdvantageImgUrl;
   }
   public void setSupportImgUrl(String supportImgUrl){
         this.supportImgUrl = supportImgUrl;
   }
   public String getSupportImgUrl(){
      return this.supportImgUrl;
   }
}