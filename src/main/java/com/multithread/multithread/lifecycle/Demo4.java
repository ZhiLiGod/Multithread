package com.multithread.multithread.lifecycle;

import java.util.Timer;
import java.util.TimerTask;

public class Demo4 {

  public static void main(String[] args) {

    Timer timer = new Timer();

    timer.schedule(new TimerTask() {

      @Override
      public void run() {
        // implement timer task
        System.out.println("timer task is running..");
      }
    }, 0, 1000);

  }

}
