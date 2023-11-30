import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class L6_4_FormPage {
    public static void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("LAZY");
        driver.findElement(By.id("last-name")).sendKeys("NT");
        driver.findElement(By.id("job-title")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input[value='radio-button-2']")).click();
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("02/02/2012");
        driver.findElement(By.cssSelector("#datepicker")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary' and text() = 'Submit']")).click();
    }
}
