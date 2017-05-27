package vn.ducquoc;

/**
 * Apache POI was originally an acronym for "Poor Obfuscation Implementation".
 * 
 * @see https://en.wikipedia.org/wiki/Apache_POI
 */
@SuppressWarnings("unused")
public class App {

  public static Integer ANSWER_TO_LIFE_AND_UNIVERSE = 42;
  public static Integer MAGIC_NUM1 = ANSWER_TO_LIFE_AND_UNIVERSE - 229985494;
  public static Integer MAGIC_NUM2 = ANSWER_TO_LIFE_AND_UNIVERSE - 147909691;

  public static void main(String[] args) {

    System.out.println(javaUtilRandom(MAGIC_NUM1) + " " + javaUtilRandom(MAGIC_NUM2));
  }

  public static String javaUtilRandom(int param) {
    java.util.Random ran = new java.util.Random(param);
    StringBuffer sb = new StringBuffer();
    for (int i = 0;; i++) {
      int k = ran.nextInt(27);
      if (k == 0)
        break;

      sb.append((char) ('`' + k));
    }

    return sb.toString();
  }

}
