import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;


public class BlogSection_home extends Home_page_test{



    @Test
    public void blogImageIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3000)", "");
       WebElement image = driver.findElement(By.xpath("//a[@href= 'https://famcare.app/%d8%a7%d8%b3%d8%aa%d9%83%d8%b4%d9%81-%d9%85%d8%ae%d8%a7%d8%b7%d8%b1-%d8%a7%d9%84%d8%a7%d8%ad%d8%aa%d8%b1%d8%a7%d9%82-%d8%a7%d9%84%d9%88%d8%b8%d9%8a%d9%81%d9%8a/']"));
       sleep(500);
        Assert.assertTrue(image.isDisplayed());
    }

    @Test
    public void postDateIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3000)", "");
        WebElement textDate = driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div/div/article[1]/div/div[2]/div[1]"));
        sleep(500);
        Assert.assertTrue(textDate.isDisplayed());
    }

    @Test
    public void specializedIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3000)", "");
        WebElement specialized = driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div/div/article[1]/div/div[2]/div[1]/a"));
        sleep(500);
        Assert.assertTrue(specialized.isDisplayed());
    }

    @Test
    public void postTitleIsDisplayed() throws InterruptedException {

        jse.executeScript("window.scrollBy(0,3000)", "");
        WebElement specialized = driver.findElement(By.xpath("//*[contains(text() , 'استكشف مخاطر الاحتراق الوظيفي')]"));
        sleep(500);
        Assert.assertTrue(specialized.isDisplayed());
    }

    @Test
    public void postSubTitleIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3000)", "");
        WebElement specialized = driver.findElement(By.xpath("//*[contains(text() , 'هو ضعف الطاقة الفكرية والجسدية، وبالتالي النفسية تكاد تكون معدومة الراحة والرضا الوظيفي. كيف يأتي الاحتراق؟ يأتي من عدة نوافذ منها مرئية ومنها غير مرئية للموظف')]"));
        sleep(500);
        Assert.assertTrue(specialized.isDisplayed());
    }

    @Test
    public void postCreatorProfileImageIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3000)", "");
        WebElement profileImage = driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div/div/article[1]/div/div[2]/div[2]/div/div/a/img"));
        sleep(1500);
        Assert.assertTrue(profileImage.isDisplayed());
    }

    @Test
    public void postCreatorSpecializedIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3100)", "");
        WebElement specialized = driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div/div/article[1]/div/div[2]/div[2]/div/div/div/p"));
        sleep(700);
        Assert.assertTrue(specialized.isDisplayed());
    }

    @Test
    public void detailsButtonIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3100)", "");
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div/div/article[1]/div/div[1]/a"));
        sleep(700);
        Assert.assertTrue(button.isDisplayed());
    }
    @Test
    public void detailsButtonIsClickable() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3100)", "");
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div/div/article[1]/div/div[1]/a"));
        sleep(700);
        button.click();
        WebElement titleInSecondPage = driver.findElement(By.xpath("/html/body/div[1]/div/div/h1"));
        Assert.assertTrue(titleInSecondPage.isDisplayed());
    }


    @Test
    public void readMoreButtonIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3100)", "");
        WebElement button = driver.findElement(By.xpath("//*[contains(text() , 'اقرأ المزيد من المدونة')]"));
        sleep(700);
        Assert.assertTrue(button.isDisplayed());
    }
    @Test
    public void readMoreButtonIsClickable() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,3100)", "");
        WebElement button = driver.findElement(By.xpath("//*[contains(text() , 'اقرأ المزيد من المدونة')]"));
        sleep(700);
        button.click();
        WebElement titleInSecondPage = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/div[1]/div/a/h2"));
        Assert.assertTrue(titleInSecondPage.isDisplayed());
    }

}


