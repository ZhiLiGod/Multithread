package com.multithread.multithread.sync;

public class SyncObjectCodeBlock implements Runnable {

  static SyncObjectCodeBlock instance = new SyncObjectCodeBlock();

  Object lock1 = new Object();
  Object lock2 = new Object();

  @Override
  public void run() {
    synchronized (lock1) {
      System.out.println("Thread Lock 1: " + Thread.currentThread().getName());

      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("Finish: " + Thread.currentThread().getName());
    }

    synchronized (lock2) {
      System.out.println("Thread Lock 2: " + Thread.currentThread().getName());

      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("Finish: " + Thread.currentThread().getName());
    }
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
}
