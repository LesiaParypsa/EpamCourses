package homework.lesson11.pageObjectWithByAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginFailedPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@class=\"_4rbf _53ij\"]")
    private WebElement errorMessage;

    public FBLoginFailedPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

}
