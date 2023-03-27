package com.cydeo.tests.day7_webtales_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class  T3_CRM_Login extends TestBase {


    @Test
    public void crm_login_test() {


//2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

//3. Enter valid username

        WebElement InputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        InputUsername.sendKeys("helpdesk1@cybertekschool.com");
//4. Enter valid password

        WebElement InputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        InputPassword.sendKeys("UserUser");

//5. Click to `Log In` button

        WebElement logIn = driver.findElement(By.xpath("//input[@value='Log In']"));
        logIn.click();
//6. Verify title is as expected:

        BrowserUtils.verifyTitle(driver, "My tasks");


    }

    @Test
    public void crm_login_test_2() {


//2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        //4. Enter valid password
        //5. Click to `Log In` button

// calling my utility method to log in helpdesk
        CRM_Utilities.crm_login(driver);

//6. Verify title is as expected:
//Expected : "Portal
        BrowserUtils.verifyTitle(driver, "My tasks");


    }

    @Test
    public void crm_login_test_3() {


//2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        //4. Enter valid password
        //5. Click to `Log In` button

// calling my utility method to log in helpdesk
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");

//6. Verify title is as expected:
//Expected : "Portal
        BrowserUtils.verifyTitle(driver, "Portal");

    }
}
