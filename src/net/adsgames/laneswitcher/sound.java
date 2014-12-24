package net.adsgames.laneswitcher;

import  sun.audio.*;
import  java.io.*;

public class sound {

    private InputStream input;
    private AudioStream audio;

    public sound (String fileName)
    {
      try {
        input = new FileInputStream(fileName);
        audio = new AudioStream(input);
      }
      catch (Exception e) {
        System.out.println("Problem playing file " + fileName);
        System.out.println(e);
      }
    }

    public void play()
    {
        AudioPlayer.player.start(audio);
    }

    public void stop()
    {
        AudioPlayer.player.stop(audio);
    }

}