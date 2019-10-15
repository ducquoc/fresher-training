package vn.ducquoc.qa.tool;

import vn.ducquoc.jutil.BrowserUtil;

/**
 * Not necessary to use Selenium, Cucumber, Watir, etc...
 * <br></br>
 * This test case will open browser with some randomness.
 *
 * @see //is.gd/automation_selenium_commit_png
 */
public class AutomationBrowser {

    public static void main(String[] args) {
        int inputNumber = args.length > 0 ? Integer.parseInt(args[0]) : new java.util.Random().nextInt();

        randomOpenBrowser(inputNumber, "https://phatgiao.org.vn/tu-dien-phat-hoc-online/ta-hoa-hien-phat-k41295.html",
                "http://anphat.org/dictionary/detail/tu-dien-phat-quang/2/T/55464/ta-hoa-hien-phat/1");
    }

    public static void randomOpenBrowser(int inputNumber, String taHoaHienPhat, String diHoaTiepMoc) {
        if (inputNumber % 2 == 0) { // Tá Hoa Hiến Phật
            System.out.println(String.format(" %s : Ta Hoa Hien Phat", inputNumber));
            BrowserUtil.openUrl(taHoaHienPhat);
        } else { // Di Hoa Tiếp Mộc
            System.out.println(String.format(" %s : Di Hoa Tiep Ngoc", inputNumber));
            BrowserUtil.openUrl(diHoaTiepMoc);
        }
    }

}
