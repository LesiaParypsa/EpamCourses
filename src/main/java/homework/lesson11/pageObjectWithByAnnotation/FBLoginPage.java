package homework.lesson11.pageObjectWithByAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement fbEmailInputField;

    @FindBy(xpath = "//input[@id=\"pass\"]")
    private WebElement fbPasswordInputField;

    @FindBy(xpath = "//input[@data-testid=\"royal_login_button\"]")
    private WebElement fbLoginButton;

    public FBLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getFbEmailInputField() {
        return fbEmailInputField;
    }

    public WebElement getFbPasswordInputField() {
        return fbPasswordInputField;
    }

    public WebElement getFbLoginButton() {
        return fbLoginButton;
    }

    public void makeLogin(String email, String password) {
        getFbEmailInputField().sendKeys(email);
        getFbPasswordInputField().sendKeys(email);
        getFbLoginButton().click();
    }

}
