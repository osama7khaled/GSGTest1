import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class FeedbackSection_home extends Home_page_test {

    @Story("Ensure the person icon is displayed")
    @Description("open the home page and check the person icon is displayed")
    @Test(description = "open home page and verify the person icon is displayed", priority = 30)
    public void personIconIsDisplayed() {
        jse.executeScript("window.scrollBy(0,1800)", "");
        WebElement icon = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/div/div[2]/div/div[1]/img"));
        Assert.assertTrue(icon.isDisplayed());
    }

    @Story("Ensure the number text is displayed")
    @Description("open the home page and check the number text is displayed")
    @Test(description = "open home page and verify the number text is displayed and equal +500,000", priority = 31)
    public void textNumberIsDisplayed() {
        WebElement textNumber = driver.findElement(By.xpath("//*[text() = '+500,000']"));
        Assert.assertTrue(textNumber.isDisplayed());
        String getText = textNumber.getText();
        Assert.assertEquals(getText, "+500,000");
    }

    @Story("Ensure the subTitle is displayed")
    @Description("open the home page and check the subTitle is displayed")
    @Test(description = "open home page and verify the subTitle is displayed and equal مستفيد ومستفيدة", priority = 32)
    public void subTitleIsDisplayed() {
        WebElement subTitle = driver.findElement(By.xpath("//*[text() = 'مستفيد ومستفيدة']"));
        Assert.assertTrue(subTitle.isDisplayed());
        String getText = subTitle.getText();
        Assert.assertEquals(getText, "مستفيد ومستفيدة");
    }

    @Story("Ensure the feedback slider is displayed")
    @Description("open the home page and check the feedback slider is displayed")
    @Test(description = "open home page and verify the feedback slider is displayed", priority = 33)
    public void sliderIsDisplayed() {
        WebElement slider = driver.findElement(By.cssSelector(".kc-css-66359 .swiper-wrapper"));
        Assert.assertTrue(slider.isDisplayed());
    }

    @Story("Ensure the feedback card is displayed")
    @Description("open the home page and check the feedback card is displayed")
    @Test(description = "open home page and verify the feedback card is displayed", priority = 34)
    public void feedBackCardIsDisplayed() {
        WebElement slider = driver.findElement(By.cssSelector(".swiper-slide:nth-child(4) > .testi-item"));
        Assert.assertTrue(slider.isDisplayed());
    }


    @Story("Ensure the rating is displayed")
    @Description("open the home page and check the rating on card is displayed")
    @Test(description = "open home page and verify the rating on card is displayed", priority = 35)
    public void ratingIsDisplayed() {
        WebElement rate = driver.findElement(By.cssSelector(".swiper-slide:nth-child(5) .stars"));
        Assert.assertTrue(rate.isDisplayed());
    }

    @Story("Ensure the comment is displayed")
    @Description("open the home page and check the comment on card is displayed")
    @Test(description = "open home page and verify the comment on card is displayed", priority = 36)
    public void commentIsDisplayed() {
        WebElement comment = driver.findElement(By.xpath("/html/body/div[1]/section[5]/div/div/div/div/div[2]/div/div/div[5]/div/div/div"));
    }

    @Story("Ensure the comment owner name is displayed")
    @Description("open the home page and check the comment owner name on card is displayed")
    @Test(description = "open home page and verify the comment owner name on card is displayed", priority = 37)
    public void commentOwnerNameIsDisplayed() {
        WebElement ownerName = driver.findElement(By.cssSelector(".swiper-slide:nth-child(5) h4"));
        Assert.assertTrue(ownerName.isDisplayed());
    }
}
