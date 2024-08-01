package vn.ducquoc.upto.cl.helper;

public class CliHelper {

  public static int MAX_LENGTH_INPUT = 18;

  public static String banner() {
    return "             ,-----.,--.    ,--. ,--.        ,--------.      \n" +
            "            '  .--./|  |    |  | |  | ,---.  '--.  .--',---. \n" +
            "            |  |    |  |    |  | |  || .-. |    |  |  | .-. |\n" +
            "            '  '--'\\|  '--. '  '-'  '| '-' '    |  |  ' '-' '\n" +
            "             `-----'`-----'  `-----' |  |-'     `--'   `---' \n" +
            "                                     `--'                    "
            ;
  }

  public static String bannerV2() {
    return "               _____ _        _    _         _______   \n" +
            "              / ____| |      | |  | |       |__   __|  \n" +
            "             | |    | |      | |  | |_ __      | | ___ \n" +
            "             | |    | |      | |  | | '_ \\     | |/ _ \\\n" +
            "             | |____| |____  | |__| | |_) |    | | (_) |\n" +
            "              \\_____|______|  \\____/| .__/     |_|\\___/\n" +
            "                                    | |                \n" +
            "                                    |_|                "
            ;
  }

  public static String usage() {
    return help() + System.lineSeparator() + solicitInput();
  }

  public static String help() {
    return "== Command-line tool helps find largest prime number up to input number." + System.lineSeparator() +
            "=== Example: pNumUpTo(70)=67, pNumUpTo(105)=103, pNumUpTo(127)=127, pNumUpTo(140)=139";
  }

  public static String solicitInput() {
    return "Please input integer (max length " + MAX_LENGTH_INPUT + "): ";
  }
}
