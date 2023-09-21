import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SpecialistsSection_home extends Home_page_test {


    @Test
    public void specialistTitleIsDisplayed() throws InterruptedException {

        jse.executeScript("window.scrollBy(0,1000)", "");
        WebElement websiteParagraphElement = driver.findElement(By.xpath("//*[text()='نخبة من الأخصائيين والمرشدين']"));
        Assert.assertTrue(websiteParagraphElement.isDisplayed());
    }

    // SHOULD ADD SCROLL ??
    @Test
    public void specialistCardIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,500)", "");
        sleep(500);
        WebElement subParagraph = driver.findElement(By.xpath("//div[@aria-label='3 / 16']"));
        Assert.assertTrue(subParagraph.isDisplayed());
    }

// NIDAL
    @Test
    public void ensureScrollingTheSpecialistSlider() throws InterruptedException {

//        WebElement scroll = driver.findElement(By.xpath("//div[10]/div/h2"));
        WebElement scroll = driver.findElement(By.xpath("//div[10]/div/h2"));
        jse.executeScript("window.scrollBy(0,1000)", "");
        sleep(500);

        jse.executeScript("arguments[0].scrollLeft += 900;", scroll); // تمرير 500 بكسل إلى اليمين

        // الانتظار لبعض الوقت لرؤية التأثير
        try {
            Thread.sleep(2000); // انتظر لمدة 2 ثانية
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // NOT WORKING

//    @Test(priority = 15)
//    public void sliderIsScrolling() throws InterruptedException {
//        jse.executeScript("window.scrollBy(0,1000)", "");
//        sleep(800);
//        WebElement scrollRight = driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-f8d21d3511a53e43\"]/div[19]/div"));
//        WebElement ScrollLeft = driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-2aec25438cb2010e4\"]/div[1]/div"));
//
//        jse.executeScript("arguments[0].scrollInView", scrollRight);
//        Thread.sleep(300);
//        jse.executeScript("arguments[0].scrollInView", ScrollLeft);
//        Thread.sleep(300);
//
//
//    }



// CANT FIND ELEMENT

    @Test
    public void bookAppointmentButtonIsDisplayed() throws InterruptedException {
        WebElement bookButton = driver.findElement(By.xpath("//a[@href= 'https://famcare.app/subscriptions?link=https://famcare.onelink.me/v4gj/HamadAlDossary']"));
        jse.executeScript("window.scrollBy(0,1000)", "");
        sleep(500);
        Assert.assertTrue(bookButton.isDisplayed());
        bookButton.click();
        driver.navigate().back();
        sleep(500);
    }


    // CANT FIND ELEMENT

    @Test
    public void profileButtonIsDisplayed() throws InterruptedException {
        WebElement profileButton = driver.findElement(By.xpath("(//a[contains(text(),'الملف الشخصي')])[10]"));
        jse.executeScript("window.scrollBy(0,1000)", "");
        sleep(500);
        Assert.assertTrue(profileButton.isDisplayed());
        profileButton.click();
        driver.navigate().back();
        sleep(500);
    }


    // CANT FIND ELEMENT

    @Test
    public void specialistImageIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,1000)", "");
        sleep(500);
        WebElement profileImage = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[3]/div/div/div[10]/div/div[1]/a/img"));
        Assert.assertTrue(profileImage.isDisplayed());

    }

    @Test
    public void specialistImageIsClickable() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,1000)", "");
        sleep(500);
        WebElement profileImage = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[3]/div/div/div[10]/div/div[1]/a/img"));
        profileImage.click();
        driver.navigate().back();
        driver.quit();

    }

    @Test
    public void specialistNameIsDisplayed() throws InterruptedException {

        WebElement specialistName = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[3]/div/div/div[10]/div/h2/a"));
        jse.executeScript("window.scrollBy(0,1000)", "");
        sleep(500);
        Assert.assertTrue(specialistName.isDisplayed());
    }

    @Test
    public void specialistNameIsClickable() throws InterruptedException {

        WebElement specialistName = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[3]/div/div/div[10]/div/h2/a"));
        jse.executeScript("window.scrollBy(0,1000)", "");
        sleep(500);
        specialistName.click();
        driver.navigate().back();
        driver.quit();
    }


    @Test
    public void specialistDescriptionIsDisplayed() throws InterruptedException {

        WebElement description = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[3]/div/div/div[10]/div/p[2]/a"));
        jse.executeScript("window.scrollBy(0,1000)", "");
        sleep(500);
        Assert.assertTrue(description.isDisplayed());
    }

    @Test
    public void specialistDescriptionIsClickable() throws InterruptedException {

        WebElement description = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[3]/div/div/div[13]/div/p[2]/a"));
        jse.executeScript("window.scrollBy(0,1000)", "");
        sleep(500);
        Assert.assertTrue(description.isDisplayed());
        description.click();
        driver.navigate().back();
        driver.quit();
    }

    @Test
    public void contactIsDisplayed() throws InterruptedException {
        WebElement contact = driver.findElement(By.linkText("تواصل الآن"));
        Assert.assertTrue(contact.isDisplayed());
        contact.click();
        driver.navigate().back();
        sleep(500);

    }
    @Test
    public void findMessageIcon() throws InterruptedException {
        WebElement messageIcon = driver.findElement(By.xpath("/html/body/div[12]/div/div[1]"));
        SetUp.wait.until(ExpectedConditions.visibilityOf(messageIcon));
        Assert.assertTrue(messageIcon.isDisplayed());

    }
    @Test
    public void messageIconClickable() throws InterruptedException {
        WebElement messageIcon = driver.findElement(By.xpath("/html/body/div[12]/div/div[1]"));
        SetUp.wait.until(ExpectedConditions.visibilityOf(messageIcon));
        Assert.assertTrue(messageIcon.isDisplayed());
        messageIcon.click();


    }
}