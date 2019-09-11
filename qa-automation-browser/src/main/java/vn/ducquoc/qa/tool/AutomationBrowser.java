package vn.ducquoc.qa.tool;

import vn.ducquoc.jutil.BrowserUtil;

public class AutomationBrowser {

    public static void main(String[] args) {
        int inputNumber = args.length > 0 ? Integer.parseInt(args[0]) : new java.util.Random().nextInt();

        if (inputNumber % 2 == 0) { // Tá Hoa Hiến Pht
            System.out.println(String.format(" %s : Ta Hoa Hien Phat", inputNumber));
            BrowserUtil.openUrl("https://phatgiao.org.vn/tu-dien-phat-hoc-online/ta-hoa-hien-phat-k41295.html");
        } else { // Di Hoa Tiếp Mộc
            System.out.println(String.format(" %s : Di Hoa Tiep Ngoc", inputNumber));
            BrowserUtil.openUrl("http://anphat.org/dictionary/detail/tu-dien-phat-quang/2/T/55464/ta-hoa-hien-phat/1");
        }
    }

}
