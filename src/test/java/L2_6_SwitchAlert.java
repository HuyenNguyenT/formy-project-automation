import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L2_6_SwitchAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertBtn = driver.findElement(By.id("alert-button"));
        alertBtn.click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();

        driver.quit();
    }


}
