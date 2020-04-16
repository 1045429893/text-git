package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdStrength implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //横幅广告1
   private String banner1;
   //实力展示图片1
   private String strengthImgUrl1;
   //实力展示图片2
   private String strengthImgUrl2;
   //实力展示图片3
   private String strengthImgUrl3;
   //实力展示图片4
   private String strengthImgUrl4;
   //实力展示图片5
   private String strengthImgUrl5;
   //实力展示图片6
   private String strengthImgUrl6;
   //诚信展示1
   private String integrityShowImgUrl1;
   //诚信展示2
   private String integrityShowImgUrl2;
   //签约案例
   private String signUpCaseImgUrl;

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
   public void setStrengthImgUrl1(String strengthImgUrl1){
         this.strengthImgUrl1 = strengthImgUrl1;
   }
   public String getStrengthImgUrl1(){
      return this.strengthImgUrl1;
   }
   public void setStrengthImgUrl2(String strengthImgUrl2){
         this.strengthImgUrl2 = strengthImgUrl2;
   }
   public String getStrengthImgUrl2(){
      return this.strengthImgUrl2;
   }
   public void setStrengthImgUrl3(String strengthImgUrl3){
         this.strengthImgUrl3 = strengthImgUrl3;
   }
   public String getStrengthImgUrl3(){
      return this.strengthImgUrl3;
   }
   public void setStrengthImgUrl4(String strengthImgUrl4){
         this.strengthImgUrl4 = strengthImgUrl4;
   }
   public String getStrengthImgUrl4(){
      return this.strengthImgUrl4;
   }
   public void setStrengthImgUrl5(String strengthImgUrl5){
         this.strengthImgUrl5 = strengthImgUrl5;
   }
   public String getStrengthImgUrl5(){
      return this.strengthImgUrl5;
   }
   public void setStrengthImgUrl6(String strengthImgUrl6){
         this.strengthImgUrl6 = strengthImgUrl6;
   }
   public String getStrengthImgUrl6(){
      return this.strengthImgUrl6;
   }
   public void setIntegrityShowImgUrl1(String integrityShowImgUrl1){
         this.integrityShowImgUrl1 = integrityShowImgUrl1;
   }
   public String getIntegrityShowImgUrl1(){
      return this.integrityShowImgUrl1;
   }
   public void setIntegrityShowImgUrl2(String integrityShowImgUrl2){
         this.integrityShowImgUrl2 = integrityShowImgUrl2;
   }
   public String getIntegrityShowImgUrl2(){
      return this.integrityShowImgUrl2;
   }
   public void setSignUpCaseImgUrl(String signUpCaseImgUrl){
         this.signUpCaseImgUrl = signUpCaseImgUrl;
   }
   public String getSignUpCaseImgUrl(){
      return this.signUpCaseImgUrl;
   }
}