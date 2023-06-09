package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    this method will log in with helpdesk1@cybertekschool.com
    user when it is called
     */
    public static void crm_login(WebDriver driver){
        //3. Enter valid username

        WebElement InputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        InputUsername .sendKeys("helpdesk1@cybertekschool.com");
//4. Enter valid password

        WebElement InputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        InputPassword.sendKeys("UserUser");

//5. Click to `Log In` button

        WebElement logIn = driver.findElement(By.xpath("//input[@value='Log In']"));
        logIn.click();
    }


    public static void crm_login(WebDriver driver,String username ,String password){
        //3. Enter valid username

        WebElement InputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        InputUsername.sendKeys(username);
//4. Enter valid password

        WebElement InputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        InputPassword.sendKeys(password);

//5. Click to `Log In` button

        WebElement logIn = driver.findElement(By.xpath("//input[@value='Log In']"));
        logIn.click();
    }


}
