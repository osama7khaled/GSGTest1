import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class FeedbackSection_home extends Home_page_test {


    @Test
    public void iconIsDisplayed() {

        WebElement icon = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/div/div[2]/div/div[1]/img"));
        Assert.assertTrue(icon.isDisplayed());
    }

    @Test
    public void textNumberIsDisplayed() {

        WebElement textNumber = driver.findElement(By.xpath("//*[text() = '+500,000']"));
        Assert.assertTrue(textNumber.isDisplayed());
    }

    @Test
    public void subTitleIsDisplayed() {

        WebElement subTitle = driver.findElement(By.xpath("//*[text() = 'مستفيد ومستفيدة']"));
        Assert.assertTrue(subTitle.isDisplayed());
    }
// NOT WORKING
//    @Test
//    public void sliderIsDisplayed() {
//
//        WebElement slider = driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-9e7b2102a9ae1e98d\"]"));
//        Assert.assertTrue(slider.isDisplayed());
//    }


    //nidal
    @Test
    public void ensureScrollingTheSpecialistSlider() throws InterruptedException {

//        WebElement scroll = driver.findElement(By.xpath("//div[10]/div/h2"));
        jse.executeScript("window.scrollBy(0,1500)", "");
        WebElement scroll = driver.findElement(By.xpath("/html/body/div[1]/section[5]/div/div/div/div/div[2]/div/div"));
        sleep(500);

        jse.executeScript("arguments[0].scrollLeft += 900;", scroll); // تمرير 500 بكسل إلى اليمين

        // الانتظار لبعض الوقت لرؤية التأثير
        try {
            Thread.sleep(2000); // انتظر لمدة 2 ثانية
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void ratingIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,1500)", "");
        sleep(500);
        WebElement rate = driver.findElement(By.xpath("/html/body/div[1]/section[5]/div/div/div/div/div[2]/div/div/div[5]/div/div/div/div/img"));
        Assert.assertTrue(rate.isDisplayed());
    }
// NIDAL
//    @Test
//    public void commentIsDisplayed() throws InterruptedException {
//        jse.executeScript("window.scrollBy(0,1500)", "");
//        sleep(500);
//         WebElement comment = driver.findElement(By.xpath("/html/body/div[1]/section[5]/div/div/div/div/div[2]/div/div/div[8]/div/div/div/text()[1]"));
//String d = comment.getText();
//        System.out.println(d);
//    }
//
//    @Test
//    public void commentOwnerIsDisplayed() {
//
//        WebElement owner = driver.findElement(By.xpath("/html/body/div[1]/section[5]/div/div/div/div/div[2]/div/div/div[12]/div/div/div/h4"));
//
//    }
}
