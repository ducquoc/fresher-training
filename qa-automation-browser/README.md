QA Tool 
=== 

Reference from jutil-dq: 

https://github.com/ducquoc/jutil-dq/blob/master/jutil/src/main/java/vn/ducquoc/jutil/BrowserUtil.java
```
mvn compile exec:java -Dexec.mainClass=vn.ducquoc.qa.tool.AutomationBrowser
```
(sample with Selenium java lib is: DashboardLogin/DashboardLoginTest, NmtLogout/NmtLogoutTest)

## Execution Automation
```
mvn test -Dtest=DashboardLoginTest

mvn compile exec:java -Dexec.mainClass=vn.ducquoc.qa.tool.selenium.DashboardLogin

mvn compile exec:java -Dexec.mainClass=vn.ducquoc.qa.tool.selenium.NmtLogout

mvn test -Dtest=NmtLogoutTest
... (etc)
```
You might need to download the executable driver to the `src/main/resources` folder 
respectively (to your Operating System: Windows, MacOSX, Linux), or just copy into 
$HOME/Downloads/ folder, and rename the path in corresponding source file before running.
```
Driver Chrome: https://chromedriver.chromium.org/downloads https://chromedriver.storage.googleapis.com/index.html
Driver Firefox: https://github.com/mozilla/geckodriver/releases/
Driver IE: https://docs.seleniumhq.org/download/
```

## See also

https://viblo.asia/p/automation-test-with-selenium-nwmGyMogGoW

https://saucelabs.com/resources/articles/getting-started-with-webdriver-in-java-using-intellij-on-osx

https://saucelabs.com/resources/articles/getting-started-with-webdriver-selenium-for-java-in-eclipse
```
https://www.youtube.com/watch?v=trA2BAfR6hU
```
https://dzone.com/articles/selenium-java-tutorial-how-to-test-login-process

https://www.seleniumhq.org/selenium-ide/docs/en/introduction/control-flow/

https://is.gd/automation_selenium_commit_png ![AutomationSeleniumCommit](https://is.gd/automation_selenium_commit_png)

https://viblo.asia/p/huong-dan-tao-test-case-co-ban-su-dung-selenium-ide-6J3ZgDkLlmB

...
