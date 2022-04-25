package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //find login link and click on login link
        clickOnElement(By.linkText("Log in"));
        //this os form requirement
        String expectedMessage = "Welcome, Please Sign In!";
        //find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']"));


        //variable actual and expected message
        verifyTextMessage(expectedMessage,actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find login link and click on login link
        clickOnElement(By.linkText("Log in"));
        //find the element of email and send the email key
        sendTextToElement(By.xpath("//input[@id='Email']"),"meghakansagara123@gmail.com");
        //find the element of password and send the password key
        sendTextToElement(By.id("Password"),"megha1234");
        //click on loging button using elements
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //this os form requirement
        String expectedLogOutText = "Log out";
        //find the welcome text element and get the text
        String actualLogOutText = getTextFromElement(By.linkText("Log out"));
        //Verify the text error message with assert
        verifyTextMessage(expectedLogOutText,actualLogOutText);
    }

    @Test
    public void verifyTheErrorMessage(){
        //find login link and click on login link
        clickOnElement(By.linkText("Log in"));
        //find the element of email and send the email key
        sendTextToElement(By.xpath("//input[@id='Email']"),"prime@gmail.com");
        //find the element of password and send the password key
        sendTextToElement(By.xpath("//input[@id='Password']"),"prime123");
        //click on loging button using elements
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //this os form requirement
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //find the welcome text element and get the text
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        //Verify the text error message with assert
        verifyTextMessage(expectedErrorMessage,actualErrorMessage);

    }

    @After
    public void tearDown(){
        //closeBrowser();
    }


}
