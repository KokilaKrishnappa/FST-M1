package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait.*;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class JobActivity6 {
    private WebDriver driver;

    @BeforeClass

    public void setup()
    {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void ass1() throws InterruptedException {
        // Assert.assertEquals(driver.getTitle(),"Alchemy Jobs – Job Board Application");
        driver.findElement(By.linkText("Jobs")).click();
        //driver.manage().tim
        driver.findElement(By.className("entry-title"));
        sleep(20);
        driver.findElement(By.id("search_keywords")).sendKeys("Banking");
        driver.findElement((By.xpath("//input[@type='submit']"))).click();
        //sleep(20);
        //Example with ExpectedConditions
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[text()='BankingTestJob'])[1]")));
        driver.findElement(By.xpath("//li[contains(@class,'post-4474 job_listing')]//a[1]")).click();
        sleep(20);
        driver.findElement((By.xpath("//input[@class='application_button button']"))).click();
        sleep(20);
        WebElement email = driver.findElement(By.linkText("abhiram@cklabs.com"));
        System.out.println("email" + email);



    }
    @AfterClass

    public void closeApp()
    {
        driver.close();
    }


}