package vn.ducquoc.qa.tool.selenium;

//import vn.ducquoc.jutil.BrowserUtil;
import vn.ducquoc.qa.tool.AutomationBrowser;

/**
 * TNM classification of cancer. T (not danger) might be mis-understood as N (danger).
 * <br></br>
 * This test case will try to logout 3 different accounts (after login).
 * <br></br>
 * Driver Chrome: https://chromedriver.chromium.org/downloads
 */
public class NmtLogout {

    public static void main(String[] args) throws Exception {
//        logOut("https://beecat.myshopify.com", "nmt.cancer@yopmail.com", "tnm@1234");
        new NmtLogout().auto_logout_3_accounts();
    }

    public static void logOut(String url, String username, String password) {
        //strange path, hard-coded, might break automation if changed
//        System.out.println(String.format(" %s : Ta Luc Da Luc", username));
//        BrowserUtil.openUrl(url);
        AutomationBrowser.randomOpenBrowser(new java.util.Random().nextInt(),
                "https://phatgiao.org.vn/tu-dien-phat-hoc-online/ta-hoa-hien-phat-k41295.html",
                "http://anphat.org/dictionary/detail/tu-dien-phat-quang/2/T/55464/ta-hoa-hien-phat/1");
    }

    @org.junit.Test
    public void auto_logout_3_accounts() throws Exception {
        org.openqa.selenium.WebDriver browser;
        //Browser's webdriver *requires* you to specify its location.
        System.setProperty("webdriver.chrome.driver", "/Users/ducquoc/github/fresher-training/"
                + "qa-automation-browser/src/main/resources/mac64/chromedriver_2.44_69-71"); //driver Chrome 69-71
        browser = new org.openqa.selenium.chrome.ChromeDriver();
        // note that executable might be different on MacOSX,Linux,Windows

        browser.get("https://beecat.myshopify.com");
        Thread.sleep(3000);

        tryClickLink(browser, "customer_login_link");
        loginAuto(browser, "nmt.cancer@yopmail.com", "tnm@1234");
        Thread.sleep(2000);
        logoutTryHard(browser);

        tryClickLink(browser, "customer_login_link");
        loginAuto(browser, "duc.quoc@yopmail.com", "123456");
        Thread.sleep(2000);
        logoutTryHard(browser);

        tryClickLink(browser, "customer_login_link");
        loginAuto(browser, "ducquoc.vn@yopmail.com", "Test@1234");
        Thread.sleep(2000);
        logoutTryHard(browser);

        tryClickLink(browser, "customer_register_link");
        Thread.sleep(2500);

        //bonus
        logOut("https://beecat.myshopify.com", "nmt.cancer@yopmail.com", "tnm@1234");
        Thread.sleep(1800);

        browser.close();
        Thread.sleep(1500);
    }

    // smaller methods for re-use , can refactor into a Base class
    private void loginAuto(org.openqa.selenium.WebDriver browser, String email, String passwd) throws InterruptedException {
        org.openqa.selenium.WebElement emailTxt = browser.findElement(org.openqa.selenium.By.id("CustomerEmail"));
        if (emailTxt.isDisplayed() && emailTxt.isEnabled()) {
            emailTxt.sendKeys(email);
        }
        Thread.sleep(800);
        org.openqa.selenium.WebElement passwordField = browser.findElement(org.openqa.selenium.By.id("CustomerPassword"));
        if (passwordField.isDisplayed() && passwordField.isEnabled()) {
            passwordField.sendKeys(passwd);
        }
        Thread.sleep(1000);
        org.openqa.selenium.WebElement loginBtn = browser.findElement(org.openqa.selenium.By.xpath("//*[@id=\"customer_login\"]/p[2]/input"));
        if (loginBtn.isDisplayed() && loginBtn.isEnabled()) {
            loginBtn.click();
        }
        Thread.sleep(3000);
    }

    private void logoutTryHard(org.openqa.selenium.WebDriver browser) throws InterruptedException {
        Thread.sleep(500);
        org.openqa.selenium.WebElement logoutLink = browser.findElement(org.openqa.selenium.By.id("customer_logout_link"));
        logoutLink.click();
        Thread.sleep(3500);
    }

    private void tryClickLink(org.openqa.selenium.WebDriver browser, String idLink) throws InterruptedException {
        org.openqa.selenium.WebElement loginLink = browser.findElement(org.openqa.selenium.By.id(idLink));
        if (loginLink.isDisplayed() && loginLink.isEnabled()) {
            //org.junit.Assert.assertTrue((loginLink.isDisplayed()));
            loginLink.click();
            Thread.sleep(2500);
        }
    }

}
