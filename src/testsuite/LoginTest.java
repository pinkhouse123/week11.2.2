package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter username and password
        //driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        sendTextToElement(By.xpath("//input[@id='txtUsername']"), "Admin");
        //driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        sendTextToElement(By.xpath("//input[@id='txtPassword']"), "admin123");
        // Click login button
        //driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        clickOnElement(By.xpath("//input[@id='btnLogin']"));
        //driver.findElement(By.xpath("//a[@id='welcome']")).click();
        clickOnElement(By.xpath("//a[@id='welcome']"));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}



