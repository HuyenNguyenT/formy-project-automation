import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L4_3_Datepicker {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("01/12/2023");
        datepicker.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();
    }
}
