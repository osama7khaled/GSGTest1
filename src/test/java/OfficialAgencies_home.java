import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OfficialAgencies_home extends Home_page_test {


    @Story("Ensure the title is displayed")
    @Description("open the home page and check the title is displayed")
    @Test(description = "open home page and verify the title is displayed and equal تطبيق معتمد من الجهات الرسمية", priority = 15)
    public void officialAgenciesTitleIsDisplayed() {
        WebElement title = driver.findElement(By.xpath("//*[text()='تطبيق معتمد من الجهات الرسمية']"));
        Assert.assertTrue(title.isDisplayed());
        String getText = title.getText();
        Assert.assertEquals(getText, "تطبيق معتمد من الجهات الرسمية");
    }

    @Story("Ensure the image is Displayed")
    @Description("verify the image on home page is Displayed")
    @Test(description = "open home page and verify the agencies image is Displayed", priority = 16)
    public void agenciesImageIsDisplayed() {
        WebElement image = driver.findElement(By.cssSelector("img[src='https://famcare.app/wp-content/uploads/2022/05/مركز-طب-اتصالي.png']"));
        Assert.assertTrue(image.isDisplayed());

    }

    @Story("Ensure the subTitle is displayed")
    @Description("open the home page and check the subTitle is displayed")
    @Test(description = "open home page and verify the subTitle is displayed and equal مركز طب اتصالي\n", priority = 17)
    public void subTitleIsDisplayed() {
        jse.executeScript("window.scrollBy(0,500)", "");
        WebElement subTitle = driver.findElement(By.xpath("//*[text()='مركز طب اتصالي']"));
        Assert.assertTrue(subTitle.isDisplayed());
        String getText = subTitle.getText();
        Assert.assertEquals(getText, "مركز طب اتصالي");
    }


}
