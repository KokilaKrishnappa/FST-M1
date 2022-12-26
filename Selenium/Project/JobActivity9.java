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

public class JobActivity9 {
    private WebDriver driver;

    @BeforeClass

    public void setup()
    {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void ass1() throws InterruptedException {

        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).submit();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='menu-posts-job_listing']/a[1]/div[3]")));

        driver.findElement(By.xpath("//li[@id='menu-posts-job_listing']/a[1]/div[3]")).click();
        //driver.findElement(By.xpath("//li[@id='menu-posts-job_listing']/ul[1]/li[3]/a[1]")).click();
          // driver.findElement(By.className("page-title-action")).click();
        driver.findElement(By.className("page-title-action")).click();
        driver.findElement(By.id("post-title-0")).sendKeys("Automation TestLead");
        driver.findElement((By.id("_company_website"))).sendKeys("w3.ibm.com");
        driver.findElement((By.id("_company_name"))).sendKeys("IBM");
        driver.findElement(By.id("_company_tagline")).sendKeys("Sr Tester with BDD skills");
        driver.findElement(By.xpath("//button[contains(@class,'components-button editor-post-publish-panel__toggle')]")).click();
        //driver.findElement(By.xpath("//button[text()='Publish…']")).click();

        driver.findElement(By.className("editor-post-publish-panel__header-publish-button")).click();



    }
   /* @AfterClass

    public void closeApp()
    {
        driver.close();
    }
*/

}