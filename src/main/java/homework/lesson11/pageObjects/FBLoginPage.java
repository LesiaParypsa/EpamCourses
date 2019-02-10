package homework.lesson11.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLoginPage {

    WebDriver driver;
    private By fbEmailInputField = By.xpath("//input[@id=\"email\"]");
    private By fbPasswordInputField = By.xpath("//input[@id=\"pass\"]");
    private By fbLoginButton = By.xpath("//input[@data-testid=\"royal_login_button\"]");

    public FBLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFbEmailInputField() {
        return driver.findElement(fbEmailInputField);
    }

    public WebElement getFbPasswordInputField() {
        return driver.findElement(fbPasswordInputField);
    }

    public WebElement getFbLoginButton() {
        return driver.findElement(fbLoginButton);
    }

    public void makeLogin(String email, String password) {
        getFbEmailInputField().sendKeys(email);
        getFbPasswordInputField().sendKeys(password);
        getFbLoginButton().click();
    }

}
