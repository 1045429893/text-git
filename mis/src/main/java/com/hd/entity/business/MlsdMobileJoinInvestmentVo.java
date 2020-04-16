package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class MlsdMobileJoinInvestmentVo implements Serializable {

   private String id;
   //店面效果图片1
   private String imgUrl1;
   //店面效果图片2
   private String imgUrl2;
   //店面效果图片3
   private String imgUrl3;
   //店面效果图片4
   private String imgUrl4;
   //店面效果图片5
   private String imgUrl5;
   //店面效果图片6
   private String imgUrl6;

   public void setId(String id){
      this.id = id;
   }
   public String getId(){
      return this.id;
   }
   public void setImgUrl1(String imgUrl1){
      this.imgUrl1 = imgUrl1;
   }
   public String getImgUrl1(){
      return this.imgUrl1;
   }
   public void setImgUrl2(String imgUrl2){
      this.imgUrl2 = imgUrl2;
   }
   public String getImgUrl2(){
      return this.imgUrl2;
   }
   public void setImgUrl3(String imgUrl3){
      this.imgUrl3 = imgUrl3;
   }
   public String getImgUrl3(){
      return this.imgUrl3;
   }
   public void setImgUrl4(String imgUrl4){
      this.imgUrl4 = imgUrl4;
   }
   public String getImgUrl4(){
      return this.imgUrl4;
   }
   public void setImgUrl5(String imgUrl5){
      this.imgUrl5 = imgUrl5;
   }
   public String getImgUrl5(){
      return this.imgUrl5;
   }
   public void setImgUrl6(String imgUrl6){
      this.imgUrl6 = imgUrl6;
   }
   public String getImgUrl6(){
      return this.imgUrl6;
   }
}