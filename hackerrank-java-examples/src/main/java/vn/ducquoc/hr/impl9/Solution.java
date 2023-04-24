package vn.ducquoc.hr.impl9;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** @see //hackerrank.com/challenges/day-of-the-programmer */
public class Solution {

  static String solve(int year) {
    // Complete this function
    /* START - DQ */
    if (year == 1918) return "26.09.1918";
    if (year < 1918 && year % 4 == 0) return "12.09." + year; //Julian
    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) return "12.09." + year;
    return "13.09." + year;
    /* END - DQ */
  }

  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
    DScanner in = new DScanner(System.in);
    int year = in.nextInt();
    String result = solve(year);
    System.out.println(result);
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