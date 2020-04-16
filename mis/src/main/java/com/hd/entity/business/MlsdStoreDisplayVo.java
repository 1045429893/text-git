package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class MlsdStoreDisplayVo implements Serializable {

   private String id;
   //横幅广告1
   private String banner1;
   //门店展示图片1
   private String storeDisplayImgUrl1;
   //门店展示图片2
   private String storeDisplayImgUrl2;
   //门店展示图片3
   private String storeDisplayImgUrl3;
   //门店展示图片4
   private String storeDisplayImgUrl4;
   //制作展示标题
   private String makeShowTitleImgUrl;
   //制作展示图片1
   private String makeShowImgUrl1;
   //制作展示图片2
   private String makeShowImgUrl2;
   //制作展示图片3
   private String makeShowImgUrl3;

   public void setId(String id){
      this.id = id;
   }
   public String getId(){
      return this.id;
   }
   public void setBanner1(String banner1){
      this.banner1 = banner1;
   }
   public String getBanner1(){
      return this.banner1;
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
   public void setStoreDisplayImgUrl4(String storeDisplayImgUrl4){
      this.storeDisplayImgUrl4 = storeDisplayImgUrl4;
   }
   public String getStoreDisplayImgUrl4(){
      return this.storeDisplayImgUrl4;
   }
   public void setMakeShowTitleImgUrl(String makeShowTitleImgUrl){
      this.makeShowTitleImgUrl = makeShowTitleImgUrl;
   }
   public String getMakeShowTitleImgUrl(){
      return this.makeShowTitleImgUrl;
   }
   public void setMakeShowImgUrl1(String makeShowImgUrl1){
      this.makeShowImgUrl1 = makeShowImgUrl1;
   }
   public String getMakeShowImgUrl1(){
      return this.makeShowImgUrl1;
   }
   public void setMakeShowImgUrl2(String makeShowImgUrl2){
      this.makeShowImgUrl2 = makeShowImgUrl2;
   }
   public String getMakeShowImgUrl2(){
      return this.makeShowImgUrl2;
   }
   public void setMakeShowImgUrl3(String makeShowImgUrl3){
      this.makeShowImgUrl3 = makeShowImgUrl3;
   }
   public String getMakeShowImgUrl3(){
      return this.makeShowImgUrl3;
   }
}