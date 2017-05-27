package vn.ducquoc.hr.warmup1;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @org.junit.Test
  public void test00() throws Exception {

    //setUp
    OutputStream outputContent = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(outputContent);
    System.setOut(ps); // google OutputCapture/SystemOutRule

    InputStream inputContent = Thread.currentThread().getContextClassLoader().getResourceAsStream("warmup1/input00.txt");
    System.setIn(inputContent);

    //testTarget
    Solution solution = new Solution();
    solution.main(new String[0]);

    //assertion
    String actual = outputContent.toString();
    String expected = "5";// can read from file output00.txt;
    org.junit.Assert.assertEquals(expected, actual.trim());

    //tearDown
    System.setOut(null);
    System.setIn(null);
  }

  @Test
  public void test01() throws Exception {

    //setUp
    OutputStream outputContent = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(outputContent);
    System.setOut(ps); // google OutputCapture/SystemOutRule

    InputStream inputContent = Thread.currentThread().getContextClassLoader().getResourceAsStream("warmup1/input01.txt");
    System.setIn(inputContent); // file as std input: < warmup1/input01.txt

    //testTarget
    Solution solution = new Solution();
    solution.main(new String[0]);

    //assertion
    String actual = outputContent.toString();
    InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("warmup1/output01.txt");
    String expected = new BufferedReader(new InputStreamReader(is)).readLine();
    Assert.assertEquals(expected, actual.trim());

    //tearDown
    System.setOut(null);
    System.setIn(null);
  }

}
