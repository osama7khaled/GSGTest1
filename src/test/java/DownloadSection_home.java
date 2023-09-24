import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class DownloadSection_home extends Home_page_test {


    @Story("Ensure the title text is Displayed")
    @Description("verify the title on home page is Displayed and equal")
    @Test(description = "open home page and verify the title of section is Displayed and equal من المشكلة إلى الحل في ثلاث خطوات فقط!", priority = 38)
    public void titleIsDisplayed() {
        jse.executeScript("window.scrollBy(0,2200)", "");
        WebElement title = driver.findElement(By.xpath("//*[contains(text() , 'من المشكلة إلى الحل في ثلاث خطوات فقط')]"));
        Assert.assertTrue(title.isDisplayed());
        String getText = title.getText();
        Assert.assertEquals(getText, "من المشكلة إلى الحل في ثلاث خطوات فقط!");
    }

    @Story("Ensure the subTitle text is Displayed")
    @Description("verify the subTitle on home page is Displayed")
    @Test(description = "open home page and verify the subTitle of section is Displayed and equal احجز استشارة مباشرة أو مجدولة بسريّة تامة من أي مكان وفي أي وقت، بأسعار رمزيّة ومناسبة للجميع", priority = 39)
    public void subTitleIsDisplayed() {
        WebElement subTitle = driver.findElement(By.xpath("//*[contains(text() , 'بأسعار رمزيّة ومناسبة للجميع')]"));
        Assert.assertTrue(subTitle.isDisplayed());
        String getText = subTitle.getText();
        Assert.assertEquals(getText, "احجز استشارة مباشرة أو مجدولة بسريّة تامة من أي مكان وفي أي وقت، بأسعار رمزيّة ومناسبة للجميع.");

    }


    @Story("The google play button should displayed")
    @Description("verify The google play button should displayed ")
    @Test(description = "Verify The google play button is displayed", priority = 40)
    public void googlePlayButtonIsDisplayed() {
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section[6]/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div[2]/div/div/a[1]"));
        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The google play button should clickable")
    @Description("verify The google play button is clickable ")
    @Test(description = "click on google play button and ensure if title from new page are displayed", priority = 41)
    public void googlePlayButtonIsClickable() {
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section[6]/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div[2]/div/div/a[1]"));
        button.click();
        WebElement titleInNewWindow = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div/div[2]/div[1]/div/div/c-wiz/div[2]/div[1]/div/h1/span"));
        Assert.assertTrue(titleInNewWindow.isDisplayed());
        driver.navigate().back();
    }


    @Story("The apple store button should displayed")
    @Description("verify The apple store button should displayed ")
    @Test(description = "Verify The apple store button is displayed in section", priority = 42)
    public void appleStoreButtonIsDisplayed(){
        WebElement button = driver.findElement(By.xpath("//a[@href= 'https://apps.apple.com/us/app/famcare/id1517781498?utm_source=organic&utm_medium=website%20header&utm_campaign=a']"));
        Assert.assertTrue(button.isDisplayed());
    }


    @Story("The apple store button should clickable")
    @Description("verify The apple store button is clickable ")
    @Test(description = "click on apple store button and ensure if title from new page are displayed", priority = 43)
    public void appleStoreButtonIsClickable() {
        WebElement button = driver.findElement(By.xpath("//a[@href= 'https://apps.apple.com/us/app/famcare/id1517781498?utm_source=organic&utm_medium=website%20header&utm_campaign=a']"));
        button.click();
        WebElement titleInNewWindow = driver.findElement(By.cssSelector(".product-header__title"));
        Assert.assertTrue(titleInNewWindow.isDisplayed());
        driver.navigate().back();
    }


    @Story("The video should displayed")
    @Description("verify The video on main section should displayed ")
    @Test(description = "Verify The video is displayed in main section", priority = 44)
    public void videoIsDisplayed() {
        WebElement video = driver.findElement(By.xpath("/html/body/div[1]/section[6]/div/div/div[3]/div/div/a/img"));
        Assert.assertTrue(video.isDisplayed());
    }

    @Story("verify The video on main section is displayed ")
    @Description("verify The video on main section is displayed ")
    @Test(description = "find the video element and click on play icon , then find close button to ensure the video is opened", priority = 45)
    public void videoIsOpened() {
        WebElement video = driver.findElement(By.xpath("(//*[@href = 'dmmw4Rngozg'])[2]"));
        video.click();
        WebElement closeIcon = driver.findElement(By.cssSelector(".video-close"));
        closeIcon.click();
    }
}
