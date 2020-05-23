package com.multithread.multithread.sync;

public class DisappearRequest implements Runnable {

  static DisappearRequest instance = new DisappearRequest();
  static int i = 0;

  public static void main(String[] args) throws Exception {
    Thread t1 = new Thread(instance);
    Thread t2 = new Thread(instance);

    t1.start();
    t2.start();
    t1.join();
    t2.join();

    System.out.println(i);
  }

  @Override
  public void run() {
    for (int j = 0; j < 100000; j++) {
      i++;
    }
  }
}
