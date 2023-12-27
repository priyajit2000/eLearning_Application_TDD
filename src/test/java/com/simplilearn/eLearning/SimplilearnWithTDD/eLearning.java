package com.simplilearn.eLearning.SimplilearnWithTDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class eLearning {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testWebsiteTitle() {
   
        driver.get("https://www.simplilearn.com/");

       
        Assert.assertEquals(driver.getTitle(), "Simplilearn | Online Courses - Bootcamp & Certification Platform");
    }

    
    @AfterClass
    public void tearDown() {
       
        if (driver != null) {
            //driver.quit();
        }
    }
}
