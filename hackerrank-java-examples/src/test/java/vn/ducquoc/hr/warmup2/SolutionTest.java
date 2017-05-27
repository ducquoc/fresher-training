package vn.ducquoc.hr.warmup2;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ducquoc (ducquoc.vn@gmail.com)
 */
@SuppressWarnings("all")
public class SolutionTest {

  OutputStream outputContent = new ByteArrayOutputStream();

  @org.junit.Before
  public void setUp() { //setUp Before
    PrintStream ps = new PrintStream(outputContent);
    System.setOut(ps); // google OutputCapture/SystemOutRule
  }

  @org.junit.After
  public void tearDown(){ //tearDown After
    System.setOut(null);
    System.setIn(null);
  }

  public static InputStream readResource(String resourcePath) {

    return Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath);
  }

  @org.junit.Test
  public void test00() throws Exception {
    InputStream inputContent = readResource("warmup2/input00.txt");
    System.setIn(inputContent); // file as std input: < warmup1/input00.txt

    //testTarget
    Solution solution = new Solution();
    solution.main(new String[0]);

    //assertion
    String actual = outputContent.toString();
    InputStream is = readResource("warmup2/output00.txt");
    String expected = new BufferedReader(new InputStreamReader(is)).readLine();
    org.junit.Assert.assertEquals(expected, actual.trim());
  }

  @Test
  public void test01() throws Exception {
    InputStream inputContent = readResource("warmup2/input01.txt");
    System.setIn(inputContent); // file as std input: < warmup1/input01.txt

    //testTarget
    Solution solution = new Solution();
    solution.main(new String[0]);

    //assertion
    String actual = outputContent.toString();
    InputStream is = readResource("warmup2/output01.txt");
    String expected = new BufferedReader(new InputStreamReader(is)).readLine();
    Assert.assertEquals(expected, actual.trim());
  }

  @Test
  public void test02() throws Exception {
    System.setIn(readResource("warmup2/input02.txt")); // file as std input: < warmup1/input01.txt

    //testTarget
    Solution.main(new String[0]);

    //assertion
    String actual = outputContent.toString();
    String expected = new BufferedReader(new InputStreamReader(readResource("warmup2/output02.txt"))).readLine();
    Assert.assertEquals(expected, actual.trim());
  }

}
