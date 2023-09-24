import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import static java.lang.Thread.sleep;

public class SubscriptionSection_home extends Home_page_test {

    @Story("Displayed the title")
    @Description("open main page and find the Title if it displayed and equal انضم الى مجتمع المعرفة والخبرة النفسية والزواجية")
    @Test(description = "open main page and find the Title if it displayed ", priority = 67)
    public void TitleIsDisplayed() {
        jse.executeScript("window.scrollBy(0,4800)", "");
        WebElement title = driver.findElement(By.cssSelector(".kc-css-441987 > .kc_title"));
        Assert.assertTrue(title.isDisplayed());
        String getText = title.getText();
        Assert.assertEquals(getText, "انضم الى مجتمع المعرفة والخبرة النفسية والزواجية");
    }

    @Story("verify the input field is displayed")
    @Description("open main page and find the input field  if it displayed ")
    @Test(description = "the input field in main page should displayed ", priority = 68)
    public void inputIsDisplayed() {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-1 .mail-list-email"));
        Assert.assertTrue(input.isDisplayed());
    }

    @Story("verify the input field is enabled")
    @Description("open main page and click on the input field and check if it enabled ")
    @Test(description = "the input field in main page should enabled ", priority = 69)
    public void inputIsEnabled() throws InterruptedException {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-1 .mail-list-email"));
        Assert.assertTrue(input.isEnabled());
    }

    @Story("verify the input field is editable")
    @Description(" open main page and click on the input field and write word and check if it editable")
    @Test(description = "the input field in main page should editable", priority = 70)
    public void inputIsEditable() {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-1 .mail-list-email"));
        input.sendKeys("hello");
        input.clear();
    }

    @Story("The subscription Button should displayed")
    @Description("open home page and Verify The subscription button is displayed")
    @Test(description = " The subscription button should displayed ", priority = 71)
    public void subscriptionButtonIsDisplayed() {
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        Assert.assertTrue(button.isDisplayed());


    }

    @Story("The subscription Button should clickable")
    @Description("open home page and click on The subscription button to ensure if it clickable ")
    @Test(description = "Verify The subscription button is clickable ", priority = 72)
    public void subscriptionButtonIsClickable() {
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        button.click();
    }

    @Story("Click on subscription button with invalid email ")
    @Description("Verify to click on subscription button with enter invalid email format on field ")
    @Test(description = "verify to click on subscription button with wrong email  ", priority = 73)
    public void clickSubscriptionButtonWithInvalidEmail() {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-1 .mail-list-email"));
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        input.sendKeys(Keys.CLEAR);
        input.sendKeys("hello");
        button.click();


    }

    @Story("Click on subscription button with valid email ")
    @Description("Verify to click on subscription button with enter valid email format on field")
    @Test(description = "verify to click on subscription button with correct email  ", priority = 74)
    public void clickSubscriptionButtonWithValidEmail() throws InterruptedException {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-1 .mail-list-email"));
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[1]"));
        input.sendKeys("osama@email.com");
        button.click();
        driver.navigate().back();
    }

    @Story("the title is displayed")
    @Description("check the title is displayed and equal نحن هنا لمساعدتك")
    @Test(description = "test the title is displayed", priority = 75)
    public void titleIsDisplayed() {
        WebElement secTitle = driver.findElement(By.xpath("//*[text() = 'نحن هنا لمساعدتك']"));
        Assert.assertTrue(secTitle.isDisplayed());
        String getText  = secTitle.getText();
        Assert.assertEquals( getText , "نحن هنا لمساعدتك");
    }

    @Story("the subTitle is displayed")
    @Description("check the subTitle is displayed and equal تواصل معنا من خلال قنوات التواصل")
    @Test(description = "test the subTitle is displayed", priority = 76)
    public void subTitleIsDisplayed() {
        WebElement subTitle = driver.findElement(By.xpath("//*[text() = 'تواصل معنا من خلال قنوات التواصل']"));
        Assert.assertTrue(subTitle.isDisplayed());
        String getText  = subTitle.getText();
        Assert.assertEquals( getText , "تواصل معنا من خلال قنوات التواصل");
    }

    @Story("the email icon is displayed")
    @Description("test the email icon is displayed")
    @Test(description = " the email icon should displayed", priority = 77)
    public void emailIconIsDisplayed() {
        WebElement icon = driver.findElement(By.cssSelector(".contact-icon > .lazyloaded"));
        Assert.assertTrue(icon.isDisplayed());
    }

    @Story("the email text is Displayed ")
    @Description("test the email text is displayed and equal  hi@famcare.app")
    @Test(description = " the email text should displayed", priority = 78)
    public void emailTextIsDisplayed() {
        WebElement emailText = driver.findElement(By.xpath("//*[text() = 'hi@famcare.app']"));
        Assert.assertTrue(emailText.isDisplayed());
        String getText  = emailText.getText();
        Assert.assertEquals( getText , "hi@famcare.app");
    }


    @Story("the google play button is displayed")
    @Description("verify The google play button should displayed ")
    @Test(description = "The google play button should displayed", priority = 79)
    public void googlePlayButtonIsDisplayed()  {
        WebElement button = driver.findElement(By.xpath("//*[@class = \"google-app-downloads\"]"));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The google play button is clickable")
    @Description("verify The google play button is clickable and displayed the title of new page")
    @Test(description = "Verify The google play button is clickable when click", priority = 80)
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
    @Test(description = " The apple store button should displayed", priority = 81)
    public void appleStoreButtonIsDisplayed() {
        WebElement button = driver.findElement(By.xpath("//*[@class = \"apple-app-downloads\"]"));
        wait.until(ExpectedConditions.visibilityOf(button));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The apple store button should clickable")
    @Description("verify The apple store button is clickable and displayed the tile of new page")
    @Test(description = "Verify The apple store button is clickable when click", priority = 82)
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
    @Test(description = "The subscription button should displayed", priority = 83)
    public void secondSubscriptionButtonIsDisplayed()  {
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[2]"));
        wait.until(ExpectedConditions.visibilityOf(button));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The subscription Button should clickable")
    @Description("verify The subscription button is clickable when click")
    @Test(description = "Verify The subscription button should clickable", priority = 84)
    public void secondSubscriptionButtonIsClickable()  {

        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[2]"));
        button.click();
    }

    @Story("Click on subscription button with invalid email ")
    @Description("verify to click on subscription button when enter wrong format email")
    @Test(description = "Verify to click on subscription button with invalid email format ", priority = 85)
    public void clickSecondSubscriptionButtonWithInvalidEmail()  {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-2 .mail-list-email"));
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[2]"));
        input.sendKeys(Keys.CLEAR);
        input.sendKeys("hello");
        button.click();


    }

    @Story("Click on subscription button with valid email ")
    @Description("verify to click on subscription button with correct email")
    @Test(description = "Verify to click on subscription button with valid email format ", priority = 86)
    public void clickSecondSubscriptionButtonWithValidEmail() {
        WebElement input = driver.findElement(By.cssSelector("#mc4wp-form-2 .mail-list-email"));
        WebElement button = driver.findElement(By.xpath("(//input[@value = 'اشتراك'])[2]"));
        input.sendKeys("osama@email.com");
        button.click();
        driver.navigate().back();
    }

    @Story("verify the image on footer is displayed ")
    @Description("verify the image is displayed ")
    @Test(description = "verify the image is displayed on footer", priority = 87)
    public void imageIsDisplayed()  {
        WebElement image = driver.findElement(By.cssSelector(".app-image > .lazyloaded"));
        Assert.assertTrue(image.isDisplayed());

    }
}
