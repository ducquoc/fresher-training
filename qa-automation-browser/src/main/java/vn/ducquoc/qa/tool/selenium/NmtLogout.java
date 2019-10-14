package vn.ducquoc.qa.tool.selenium;

import vn.ducquoc.jutil.BrowserUtil;

/**
 * TNM classification of cancer. T (not danger) might be mis-understood as N (danger).
 * <br></br>
 * This test case will try to logout 3 different users (after login).
 */
public class NmtLogout {

    public static void main(String[] args) {
        logOut("https://beecat.myshopify.com", "nmt.cancer@yopmail.com", "tnm@1234");
    }

    public static void logOut(String url, String username, String password) {
        //strange path, hard-coded, might break automation if changed
        System.out.println(String.format(" %s : Ta Luc Da Luc", username));
        BrowserUtil.openUrl(url);
    }

}
