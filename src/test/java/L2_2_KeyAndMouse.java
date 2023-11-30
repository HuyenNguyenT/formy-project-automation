import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L2_2_KeyAndMouse {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMP\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("NT LAZY");
        Thread.sleep(5000);
        WebElement btn = driver.findElement(By.id("button"));
        btn.click();
        driver.quit();

    }
}
