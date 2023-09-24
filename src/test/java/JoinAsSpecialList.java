import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinAsSpecialList extends Home_page_test{


    @Story("Join As Specialist button is displayed")
    @Description("Join As Specialist button is displayed on navbar")
    @Test(description = "Join As Specialist button should displayed", priority = 1)
    public void joinAsSpecialistButtonIsDisplayed() {
        WebElement joinAsSpecialListButton = driver.findElement(By.xpath("//*[@id='navbarContent']/button"));
        Assert.assertTrue(joinAsSpecialListButton.isDisplayed());
    }

    @Story("Join As Specialist button is clickable")
    @Description("the Specialist button on navBar should Clickable and open form menu")
    @Test(description = "Join As Specialist button should clickable", priority = 2)
    public void joinAsSpecialistButtonIsClickable() {
        WebElement joinAsSpecialListButton = driver.findElement(By.xpath("//*[@id='navbarContent']/button"));
        joinAsSpecialListButton.click();
        WebElement inputField = driver.findElement(By.cssSelector("#joinUsModal form input[name='your-name']"));
        Assert.assertTrue(inputField.isDisplayed());
    }

    @Story("Close Join As Specialist Button is clickable")
    @Description("click on icon and ensure the form menu will disappear")
    @Test(description = "Close Join As Specialist Button is clickable", priority = 3)
    public void closeButtonOnFormMenuIsClickable() {
        WebElement closeButton = driver.findElement(By.xpath("//*[@id=\"joinUsModal\"]/div/div/button/span"));
        closeButton.click();
        WebElement formMenu = driver.findElement(By.xpath("/html/body/div[4]/div/div"));
        Assert.assertFalse(formMenu.isDisplayed());

    }


    @Story("Filling all form")
    @Description("verify to fill all inputs filed with fake data")
    @Test(description = "Filling all form", priority = 4)
    public void joinAsSpecialListIsEditable()  {

        WebElement joinAsSpecialListButton = driver.findElement(By.xpath("//*[@id='navbarContent']/button"));
        joinAsSpecialListButton.click();

        WebElement yourNameInputField = driver.findElement(By.cssSelector("#joinUsModal form input[name='your-name']"));
        String fakeNameData = Faker.instance().name().name();
        yourNameInputField.sendKeys(fakeNameData);


        WebElement phoneNumberInputField = driver.findElement(By.cssSelector("#joinUsModal form input[name='your-phone']"));
        String fakeNumberData = Faker.instance().phoneNumber().phoneNumber();
        phoneNumberInputField.sendKeys(fakeNumberData);


        WebElement scientificDegreeInputField = driver.findElement(By.cssSelector("#joinUsModal form input[name='degree']"));
        String fakeDegreeData = Faker.instance().address().city();
        scientificDegreeInputField.sendKeys(fakeDegreeData);


        WebElement scientificSpecializationInputField = driver.findElement(By.cssSelector("#joinUsModal form input[name='specialization']"));
        String fakeScientificSpecialization = Faker.instance().company().name();
        scientificSpecializationInputField.sendKeys(fakeScientificSpecialization);


        WebElement experienceYearsInputField = driver.findElement(By.cssSelector("#joinUsModal form input[name='experience']"));
        String  fakeExperienceYearsNumber = Faker.instance().number().numberBetween(1,10) + "";
        experienceYearsInputField.sendKeys(fakeExperienceYearsNumber);

        WebElement socialMediaActivityInputField = driver.findElement(By.cssSelector("#joinUsModal form input[name='socialmedia']"));
        String  fakeText = Faker.instance().company().name();
        socialMediaActivityInputField.sendKeys(fakeText);



    }
    @Story("the send button should displayed")
    @Description("verify the send button is displayed on form menu")
    @Test(description = "the send button should displayed", priority = 5)
    public void sendRequestButtonIsDisplayed (){
        WebElement sendButton = driver.findElement(By.xpath("(//input[@value='إرسال'])[2]"));
        Assert.assertTrue(sendButton.isDisplayed());
    }
    @Story("the send button should clickable")
    @Description("verify the send button is clickable on form menu and displayed success message after click")
    @Test(description = "the send button should clickable on form menu", priority = 6)
    public void sendRequestButtonIsClickable (){
        WebElement sendButton = driver.findElement(By.xpath("(//input[@value='إرسال'])[2]"));
        sendButton.click();
        WebElement successMessageElement = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/form/div[7]"));
        String message = successMessageElement.getText();
        Assert.assertEquals(successMessageElement, "شكراً لك. لقد تم الإرسال بنجاح.");



    }

}
