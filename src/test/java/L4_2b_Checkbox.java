import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L4_2b_Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
        checkbox2.click();
        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
        checkbox3.click();
        Thread.sleep(5000);
        driver.navigate().refresh();
        WebElement checkbox1Css = driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        checkbox1Css.click();
        WebElement checkbox2Css = driver.findElement(By.cssSelector("input#checkbox-2"));
        checkbox2Css.click();
        WebElement checkbox3Css = driver.findElement(By.xpath("//div[3]//div/input"));
        checkbox3Css.click();
        driver.navigate().refresh();
        Thread.sleep(5000);
        checkbox3Css = driver.findElement(By.xpath("//div[3]//div/input"));
        checkbox3Css.click();
        driver.quit();
    }
}
