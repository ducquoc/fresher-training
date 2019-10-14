package vn.ducquoc.qa.tool.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Homepage -> Login ( nmt.cancer@yopmail.com/tnm@1234 ) https://beecat.myshopify.com
 * <br></br>
 * This test case will set text and login only.
 */
public class DashboardLoginTest {

    public static final String LONG_LENGTHY_PATH_SIGN_IN = "/blah/blah/very/very/long/path/to/this/p[2]/input";
    public static final String LONG_LENGTHY_PATH_LOGIN_LINK = "/blah/very/long/path/to/some/customer_login_link";

    @org.junit.Test
    public void automation_browser_login_page() throws Exception {
        WebDriver browser;
        //Browser's webdriver *requires* you to specify its location.
        System.setProperty("webdriver.chrome.driver", "/Users/ducquoc/github/fresher-training/"
                + "qa-automation-browser/src/main/resources/mac64/chromedriver_2.44_69-71");
        browser = new ChromeDriver(); // note that executable might be different on MacOSX,Linux,Windows

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
        Thread.sleep(4000);

//        WebElement logoutLink = browser.findElement(By.id("customer_logout_link"));
//        logoutLink.click();
//        Thread.sleep(3500);
        browser.close();
        Thread.sleep(1500);
    }

}
