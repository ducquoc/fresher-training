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

  public boolean refuteEulerConjecture(int range) {
    boolean foundCounterExample = false;
    boolean notZero = (a != 0) && (b != 0) && (c!=0) && (d!=0);

    for (int i = 0; i < range; i++) {
       if (a*a*a*a*a + b*b*b*b*b + c*c*c*c*c + d*d*d*d*d == e*e*e*e*e) {
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
    for (int d = 1; d < rangeCheck; d++) {
      long d3 = d * d * d;
      for (int a = 1; a <= rangeCheck; a++) {
        long a3 = a * a * a;
        for (int b = 1; b <= rangeCheck; b++) {
          long b3 = b * b * b;
          for (int c = 1; c <= rangeCheck; c++) {
            long c3 = c * c * c;
            if (d3 == a3 + b3 + c3) {
              System.out.println("Found: a=" + a + " b=" + b + " c=" + c + " d=" + d);
            }
          }
        }
      }
    }

    long tEnd = System.nanoTime();
    System.out.printf("Time lapsed: %.4f ms\n", (tEnd - tStart) / 1000000.0);
  }

}
