package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        //open the browser
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Find the register elements
        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        //this is from documents
        String expectedRegisterLink = "Register";
        //find the welcome text element and get the text
        String actualRegisterLink = getTextFromElement(By.xpath("//div[@class='page-title']"));
        //Verify the text ‘Register’ with assert
        verifyTextMessage(expectedRegisterLink,actualRegisterLink);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //Find the register elements
        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        //Select gender radio button
        clickOnElement(By.id("gender-female"));
        //Enter First name with name
        sendTextToElement(By.name("FirstName"),"Megha");
        //Enter last name with css selector
        sendTextToElement(By.cssSelector("input#LastName"),"Jadvani");
        //Select Date of birth using select class
        selectByValueFromDropDown(By.name("DateOfBirthDay"),"26");
        //Select month of birth using select class
        selectByValueFromDropDown(By.name("DateOfBirthMonth"),"7");
        //Select year of birth using select class
        selectByValueFromDropDown(By.name("DateOfBirthYear"),"1998");
        // Enter Email address using xpath
        sendTextToElement(By.xpath("//input[@id='Email']"),"djadvani12345@gmail.com");
        //Enter Password using id
        sendTextToElement(By.id("Password"),"megha1234");
        //Enter confirm Password using id
        sendTextToElement(By.id("ConfirmPassword"),"megha1234");
        //Click on REGISTER button
        clickOnElement(By.id("register-button"));
        String expectedRegister = "Your registration completed";
        String actualregister = getTextFromElement(By.cssSelector("div.result"));

        //variable actual and expected message
        verifyTextMessage(expectedRegister,actualregister);
    }


    @After
    public void clearBrowser(){
        //close the browser
       //closeBrowser();
    }
}
