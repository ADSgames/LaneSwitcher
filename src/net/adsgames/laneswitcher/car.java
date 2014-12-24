package net.adsgames.laneswitcher;

import java.awt.*;

public class car{
   private int x;
   private int y;
   private int speed;  
   private Image picture;
   private int type;
   
   public car(int carX, int carY, int carSpeed, Image carImage, int carType) {
      x = carX;
      y = carY;
      speed = carSpeed;
      picture = carImage;
      type = carType;
   }
   
   public Image getImage(){
     return picture;
   }
   
   public int getX(){
     return x;
   }
   
   public int getY(){
     return y;
   }
  
   public int getSpeed(){
     return speed;
   }
   
   public int getType(){
     return type;
   }
   
   public void setType(int carType){
     type = carType;
   }
   
   public void setSpeed(int newSpeed){
     speed = newSpeed;
   }
   
   public void setX(int newX){
     x = newX;
   }
   
   public void setY(int newY){
     y = newY;
   }
   
   public void setImage(Image newImage){
     picture = newImage;
   }
}