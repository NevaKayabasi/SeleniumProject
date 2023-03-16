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

public class XYZBank {

 public WebDriver driver;


 @BeforeMethod
 public void setUpMethod(){

  driver = WebDriverFactory.getDriver("chrome");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
 }

 @Test

 public void bank_manager_logIn(){

  BrowserUtils.sleep(1);
  WebElement bankManagerButton = driver.findElement(By.xpath("//button[@ng-click='manager()']"));
  bankManagerButton.click();


   BrowserUtils.sleep(1);
   WebElement addCustomerButton = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
   addCustomerButton.click();


   BrowserUtils.sleep(1);
   WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
   firstName.sendKeys("Bahadir Leo");


   BrowserUtils.sleep(1);
   WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
   lastName.sendKeys("Kayabasi");


  BrowserUtils.sleep(1);
  WebElement postCode = driver.findElement(By.xpath("//input[@placeholder='Post Code']"));
  postCode.sendKeys("24750");


  BrowserUtils.sleep(1);
  WebElement addCustomer = driver.findElement(By.xpath("//button[@type='submit']"));
  addCustomer.click();

  Alert alert = driver.switchTo().alert();
  alert.accept();


 driver.close();

 }

@Test
 public void openAccount(){

 BrowserUtils.sleep(1);
 WebElement bankManagerButton = driver.findElement(By.xpath("//button[@ng-click='manager()']"));
 bankManagerButton.click();

 WebElement open_account = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
 open_account.click();

 Select customerName = new Select(driver.findElement(By.id("userSelect")));
 customerName.selectByVisibleText("Hermoine Granger");

 Select currency = new Select(driver.findElement(By.id("currency")));
 currency.selectByVisibleText("Pound");


WebElement processButton = driver.findElement(By.xpath("//button[@type='submit']"));
processButton.click();

BrowserUtils.sleep(1);
Alert alert = driver.switchTo().alert();
alert.accept();











}




















}
