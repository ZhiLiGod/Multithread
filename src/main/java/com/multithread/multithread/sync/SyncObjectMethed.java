package com.multithread.multithread.sync;

public class SyncObjectMethed implements Runnable {

  static SyncObjectMethed instance = new SyncObjectMethed();

  @Override
  public void run() {
    method();
  }

  public static void main(String[] args) {
    Thread t1 = new Thread(instance);
    Thread t2 = new Thread(instance);

    t1.start();
    t2.start();

    while (t1.isAlive() || t2.isAlive()) {
      // do nothing
    }

    System.out.println("finished");
  }

  public synchronized void method() {
    System.out.println("Method Lock: " + Thread.currentThread().getName());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Method Lock Finished: " + Thread.currentThread().getName());
  }

}
