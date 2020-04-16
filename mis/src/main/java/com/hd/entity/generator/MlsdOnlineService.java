package com.hd.entity.generator;


import java.io.Serializable;

import java.math.BigInteger;

/**

@author Robot
*/
public class MlsdOnlineService implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private BigInteger id;
   //在线客服图标(左侧)
   private String onlineIconLeft;
   //在线客服图标(右侧)
   private String onlineIconRight;

   public void setId(BigInteger id){
         this.id = id;
   }
   public BigInteger getId(){
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