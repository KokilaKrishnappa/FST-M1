package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobActivity4 {
    private WebDriver driver;

    @BeforeClass

    public void setup()
    {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void ass1()
    {
        // Assert.assertEquals(driver.getTitle(),"Alchemy Jobs – Job Board Application");
        WebElement Heading = driver.findElement(By.xpath("//h2[text()='Quia quis non']"));
        System.out.println("Heading is :"+ Heading.getText());
        driver.findElement(By.tagName("h2")).click();
        Assert.assertFalse(Boolean.parseBoolean("Quia quis non"));

    }
    @AfterClass

    public void closeApp()
    {
        driver.close();
    }


}