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
    Scanner in = new Scanner(System.in);
    int year = in.nextInt();
    String result = solve(year);
    System.out.println(result);
  }

}