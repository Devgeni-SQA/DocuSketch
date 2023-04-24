package docuSketch;

import docuSketch.runner.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GmailTest extends BaseTest {

    @Test
    public void testMyGmailTitle() {
        getDriver().get("https://www.google.com/");

        String title =  getDriver().getTitle();
        Assert.assertEquals("Google", title);

        WebElement signIn =  getDriver().findElement(By.xpath("//*[@id='gb']//div[2]/a/span"));
        signIn.click();
        WebElement account =  getDriver().findElement(By.xpath("//input[@type='email']"));
        account.sendKeys("qae4488@gmail.com" + Keys.ENTER);

        WebElement inputPasswordField =  getDriver().findElement(By.xpath("//input[@type='password']"));
        inputPasswordField.sendKeys("44884488" + Keys.ENTER);

        WebElement buttonEmail = getDriver().findElement(By.xpath("//a[@aria-label='Почта (откроется новая вкладка)']"));
        buttonEmail.click();

        String titleEmailPage = getDriver().getTitle();
        String subStringtitleEmailPage = "qae4488@gmail.com";
        Boolean checkTitleEmailPage = titleEmailPage.contains(subStringtitleEmailPage);

        Assert.assertEquals(checkTitleEmailPage, true);

        }
    }




