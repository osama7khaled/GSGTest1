import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class AboutUs extends Home_page_test {

    @Story("Open About As Page")
    @Description("Should open About As Page")
    @Test(description = "The About As button on navbar should able to navigate to About As page", priority = 1)
    public void joinAboutUs_buttonLocator() {
        WebElement joinAboutUs_buttonLocator = driver.findElement(By.xpath("//*[@title = 'من نحن']"));
        joinAboutUs_buttonLocator.click();
    }

    @Story("The title should Displayed")
    @Description(" Verify The title should Displayed on aboutUs page and equal منصة فامكير")
    @Test(description = "The title should Displayed", priority = 2)
    public void titleIsDisplayed() {
        WebElement aboutUsTitle = driver.findElement(By.xpath("(//*[contains(text() , 'منصة فامكير')])[1]"));
        Assert.assertTrue(aboutUsTitle.isDisplayed());

    }

    @Story("The subTitle should Displayed")
    @Description(" Verify The subTitle should Displayed on aboutUs page")
    @Test(description = "The subTitle should Displayed ", priority = 3)
    public void subTitleInAboutAsIsDisplayed() {
        WebElement aboutUsSubTitle = driver.findElement(By.xpath("//*[contains(text() , 'بدأت من منطلق اهتمامنا بتعزيز الصحة')]"));
        Assert.assertTrue(aboutUsSubTitle.isDisplayed());

    }

    @Story("the image on about us should displayed")
    @Description("Verify The image is Displayed on aboutUs page")
    @Test(description = "the image should displayed", priority = 4)
    public void basicImageInAboutUsIsDisplayed() {
        WebElement aboutUsImage = driver.findElement(By.cssSelector(".kc-elm > img"));
        Assert.assertTrue(aboutUsImage.isDisplayed());
    }

    @Story("the card should displayed")
    @Description("the card on aboutUs page should displayed ")
    @Test(description = "the card element should displayed", priority = 5)
    public void ourVisionCardDisplayed() {
        WebElement titleOnCard = driver.findElement(By.cssSelector(".kc-css-747832 > .kc_title"));
        Assert.assertTrue(titleOnCard.isDisplayed());

    }

    @Story("the title in card should displayed ")
    @Description("the title in card should displayed on about us page and equal رؤيتنا")
    @Test(description = "Verify the title in card is displayed", priority = 6)
    public void titleOurVisionCardDisplayed() {
        WebElement titleCard = driver.findElement(By.xpath("//*[contains(text() , 'رؤيتنا')]"));
        Assert.assertTrue(titleCard.isDisplayed());
        String getText = titleCard.getText();
        Assert.assertEquals(getText ,"رؤيتنا");
    }

    @Story("The OurVisionCard Description should be displayed")
    @Description("  The OurVisionCard Description should Displayed on aboutUs page ")
    @Test(description = "Verify The OurVisionCard Description is Displayed ", priority = 7)
    public void theOurVisionCardDescriptionIsDisplayed() {
        WebElement ourVisionCardDescription = driver.findElement(By.xpath("//*[contains(text() , 'أن نكون منصة رائدة عربياً في مجال تقديم الاستشارات الأسرية والزوجية والدعم النفسي.')]"));
        Assert.assertTrue(ourVisionCardDescription.isDisplayed());
    }

    @Story("the title is displayed")
    @Description("check the title is displayed and equal نحن هنا لمساعدتك")
    @Test(description = "test the title is displayed", priority = 8)
    public void titleOnFooterIsDisplayed() {
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        WebElement secTitle = driver.findElement(By.xpath("//*[text() = 'نحن هنا لمساعدتك']"));
        Assert.assertTrue(secTitle.isDisplayed());
        String getText  = secTitle.getText();
        Assert.assertEquals( getText , "نحن هنا لمساعدتك");
    }

    @Story("the subTitle is displayed")
    @Description("check the subTitle is displayed and equal تواصل معنا من خلال قنوات التواصل")
    @Test(description = "test the subTitle is displayed", priority = 9)
    public void subTitleOnFooterIsDisplayed() {
        WebElement subTitle = driver.findElement(By.xpath("//*[text() = 'تواصل معنا من خلال قنوات التواصل']"));
        Assert.assertTrue(subTitle.isDisplayed());
        String getText  = subTitle.getText();
        Assert.assertEquals( getText , "تواصل معنا من خلال قنوات التواصل");
    }

    @Story("the email icon is displayed")
    @Description("test the email icon is displayed")
    @Test(description = " the email icon should displayed", priority = 10)
    public void emailIconIsDisplayed() {
        WebElement icon = driver.findElement(By.cssSelector(".contact-icon > .lazyloaded"));
        Assert.assertTrue(icon.isDisplayed());
    }

    @Story("the email text is Displayed ")
    @Description("test the email text is displayed and equal  hi@famcare.app")
    @Test(description = " the email text should displayed", priority = 11)
    public void emailTextIsDisplayed() {
        WebElement emailText = driver.findElement(By.xpath("//*[text() = 'hi@famcare.app']"));
        Assert.assertTrue(emailText.isDisplayed());
        String getText  = emailText.getText();
        Assert.assertEquals( getText , "hi@famcare.app");
    }


    @Story("the google play button is displayed")
    @Description("verify The google play button should displayed ")
    @Test(description = "The google play button should displayed", priority = 12)
    public void googlePlayButtonIsDisplayed()  {
        WebElement button = driver.findElement(By.xpath("//*[@class = \"google-app-downloads\"]"));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The google play button is clickable")
    @Description("verify The google play button is clickable and displayed the title of new page")
    @Test(description = "Verify The google play button is clickable when click", priority = 13)
    public void googlePlayButtonIsClickable()  {
        WebElement button = driver.findElement(By.xpath("//*[@class = \"google-app-downloads\"]"));
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
    @Test(description = " The apple store button should displayed", priority = 14)
    public void appleStoreButtonIsDisplayed() {
        WebElement button = driver.findElement(By.xpath("//*[@class = \"apple-app-downloads\"]"));
        wait.until(ExpectedConditions.visibilityOf(button));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The apple store button should clickable")
    @Description("verify The apple store button is clickable and displayed the tile of new page")
    @Test(description = "Verify The apple store button is clickable when click", priority = 15)
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
    @Test(description = "The subscription button should displayed", priority = 16)
    public void subscriptionButtonIsDisplayed()  {
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(button));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The subscription Button should clickable")
    @Description("verify The subscription button is clickable when click")
    @Test(description = "Verify The subscription button should clickable", priority = 17)
    public void subscriptionButtonIsClickable()  {

        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        button.click();
    }

    @Story("Click on subscription button with invalid email ")
    @Description("verify to click on subscription button when enter wrong format email")
    @Test(description = "Verify to click on subscription button with invalid email format ", priority = 18)
    public void clickSubscriptionButtonWithInvalidEmail()  {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-1 .mail-list-email"));
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        input.sendKeys("hello");
        button.click();


    }

    @Story("Click on subscription button with valid email ")
    @Description("verify to click on subscription button with correct email")
    @Test(description = "Verify to click on subscription button with valid email format ", priority = 19)
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
    @Test(description = "verify the image is displayed on footer", priority = 20)
    public void imageIsDisplayed()  {
        WebElement image = driver.findElement(By.cssSelector(".app-image > .lazyloaded"));
        Assert.assertTrue(image.isDisplayed());

    }



}