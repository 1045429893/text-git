package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdMobileProductPresentation implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //新品推荐图片1
   private String newProductsImgUrl1;
   //新品推荐图片2
   private String newProductsImgUrl2;
   //新品推荐图片3
   private String newProductsImgUrl3;
   //新品推荐图片4
   private String newProductsImgUrl4;
   //招牌美食图片1
   private String signatureCuisineimgUrl1;
   //招牌美食图片2
   private String signatureCuisineimgUrl2;
   //招牌美食图片3
   private String signatureCuisineimgUrl3;
   //招牌美食图片4
   private String signatureCuisineimgUrl4;
   //新品推荐 标题图片
   private String newProductsTitleImgUrl;
   //招牌美食 标题
   private String signatureCuisineimgTitleImgUrl;
   //产品清单
   private String productListImgUrl;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
      return this.id;
   }
   public void setNewProductsImgUrl1(String newProductsImgUrl1){
         this.newProductsImgUrl1 = newProductsImgUrl1;
   }
   public String getNewProductsImgUrl1(){
      return this.newProductsImgUrl1;
   }
   public void setNewProductsImgUrl2(String newProductsImgUrl2){
         this.newProductsImgUrl2 = newProductsImgUrl2;
   }
   public String getNewProductsImgUrl2(){
      return this.newProductsImgUrl2;
   }
   public void setNewProductsImgUrl3(String newProductsImgUrl3){
         this.newProductsImgUrl3 = newProductsImgUrl3;
   }
   public String getNewProductsImgUrl3(){
      return this.newProductsImgUrl3;
   }
   public void setNewProductsImgUrl4(String newProductsImgUrl4){
         this.newProductsImgUrl4 = newProductsImgUrl4;
   }
   public String getNewProductsImgUrl4(){
      return this.newProductsImgUrl4;
   }
   public void setSignatureCuisineimgUrl1(String signatureCuisineimgUrl1){
         this.signatureCuisineimgUrl1 = signatureCuisineimgUrl1;
   }
   public String getSignatureCuisineimgUrl1(){
      return this.signatureCuisineimgUrl1;
   }
   public void setSignatureCuisineimgUrl2(String signatureCuisineimgUrl2){
         this.signatureCuisineimgUrl2 = signatureCuisineimgUrl2;
   }
   public String getSignatureCuisineimgUrl2(){
      return this.signatureCuisineimgUrl2;
   }
   public void setSignatureCuisineimgUrl3(String signatureCuisineimgUrl3){
         this.signatureCuisineimgUrl3 = signatureCuisineimgUrl3;
   }
   public String getSignatureCuisineimgUrl3(){
      return this.signatureCuisineimgUrl3;
   }
   public void setSignatureCuisineimgUrl4(String signatureCuisineimgUrl4){
         this.signatureCuisineimgUrl4 = signatureCuisineimgUrl4;
   }
   public String getSignatureCuisineimgUrl4(){
      return this.signatureCuisineimgUrl4;
   }
   public void setNewProductsTitleImgUrl(String newProductsTitleImgUrl){
         this.newProductsTitleImgUrl = newProductsTitleImgUrl;
   }
   public String getNewProductsTitleImgUrl(){
      return this.newProductsTitleImgUrl;
   }
   public void setSignatureCuisineimgTitleImgUrl(String signatureCuisineimgTitleImgUrl){
         this.signatureCuisineimgTitleImgUrl = signatureCuisineimgTitleImgUrl;
   }
   public String getSignatureCuisineimgTitleImgUrl(){
      return this.signatureCuisineimgTitleImgUrl;
   }
   public void setProductListImgUrl(String productListImgUrl){
         this.productListImgUrl = productListImgUrl;
   }
   public String getProductListImgUrl(){
      return this.productListImgUrl;
   }
}