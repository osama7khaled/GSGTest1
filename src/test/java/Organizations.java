import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Organizations extends Home_page_test{




    @Test
    public void aboodA() {

        WebElement openAboutUs = driver.findElement(By.xpath("//a[contains(text(),'المنظمات')]"));
        openAboutUs.click();
        WebElement abood = driver.findElement(By.xpath(" (//*[contains(text() , 'منصة فامكير')])[1]"));
        Assert.assertTrue(abood.isDisplayed());
    }


    @Story("Organizations section image title Displayed")
    @Description("The specialList Name should Displayed in specialList card")
    @Test(description = "Verify The specialList Name is Displayed in specialList card ", priority = 8)
    public void imageTitleSectionDisplayed() {

        WebElement openAboutUs = driver.findElement(By.xpath("//a[contains(text(),'المنظمات')]"));
        openAboutUs.click();
        WebElement imageTitleSection = driver.findElement(By.xpath("(//*[contains(text() , 'استمرارية في العطاء')])[2]"));
        Assert.assertTrue(imageTitleSection.isDisplayed());
    }


    @Story("Organizations section image Displayed")
    @Description("The specialList Name should Displayed in specialList card")
    @Test(description = "Verify The specialList Name is Displayed in specialList card ", priority = 7)
    public void imageSectionDisplayed() {
        WebElement joinAOrganizations_buttonLocator = driver.findElement(By.xpath("//*[@title = 'المنظمات']"));
        joinAOrganizations_buttonLocator.click();
        WebElement imageSection = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[3]/div/div/div[1]/img"));
        Assert.assertTrue(imageSection.isDisplayed());
    }

//    @Story("Filling all form")
//    @Description("")
//    @Test(description = "", priority = 13)
//    public void shouldBeAbleToOpenRequestTheServiceForm() throws InterruptedException {
//
//        WebElement joinAOrganizations_buttonLocator = driver.findElement(By.xpath("//*[@title = 'المنظمات']"));
//        joinAOrganizations_buttonLocator.click();
//
//        WebElement requestTheServiceFButton = driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[2]/button"));
//        requestTheServiceFButton.click();
//
//        String your_name = Faker.internet().emailAddress();
//        WebElement joinAsSpecialistForm_yourName_inputLocator = driver.findElement(By.cssSelector("#joinUsModal form input[name='your-name']"));
//        joinAsSpecialistForm_yourName_inputLocator.sendKeys(your_name);
//        System.out.println(your_name);
//    }

}
