package com.multithread.multithread.lifecycle;

import java.util.Arrays;
import java.util.List;

public class Demo6 {

  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
    int result = new Demo6().add(values);

    System.out.println("Result: " + result);
  }

  public int add(List<Integer> values) {
    values.parallelStream().forEach(System.out::println);
    return values.parallelStream().mapToInt(a -> a).sum();
  }

}
