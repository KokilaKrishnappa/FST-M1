package Project;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait.*;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class JobActivity7 {
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
        driver.findElement(By.linkText("Post a Job")).click();
        sleep(20);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).submit();
        //driver.findElement(By.xpath("//label[text()='Job Title']")).click();
        //driver.findElement(By.xpath("(//input[@class='input-text'])[1]")).sendKeys("Tester");
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_title")));
        driver.findElement(By.id("job_title")).click();
        driver.findElement(By.id("job_title")).sendKeys("Tester");
        driver.findElement(By.xpath("//label[text()='Job type']")).click();
        WebElement dropdown=driver.findElement(By.id("job_type"));
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        System.out.println("options" + options);
        select.selectByIndex(2);
        driver.findElement(By.xpath("//label[text()='Description']")).click();
        driver.findElement(By.id("job_description_ifr")).sendKeys("Automation Tester");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        WebDriverWait wait1 = new WebDriverWait (driver, Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("application")));
        driver.findElement(By.id("application")).clear();
        driver.findElement(By.id("application")).sendKeys("srenaray@in.ibm.com");

        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("window.scrollBy(0,250)");

        WebDriverWait wait2 = new WebDriverWait (driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("company_name")));
        driver.findElement(By.id("company_name")).clear();
               driver.findElement(By.id("company_name")).sendKeys("IBM");

       // JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        //jse2.executeScript("window.scrollBy(0,100)");

        /* wait3 = new WebDriverWait (driver, Duration.ofMinutes(1));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("button")));
        //new Actions(driver).moveToElement(driver.findElement(By.className("button"))).click().build().perform();
        driver.findElement((By.className("button"))).click();*/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@value='Preview']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"job_preview_submit_button\"]")).click();
        System.out.println("Job successfully posted");

            }
    /*@AfterClass

    public void closeApp()
    {
        driver.close();
    }*/


}