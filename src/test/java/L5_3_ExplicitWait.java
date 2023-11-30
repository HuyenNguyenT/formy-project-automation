import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class L5_3_ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement addr = driver.findElement(By.id("autocomplete"));
        addr.sendKeys("1555 Park Blvd, Palo Alto, CA");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement btnOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dismissButton")));
        btnOk.click();
        driver.quit();
    }
}
