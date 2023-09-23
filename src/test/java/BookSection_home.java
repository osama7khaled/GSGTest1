import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import static java.lang.Thread.sleep;

public class BookSection_home extends Home_page_test {


    @Story("Ensure the title text is Displayed")
    @Description("verify the title on home page is Displayed and equal")
    @Test(description = "verify the title on home page is Displayed and equal ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%", priority = 10)
    public void titleIsDisplayed() {
        WebElement title = driver.findElement(By.xpath("//*[text()='ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%']"));
        String getText = title.getText();

        Assert.assertTrue(title.isDisplayed());
        Assert.assertEquals(getText, "ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
    }

    @Story("Ensure the subTitle text is Displayed")
    @Description("verify the subTitle on home page is Displayed")
    @Test(description = "verify the subTitle on home page is Displayed and equal لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن", priority = 11)
    public void subTitleIsDisplayed() {
        WebElement subtitle = driver.findElement(By.xpath("//div[@id='heroText']/div/div[2]/p"));
        String getText = subtitle.getText();
        Assert.assertTrue(subtitle.isDisplayed());
        Assert.assertEquals(getText, "لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");
    }

    @Story("Ensure the bookAppointment button is Displayed")
    @Description("verify the bookAppointment button on home page is Displayed")
    @Test(description = "verify the bookAppointment button on home page is Displayed and equal احجز جلستك الأولى", priority = 12)
    public void bookAppointmentButtonIsDisplayed() {
        WebElement bookButton = driver.findElement(By.linkText("احجز جلستك الأولى"));
        Assert.assertTrue(bookButton.isDisplayed());
        String getText = bookButton.getText();
        Assert.assertEquals(getText, "احجز جلستك الأولى");

    }

    @Story("Ensure the bookAppointment button is clickable")
    @Description("verify the bookAppointment button on home page is clickable")
    @Test(description = "click on the bookAppointment button on home page and ensure if any element from new page is displayed", priority = 13)
    public void bookAppointmentButtonIsClickable()  {
        WebElement bookButton = driver.findElement(By.linkText("احجز جلستك الأولى"));
        bookButton.click();
        WebElement elementInNewWindow = driver.findElement(By.cssSelector(".product-header__title"));
        driver.navigate().back();


    }


    @Story("Ensure the image is Displayed")
    @Description("verify the image on home page is Displayed")
    @Test(description = "verify the image on home page is Displayed", priority = 14)
    public void bookImageIsDisplayed()  {
        WebElement bookImage = driver.findElement(By.cssSelector("img[src='https://famcare.app/wp-content/uploads/2022/06/shutterstock_1989703088-1-1024x493.png']"));
        Assert.assertTrue(bookImage.isDisplayed());

    }
}
