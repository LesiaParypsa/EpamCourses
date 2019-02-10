package homework.lesson11.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLoginFailedPage {

    WebDriver driver;
    private By errorMessage = By.xpath("//div[@class=\"_4rbf _53ij\"]");

    public FBLoginFailedPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getErrorMessage() {
        return driver.findElement(errorMessage);
    }

}
