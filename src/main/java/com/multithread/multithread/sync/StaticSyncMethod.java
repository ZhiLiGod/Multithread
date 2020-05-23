package com.multithread.multithread.sync;

public class StaticSyncMethod implements Runnable {

  static StaticSyncMethod instance1 = new StaticSyncMethod();
  static StaticSyncMethod instance2 = new StaticSyncMethod();

  @Override
  public void run() {
    method();
  }

  public static void main(String[] args) {
    Thread t1 = new Thread(instance1);
    Thread t2 = new Thread(instance2);

    t1.start();
    t2.start();

    while (t1.isAlive() || t2.isAlive()) {
      // do nothing
    }

    System.out.println("finished");
  }

  public static synchronized void method() {
    System.out.println("Static Method Lock: " + Thread.currentThread().getName());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Static Method Lock Finished: " + Thread.currentThread().getName());
  }

}
