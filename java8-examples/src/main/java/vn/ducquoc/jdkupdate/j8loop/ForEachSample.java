package vn.ducquoc.jdkupdate.j8loop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ForEachSample {

  private static final int MIN = 1;
  private static final int MAX = 1_000_000;

  static long sum = 0L; //primitive is faster than "boxed" objects

  public static void main(String args[]) {

    ForEachSample sample = new ForEachSample();

    System.out.println("\n *** Java 4 loop to build int list");
    for (int i = 0; i < 10; i++) {
      sample.j4BuildList(MIN, MAX);
    }

    System.out.println("\n *** Java 8 loop to build int list");
    for (int i = 0; i < 10; i++) {
      sample.j8BuildList(MIN, MAX);
    }

    System.out.println("\n *** Java 4 loop to sum square");
    for (int i = 0; i < 10; i++) {
      sample.j4SumSquare(MIN, MAX);
    }

    System.out.println("\n *** Java 8 loop to sum square");
    for (int i = 0; i < 10; i++) {
      sample.j8SumSquare(MIN, MAX);
    }

    System.out.println("\n *** Java 8 loop to sum square boxed");
    for (int i = 0; i < 10; i++) {
      sample.j8SumSquareBoxed(MIN, MAX);
    }

    System.out.println("\n *** Java 8 loop to sum square ordered");
    for (int i = 0; i < 10; i++) {
      sample.j8SumSquareOrdered(MIN, MAX);
    }

  }

  public List<Integer> j4BuildList(int min, int max) {
    long tStart = System.nanoTime();

    List<Integer> list = new ArrayList<>();
    for (int i = min; i < max; i++) {
      list.add(i); // performance overhead: boxing
    }

    long tEnd = System.nanoTime();
    System.out.println("Time elapsed: " + (tEnd - tStart) / 1e6 + " ms");
    return list;
  }

  private List<Integer> j8BuildList(int min, int max) {
    long tStart = System.nanoTime(); // also has boxing in mapToObj()

    List<Integer> list = IntStream.range(min, max).mapToObj(i -> i).collect(Collectors.toList());

    long tEnd = System.nanoTime();
    System.out.println("Time elapsed: " + (tEnd - tStart) / 1e6 + " ms");
    return list;
  }

  public long j4SumSquare(int min, int max) {
    long tStart = System.nanoTime();

    sum = 0L; //primitive is faster than "boxed" objects
    for (long i = min; i < max; i++) {
      sum += i * i;
    }

    long tEnd = System.nanoTime();
    System.out.println("Sum = " + sum + " (" + (tEnd - tStart) / 1e6 + " ms)");
    return sum;
  }

  public long j8SumSquare(int min, int max) {
    long tStart = System.nanoTime();

    sum = 0L;
    LongStream.range(min, max).forEach(i -> {
      sum += i * i;
    });

    long tEnd = System.nanoTime();
    System.out.println("Sum = " + sum + " (" + (tEnd - tStart) / 1e6 + " ms)");
    return sum;
  }

  public long j8SumSquareBoxed(int min, int max) {
    long tStart = System.nanoTime();

    sum = 0L;
    LongStream.range(min, max).boxed().forEach(i -> {
      sum += i * i;
    });

    long tEnd = System.nanoTime();
    System.out.println("Sum = " + sum + " (" + (tEnd - tStart) / 1e6 + " ms)");
    return sum;
  }


  public long j8SumSquareOrdered(int min, int max) {
    long tStart = System.nanoTime();

    sum = 0L;
    LongStream.range(min, max).forEachOrdered(i -> {
      sum += i * i;
    });

    long tEnd = System.nanoTime();
    System.out.println("Sum = " + sum + " (" + (tEnd - tStart) / 1e6 + " ms)");
    return sum;
  }

}
