import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;


public class SetUp {
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
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app");
    }
    @Test
    public void df(){
        driver.close();
    }

}