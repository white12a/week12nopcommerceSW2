package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));//click on element
        verifyText("Welcome, Please Sign In!",By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]\n"),"Navigate to loginPage");
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"), "lee12@yahoo.com");
        sendTextToElement(By.id("Password"),"123456");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        verifyText("Log out",By.className("ico-logout"),"Logout display text");
    }
    @Test
    public void verifyTheErrorMessage() {
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"), "lee@yahoo.com");
        sendTextToElement(By.id("Password"),"12345");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        verifyText("Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found",By.xpath("//form[@method='post']//div[@class='message-error validation-summary-errors']"),"Error message not validate");

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
