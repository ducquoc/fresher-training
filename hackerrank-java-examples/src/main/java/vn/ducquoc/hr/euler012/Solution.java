package vn.ducquoc.hr.euler012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** @see //hackerrank.com/contests/projecteuler/challenges/euler012 */
public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    int t, N, K;
    DScanner in = new DScanner(System.in);

    t = in.nextInt();
    // pre-compute/memoization
    HashMap<Integer, Integer> seenFactors = new LinkedHashMap<Integer, Integer>();

    while (t-- > 0) {
      N = in.nextInt();
      int triNumNeeded = 2;
      int triNumIndex = 1;
      while (triNumIndex <= triNumNeeded) {
        K = (triNumIndex * (triNumIndex + 1)) / 2;
        int factorsCount = 0;
        if (!seenFactors.containsKey(K)) {
          factorsCount = factorize(K);
          seenFactors.put(K, factorsCount);
        } else {
          factorsCount = seenFactors.get(K);
        }
        if (factorsCount > N) {
          System.out.println(K);
          break;
        } else if (factorsCount <= N) {
          triNumNeeded += 2;
        }
        triNumIndex += 1;
      }
    }

    if (in != null) in.close();
  }

  public static int countFactors(Number num) {
    long n = num.longValue();
    int factors = 0;

    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        factors += 2;
      if (i * i == n)
        factors -= 1;
    }

    return factors;
  }

  public static int factorize(Number num) {
    Integer n = num.intValue();
    int exponentProduct = 1;
    List<Integer> list = new ArrayList<Integer>();
    // memoization
    HashMap<Integer, Integer> exponentCount = new HashMap<Integer, Integer>();

    for (int i = 2; i <= n / i; i++) {
      while (n % i == 0) {
        list.add(i);
        n /= i;
      }
    }
    if (n > 1)
      list.add(n);

    //System.out.println(java.util.Arrays.toString(list.toArray()));
    for (int i = 0, s = list.size(); i < s; i++) {
      if (!exponentCount.containsKey(list.get(i))) {
        exponentCount.put(list.get(i), 1);
      } else {
        int currentCount = exponentCount.get(list.get(i));
        exponentCount.put(list.get(i), currentCount + 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : exponentCount.entrySet()) {
      exponentProduct *= entry.getValue() + 1;
    }
    return exponentProduct;
  }

  //public static long sum1ToN(long number) { return number * (number + 1) / 2; }

  public static class DScanner {// Dummy Scanner not DqScanner
    java.io.BufferedReader br;
    java.util.StringTokenizer st;

    public DScanner() {
      br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    }

    public DScanner(java.io.InputStream is) {// file/resource
      br = new java.io.BufferedReader(new java.io.InputStreamReader(
          new java.io.DataInputStream(is)));
    }

    public String next() {// no nextLine() : prefer br.readLine()
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
