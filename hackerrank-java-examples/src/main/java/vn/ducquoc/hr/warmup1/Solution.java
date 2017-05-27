package vn.ducquoc.hr.warmup1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** @see https://www.hackerrank.com/challenges/solve-me-first */
public class Solution {

  static int solveMeFirst(int a, int b) {
    // Hint: Type return a+b; below
    /* START - DQ */
    return a + b;
    /* END - DQ */
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a;
    a = in.nextInt();
    int b;
    b = in.nextInt();
    int sum;
    sum = solveMeFirst(a, b);
    System.out.println(sum);
  }

}
