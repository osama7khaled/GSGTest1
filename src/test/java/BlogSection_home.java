import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;


public class BlogSection_home extends Home_page_test {


    @Story("verify the blog image in main page is displayed")
    @Description(" the blog image in main page should displayed")
    @Test(description = "verify if the blog image in main page is displayed", priority = 46)
    public void blogImageIsDisplayed() {
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
        jse.executeScript("window.scrollBy(0,2850)", "");
        WebElement image = driver.findElement(By.xpath("//a[@href= 'https://famcare.app/%d8%a7%d8%b3%d8%aa%d9%83%d8%b4%d9%81-%d9%85%d8%ae%d8%a7%d8%b7%d8%b1-%d8%a7%d9%84%d8%a7%d8%ad%d8%aa%d8%b1%d8%a7%d9%82-%d8%a7%d9%84%d9%88%d8%b8%d9%8a%d9%81%d9%8a/']"));
        wait.until(ExpectedConditions.visibilityOf(image));
        Assert.assertTrue(image.isDisplayed());
    }

    @Story("verify the blog image in main page is clickable")
    @Description(" the blog image in main page should clickable")
    @Test(description = "verify if the blog image in main page is clickable", priority = 47)
    public void theBlogImageInMainPageIsClickable() {
        WebElement publishedDate = driver.findElement(By.xpath("//a[@href= 'https://famcare.app/%d8%a7%d8%b3%d8%aa%d9%83%d8%b4%d9%81-%d9%85%d8%ae%d8%a7%d8%b7%d8%b1-%d8%a7%d9%84%d8%a7%d8%ad%d8%aa%d8%b1%d8%a7%d9%82-%d8%a7%d9%84%d9%88%d8%b8%d9%8a%d9%81%d9%8a/']"));
        publishedDate.click();
        WebElement titleInSecondPage = driver.findElement(By.cssSelector(".post_title"));
        Assert.assertTrue(titleInSecondPage.isDisplayed());
        driver.navigate().back();
    }

    @Story("verify the blog published date in main page is displayed")
    @Description("the blog published date in main page should displayed")
    @Test(description = "find the blog published date in main page and verify if it displayed", priority = 48)
    public void blogPublishedDateIsDisplayed() {
        WebElement publishedDate = driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div/div/article[1]/div/div[2]/div[1]"));
        Assert.assertTrue(publishedDate.isDisplayed());
    }

    @Story("verify the blog Specialization in main page is displayed")
    @Description("the blog Specialization in main page should displayed")
    @Test(description = "find the blog Specialization in main page and verify if it  displayed", priority = 49)
    public void specializedIsDisplayed() {
        WebElement specialized = driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div/div/article[1]/div/div[2]/div[1]/a"));
        Assert.assertTrue(specialized.isDisplayed());
    }

    @Story("verify the blog Specialization in main page is clickable")
    @Description("the blog Specialization in main page should clickable")
    @Test(description = "verify if the blog Specialization in main page is clickable and ensure of the title on second page is displayed", priority = 50)
    public void theBlogSpecializationIsClickable() {
        WebElement blogSpecialization = driver.findElement(By.cssSelector(".col-12 .post-meta > a"));
        blogSpecialization.click();
        WebElement titleInSecondPage = driver.findElement(By.cssSelector(".col-md-6:nth-child(2) h3 > a"));
        Assert.assertTrue(titleInSecondPage.isDisplayed());
        driver.navigate().back();


    }

    @Story("verify the blog Title in main page is displayed")
    @Description("the blog Title in main page should displayed")
    @Test(description = "verify if the blog Title in main page is displayed", priority = 51)
    public void blogTitleIsDisplayed() {
        WebElement specialized = driver.findElement(By.xpath("//*[contains(text() , 'استكشف مخاطر الاحتراق الوظيفي')]"));
        Assert.assertTrue(specialized.isDisplayed());
    }

    @Story("verify the blog Title in main page is clickable")
    @Description(" the blog Title in main page should clickable")
    @Test(description = "verify if the blog Title in main page is clickable and displayed title from bolg page", priority = 52)
    public void theBlogTitleInMainPageIsClickable() {
        WebElement blogTitle = driver.findElement(By.xpath("//*[contains(text() , 'استكشف مخاطر الاحتراق الوظيفي')]"));
        blogTitle.click();
        WebElement titleInSecondPage = driver.findElement(By.cssSelector(".post_title"));
        driver.navigate().back();
    }

    @Story("verify the blog subTitle in main page is displayed")
    @Description("the blog subTitle in main page should displayed")
    @Test(description = "verify if the blog subTitle in main page is displayed", priority = 53)
    public void postSubTitleIsDisplayed() {
        WebElement specialized = driver.findElement(By.xpath("//*[contains(text() , 'كيف يأتي الاحتراق؟')]"));
        Assert.assertTrue(specialized.isDisplayed());
    }

