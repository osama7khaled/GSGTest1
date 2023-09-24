import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PartnersSection_home extends Home_page_test {

    @Story("Ensure the title is displayed")
    @Description("open the home page and check the partners title is displayed")
    @Test(description = "open home page and verify the partners title is displayed and equal شركاؤنا في النجاح", priority = 63)
    public void partnersTitleIsDisplayed() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,4000)", "");
        WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'شركاؤنا في النجاح')]"));
        Assert.assertTrue(title.isDisplayed());
        String getText = title.getText();
        Assert.assertEquals(getText, "شركاؤنا في النجاح");
    }


    @Story("verify the sliders sections is displayed")
    @Description("verify the sliders sections is displayed on blog page")
    @Test(description = "open home page and verify to find the sliders sections and ensure if itdisplayed ", priority = 64)
    public void sliderIsDisplayed()  {
        WebElement slider = driver.findElement(By.xpath("/html/body/div[1]/section[8]/div/div/div"));
        Assert.assertTrue(slider.isDisplayed());
    }

    @Story("Ensure the slider is scrolling")
    @Description("verify the partner slider on home page is scrolling")
    @Test(description = "open home page and verify the partner slider is scrolling when tap on circle", priority = 65)
    public void sliderIsScrolling () throws InterruptedException {
        WebElement scroll = driver.findElement(By.cssSelector(".owl-pagination > .owl-page"));
        scroll.click();
    }

    @Story("Ensure the partner image is Displayed")
    @Description("verify the partner image on home page is Displayed")
    @Test(description = "open home page and verify the partner image is Displayed", priority = 66)
    public void partnerImageIsDisplayed()  {
        WebElement image = driver.findElement(By.cssSelector(".owl-wrapper > .owl-item:nth-of-type(8)"));
        Assert.assertTrue(image.isDisplayed());

    }

}
