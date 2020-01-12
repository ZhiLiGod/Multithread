package com.multithread.multithread.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

  @Async
  public void a() throws Exception {
    while (true) {
      System.out.println("a");
      Thread.sleep(2000);
    }
  }

  @Async
  public void b() throws Exception {
    while (true) {
      System.out.println("b");
      Thread.sleep(2000);
    }
  }

}
