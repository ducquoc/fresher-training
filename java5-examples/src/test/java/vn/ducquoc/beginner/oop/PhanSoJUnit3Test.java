package vn.ducquoc.beginner.oop;

public class PhanSoJUnit3Test extends junit.framework.TestCase {

  public void setUp() {
    System.out.println("Preparation (data) before each test... ");
  }

  public void tearDown() {
    System.out.println("Cleaning up (data) after each test... \n");
  }

  public void testConstructorAndGetterSetter() {
    PhanSo ps = new PhanSo(1, 2);

    System.out.println("Assertion after *constructor*: Expected vs Actual!");
    junit.framework.Assert.assertEquals(1, ps.getTuSo().intValue());
    junit.framework.Assert.assertEquals(2, ps.getMauSo().intValue());

    ps.setTuSo(3);
    ps.setMauSo(5);
    System.out.println("Assertion after *setter*: Expected vs Actual!");
    junit.framework.Assert.assertEquals(3, ps.getTuSo().intValue());
    junit.framework.Assert.assertEquals(5, ps.getMauSo().intValue());
  }

  public void testAddMethodUsingInstanceOop() {
    PhanSo ps = new PhanSo(1, 2);
    PhanSo ps2 = new PhanSo(1, 3);

    ps.add(ps2);// instance method, using object call
    System.out.println("Assertion after *add*: Expected vs Actual!");
    junit.framework.Assert.assertEquals(5, ps.getTuSo().intValue());
    junit.framework.Assert.assertEquals(6, ps.getMauSo().intValue());
  }

  public void testAddMethodUsingClassNotOop() {
    PhanSo ps = new PhanSo(1, 2);
    PhanSo ps2 = new PhanSo(1, 3);

    PhanSo psTong = PhanSo.add(ps, ps2);// static method, using class call
    System.out.println("Assertion after *static add*: Expected vs Actual!");
    junit.framework.Assert.assertEquals(5, psTong.getTuSo().intValue());
    junit.framework.Assert.assertEquals(6, psTong.getMauSo().intValue());
  }

}
