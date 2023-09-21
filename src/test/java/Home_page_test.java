import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class Home_page_test {

    public static WebDriver driver;
    public static JavascriptExecutor jse;
    public static Wait<WebDriver> wait;

    @BeforeClass
    public void setUp(){
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver=  WebDriverManager.chromedriver().capabilities(options).create();
        //        //اي عنصر ما يظهر انتظره ثانيتين قبل ما تعطيني القرار
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //        // العنصر المعين انتظره 5 ثواني بعدين تاكدلي انو بيعمل اكشن معين
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app/specialists/");
    }

//    @Story("")
//    @Description("")
//    @Test(description = "v")
//    public void navBarIsDisplayed()  {
//
//        WebElement navbar = driver.findElement(By.xpath("//*[@id=\"navbarContent\"]"));
//        Assert.assertTrue(navbar.isDisplayed());
//    }
//    //By.className("collapse navbar-collapse")    : NOT WORKING
//
//
//    @Test
//    public void logoInNavBarIsDisplayed() {
//        WebElement logo = driver.findElement(By.className("navbar-brand"));
//        Assert.assertTrue(logo.isDisplayed());
//
//
////    }  @Test(priority = 0)
////    public void buttonInNavBarIsDisplayed() {
////            WebElement buttonInNav = driver.findElement(By.xpath("//*[@title=’الأخصائيين’ and @class=’nav-link’]"));
////        Assert.assertTrue(buttonInNav.isDisplayed());
////    }
//                //*[contains(@title,’الأخصائيين’)]  :   : NOT WORKING
//
//
//    }
//
//    @Test
//    public void specialButtonInNavBarIsDisplayed() throws InterruptedException {
//        WebElement buttonInNav = driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
//        Assert.assertTrue(buttonInNav.isDisplayed());
//        buttonInNav.click();
//        WebElement secondElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div"));
//        driver.navigate().back();
//        // sleep(500);
//    }
//
//    @Test
//    public void buttonInNavBarIsClickable()  {
//        WebElement buttonInNav = driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
//      wait.until(ExpectedConditions.visibilityOf(buttonInNav));
//        buttonInNav.click();
//        WebElement searchBar = driver.findElement(By.name("search"));
//        Assert.assertTrue(searchBar.isDisplayed());
//        driver.navigate().back();
//        // sleep(500);
//    }
//
//    @Test
//    public void findArrowAfterScroll()  {
//       jse.executeScript("window.scrollBy(0,1000)", "");
//        WebElement arrowButton = driver.findElement(By.id("topcontrol"));
////        wait.until(ExpectedConditions.visibilityOf(arrowButton));
//        Assert.assertTrue(arrowButton.isDisplayed());
//
////        sleep(500);
//    }










//    icon : NOT APPEAR
//    @Test
//    public void findMessageIcon() throws InterruptedException {
//            WebElement messageIcon = driver.findElement(By.cssSelector("css=.intercom-lightweight-app-launcher-icon-open path"));
//        sleep(1000);
//        wait.until(ExpectedConditions.visibilityOf(messageIcon));
//        Assert.assertTrue(messageIcon.isDisplayed());
//
//    }

//  /


}
