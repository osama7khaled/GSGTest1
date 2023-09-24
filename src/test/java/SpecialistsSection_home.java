import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SpecialistsSection_home extends Home_page_test {


    @Story("Ensure the title is displayed")
    @Description("open the home page and check the title is displayed")
    @Test(description = "open home page and verify the title is displayed and equal نخبة من الأخصائيين والمرشدين", priority = 18)
    public void specialistTitleIsDisplayed() {
        jse.executeScript("window.scrollBy(0,700)", "");
        WebElement title = driver.findElement(By.xpath("//*[text()='نخبة من الأخصائيين والمرشدين']"));
        Assert.assertTrue(title.isDisplayed());
        String getText = title.getText();
        Assert.assertEquals(getText, "نخبة من الأخصائيين والمرشدين");
    }


    @Story("Ensure the specialList card is displayed")
    @Description("open the home page and check the specialList card is displayed")
    @Test(description = "open home page and verify the specialList card is displayed", priority = 19)
    public void specialistCardIsDisplayed() {
        WebElement subParagraph = driver.findElement(By.xpath("//div[@aria-label='3 / 16']"));
        Assert.assertTrue(subParagraph.isDisplayed());
    }

    @Story("Ensure the bookAppointment button is Displayed")
    @Description("verify the bookAppointment button on home page is Displayed")
    @Issue("not navigated to correct page")
    @Test(description = "verify the bookAppointment button on home page is Displayed", priority = 20)
    public void bookAppointmentButtonIsDisplayed()  {
        WebElement bookButton = driver.findElement(By.cssSelector(".swiper-slide-active #bookNow"));
        Assert.assertTrue(bookButton.isDisplayed());
        bookButton.click();
        driver.navigate().back();
    }

    @Story("Ensure the profile button is Displayed")
    @Description("verify the profile button on home page is Displayed")
    @Test(description = "verify the profile button on home page is Displayed", priority = 21)
    public void profileButtonIsDisplayed() {
        WebElement profileButton = driver.findElement(By.cssSelector(".swiper-slide-active .profile"));
        Assert.assertTrue(profileButton.isDisplayed());
        profileButton.click();
        driver.navigate().back();
    }


    // CANT FIND ELEMENT

    @Story("Ensure the profile image is Displayed")
    @Description("verify the profile image for specialist on home page is Displayed")
    @Test(description = "verify the profile image for specialist on home page is Displayed", priority = 22)
    public void specialistProfileImageIsDisplayed() {
        WebElement profileImage = driver.findElement(By.cssSelector(".swiper-slide-active .lazyloaded"));
        Assert.assertTrue(profileImage.isDisplayed());
    }

    //    }
//
    @Story("verify The specialList profile image is Clickable")
    @Description("The specialList profile image should Clickable in specialList card")
    @Test(description = "open home page and click on specialList profile Image and ensure to display element from new page", priority = 23)
    public void specialistImageIsClickable() {
        WebElement profileImage = driver.findElement(By.cssSelector(".swiper-slide-active .lazyloaded"));
        profileImage.click();
        WebElement secondElement = driver.findElement(By.xpath("//h1[contains(.,'جواهر العبدالسلام')]"));
        Assert.assertTrue(secondElement.isDisplayed());
        driver.navigate().back();

    }

    @Story("Ensure the specialList name is Displayed")
    @Description("verify the specialList name on home page is Displayed")
    @Test(description = "open the home page and ensure if the specialList name is Displayed and equal جواهر العبدالسلام", priority = 24)
    public void specialistNameIsDisplayed() {
        WebElement specialistName = driver.findElement(By.cssSelector(".swiper-slide-active .mt-3 a"));
        Assert.assertTrue(specialistName.isDisplayed());
        String name = specialistName.getText();
        Assert.assertEquals(name, "جواهر العبدالسلام");
    }

    @Story("Ensure the specialList name is clickable")
    @Description("verify the specialList name on home page is clickable")
    @Test(description = "open the home page and click on the specialList name and ensure to display element from new page", priority = 25)
    public void specialistNameIsClickable() {
        WebElement specialistName = driver.findElement(By.cssSelector(".swiper-slide-active .mt-3 a"));
        wait.until(ExpectedConditions.visibilityOf(specialistName));
        specialistName.click();
        WebElement secondElement = driver.findElement(By.xpath("//h1[contains(.,'جواهر العبدالسلام')]"));
        Assert.assertTrue(secondElement.isDisplayed());
        driver.navigate().back();
    }


    @Story("Ensure the specialList Description is Displayed")
    @Description("verify the specialList Description on specialList card on home page is Displayed")
    @Test(description = "open the home page and ensure if the specialList Description is Displayed on card", priority = 26)
    public void specialistDescriptionIsDisplayed() {
        WebElement description = driver.findElement(By.cssSelector(".swiper-slide-active .bio a"));
        Assert.assertTrue(description.isDisplayed());

    }

    @Story("Ensure the specialList Description is clickable")
    @Description("verify the specialList Description on home page is clickable")
    @Test(description = "open the home page and click on the specialList Description and ensure to display element from new page", priority = 27)
    public void specialistDescriptionIsClickable() {
        WebElement description = driver.findElement(By.cssSelector(".swiper-slide-active .bio a"));
        description.click();
        WebElement secondElement = driver.findElement(By.xpath("//h1[contains(.,'جواهر العبدالسلام')]"));
        Assert.assertTrue(secondElement.isDisplayed());
        driver.navigate().back();
    }

    @Story("Ensure the contact button is Displayed")
    @Description("verify the contact button on home page is Displayed")
    @Test(description = "open the home page and ensure if the contact button is Displayed and button text equal تواصل الآن", priority = 28)
    public void contactButtonIsDisplayed() {
        WebElement contact = driver.findElement(By.linkText("تواصل الآن"));
        Assert.assertTrue(contact.isDisplayed());
        String name = contact.getText();
        Assert.assertEquals(name, "تواصل الآن");

    }

    @Story("Ensure the contact button is clickable")
    @Description("verify the contact button on home page is clickable")
    @Test(description = "open the home page and ensure if the contact button is clickable and ensure to display element from new page", priority = 29)
    public void contactButtonIsClickable() {
        WebElement contact = driver.findElement(By.linkText("تواصل الآن"));
        contact.click();
        WebElement secondElement = driver.findElement(By.xpath("//h1[contains(.,'أخصائيين فامكير')]"));
        Assert.assertTrue(secondElement.isDisplayed());
        driver.navigate().back();

    }
}