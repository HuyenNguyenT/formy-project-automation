import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class L2_4_Scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        Thread.sleep(5000);
        name.click();
        name.sendKeys("NT LAZY");
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("29/11/2023");
        driver.quit();
    }
}
