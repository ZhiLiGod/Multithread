package com.multithread.multithread.services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.multithread.multithread.configs.Config;

public class Main {

  public static void main(String[] args) throws Exception {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

    DemoService ds = ac.getBean(DemoService.class);

    ds.a();
    ds.b();
  }

}
