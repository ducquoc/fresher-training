package vn.ducquoc.upto.cl;

import vn.ducquoc.upto.cl.helper.CliHelper;
import vn.ducquoc.upto.cl.util.MathUtil;

import java.util.Scanner;
//import java.util.stream.IntStream;
//import java.util.stream.LongStream;

/**
 * Command-line prime number up to.
 */
@SuppressWarnings({"unused", "unchecked", "Duplicates"})
public class ClUpTo {

  public static int ANSWER_TO_LIFE_AND_UNIVERSE = 42;
  public static int FORTY_EIGHT = ANSWER_TO_LIFE_AND_UNIVERSE + 6;
  public static int FIFTY_SEVEN = ANSWER_TO_LIFE_AND_UNIVERSE + 15;
  public static int SIXTY_NINE = ANSWER_TO_LIFE_AND_UNIVERSE + 27;
  public static int MAX_LENGTH_INPUT = 15;

  public static void main(String[] args) {
    System.out.println(new java.util.Random().nextInt() % 2 == 0 ? CliHelper.banner() : CliHelper.bannerV2());

    String input = (args != null && args.length > 0) ? args[0] : FIFTY_SEVEN + "";
    if ("57".equals(input) || "69".equals(input) || "48".equals(input)) {
      System.out.println("Largest prime number up to " + input + " is " + pnUpTo(Long.valueOf(input)));
    }

    System.out.print(CliHelper.usage());
    Scanner in = new Scanner(System.in);
    do {
      input = in.next();
      long inNum = parseLong(input);
      if (inNum >= 2) {
        System.out.println("Largest prime number up to " + inNum + " is " + pnUpTo(inNum));
      } else {
        System.out.println("2 is the lowest prime number. Please provide a number higher than that.");
      }

      System.out.print(" Continue process? (Exit by input 'X' or press Ctrl+C)\n\n" + CliHelper.solicitInput());
    } while (!input.equalsIgnoreCase("X") && !input.equalsIgnoreCase("C"));
  }

  private static long parseLong(String input) {
    long inNum = 0;
    try {
      inNum = Long.parseLong(input);
    } catch (NumberFormatException ex) {
      System.err.println("Must be valid integer or long number: " + ex.getMessage());
    }
    return inNum;
  }

  public static long pnUpTo(long n) {
    while (n > 0) {
      if (MathUtil.isPrime(n)) {
        break;
      }
      n--;
    }
    return n;
  }
}
