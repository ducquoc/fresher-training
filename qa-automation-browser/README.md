QA Tool 
=== 

Reference from jutil-dq: 

https://github.com/ducquoc/jutil-dq/blob/master/jutil/src/main/java/vn/ducquoc/jutil/BrowserUtil.java
```
mvn compile exec:java -Dexec.mainClass=vn.ducquoc.qa.tool.DashboardLogin
```
(sample with Selenium java lib is: DashboardLogin/DashboardLoginTest, NmtLogout/NmtLogoutTest)

## Execution Automation
```
mvn compile exec:java -Dexec.mainClass=vn.ducquoc.qa.tool.AutomationBrowser

mvn compile exec:java -Dexec.mainClass=vn.ducquoc.qa.tool.selenium.DashboardLogin

... (etc)
```

## See also

https://viblo.asia/p/automation-test-with-selenium-nwmGyMogGoW

https://saucelabs.com/resources/articles/getting-started-with-webdriver-in-java-using-intellij-on-osx

https://saucelabs.com/resources/articles/getting-started-with-webdriver-selenium-for-java-in-eclipse
```
mvn compile exec:java -Dexec.mainClass=vn.ducquoc.qa.tool.selenium.NmtLogout
```
https://dzone.com/articles/selenium-java-tutorial-how-to-test-login-process

https://www.seleniumhq.org/selenium-ide/docs/en/introduction/control-flow/

https://is.gd/automation_selenium_commit_png

