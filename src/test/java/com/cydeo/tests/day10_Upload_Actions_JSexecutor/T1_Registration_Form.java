package com.cydeo.tests.day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.Configuration_Reader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){

//TC#1: Registration form confirmation
//Note: Use JavaFaker OR read from configuration.properties file when possible.
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form

        Driver.getDriver().get(Configuration_Reader.getProperty("registration.form.url"));

        //Create JavaFaker object to get values
        Faker faker = new Faker();

//3. Enter first name
        WebElement inputFirstname = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstname.sendKeys(faker.name().firstName());

//4. Enter last name
        WebElement inputLastname = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastname.sendKeys(faker.name().lastName());

//5. Enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUsername.sendKeys(faker.name().username().replaceAll(".",""));

        String user = (faker.bothify("helpdesk####"));
        inputUsername.sendKeys(user);

//6. Enter email address
        WebElement emailAddress = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailAddress.sendKeys( user + "@gmail.com");

//7. Enter password
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.numerify("#########"));
                                        // ya da direkt "1234567899" faker a gerek olmadan
        //faker().internet().password();

//8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));

//9. Select a gender from radio buttons

        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

//10.Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004, 1920)
        inputBirthday.sendKeys("03/08/2000");

 //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

//12.Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

//13.Select programming language from checkboxes
//14.Click to sign up button
//15.Verify success message “You’ve successfully completed registration.” is
//displayed.






    }




}
