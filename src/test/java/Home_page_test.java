import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;


public class Home_page_test {

    public static WebDriver driver;
    public static JavascriptExecutor jse;
    public static Wait<WebDriver> wait;

    @BeforeClass
    public void setUp() {
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        //        //اي عنصر ما يظهر انتظره ثانيتين قبل ما تعطيني القرار
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        //        // العنصر المعين انتظره 5 ثواني بعدين تاكدلي انو بيعمل اكشن معين
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app/");
    }


//    @Story("Ensure the navbar is displayed")
//    @Description("open the home page and check the navbar is displayed")
//    @Test(description = "try to find navbar section and assert true if it displayed", priority = 0)
//    public void navBarIsDisplayed() {
//
//        WebElement navbar = driver.findElement(By.xpath("//*[@id=\"navbarContent\"]"));
//        Assert.assertTrue(navbar.isDisplayed());
//    }
//    //By.className("collapse navbar-collapse")    : NOT WORKING
//
//
//    @Story("Ensure the logo on navbar is displayed")
//    @Description("open the home page and check if the logo on navbar is displayed")
//    @Test(description = "try to find logo and assert true if it displayed", priority = 1)
//    public void logoInNavBarIsDisplayed() {
//        WebElement logo = driver.findElement(By.className("navbar-brand"));
//        Assert.assertTrue(logo.isDisplayed());
//    }
//
//    @Story("Ensure the logo on navbar is clickable")
//    @Description("click on the logo on navbar and ensure if it clickable ")
//    @Test(description = "click on the logo on navbar and ensure if it clickable and open home page , and ensure of any element on home page is displayed", priority = 2)
//    public void logoInNavBarIsClickable() {
//        WebElement logo = driver.findElement(By.className("navbar-brand"));
//        logo.click();
//        WebElement secondElement = driver.findElement(By.className("navbar-brand"));
//
//    }
//
//    @Story("Ensure the specialList button on navbar is Displayed")
//    @Description("verify the specialList button on navbar is Displayed and equal الأخصائيين")
//    @Test(description = "find the specialList button element is Displayed and ensure if equal الأخصائيين", priority = 3)
//    public void specialListButtonInNavBarIsDisplayed() {
//        WebElement buttonInNav = driver.findElement(By.xpath("//*[@title='الأخصائيين' and @class='nav-link']"));
//        String getText = buttonInNav.getText();
//        Assert.assertTrue(buttonInNav.isDisplayed());
//        Assert.assertEquals(getText, "الأخصائيين");
//    }
//
//
//    @Story("Ensure the specialList button on navbar is clickable")
//    @Description("click on the specialList button and ensure if it clickable ")
//    @Test(description = "click on the specialList button and ensure if it clickable and open SpecialList Page page , and ensure of any element on SpecialList page is displayed", priority = 4)
//    public void specialListButtonInNavBarIsClickable() {
//        WebElement buttonInNav = driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
//        wait.until(ExpectedConditions.visibilityOf(buttonInNav));
//        buttonInNav.click();
//        WebElement searchBar = driver.findElement(By.name("search"));
//        Assert.assertTrue(searchBar.isDisplayed());
//        driver.navigate().back();
//    }
//
//    @Story("verify the page is scrolling")
//    @Description("verify the page is scrolling Down correctly")
//    @Test(description = "verify The blog page is Scrolling Down Correctly", priority = 5)
//    public void thePageIsScrolling() throws InterruptedException {
//        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
//        sleep(2000);
//    }
//
//    @Story("Ensure the Arrow icon is displayed")
//    @Description("open the home page and scrolling down and check if the arrow icon is displayed")
//    @Test(description = "open the home page and scrolling down and check if the arrow icon is displayed", priority = 6)
//    public void findArrowAfterScrollIsDisplayed() {
//        WebElement arrowButton = driver.findElement(By.id("topcontrol"));
//        Assert.assertTrue(arrowButton.isDisplayed());
//    }
//
//    @Story("Ensure the Arrow icon is clickable")
//    @Description("open the home page and scrolling down and click on arrow button to ensure if it clickable")
//    @Test(description = "open the home page and scrolling down and click on arrow button to ensure if it clickable and scrolling up again", priority = 7)
//    public void findArrowAfterScrollIsClickable() {
//        WebElement arrowButton = driver.findElement(By.id("topcontrol"));
//        arrowButton.click();
//    }
//
//    @Story("Ensure the message icon is displayed")
//    @Description("open the home page check if the message icon is displayed")
//    @Test(description = "open the home page and check if the message icon is displayed", priority = 8)
//    public void messageIconIsDisplayed() throws InterruptedException {
//        WebElement messageIcon = driver.findElement(By.xpath("/html/body/div[12]/div/div[1]"));
//        wait.until(ExpectedConditions.visibilityOf(messageIcon));
//        Assert.assertTrue(messageIcon.isDisplayed());
//
//    }
//
//    @Story("Ensure the message icon is clickable")
//    @Description("open the home page and click on message button to ensure if it clickable")
//    @Test(description = "open the home page and click on message button to ensure if it clickable and displayed messages menu", priority = 9)
//    public void messageIconIsClickable() throws InterruptedException {
//        WebElement messageIcon = driver.findElement(By.xpath("/html/body/div[12]/div/div[1]"));
//        wait.until(ExpectedConditions.visibilityOf(messageIcon));
//        messageIcon.click();
//        sleep(2000);
//        WebElement messageMenu = driver.findElement(By.xpath("/html/body/div[12]/div/div[1]"));
//        sleep(5000);
//        Assert.assertTrue(messageMenu.isDisplayed());
//    }

}
