package vn.ducquoc.hr.warmup10;

import java.util.Scanner;

/** @see //hackerrank.com/challenges/time-conversion */
public class Solution {

  public static void main(String args[]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    /* START - DQ */
    //int t, n, m;
    Scanner in = new Scanner(System.in);

    String timeText = in.next();
    String hourText = timeText.substring(0, 2);
    if (timeText.endsWith("AM")) {
      if ("12".equals(hourText)) {
        hourText = "00";
      }
    } else { // PM
      if (!"12".equals(hourText)) {
        hourText = String.valueOf(12 + Integer.valueOf(hourText));
      }
    }
    timeText = hourText + timeText.substring(2, timeText.length() - 2);
    System.out.println(timeText);

    if (in != null) in.close();
    /* END - DQ */
  }

}
