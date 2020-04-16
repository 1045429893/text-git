package com.hd.entity.business;


import java.io.Serializable;

/**

@author Robot
*/
public class MlsdOnlineServiceVo implements Serializable {

   private String id;
   //在线客服图标(左侧)
   private String onlineIconLeft;
   //在线客服图标(右侧)
   private String onlineIconRight;

   public void setId(String id){
      this.id = id;
   }
   public String getId(){
      return this.id;
   }
   public void setOnlineIconLeft(String onlineIconLeft){
      this.onlineIconLeft = onlineIconLeft;
   }
   public String getOnlineIconLeft(){
      return this.onlineIconLeft;
   }
   public void setOnlineIconRight(String onlineIconRight){
      this.onlineIconRight = onlineIconRight;
   }
   public String getOnlineIconRight(){
      return this.onlineIconRight;
   }
}