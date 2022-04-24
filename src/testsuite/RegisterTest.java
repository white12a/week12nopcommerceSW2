package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.Random;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        clickOnElement(By.linkText("Register"));
        verifyText("Register", By.linkText("Register"), "Register Text display");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        clickOnElement(By.linkText("Register"));
        clickOnElement(By.id("gender-male"));
        sendTextToElement(By.id("FirstName"), "mark");
        sendTextToElement(By.id("LastName"), "tiger");
        selectByIndexFromDropDown(By.name("DateOfBirthDay"), 8);
        selectByVisibleTextFromDropDown(By.name("DateOfBirthMonth"), "April");
        selectByVisibleTextFromDropDown(By.name("DateOfBirthYear"), "2013");
        WebElement emailField = driver.findElement(By.id("Email"));// email field locator
        emailField.click();// click email field
        Random randomGenerator = new Random();// random generator class
        int randomInt = randomGenerator.nextInt(1000);
        emailField.sendKeys("username" + randomInt + "@gmail.com");// creating random email generator
        sendTextToElement(By.id("Password"), "1234567");
        sendTextToElement(By.id("ConfirmPassword"), "1234567");
        clickOnElement(By.id("register-button"));
        verifyText("Your registration completed", By.xpath("//div[@class='page-body']//div[@class='result']"), "Registration text");
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
