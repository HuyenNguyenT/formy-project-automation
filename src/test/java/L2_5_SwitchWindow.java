import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L2_5_SwitchWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabBtn = driver.findElement(By.id("new-tab-button"));
        newTabBtn.click();
        String originalHandle = driver.getWindowHandle();
        Thread.sleep(5000);
        for(String handle1 : driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);
        driver.quit();
    }
}
