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
  public static int BASELINE_HL_3 = ANSWER_TO_LIFE_AND_UNIVERSE - 7;
  public static int BASELINE_HL_4 = ANSWER_TO_LIFE_AND_UNIVERSE + 4;
  public static int[] BASELINE_OF_7 = {FORTY_EIGHT, FIFTY_SEVEN, SIXTY_NINE, BASELINE_HL_3 * 2, BASELINE_HL_4 * 2,
          BASELINE_HL_3 * 3, BASELINE_HL_4 * 3};

  public static void main(String[] args) {
    System.out.println(new java.util.Random().nextInt() % 2 == 0 ? CliHelper.banner() : CliHelper.bannerV2());

    java.util.List<Integer> baselineAfter = java.util.Arrays.stream(BASELINE_OF_7)//.mapToObj(Integer::new)
            .boxed().collect(java.util.stream.Collectors.toList());
    baselineAfter.remove(Integer.valueOf(BASELINE_HL_3 * 2)); // 70
    baselineAfter.add(BASELINE_HL_4 * 3 + BASELINE_HL_3 * 2); // 208
    baselineAfter.add(BASELINE_HL_4 * 3 + BASELINE_HL_3 * 4); // 278
    String input = (args != null && args.length > 0) ? args[0] : randomChoice(baselineAfter) + "";
    System.out.println("Largest prime number up to " + input + " is " + pnUpTo(Long.valueOf(input)));

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

  private static Integer randomChoice(java.util.List<Integer> list) {
    return list.get(new java.util.Random().nextInt(list.size()));
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
