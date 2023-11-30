import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class L5_2_ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement addr = driver.findElement(By.id("autocomplete"));
        addr.sendKeys("1555 Park Blvd, Palo Alto, CA");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnOk = driver.findElement(By.className("dismissButton"));
        btnOk.click();
        driver.quit();
    }
}
