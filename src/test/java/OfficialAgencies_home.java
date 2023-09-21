import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OfficialAgencies_home extends Home_page_test{





@Test
    public void officialAgenciesTitleIsDisplayed() {

        WebElement websiteParagraphElement = driver.findElement(By.xpath("//*[text()='تطبيق معتمد من الجهات الرسمية']"));
        Assert.assertTrue(websiteParagraphElement.isDisplayed());
    }


    @Test
    public void subParagraphIsDisplayed() {

        jse.executeScript("window.scrollBy(0,500)", "");
        WebElement subParagraph = driver.findElement(By.xpath("//*[text()='مركز طب اتصالي']"));
        Assert.assertTrue(subParagraph.isDisplayed());
    }


    @Test
    public void agenciesImageIsDisplayed() throws InterruptedException {
        WebElement image = driver.findElement(By.cssSelector("img[src='https://famcare.app/wp-content/uploads/2022/05/مركز-طب-اتصالي.png']"));
        Assert.assertTrue(image.isDisplayed());

    }
}
