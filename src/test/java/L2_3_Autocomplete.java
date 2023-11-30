import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L2_3_Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMP\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement addr = driver.findElement(By.id("autocomplete"));
        addr.sendKeys("1555 Park Blvd, Palo Alto, CA");
        Thread.sleep(1000);
        WebElement btnOk = driver.findElement(By.className("dismissButton"));
        btnOk.click();
        driver.quit();
    }
}
