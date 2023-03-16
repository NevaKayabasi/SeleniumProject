package com.cydeo.AutomationPractices;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class XYZ_Bank {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/");
    }

    @Test
    public void add_Costumer() {

//Click bank manager log in
        BrowserUtils.sleep(1);
        WebElement BankManagerLogIn = driver.findElement(By.cssSelector("button[ng-click='manager()']"));
        BankManagerLogIn.click();


//Click Add costumer

        BrowserUtils.sleep(1);
        WebElement addCostumer = driver.findElement(By.cssSelector("button[ng-class='btnClass1']"));
        addCostumer.click();


//Fill the application
//write first name
        BrowserUtils.sleep(1);
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Neva");

//Write last name
        BrowserUtils.sleep(1);
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Kayabasi");

//write postcode
        BrowserUtils.sleep(1);
        WebElement postCode = driver.findElement(By.xpath("//input[@placeholder='Post Code']"));
        postCode.sendKeys("123456");

//click add costumer button
        BrowserUtils.sleep(1);
        WebElement addCostumerButton = driver.findElement(By.xpath("//button[@type='submit']"));
        addCostumerButton.click();

//we need to switch driver's focus to alert
        BrowserUtils.sleep(1);
//press Ok button
        Alert alert = driver.switchTo().alert();

        alert.accept();
    }


    @Test

    public void open_account(){


        BrowserUtils.sleep(1);
        WebElement BankManagerLogIn = driver.findElement(By.cssSelector("button[ng-click='manager()']"));
        BankManagerLogIn.click();

        BrowserUtils.sleep(1);
        WebElement openAccount = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        openAccount.click();

        BrowserUtils.sleep(1);
        Select costumer = new Select(driver.findElement(By.xpath("//select[@id='userSelect']")));
        costumer.selectByVisibleText("Harry Potter");

        BrowserUtils.sleep(1);
        Select currency = new Select(driver.findElement(By.id("currency")));
        currency.selectByValue("Rupee");

        BrowserUtils.sleep(1);
        WebElement processButton = driver.findElement(By.xpath("//button[@type='submit']"));
        processButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


}








