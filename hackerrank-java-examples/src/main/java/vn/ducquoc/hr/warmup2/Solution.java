package vn.ducquoc.hr.warmup2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** @see https://www.hackerrank.com/challenges/simple-array-sum */
public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    /* START - DQ */
    int t, n, m;
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    int arr[] = new int[n];
    long sum = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
      sum += arr[i];
    }
    System.out.println(sum);
    /* END - DQ */
  }

}
