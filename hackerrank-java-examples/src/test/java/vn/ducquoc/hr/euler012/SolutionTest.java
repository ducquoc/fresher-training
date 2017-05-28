package vn.ducquoc.hr.euler012;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  public static InputStream readResource(String resourcePath) {

    return Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath);
  }

  public String getOutputResultFromMainRunStdin(String resourcePath) {
    OutputStream outputContent = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(outputContent);
    System.setOut(ps); // google OutputCapture/SystemOutRule

    System.setIn(readResource(resourcePath));// file stdin: < PATH/input00.txt
    Solution.main(new String[0]);

    String output = outputContent.toString();
    System.setOut(null);
    System.setIn(null);

    return output;
  }

  @Test(timeout=60000)
  public void test00() throws Exception {

    String actual = getOutputResultFromMainRunStdin("euler012/input00.txt");
    BufferedReader buff = new BufferedReader(new InputStreamReader(readResource("euler012/output00.txt")));
    String expected = "", line = "";
    while((line = buff.readLine()) != null) {
      expected += line + System.getProperty("line.separator");
    }
    Assert.assertEquals(expected.trim(), actual.trim());
  }

  @Test(timeout=60000)
  public void test01() throws Exception {

    String actual = getOutputResultFromMainRunStdin("euler012/input01.txt");
    BufferedReader buff = new BufferedReader(new InputStreamReader(readResource("euler012/output01.txt")));
    String expected = "", line = "";
    while((line = buff.readLine()) != null) {
      expected += line + System.getProperty("line.separator");
    }
    Assert.assertEquals(expected.trim(), actual.trim());
  }

}
