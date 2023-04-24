package vn.ducquoc.hr.implexlf;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'extraLongFactorials' function below.
   *
   * The function accepts INTEGER n as parameter.
   */
  public static void extraLongFactorials(int n) {
    // Write your code here
    final BigInteger[] result = new BigInteger[n + 1]; // OK either n or n+1, it depends
    result[0] = BigInteger.ONE;
    IntStream.range(1, n + 1).forEach(i -> {
      result[i] = result[i - 1].multiply(BigInteger.valueOf(i));
    });
    System.out.println(result[n]);
  }
}

public class Solution {
  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    int n = Integer.parseInt(bufferedReader.readLine().trim());
//    Result.extraLongFactorials(n);
//    bufferedReader.close();
    DScanner in = new DScanner(System.in);
    int n = in.nextInt();
    Result.extraLongFactorials(n);
    in.close();
  }

  public static class DScanner { // DScanner - quicker Scanner
    java.io.BufferedReader br;
    java.util.StringTokenizer st;

    public DScanner() {
      br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    }

    public DScanner(java.io.InputStream is) { // file/resource
      br = new java.io.BufferedReader(new java.io.InputStreamReader(
              new java.io.DataInputStream(is)));
    }

    public String next() { // no nextLine() : prefer br.readLine()
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new java.util.StringTokenizer(br.readLine());
        } catch (java.io.IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.valueOf(next());
    }

    public void close() {
      if (br != null) {
        try {
          br.close();
        } catch (java.io.IOException e) {
          e.printStackTrace();
        }
      }
    }

    //long nextLong() { return Long.valueOf(next()); }
    //double nextDouble() { return Double.valueOf(next()); }
  }
}
