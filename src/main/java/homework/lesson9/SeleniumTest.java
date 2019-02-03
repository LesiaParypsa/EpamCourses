package homework.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "seleniumDrivers\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lang=en_GB");

        WebDriver testDriver = new ChromeDriver(chromeOptions);

        testDriver.get("https://www.google.com");
        WebElement googleSearchField = testDriver.findElement(By.xpath("//input[@name=\"q\"]"));
        googleSearchField.sendKeys("Facebook");

        //        googleSearchField.sendKeys(Keys.ENTER);
        // or
        WebElement googleSearchButton = testDriver.findElement(By.xpath("//div[@class=\"VlcLAe\"]//input[@name=\"btnK\"]"));
        googleSearchButton.submit();

        WebElement googleSearchResult = testDriver.findElement(By.xpath("//h3[@class=\"LC20lb\"]"));
        googleSearchResult.click();

        WebElement fbEmailInput = testDriver.findElement(By.xpath("//input[@id=\"email\"]"));
        fbEmailInput.sendKeys("mile3824@gmail.com");

        WebElement fbPasswordInput = testDriver.findElement(By.xpath("//input[@id=\"pass\"]"));
        fbPasswordInput.sendKeys("mile mile");

        WebElement fbSignInBtn = testDriver.findElement(By.xpath("//input[@data-testid=\"royal_login_button\"]"));
        fbSignInBtn.click();

        WebElement fbWarning = testDriver.findElement(By.xpath("//div[@class=\"_4rbf _53ij\"]"));
        if (fbWarning.getText().equals("The email address that you've entered doesn't match any account. Sign up for an account.")) {
//        if (fbWarning.getText().equals("The email address or phone number that you've entered doesn't match any account. Sign up for an account.")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        testDriver.quit();
    }
}
