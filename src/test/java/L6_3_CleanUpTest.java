import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class L6_3_CleanUpTest {
    public static void main(String[] args) {
        WebDriver driver = (WebDriver) WebDriverManager.initiateDriverOption();
        driver.get("https://formy-project.herokuapp.com/form");
        L6_4_FormPage formPage = new L6_4_FormPage();
        formPage.submitForm(driver);
        L6_4_ConfirmationPage confirmationPage = new L6_4_ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));
        driver.quit();
    }

}
