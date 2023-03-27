package com.cydeo.tests.day10_Upload_Actions_JSexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){

//TC #2 Upload Test
//1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");


//2. Find some small file from your computer, and get the path of it.

        String path = "C:\\Users\\kayab\\Downloads\\İskandinav-dekorasyonu_120e9.jpeg";

//3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload")); // button a kendimiz tiklamizyoruz javascript alert cikiyor
        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();



//4. Assert:
//-File uploaded text is displayed on the page

        WebElement fileUploadedHeader =Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());

    }
}
