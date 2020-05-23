package com.multithread.multithread.sync;

public class StaticSyncClass implements Runnable {

  static StaticSyncClass instance1 = new StaticSyncClass();
  static StaticSyncClass instance2 = new StaticSyncClass();

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

  public void method() {
    synchronized (StaticSyncClass.class) {
      System.out.println("Static Method Lock: " + Thread.currentThread().getName());
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Static Method Lock Finished: " + Thread.currentThread().getName());
    }
  }

}
