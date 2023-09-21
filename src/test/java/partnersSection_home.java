import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class partnersSection_home extends Home_page_test {

    @Test
    public void partnersTitleIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,4000)", "");
        sleep(500);
        WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'شركاؤنا في النجاح')]"));
        Assert.assertTrue(title.isDisplayed());
    }


    @Test
    public void sliderIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,4000)", "");
        sleep(500);
        WebElement slider = driver.findElement(By.xpath("/html/body/div[1]/section[8]/div/div/div"));
        Assert.assertTrue(slider.isDisplayed());
    }

    //TODO
//    @Test
//    public void horizontalScrolling() throws InterruptedException {
//        jse.executeScript("window.scrollBy(0,1000)", "");
//        sleep(800);
//        WebElement scrollRight = driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-f8d21d3511a53e43\"]/div[19]/div"));
//        WebElement ScrollLeft = driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-2aec25438cb2010e4\"]/div[1]/div"));
//
//        jse.executeScript("arguments[0].scrollInView", scrollRight);
//        Thread.sleep(300);
//        jse.executeScript("arguments[0].scrollInView", ScrollLeft);
//        Thread.sleep(300);
//    }

    @Test
    public void sliderIsScrolling () throws InterruptedException {
        jse.executeScript("window.scrollBy(0,4100)", "");
        WebElement scroll = driver.findElement(By.cssSelector(".owl-pagination > .owl-page"));
        scroll.click();
        sleep(10000);
    }

    @Test
    public void partnerImageIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,4100)", "");
        WebElement image = driver.findElement(By.cssSelector(".owl-wrapper > .owl-item"));
        sleep(1000);
        Assert.assertTrue(image.isDisplayed());

    }

}
