package com.multithread.multithread.lifecycle;

public class Demo1 extends Thread {

  public Demo1(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (true)
      System.out.println(getName() + "Thread statred...");
  }

  public static void main(String[] args) throws InterruptedException {
    Demo1 d1 = new Demo1("First Thread");
    Demo1 d2 = new Demo1("Second Thread");

    d1.setDaemon(Boolean.TRUE);// if main thread dead, this thread dead
    d2.setDaemon(Boolean.TRUE);

    d1.start();
    d2.start();

    Thread.sleep(2000);
  }

}
