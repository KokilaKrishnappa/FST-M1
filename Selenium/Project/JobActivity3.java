package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobActivity3 {
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
       WebElement Heading = driver.findElement(By.tagName("img"));
        System.out.println("Heading is :"+ Heading.getAttribute("src"));
        Assert.assertEquals(driver.getTitle(),"Alchemy Jobs – Job Board Application");

    }
    @AfterClass

    public void closeApp()
    {
        driver.close();
    }


}