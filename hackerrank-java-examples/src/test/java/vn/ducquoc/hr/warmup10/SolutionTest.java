package vn.ducquoc.hr.warmup10;

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

  private String getOutputResultFromMainRunStdin(String resourcePath) {
    System.setIn(readResource(resourcePath));// file as std input: < warmup1/input01.txt
    Solution.main(new String[0]);

    return outputContent.toString();
  }

  @Test(timeout=60000)
  public void test00() throws Exception {
    String actual = getOutputResultFromMainRunStdin("warmup10/input00.txt");
    String expected = new BufferedReader(new InputStreamReader(readResource("warmup10/output00.txt"))).readLine();
    Assert.assertEquals(expected.trim(), actual.trim());
  }

  @Test(timeout=60000)
  public void test01() throws Exception {
    String actual = getOutputResultFromMainRunStdin("warmup10/input01.txt");
    String expected = new BufferedReader(new InputStreamReader(readResource("warmup10/output01.txt"))).readLine();
    Assert.assertEquals(expected.trim(), actual.trim());
  }

  @Test(timeout=60000)
  public void test02() throws Exception {
    String actual = getOutputResultFromMainRunStdin("warmup10/input02.txt");
    String expected = new BufferedReader(new InputStreamReader(readResource("warmup10/output02.txt"))).readLine();
    Assert.assertEquals(expected.trim(), actual.trim());
  }

  @Test(timeout=60000)
  public void test03() throws Exception {
    String actual = getOutputResultFromMainRunStdin("warmup10/input03.txt");
    String expected = new BufferedReader(new InputStreamReader(readResource("warmup10/output03.txt"))).readLine();
    Assert.assertEquals(expected.trim(), actual.trim());
  }

  @Test(timeout=60000)
  public void test04() throws Exception {
    String actual = getOutputResultFromMainRunStdin("warmup10/input04.txt");
    String expected = new BufferedReader(new InputStreamReader(readResource("warmup10/output04.txt"))).readLine();
    Assert.assertEquals(expected.trim(), actual.trim());
  }

  @Test(timeout=60000)
  public void test05() throws Exception {
    String actual = getOutputResultFromMainRunStdin("warmup10/input05.txt");
    String expected = new BufferedReader(new InputStreamReader(readResource("warmup10/output05.txt"))).readLine();
    Assert.assertEquals(expected.trim(), actual.trim());
  }

}
