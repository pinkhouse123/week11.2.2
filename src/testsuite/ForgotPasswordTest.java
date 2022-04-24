package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        // Click on forgot your password link
        //driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}




