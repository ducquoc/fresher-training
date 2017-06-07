package vn.ducquoc.beginner.efficiency;

import org.junit.Assert;
import org.junit.Test;

public class PhongDoanEulerTest {

  @Test(timeout=30000)
  public void test_refute_euler_conjecture_with_timeout_30s() {
    PhongDoanEuler eulerConjecture = new PhongDoanEuler();

    System.out.println("Trying to reject the conjecture! (max 30s)");
    eulerConjecture.refuteEulerConjecture(200);

    System.out.println("Assertion after trying (max 30s)");
    Assert.assertTrue(eulerConjecture.getA() != 0);
    Assert.assertTrue(eulerConjecture.getB() != 0);
    Assert.assertTrue(eulerConjecture.getC() != 0);
    Assert.assertTrue(eulerConjecture.getD() != 0);
    Assert.assertFalse(eulerConjecture.getE() == 0);

    long a5 = (long) Math.pow(eulerConjecture.getA(), 5);
    long b5 = (long) Math.pow(eulerConjecture.getB(), 5);
    long c5 = (long) Math.pow(eulerConjecture.getC(), 5);
    long d5 = (long) Math.pow(eulerConjecture.getD(), 5);
    long e5 = (long) Math.pow(eulerConjecture.getE(), 5);
    Assert.assertTrue(e5 == a5 + b5 + c5 + d5);
  }

  @Test(timeout=15000)
  public void test_refute_euler_conjecture_with_timeout_15s() {
    PhongDoanEuler eulerConjecture = new PhongDoanEuler();

    System.out.println("Trying to reject the conjecture! (max 15s)");
    eulerConjecture.refuteEulerConjecture(180);

    System.out.println("Assertion after trying (max 15s)");
    Assert.assertTrue(eulerConjecture.getA() != 0);
    Assert.assertTrue(eulerConjecture.getB() != 0);
    Assert.assertTrue(eulerConjecture.getC() != 0);
    Assert.assertTrue(eulerConjecture.getD() != 0);
    Assert.assertFalse(eulerConjecture.getE() == 0);

    long a5 = (long) Math.pow(eulerConjecture.getA(), 5);
    long b5 = (long) Math.pow(eulerConjecture.getB(), 5);
    long c5 = (long) Math.pow(eulerConjecture.getC(), 5);
    long d5 = (long) Math.pow(eulerConjecture.getD(), 5);
    long e5 = (long) Math.pow(eulerConjecture.getE(), 5);
    Assert.assertTrue(e5 == a5 + b5 + c5 + d5);
  }

  @Test(timeout=5000)
  public void test_refute_euler_conjecture_with_timeout_5s() {
    PhongDoanEuler eulerConjecture = new PhongDoanEuler();

    System.out.println("Trying to reject the conjecture! (max 5s)");
    eulerConjecture.refuteEulerConjecture(150);

    System.out.println("Assertion after trying (max 5s)");
    Assert.assertTrue(eulerConjecture.getA() != 0);
    Assert.assertTrue(eulerConjecture.getB() != 0);
    Assert.assertTrue(eulerConjecture.getC() != 0);
    Assert.assertTrue(eulerConjecture.getD() != 0);
    Assert.assertFalse(eulerConjecture.getE() == 0);

    long a5 = (long) Math.pow(eulerConjecture.getA(), 5);
    long b5 = (long) Math.pow(eulerConjecture.getB(), 5);
    long c5 = (long) Math.pow(eulerConjecture.getC(), 5);
    long d5 = (long) Math.pow(eulerConjecture.getD(), 5);
    long e5 = (long) Math.pow(eulerConjecture.getE(), 5);
    Assert.assertTrue(e5 == a5 + b5 + c5 + d5);
  }

}
