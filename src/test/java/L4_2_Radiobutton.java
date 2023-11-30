import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L4_2_Radiobutton {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement btn1 = driver.findElement(By.id("radio-button-1"));
        Thread.sleep(5000);
        btn1.click();
        WebElement btn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        Thread.sleep(5000);
        btn2.click();
        WebElement btn3 = driver.findElement(By.cssSelector("input[value='option3']"));
        Thread.sleep(5000);
        btn3.click();
        WebElement radioBtn1 = driver.findElement(By.xpath("//div[1]/input"));
        radioBtn1.click();
        WebElement radioBtn2 = driver.findElement(By.xpath("//div[2]/input"));
        radioBtn2.click();
        WebElement radioBtn3 = driver.findElement(By.xpath("//div[3]/input"));
        radioBtn3.click();
        driver.quit();
    }
}
