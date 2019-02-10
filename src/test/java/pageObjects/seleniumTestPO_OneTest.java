package homework.lesson11.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumTestPO_OneTest {

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "seleniumDrivers\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--lang=en_GB");
            driver = new ChromeDriver(chromeOptions);
        }
        return driver;
    }

    public static void exitDriver() {
        driver.quit();
        driver = null;
    }

    public static void main(String[] args) {
        verifyFacebookErrorMessage("wrongemail@hotmail.com", "wrongemail password","The password that you've entered is incorrect. Forgotten password?");
        verifyFacebookErrorMessage("+380112345678", "1111", "The email address or phone number that you've entered doesn't match any account. Sign up for an account.");
    }

    public static void verifyFacebookErrorMessage(String email, String password, String message) {
        GooglePage google = new GooglePage(getDriver());
        google.searchFor("Facebook");
        google.getFacebookLink().click();

        FBLoginPage facebookLoginPage = new FBLoginPage(getDriver());
        facebookLoginPage.makeLogin(email, password);

        String errorMessageText = new FBLoginFailedPage(getDriver())
                .getErrorMessage()
                .getText();

        if (errorMessageText.equals(message)) {
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED!\nActual text is: " + errorMessageText);
        }
        exitDriver();
    }

}


