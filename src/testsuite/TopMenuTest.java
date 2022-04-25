package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        //open the browser
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Find the Computers elements
        //click on the ‘Computers’ link
        clickOnElement(By.linkText("Computers"));
        //this is from documents
        String expectedComputersLink = "Computers";
        //find the welcome text element and get the text
        String actualComputersLink = getTextFromElement(By.cssSelector("div.page-title"));
        //Verify the text ‘Computers’ with assert
        verifyTextMessage(expectedComputersLink,actualComputersLink);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Find the Computers elements
        //click on the ‘Electronics’ link
        clickOnElement(By.linkText("Electronics"));
        //this is from documents
        String expectedElectronicsLink = "Electronics";
        //find the welcome text element and get the text
        String actualElectronicsLink = getTextFromElement(By.className("page-title"));
        //Verify the text ‘Electronics’ with assert
        verifyTextMessage(expectedElectronicsLink,actualElectronicsLink);
        //Find the Electronics elements
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Find the Apparel elements
        //click on the ‘Apparel’ link
        clickOnElement(By.linkText("Apparel"));
        //this is from documents
        String expectedApparelLink = "Apparel";
        //find the welcome text element and get the text
        String actualApparelLink = getTextFromElement(By.className("page-title"));
        //Verify the text ‘Apparel’ with assert
        verifyTextMessage(expectedApparelLink,actualApparelLink);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //Find the Digital downloads elements
        //click on the ‘DigitalDownloads’ link
        clickOnElement(By.linkText("Digital downloads"));
        //this is from documents
        String expectedDigitalDownloadsLink = "Digital downloads";
        //find the welcome text element and get the text
        String actualDigitalDownloadsLink = getTextFromElement(By.xpath("//div[@class='page-title']"));
        //Verify the text ‘Digital downloads’ with assert
        Assert.assertEquals(expectedDigitalDownloadsLink,actualDigitalDownloadsLink);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //Find the Books elements
        //click on the ‘Books’ link
        clickOnElement(By.linkText("Books"));
        //this is from documents
        String expectedBooksLink = "Books";
        //find the welcome text element and get the text
        String actualBooksLink = getTextFromElement(By.xpath("//div[@class='page-title']"));
        //Verify the text ‘Books’ with assert
        verifyTextMessage(expectedBooksLink,actualBooksLink);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //Find the Jewelry elements
        //click on the ‘Jewelry’ link
        clickOnElement(By.linkText("Jewelry"));
        //this is from documents
        String expectedJewelrysLink = "Jewelry";
        //find the welcome text element and get the text
        String actualJewelryLink = getTextFromElement(By.cssSelector("div.page-title"));
        //Verify the text ‘Jewelry’ with assert
        verifyTextMessage(expectedJewelrysLink,actualJewelryLink);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //Find the Gift Cards elements
        //click on the ‘Gift Cards’ link
        clickOnElement(By.linkText("Gift Cards"));
        //this is from documents
        String expectedGiftCardsLink = "Gift Cards";
        //find the welcome text element and get the text
        String actualGiftCardsLink= getTextFromElement(By.cssSelector("div.page-title"));
        //Verify the text ‘Gift Cards’ with assert
        verifyTextMessage(expectedGiftCardsLink,actualGiftCardsLink);
    }

    @After
    public void clearBrowser(){
        //close the browser
      // closeBrowser();
    }
}
