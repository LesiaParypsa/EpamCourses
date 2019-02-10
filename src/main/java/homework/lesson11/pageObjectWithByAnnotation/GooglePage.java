package homework.lesson11.pageObjectWithByAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    @FindBy(xpath = "//div[@class=\"VlcLAe\"]//input[@name=\"btnK\"]")
    private WebElement searchButton;

    @FindBy(xpath = "//h3[@class=\"LC20lb\"]")
    private WebElement firstLink;

    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.driver.get("https://www.google.com");
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getFacebookLink() {
        return firstLink;
    }

    public void searchFor(String textToSearch) {
        getSearchField().sendKeys(textToSearch);
        getSearchButton().submit();
    }
}
