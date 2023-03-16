package com.cydeo.AutomationPractices;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Demo_applitools {
    @Test

    public void applitools(){


    WebDriver driver = WebDriverFactory.getDriver("Chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://demo.applitools.com/");


    BrowserUtils.sleep(1);
    WebElement inputUsername = driver.findElement(By.xpath("//input[@id='username']"));
    inputUsername.sendKeys("kayabasineva");

    BrowserUtils.sleep(1);
    WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
    inputPassword.sendKeys("1234567");

    BrowserUtils.sleep(1);
    WebElement SignIn = driver.findElement(By.linkText("Sign in"));
    SignIn.click();


   BrowserUtils.verifyTitle(driver,"ACME demo app");

}
 }