package net.adsgames.laneswitcher;

import java.io.*;
import javazoom.jl.player.Player;

public class MP3 extends Thread{
  String filename;
  Player player; 
  boolean loop;
  
  public MP3(String name, boolean newLoop) {
    filename = name;
    loop = newLoop;
    start();
  }
  
  public void close() {
    loop = false;
    if (player != null) 
      player.close(); 
    System.out.println("Shut Down!");
  }
  
  public void run() {
    try {
      while(loop){
        InputStream bis = getClass().getResourceAsStream(filename);
        player = new Player(bis);
        player.play(); 
      }
    }
    catch (Exception e){ 
      System.out.println("Problem playing file " + filename);
      System.out.println(e); 
    }
  }
}