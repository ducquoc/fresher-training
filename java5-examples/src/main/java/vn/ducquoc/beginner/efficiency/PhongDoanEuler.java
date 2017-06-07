package vn.ducquoc.beginner.efficiency;

/**
 * Định lý Fermat: không tồn tại các nghiệm nguyên khác 0 a, b, c để thỏa:
 * <p>
 * a^3 + b^3 = c^3
 * </p>
 * a^4 + b^4 = c^4
 * <p>
 * a^5 + b^5 = c^5
 * </p>
 * ... với mọi lũy thừa K > 2 .
 * <p>
 * Phỏng đoán Euler: không tồn tại nghiệm nguyên khác 0 a, b, c, d, e... thỏa:
 * </p>
 * a^3 + b^3 = c^3
 * <p>
 * a^4 + b^4 + c^4 = d^4
 * <p>
 * a^5 + b^5 + c^5 + d^5 = c^5
 * </p>
 * ... với số lượng số hạng vế trái (N) < số lũy thừa (K).
 * <p>
 * Tuy nhiên năm 1966 có người đã tìm ra phản ví dụ cho K=5 (N=4):
 * </p>
 * 27^5 + 84^5 + 110^5 + 133^5 = X^5
 * <p>
 * This program will try to "refute" the Euler conjecture (sum of powers), by
 * finding the counter-example for K = 5, like Lander & Parkin did in 1966
 * 
 * @author ducquoc
 */
public class PhongDoanEuler {

  private int a;
  private int b;
  private int c;
  private int d;
  private int e = 1;

  /**
   * This method is not implemented correctly yet. Your home work!
   * 
   * @param range - limit to check
   * @return true if found any counter-example, false otherwise
   */
  public boolean refuteEulerConjecture(int range) {
    /* Update to pass the tests. Can update more in class if needed. */
    boolean foundCounterExample = false;
    boolean notZero = (a != 0) && (b != 0) && (c != 0) && (d != 0);

    long a5 = Long.valueOf(a * a) * a * a * a;
    long b5 = Long.valueOf(b * b) * b * b * b;
    long c5 = Long.valueOf(c * c) * c * c * c;
    long d5 = Long.valueOf(d * d) * d * d * d;
    long e5 = Long.valueOf(e * e) * e * e * e;
    for (int i = 0; i < range; i++) {
       if ((a5 + b5 + c5 + d5) == e5) {
          foundCounterExample = true;
       }
    }

    return foundCounterExample && notZero;
  }

  //getters/setters
  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }

  public int getD() {
    return d;
  }

  public void setD(int d) {
    this.d = d;
  }

  public int getE() {
    return e;
  }

  public void setE(int e) {
    this.e = e;
  }

  //hint/quick check
  public static void main(String[] args) {
    long tStart = System.nanoTime();

    int rangeCheck = (args.length > 0) ? Integer.valueOf(args[0]) : 200;
    for (int d1 = 1; d1 <= rangeCheck; d1++) {
      long d3 = d1 * d1 * d1;
      for (int a1 = 1; a1 <= rangeCheck; a1++) {
        long a3 = a1 * a1 * a1;
        for (int b1 = 1; b1 <= rangeCheck; b1++) {
          long b3 = b1 * b1 * b1;
          for (int c1 = 1; c1 <= rangeCheck; c1++) {
            long c3 = c1 * c1 * c1;
            if (d3 == (a3 + b3 + c3)) { // 6^3 is Plato's number
              System.out.println("Found: a=" + a1 + " b=" + b1 + " c=" + c1 + " d=" + d1);
            }
          }
        }
      }
    }

    long tEnd = System.nanoTime();
    System.out.printf("Time lapsed: %.4f ms\n", (tEnd - tStart) / 1000000.0);
  }

  /*
  // another hint - try to solve by yourself first
  // https://github.com/ducquoc/fresher-training/blob/master/java5-examples/src/test/java/vn/ducquoc/beginner/efficiency/PhongDoanEulerTest.java
  // aHR0cHM6Ly9naXRodWIuY29tL2R1Y3F1b2MvZXVsZXItZnVuL2Jsb2IvbWFzdGVyL2V1bGVyL3NyYy9tYWluL2phdmEvdm4vZHVjcXVvYy9ldWxlci9FdWxlclN1bUNvbmplY3R1cmUuamF2YQ==
  */

}
