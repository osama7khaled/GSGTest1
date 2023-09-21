import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SubscriptionٍSection_home extends Home_page_test {

    @Test
    public void TitleIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5000)", "");
        sleep(500);
        WebElement title = driver.findElement(By.xpath("//*[@class = 'kc-elm kc-css-441987 kc-title-wrap ']//*[text() = 'انضم الى مجتمع المعرفة والخبرة النفسية والزواجية']"));
        Assert.assertTrue(title.isDisplayed());
    }

    @Test
    public void inputIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5000)", "");
        sleep(500);
        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[2]/form/div[1]/div/input[1]"));
        Assert.assertTrue(input.isDisplayed());
    }

    @Test
    public void inputIsEnabled() throws InterruptedException {

        jse.executeScript("window.scrollBy(0,5000)", "");
        sleep(500);
        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[2]/form/div[1]/div/input[1]"));
        Assert.assertTrue(input.isEnabled());
    }
    @Test
    public void inputIsEditable() throws InterruptedException {

        jse.executeScript("window.scrollBy(0,5000)", "");
        sleep(500);
        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[2]/form/div[1]/div/input[1]"));
        input.sendKeys("hello");
        sleep(500);
    }

    @Test
    public void subscriptionButtonIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5000)", "");
        sleep(500);
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[2]/form/div[1]/div/input[2]"));
        Assert.assertTrue(button.isDisplayed());
    }

    @Test
    public void subscriptionButtonIsClickable() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5000)", "");
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[2]/form/div[1]/div/input[2]"));
        button.click();
        sleep(1000);
    }
    @Test
    public void clickSubscriptionButtonWithInvalidEmail() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5000)", "");
        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[2]/form/div[1]/div/input[1]"));
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[2]/form/div[1]/div/input[2]"));
        input.sendKeys("hello");
        button.click();
        sleep(1000);
    }
    @Test
    public void clickSubscriptionButtonWithValidEmail() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5000)", "");
        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[2]/form/div[1]/div/input[1]"));
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[2]/form/div[1]/div/input[2]"));
        input.sendKeys("osama@email.com");
        button.click();
        sleep(1000);
    }

    @Test
    public void secTitleIsDisplayed() {
        jse.executeScript("window.scrollBy(0,6000)", "");
        WebElement secTitle = driver.findElement(By.xpath("//*[text() = 'نحن هنا لمساعدتك']"));
        Assert.assertTrue(secTitle.isDisplayed());
    }

    @Test
    public void subTitleIsDisplayed() {
        jse.executeScript("window.scrollBy(0,6000)", "");
        WebElement secTitle = driver.findElement(By.xpath("//*[text() = 'تواصل معنا من خلال قنوات التواصل']"));
        Assert.assertTrue(secTitle.isDisplayed());
    }
    @Test
    public void emailIconIsDisplayed() {
        jse.executeScript("window.scrollBy(0,6000)", "");
        WebElement icon = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/div[2]/div[1]/div[1]/img"));
        Assert.assertTrue(icon.isDisplayed());
    }
    @Test
    public void emailTextIsDisplayed() {
        jse.executeScript("window.scrollBy(0,6000)", "");
        WebElement emailText = driver.findElement(By.xpath("//*[text() = 'hi@famcare.app']"));
        Assert.assertTrue(emailText.isDisplayed());
    }


    @Test
    public void googlePlayButtonIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,6000)", "");
        WebElement button = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/div[1]/div/div[1]/a/img"));
        sleep(500);
        Assert.assertTrue(button.isDisplayed());
    }
     @Test
    public void googlePlayButtonIsClickable() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,6000)", "");
        WebElement button = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/div[1]/div/div[1]/a/img"));
         button.click();
         sleep(1000);
         driver.navigate().back();
         sleep(1000);
    }

    @Test
    public void appleStoreButtonIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,6000)", "");
        WebElement button = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/div[1]/div/div[2]/a/img"));
        button.click();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
    }

    @Test
    public void secondSubscriptionButtonIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5500)", "");
        sleep(500);
        WebElement button = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/form/div[1]/div/input[2]"));
        Assert.assertTrue(button.isDisplayed());
    }

    @Test
    public void secondSubscriptionButtonIsClickable() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5000)", "");
        WebElement button = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/form/div[1]/div/input[2]"));
        button.click();
        sleep(1000);
    }
    @Test
    public void clickSecondSubscriptionButtonWithInvalidEmail() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5000)", "");
        WebElement input = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/form/div[1]/div/input[1]"));
        WebElement button = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/form/div[1]/div/input[2]"));
        input.sendKeys("hello");
        button.click();
        sleep(1000);
    }
    @Test
    public void clickSecondSubscriptionButtonWithValidEmail() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,5000)", "");
        WebElement input = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/form/div[1]/div/input[1]"));
        WebElement button = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/form/div[1]/div/input[2]"));
        input.sendKeys("osama@email.com");
        button.click();
        sleep(1000);
        driver.navigate().back();
    }
    @Test
    public void imageIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,6000)", "");
        WebElement image = driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/div[2]/img"));
        sleep(1000);
        Assert.assertTrue(image.isDisplayed());

    }
}
