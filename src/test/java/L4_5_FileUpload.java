import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.URISyntaxException;

public class L4_5_FileUpload {
    public static void main(String[] args) throws InterruptedException, URISyntaxException {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement chooseBtn = driver.findElement(By.id("file-upload-field"));
        String currentDirectory = System.getProperty("user.dir");
        String fileName = "Google.png";  // Replace with the actual file name
        String filePath = "\\src\\attachments\\";
        String relativePath = currentDirectory + filePath + fileName;
        chooseBtn.sendKeys(relativePath);
        Thread.sleep(5000);
        driver.quit();
    }
}
