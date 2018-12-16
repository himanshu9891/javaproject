package com.him.stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class InfiniteStreamsGenerate {
  public static void main(String args[]) {
    List<Double> randomList = Stream.generate(Math::random).limit(50).
    		collect(Collectors.toList());
    randomList.forEach(System.out::println);
  }
}