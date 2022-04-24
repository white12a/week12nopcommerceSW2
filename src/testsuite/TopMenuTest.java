package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]"));
        verifyText("Computers",By.xpath("//div[@class='page-title']/h1"),"Computers Text Validation");
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]"));
        verifyText("Electronics",By.xpath("//div[@class='page-title']/h1"),"Electronics text Validation");
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]"));
        verifyText("Apparel",By.xpath("//div[@class='page-title']/h1"),"Apparel text Validation");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]"));
        verifyText("Digital downloads",By.xpath("//div[@class='page-title']/h1"),"Digital download text validation");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]"));
        verifyText("Books",By.xpath("//div[@class='page-title']/h1"),"Books text validation");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]"));
        verifyText("Jewelry",By.xpath("//div[@class='page-title']/h1"),"Jewelry text validation");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]"));
        verifyText("Gift Cards",By.xpath("//div[@class='page-title']/h1"),"Gift cards Text validation");
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
