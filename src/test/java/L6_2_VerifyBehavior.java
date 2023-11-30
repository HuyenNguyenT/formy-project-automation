import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class L6_2_VerifyBehavior {
    public static void main(String[] args) {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("LAZY");
        driver.findElement(By.id("last-name")).sendKeys("NT");
        driver.findElement(By.id("job-title")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input[value='radio-button-2']")).click();
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("02/02/2012");
        driver.findElement(By.cssSelector("#datepicker")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary' and text() = 'Submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert"))).getText();
        assertEquals("The form was successfully submitted!", alert);
        driver.quit();

    }
}
