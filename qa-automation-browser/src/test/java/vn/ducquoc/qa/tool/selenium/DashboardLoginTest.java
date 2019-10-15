package vn.ducquoc.qa.tool.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Homepage -> Login ( nmt.cancer@yopmail.com/tnm@1234 ) https://beecat.myshopify.com
 * <br></br>
 * This test case will set text and login only.
 * <br></br>
 * Driver Chrome: https://chromedriver.chromium.org/downloads https://chromedriver.storage.googleapis.com/index.html
 */
public class DashboardLoginTest {

    public static final String HOME_WITH_SLASH = System.getProperty("user.home") + java.io.File.separator;
    public static final String TRAINING_REPO_PATH = HOME_WITH_SLASH + "github/fresher-training/"; //"/Users/ducquoc/github/fresher-training/";
    public static final String MIDDLE_PROJ_RESOURCES_PATH = "qa-automation-browser/src/main/resources/mac64/";
    public static final String MIDDLE_DOWNLOADS_PATH = "Downloads/";
    // some long path for ppl who are not used to xpath (or just copy from somewhere )
    public static final String LONG_LENGTHY_PATH_SIGN_IN = "/blah/blah/very/very/long/path/to/this/p[2]/input";
    public static final String LONG_LENGTHY_PATH_LOGIN_LINK = "/blah/very/long/path/to/some/customer_login_link";

    @org.junit.Test
    public void auto_login_tnm_cancer_system() throws Exception {
        WebDriver browser;
        //Browser's webdriver *requires* you to specify its location.
//        System.setProperty("webdriver.chrome.driver", "/Users/ducquoc/github/fresher-training/"
//                + "qa-automation-browser/src/main/resources/mac64/chromedriver_2.44_69-71"); //driver Chrome 69-71
        String executableDriverName = "chromedriver_2.44_69-71";
        System.setProperty("webdriver.chrome.driver", TRAINING_REPO_PATH
                + MIDDLE_PROJ_RESOURCES_PATH + executableDriverName); //driver Chrome 69-71
        browser = new org.openqa.selenium.chrome.ChromeDriver(); //http://chromedriver.storage.googleapis.com/index.html
        // Executable might be different on MacOSX,Linux,Win. Firefox: https://github.com/mozilla/geckodriver/releases
//        executableDriverName = "geckodriver";
//        System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + File.separator
//                + MIDDLE_DOWNLOADS_PATH + executableDriverName); //driver Chrome 69-71

        browser.get("https://beecat.myshopify.com");
        Thread.sleep(3000);

        WebElement loginLink = browser.findElement(By.id("customer_login_link"));
        //org.junit.Assert.assertTrue((loginLink.isDisplayed()));
        loginLink.click();
        Thread.sleep(2000);

        WebElement emailTxt = browser.findElement(By.id("CustomerEmail"));
        emailTxt.sendKeys("nmt.cancer@yopmail.com");
        Thread.sleep(500);
        WebElement passwordField = browser.findElement(By.id("CustomerPassword"));
        passwordField.sendKeys("tnm@1234");
        Thread.sleep(500);
        WebElement loginBtn = browser.findElement(By.xpath("//*[@id=\"customer_login\"]/p[2]/input"));
        loginBtn.click();
        Thread.sleep(5000);

//        WebElement logoutLink = browser.findElement(By.id("customer_logout_link"));
//        logoutLink.click();
//        Thread.sleep(3500);

        //bonus - automation open browser using BrowserUtil
        vn.ducquoc.qa.tool.AutomationBrowser.randomOpenBrowser(new java.util.Random().nextInt(),
                "https://phatgiao.org.vn/tu-dien-phat-hoc-online/ta-hoa-hien-phat-k41295.html",
                "http://anphat.org/dictionary/detail/tu-dien-phat-quang/2/T/55464/ta-hoa-hien-phat/1");
        Thread.sleep(2500);

        browser.close();
        Thread.sleep(1500);
    }

}