    @Story("verify the profile image of blog publisher in main page is displayed")
    @Description(" the profile image of blog publisher in main page should displayed")
    @Test(description = "verify if the profile image of blog publisher in main page is displayed", priority = 54)
    public void theProfileImageOfBlogPublisherIsDisplayed() {
        WebElement profileImage = driver.findElement(By.cssSelector(".col-12 .avatar"));
        Assert.assertTrue(profileImage.isDisplayed());
    }

    @Story("verify the profile image of blog publisher in main page is clickable")
    @Description("the profile image of blog publisher in main page should clickable")
    @Test(description = "verify if the profile image of blog publisher in main page is clickable", priority = 55)
    public void theProfileImageOfBlogPublisherIsClickable() {
        WebElement profileImage = driver.findElement(By.cssSelector(".col-12 .avatar"));
        profileImage.click();
        WebElement titleInSecondPage = driver.findElement(By.cssSelector("h1:nth-child(2)"));
        Assert.assertTrue(titleInSecondPage.isDisplayed());
        driver.navigate().back();
    }

    @Story("verify the name of blog publisher in main page is displayed")
    @Description(" the name of blog publisher in main page should displayed")
    @Test(description = "verify if the name of blog publisher in main page is displayed", priority = 56)
    public void theNameOfBlogPublisherInMainPageIsDisplayed() throws InterruptedException {
        WebElement name = driver.findElement(By.cssSelector(".col-12 .m-0 > .author-name"));
        Assert.assertTrue(name.isDisplayed());
    }

    @Story("verify the name of blog publisher in main page is clickable")
    @Description(" the name of blog publisher in main page should clickable")
    @Test(description = "verify if the name of blog publisher in main page is clickable and ensure the title of new page is displayed", priority = 57)
    public void theNameOfBlogPublisherInMainPageIsClickable() {
        WebElement blogTitle = driver.findElement(By.cssSelector(".col-12 .m-0 > .author-name"));
        blogTitle.click();
        WebElement titleInSecondPage = driver.findElement(By.cssSelector("h1:nth-child(2)"));
        Assert.assertTrue(titleInSecondPage.isDisplayed());
        driver.navigate().back();

    }

    @Story("verify the specialization of blog publisher in main page is displayed")
    @Description(" the specialization of blog publisher in main page should displayed")
    @Test(description = "verify if the specialization of blog publisher in main page is displayed", priority = 58)
    public void theSpecializationOfBlogPublisherIsDisplayed() {
        WebElement specialized = driver.findElement(By.cssSelector(".col-12 .m-0:nth-child(2)"));
        Assert.assertTrue(specialized.isDisplayed());
    }

    @Story("verify the details button of blog is displayed")
    @Description(" verify the details button of blog in main page should displayed")
    @Test(description = "verify if the details button of blog in main page is displayed and equal التفاصيل", priority = 59)
    public void detailsButtonIsDisplayed() {
        WebElement button = driver.findElement(By.cssSelector(".col-12 .btn"));
        Assert.assertTrue(button.isDisplayed());
        String getText = button.getText();
        Assert.assertEquals(getText, "التفاصيل");

    }

    @Story("verify the details button of blog is clickable")
    @Description(" verify the details button of blog in main page should clickable")
    @Test(description = "verify if the details button of blog in main page is clickable and ensure the title of new page is displayed", priority = 60)
    public void detailsButtonIsClickable() {
        WebElement button = driver.findElement(By.cssSelector(".col-12 .btn"));
        button.click();
        WebElement titleInSecondPage = driver.findElement(By.xpath("/html/body/div[1]/div/div/h1"));
        Assert.assertTrue(titleInSecondPage.isDisplayed());
        driver.navigate().back();
    }


    @Story("The read more button should displayed")
    @Description("verify The read more button should displayed")
    @Test(description = "Verify The read more button is displayed ", priority = 61)
    public void readMoreButtonIsDisplayed() {
        WebElement button = driver.findElement(By.xpath("//*[contains(text() , 'اقرأ المزيد من المدونة')]"));

        Assert.assertTrue(button.isDisplayed());
    }

    @Story("The read more button should work correctly")
    @Description("verify The read more button should clickable and appear more blogs cards")
    @Test(description = "Verify The read more button is clickable and appear more blogs cards ", priority = 62)
    public void readMoreButtonIsClickable() {
        WebElement button = driver.findElement(By.xpath("//*[contains(text() , 'اقرأ المزيد من المدونة')]"));
        button.click();
        WebElement newCard = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/div[1]/div/a/h2"));
        Assert.assertTrue(newCard.isDisplayed());
    }

}


