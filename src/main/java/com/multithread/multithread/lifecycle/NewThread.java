package com.multithread.multithread.lifecycle;

public class NewThread implements Runnable {

  @Override
  public void run() {
    while (true) {
      System.out.println("Thread started...");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    Thread thread = new Thread(new NewThread());

    thread.start();

    while (true) {
      System.out.println("Main thread...");
    }
  }

}
