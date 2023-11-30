import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class L4_4_DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu.click();
//        WebElement pageScroll = driver.findElement(By.cssSelector(".dropdown-menu.show a:nth-child(12)"));
//        pageScroll.click();
        WebElement pageScroll = driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[contains(text(),'Page Scroll')]"));
        Thread.sleep(5000);
        pageScroll.click();
        driver.quit();
    }
}
