import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class BookSection_home extends Home_page_test {


    @Test(priority = 8)
    public void websiteParagraphIsDisplayed() {

        WebElement websiteParagraphElement = driver.findElement(By.xpath("//*[text()='ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%']"));
        Assert.assertTrue(websiteParagraphElement.isDisplayed());
    }

    @Test(priority = 9)
    public void subParagraphIsDisplayed() {
        WebElement subParagraph = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]/p"));
        Assert.assertTrue(subParagraph.isDisplayed());
    }

    @Test(priority = 11)
    public void bookButtonIsDisplayed() throws InterruptedException {
        WebElement bookButton = driver.findElement(By.linkText("احجز جلستك الأولى"));
        Assert.assertTrue(bookButton.isDisplayed());

    }
    @Test(priority = 11)
    public void bookButtonIsClickable() throws InterruptedException {
        WebElement bookButton = driver.findElement(By.linkText("احجز جلستك الأولى"));
        bookButton.click();
        driver.navigate().back();
        sleep(500);
    }


    @Test(priority = 10)
    public void bookImageIsDisplayed() throws InterruptedException {
        WebElement bookImage = driver.findElement(By.cssSelector("img[src='https://famcare.app/wp-content/uploads/2022/06/shutterstock_1989703088-1-1024x493.png']"));
        Assert.assertTrue(bookImage.isDisplayed());

    }
}
