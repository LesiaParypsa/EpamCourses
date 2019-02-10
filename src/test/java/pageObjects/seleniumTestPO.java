package homework.lesson11.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumTestPO {

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
        verifyWrongPassword();
        verifyWrongEmail();
    }

    public static void verifyWrongPassword() {

        GooglePage google = new GooglePage(getDriver());

        google.searchFor("Facebook");

        google.getFacebookLink().click();

        FBLoginPage facebookLoginPage = new FBLoginPage(getDriver());
        facebookLoginPage.makeLogin("michmich@gmail.com", "wrongemail password");

        FBLoginFailedPage facebookLoginFailedPage = new FBLoginFailedPage(getDriver());
        WebElement message = facebookLoginFailedPage.getErrorMessage();
        String errorMessageText = message.getText();
//        String errorMessageText = new FacebookLoginFailedPage(getDriver())
//                .getErrorMessage()
//                .getText();

        if (errorMessageText.equals("The password that you've entered is incorrect. Forgotten password?")) {
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED!\nActual text is: " + errorMessageText);
        }
        exitDriver();
    }


    public static void verifyWrongEmail() {
        GooglePage google = new GooglePage(getDriver());
        google.searchFor("Facebook");
        google.getFacebookLink().click();

        FBLoginPage facebookLoginPage = new FBLoginPage(getDriver());
        facebookLoginPage.makeLogin("fds824dfsdgmail.com", "1111");

        String errorMessageText = new FBLoginFailedPage(getDriver())
                .getErrorMessage()
                .getText();

        if (errorMessageText.equals("The email address or phone number that you've entered doesn't match any account. Sign up for an account.")) {
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED!\nActual text is: " + errorMessageText);
        }
        exitDriver();
    }
}
