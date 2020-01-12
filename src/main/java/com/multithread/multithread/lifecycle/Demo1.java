package com.multithread.multithread.lifecycle;

public class Demo1 extends Thread {

  public Demo1(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (!interrupted()) {
      System.out.println(getName() + "Thread statred...");
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Demo1 d1 = new Demo1("First Thread");
    Demo1 d2 = new Demo1("Second Thread");

    // if main thread dead, this thread dead
    //    d1.setDaemon(Boolean.TRUE);
    //    d2.setDaemon(Boolean.TRUE);

    d1.start();
    d2.start();

    d1.interrupt();

    // Thread.sleep(2000);
  }

}
