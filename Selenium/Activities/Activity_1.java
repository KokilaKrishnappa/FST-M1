package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_1 {


    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");
        driver.findElement(By.id("about-link")).click();
        driver.navigate().back();

        // Close the browser
        driver.close();
    }

}