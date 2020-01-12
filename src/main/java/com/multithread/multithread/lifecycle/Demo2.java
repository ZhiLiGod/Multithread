package com.multithread.multithread.lifecycle;

public class Demo2 implements Runnable {

  public static void main(String[] args) {
    Thread thread = new Thread(new Demo2());

    thread.start();
  }

  @Override
  public void run() {
    while (true) {
      System.out.println("Thread running..");
    }
  }

}
