package vn.ducquoc.qa.tool.selenium;

import vn.ducquoc.jutil.BrowserUtil;

/**
 * Homepage -> Login ( nmt.cancer@yopmail.com/tnm@1234 ) https://beecat.myshopify.com
 * <br></br>
 * This test case will set text and login only.
 */
public class DashboardLogin {

    public static void main(String[] args) {
        setText("https://beecat.myshopify.com", "nmt.cancer@yopmail.com", "tnm@1234");
    }

    public static void setText(String url, String username, String password) {
        //strange path, hard-coded, might break automation if changed
        System.out.println(String.format(" %s : Ta Luc Da Luc", username));
        BrowserUtil.openUrl(url);
    }

}
