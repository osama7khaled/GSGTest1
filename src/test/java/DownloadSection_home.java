import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class DownloadSection_home extends Home_page_test {
    @Test
    public void titleIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,2000)", "");

        WebElement title = driver.findElement(By.xpath("//*[contains(text() , 'من المشكلة إلى الحل في ثلاث خطوات فقط')]"));
        sleep(500);
        Assert.assertTrue(title.isDisplayed());
    }

    @Test
    public void subTitleIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,2500)", "");

        WebElement subTitle = driver.findElement(By.xpath("//*[contains(text() , 'احجز استشارة مباشرة أو مجدولة بسريّة تامة من أي مكان وفي أي وقت، بأسعار رمزيّة ومناسبة للجميع')]"));
        sleep(500);
        Assert.assertTrue(subTitle.isDisplayed());

    }

    @Test
    public void googlePlayButtonIsDisplayed() {
        jse.executeScript("window.scrollBy(0,2500)", "");
        WebElement button = driver.findElement(By.xpath("//a[@href= 'https://play.google.com/store/apps/details?id=sa.app.famcare&referrer=utm_source%3Dwebsite%26utm_medium%3Dheader']"));
        Assert.assertTrue(button.isDisplayed());
    }
    //TODO
    // click
    // ensure navigate

    @Test
    public void appleStoreButtonIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,2500)", "");
        WebElement button = driver.findElement(By.xpath("//a[@href= 'https://apps.apple.com/us/app/famcare/id1517781498?utm_source=organic&utm_medium=website%20header&utm_campaign=a']"));
        sleep(500);
        Assert.assertTrue(button.isDisplayed());
    }
    //TODO
    // click
    // ensure navigate



    @Test
    public void videoIsDisplayed() {
        jse.executeScript("window.scrollBy(0,2500)", "");
        WebElement video = driver.findElement(By.xpath("/html/body/div[1]/section[6]/div/div/div[3]/div/div/a/img"));
        Assert.assertTrue(video.isDisplayed());
    }
    //TODO
    // play or navigate
}
