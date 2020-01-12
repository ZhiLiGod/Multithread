package com.multithread.multithread.lifecycle;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo3 implements Callable<Integer> {

  public static void main(String[] args) throws Exception {
    Demo3 d = new Demo3();

    FutureTask<Integer> task = new FutureTask<>(d);

    Thread t = new Thread(task);

    t.start();

    System.out.println("Doing something else");
    System.out.println("Result: " + task.get());
  }

  @Override
  public Integer call() throws Exception {
    System.out.println("Doing something...");
    Thread.sleep(3000);
    return 1;
  }

}
