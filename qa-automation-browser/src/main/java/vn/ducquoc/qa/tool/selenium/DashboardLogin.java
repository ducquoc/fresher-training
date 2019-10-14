package vn.ducquoc.qa.tool.selenium;

import vn.ducquoc.jutil.BrowserUtil;
import vn.ducquoc.qa.tool.AutomationBrowser;

/**
 * Homepage -> Login ( nmt.cancer@yopmail.com/tnm@1234 ) https://beecat.myshopify.com
 * <br></br>
 * This test case will set text and login only.
 * <br></br>
 * Driver Chrome: https://chromedriver.chromium.org/downloads
 */
public class DashboardLogin {

    public static final String LONG_LENGTHY_PATH_SIGN_IN = "/blah/blah/very/very/long/path/to/this/p[2]/input";
    public static final String LONG_LENGTHY_PATH_LOGIN_LINK = "/blah/very/long/path/to/some/customer_login_link";

    public static void main(String[] args) {
        setText("https://beecat.myshopify.com", "nmt.cancer@yopmail.com", "tnm@1234");
    }

    public static void setText(String url, String username, String password) {
        //strange path, hard-coded, might break automation if changed
        System.out.println(String.format(" %s : Ta Luc Da Luc", username));
//        BrowserUtil.openUrl(url);
        AutomationBrowser.randomOpenBrowser(new java.util.Random().nextInt(),
                "https://phatgiao.org.vn/tu-dien-phat-hoc-online/ta-hoa-hien-phat-k41295.html",
                "http://anphat.org/dictionary/detail/tu-dien-phat-quang/2/T/55464/ta-hoa-hien-phat/1");
    }

//    @org.junit.Test
//    public void automation_browser_login_page() {
//        WebDriver browser;
//        //Firefox's geckodriver *requires* you to specify its location.
//        System.setProperty("webdriver.gecko.driver", "/Users/ducquoc/github/fresher-training/"
//                        + "qa-automation-browser/src/main/resources/mac64/chromedriver_2.44_69-71");
//        browser = new FirefoxDriver();
//        browser.get("http://saucelabs.com");
//        WebElement header = browser.findElement(By.id("site-header"));
//        assertTrue((header.isDisplayed()));
//        browser.close();
//    }

}
