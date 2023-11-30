import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class L6_1_Form {
    public static void main(String[] args) throws Exception {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/form");
        WebElement fname = driver.findElement(By.id("first-name"));
        fname.sendKeys("LAZY");
        WebElement lname = driver.findElement(By.id("last-name"));
        lname.sendKeys("NT");
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Tester");
        WebElement education = driver.findElement(By.id("radio-button-2"));
        education.click();
        WebElement gender = driver.findElement(By.id("checkbox-2"));
        gender.click();
        Select experience = new Select(driver.findElement(By.id("select-menu")));
        experience.selectByVisibleText("2-4");
        WebElement datepicker = driver.findElement(By.cssSelector("input#datepicker"));
        datepicker.sendKeys("01/11/2000");
        datepicker.sendKeys(Keys.ENTER);
        WebElement submitBtn = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary' and text() = 'Submit']"));
        submitBtn.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expectedMessage = "Thanks for submitting your form";
        String actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Thanks for submitting your form')]")).getText();
        if (!actualMessage.equals(expectedMessage)){
            throw new Exception("Link is not correct");
        }
        driver.quit();

    }
}
