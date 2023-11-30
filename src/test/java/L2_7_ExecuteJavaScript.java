import org.openqa.selenium.*;

public class L2_7_ExecuteJavaScript {
    public static void main(String[] args) {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modalBtn = driver.findElement(By.id("modal-button"));
        modalBtn.click();
        WebElement closed = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click",closed);
        driver.quit();
    }

}
