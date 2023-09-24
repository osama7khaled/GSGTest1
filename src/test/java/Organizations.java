import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Organizations extends Home_page_test{
    Faker faker = new Faker();

    @Story("Open Organizations Page")
    @Description("when click on Organizations button on navbar should able to navigate to Organizations page and ensure to display the title of new page")
    @Test(description = "Organizations button should clickable", priority = 1)
    public void openOrganizationsPage() {
        WebElement button = driver.findElement(By.xpath("//*[@title = 'المنظمات']"));
        button.click();
        WebElement OrganizationsTitle = driver.findElement(By.xpath("(//*[contains(text() , 'عطاء وإنتاجية الموظف تبدأ من الصحة النفسية')])[1]"));
        Assert.assertTrue(OrganizationsTitle.isDisplayed());
    }

    @Story("The title should Displayed")
    @Description(" Verify The Organizations title is Displayed on Organizations Page")
    @Test(description = "verify The title is Displayed", priority = 2)
    public void titleOnOrganizationsPageIsDisplayed() {
        WebElement OrganizationsTitle = driver.findElement(By.xpath("(//*[contains(text() , 'عطاء وإنتاجية الموظف تبدأ من الصحة النفسية')])[1]"));
        Assert.assertTrue(OrganizationsTitle.isDisplayed());
    }

    @Story("The Description should Displayed")
    @Description("Verify The Description is Displayed on Organizations Page")
    @Test(description = "The Organizations Description should Displayed", priority = 3)
    public void descriptionOnOrganizationsPageIsDisplayed() {
        WebElement organizationsDescription = driver.findElement(By.xpath("//*[contains(text() , 'في فامكير للمنظمات نساهم بتعزيز صحة موظفيك')]"));
        Assert.assertTrue(organizationsDescription.isDisplayed());

    }

    @Story("the image is displayed")
    @Description("The image in the first section should Displayed on Organizations Page")
    @Test(description = "the image is displayed", priority = 4)
    public void basicImageInOrganizationsIsDisplayed() {
        WebElement organizationsImage = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[2]/div/div[2]/img"));
        Assert.assertTrue(organizationsImage.isDisplayed());
    }


    @Story("the second section title is displayed")
    @Description("the second section title should displayed and equal أثر الصحة النفسية على أداء الموظفين")
    @Test(description = "the second section title should displayed", priority = 5)
    public void titleOrganizationsSectionDisplayed() {
        jse.executeScript("window.scrollBy(0,300)", "");
        WebElement titleSection = driver.findElement(By.xpath("//*[contains(text() , 'أثر الصحة النفسية على أداء الموظفين')]"));
        Assert.assertTrue(titleSection.isDisplayed());
        String getText=titleSection.getText();
        Assert.assertEquals(getText ,"أثر الصحة النفسية على أداء الموظفين");
    }

    @Story("the image of second section is displayed")
    @Description("the image of second section is displayed on Organizations Page")
    @Test(description = "the image of second section should displayed", priority = 6)
    public void imageSectionDisplayed() {
        WebElement imageSection = driver.findElement(By.cssSelector(".kc-elm:nth-child(2) > .kc-elm:nth-child(3) .lazyloaded"));
        Assert.assertTrue(imageSection.isDisplayed());
    }


    @Story("the title of image on second section is displayed")
    @Description("the title of image on second section is displayed in specialList card")
    @Test(description = "the title of image on second section should displayed ", priority = 7)
    public void imageTitleSectionDisplayed() {
        WebElement imageTitleSection = driver.findElement(By.xpath("(//*[contains(text() , 'استمرارية في العطاء')])[2]"));
        Assert.assertTrue(imageTitleSection.isDisplayed());
        String getText = imageTitleSection.getText();
        Assert.assertEquals(getText ,"استمرارية في العطاء");
    }



    @Story("the third section title is displayed")
    @Description("the third section title should displayed and equal عزّز صحة موظفيك النفسية وسجل الآن")
    @Test(description = "the third section title should displayed", priority = 8)
    public void titleOrganizationsSection2Displayed() {
        jse.executeScript("window.scrollBy(0,200)", "");
        WebElement titleSection2 = driver.findElement(By.xpath("//*[contains(text() , 'عزّز صحة موظفيك النفسية وسجل الآن')]"));
        Assert.assertTrue(titleSection2.isDisplayed());
        String getText=titleSection2.getText();
        Assert.assertEquals(getText ,"عزّز صحة موظفيك النفسية وسجل الآن");
    }


    @Story("the request service button should displayed")
    @Description("the request service button on third section should displayed")
    @Test(description = "the request service button should displayed", priority = 9)
    public void theRequestTheServiceButtonIsDisplayed() {
        WebElement RequestTheServiceButton = driver.findElement(By.cssSelector(".btn:nth-child(1)"));
        Assert.assertTrue(RequestTheServiceButton.isDisplayed());

    }

    @Story("the Request service button should be Clickable")
    @Description("the request service button on third section should Clickable and open form menu")
    @Test(description = "the Request service button should be Clickable ", priority = 10)
    public void theRequestTheServiceButtonIsClickable() throws InterruptedException {
        WebElement theRequestTheServiceButton = driver.findElement(By.cssSelector(".btn:nth-child(1)"));
        theRequestTheServiceButton.click();
        WebElement inputField = driver.findElement(By.cssSelector("#formModal form input[name='your-name']"));
        Assert.assertTrue(inputField.isDisplayed());

    }

    @Story("Filling all form")
    @Description("verify to fill all inputs filed with fake data")
    @Test(description = "Filling all form", priority = 11)
    public void requestServiceFormIsEditable()  {


        WebElement yourNameInputField = driver.findElement(By.cssSelector("#formModal form input[name='your-name']"));
        String fakeNameData = Faker.instance().name().name();
        yourNameInputField.sendKeys(fakeNameData);


        WebElement phoneNumberInputField = driver.findElement(By.cssSelector("#formModal form input[name='your-phone']"));
        String fakeNumberData = Faker.instance().phoneNumber().phoneNumber();
        phoneNumberInputField.sendKeys(fakeNumberData);


        WebElement emailInputField = driver.findElement(By.cssSelector("#formModal form input[name='your-email']"));
        String fakeEmailData = faker.internet().emailAddress();
        emailInputField.sendKeys(fakeEmailData);


        WebElement companyNameInputField = driver.findElement(By.cssSelector("#formModal form input[name='your-company']"));
        String fakeCompanyName = Faker.instance().company().name();
        companyNameInputField.sendKeys(fakeCompanyName);


        WebElement numberOfEmployeeInputField = driver.findElement(By.cssSelector("#formModal form input[name='employees']"));
        String  fakeEmployeesNumber = Faker.instance().number().numberBetween(1,10) + "";
        numberOfEmployeeInputField.sendKeys(fakeEmployeesNumber);




    }
    @Story("the send button should displayed")
    @Description("verify the send button is displayed on form menu")
    @Test(description = "the send button should displayed", priority = 12)
    public void sendRequestButtonIsDisplayed (){
        WebElement sendButton = driver.findElement(By.xpath("//input[@value='إرسال']"));
        Assert.assertTrue(sendButton.isDisplayed());
    }
    @Story("the send button should clickable")
    @Description("verify the send button is clickable on form menu and displayed success message after click")
    @Test(description = "the send button should clickable on form menu", priority = 13)
    public void sendRequestButtonIsClickable (){
        WebElement sendButton = driver.findElement(By.xpath("//input[@value='إرسال']"));
        sendButton.click();
       WebElement successMessageElement = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/form/div[7]"));
        WebElement responseOutput = driver.findElement(By.cssSelector("div .wpcf7-response-output"));
        String responseOutput5 = responseOutput.getText();
        System.out.println(responseOutput5);
        Assert.assertEquals(responseOutput5, "شكراً لك. لقد تم الإرسال بنجاح.");




    }
    @Story("the title is displayed")
    @Description("check the title is displayed and equal نحن هنا لمساعدتك")
    @Test(description = "test the title is displayed", priority = 14)
    public void titleOnFooterIsDisplayed() {
        WebElement closeButton = driver.findElement(By.xpath("/html/body/div[3]/div/div/button"));
        closeButton.click();
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        WebElement secTitle = driver.findElement(By.xpath("//*[text() = 'نحن هنا لمساعدتك']"));
        Assert.assertTrue(secTitle.isDisplayed());
        String getText  = secTitle.getText();
        Assert.assertEquals( getText , "نحن هنا لمساعدتك");
    }

    @Story("the subTitle is displayed")
    @Description("check the subTitle is displayed and equal تواصل معنا من خلال قنوات التواصل")
    @Test(description = "test the subTitle is displayed", priority = 15)
    public void subTitleOnFooterIsDisplayed() {
        WebElement subTitle = driver.findElement(By.xpath("//*[text() = 'تواصل معنا من خلال قنوات التواصل']"));
        Assert.assertTrue(subTitle.isDisplayed());
        String getText  = subTitle.getText();
        Assert.assertEquals( getText , "تواصل معنا من خلال قنوات التواصل");
    }

    @Story("the email icon is displayed")
    @Description("test the email icon is displayed")
    @Test(description = " the email icon should displayed", priority = 16)
    public void emailIconIsDisplayed() {
        WebElement icon = driver.findElement(By.cssSelector(".contact-icon > .lazyloaded"));
        Assert.assertTrue(icon.isDisplayed());
    }

    @Story("the email text is Displayed ")
    @Description("test the email text is displayed and equal  hi@famcare.app")
    @Test(description = " the email text should displayed", priority = 17)
    public void emailTextIsDisplayed() {
        WebElement emailText = driver.findElement(By.xpath("//*[text() = 'hi@famcare.app']"));
        Assert.assertTrue(emailText.isDisplayed());
        String getText  = emailText.getText();
        Assert.assertEquals( getText , "hi@famcare.app");
    }


    @Story("the google play button is displayed")
    @Description("verify The google play button should displayed ")
    @Test(description = "The google play button should displayed", priority = 18)
    public void googlePlayButtonIsDisplayed()  {
        WebElement button = driver.findElement(By.xpath("//*[@class = \"google-app-downloads\"]"));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The google play button is clickable")
    @Description("verify The google play button is clickable and displayed the title of new page")
    @Test(description = "Verify The google play button is clickable when click", priority = 19)
    public void googlePlayButtonIsClickable()  {
        WebElement button = driver.findElement(By.xpath("//*[@class = 'google-app-downloads']"));
        button.click();
        String originalWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break; // قم بالتبديل إلى أول نافذة جديدة واستمر
            }
        }
        WebElement elementInNewWindow = driver.findElement(By.cssSelector(".Fd93Bb > span"));
        Assert.assertTrue(elementInNewWindow.isDisplayed());
        driver.close();
        driver.switchTo().window(originalWindowHandle);
    }

    @Story("The apple store button should displayed")
    @Description("verify The apple store button is displayed ")
    @Test(description = " The apple store button should displayed", priority = 20)
    public void appleStoreButtonIsDisplayed() {
        WebElement button = driver.findElement(By.xpath("//*[@class = \"apple-app-downloads\"]"));
        wait.until(ExpectedConditions.visibilityOf(button));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The apple store button should clickable")
    @Description("verify The apple store button is clickable and displayed the tile of new page")
    @Test(description = "Verify The apple store button is clickable when click", priority = 21)
    public void appleStoreButtonIsClickable()  {
        WebElement button = driver.findElement(By.xpath("//*[@class = 'apple-app-downloads']"));
        button.click();
        String originalWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break; // قم بالتبديل إلى أول نافذة جديدة واستمر
            }
        }
        WebElement elementInNewWindow = driver.findElement(By.cssSelector(".product-header__title"));
        Assert.assertTrue(elementInNewWindow.isDisplayed());
        driver.close();
        driver.switchTo().window(originalWindowHandle);
    }

    @Story("The second subscription Button should displayed")
    @Description("verify The subscription button is displayed on home page")
    @Test(description = "The subscription button should displayed", priority = 22)
    public void subscriptionButtonIsDisplayed()  {
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(button));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The subscription Button should clickable")
    @Description("verify The subscription button is clickable when click")
    @Test(description = "Verify The subscription button should clickable", priority = 23)
    public void subscriptionButtonIsClickable()  {

        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        button.click();
    }

    @Story("Click on subscription button with invalid email ")
    @Description("verify to click on subscription button when enter wrong format email")
    @Test(description = "Verify to click on subscription button with invalid email format ", priority = 24)
    public void clickSubscriptionButtonWithInvalidEmail()  {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-1 .mail-list-email"));
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        input.sendKeys("hello");
        button.click();


    }

    @Story("Click on subscription button with valid email ")
    @Description("verify to click on subscription button with correct email")
    @Test(description = "Verify to click on subscription button with valid email format ", priority = 25)
    public void clickSubscriptionButtonWithValidEmail() {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-1 .mail-list-email"));
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        input.sendKeys(Keys.CLEAR);
        input.sendKeys("osama@email.com");
        button.click();
        driver.navigate().back();
    }

    @Story("verify the image on footer is displayed ")
    @Description("verify the image is displayed ")
    @Test(description = "verify the image is displayed on footer", priority = 26)
    public void imageIsDisplayed()  {
        WebElement image = driver.findElement(By.cssSelector(".app-image > .lazyloaded"));
        Assert.assertTrue(image.isDisplayed());

    }

}
