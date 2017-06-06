package vn.ducquoc.beginner.oop;

//@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class PhanSoJUnit4Test {

  @org.junit.Before
  public void setUp() {
    System.out.println("Preparation (data) before each test... ");
  }

  @org.junit.After
  public void tearDown() {
    System.out.println("Cleaning up (data) after each test... \n");
  }

  @org.junit.Test
  public void testConstructorAndGetterSetter() {
    PhanSo ps = new PhanSo(1, 2);

    System.out.println("Assertion after *constructor*: Expected vs Actual!");
    org.junit.Assert.assertEquals(1, ps.getTuSo().intValue());
    org.junit.Assert.assertEquals(2, ps.getMauSo().intValue());

    ps.setTuSo(3);
    ps.setMauSo(5);
    System.out.println("Assertion after *setter*: Expected vs Actual!");
    org.junit.Assert.assertEquals(3, ps.getTuSo().intValue());
    org.junit.Assert.assertEquals(5, ps.getMauSo().intValue());
  }

  @org.junit.Test
  public void testAddMethodUsingInstanceOop() {
    PhanSo ps = new PhanSo(1, 2);
    PhanSo ps2 = new PhanSo(1, 3);

    ps.add(ps2);// instance method, using object call
    System.out.println("Assertion after *add*: Expected vs Actual!");
    org.junit.Assert.assertEquals(5, ps.getTuSo().intValue());
    org.junit.Assert.assertEquals(6, ps.getMauSo().intValue());
  }

  @org.junit.Test
  public void testAddMethodUsingClassNotOop() {
    PhanSo ps = new PhanSo(1, 2);
    PhanSo ps2 = new PhanSo(1, 3);

    PhanSo psTong = PhanSo.add(ps, ps2);// static method, using class call
    System.out.println("Assertion after *static add*: Expected vs Actual!");
    org.junit.Assert.assertEquals(5, psTong.getTuSo().intValue());
    org.junit.Assert.assertEquals(6, psTong.getMauSo().intValue());
  }

}
