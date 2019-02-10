package homework.lesson11.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

    private WebDriver driver;

    private By searchField = By.xpath("//input[@name=\"q\"]");
    private By searchButton = By.xpath("//div[@class=\"VlcLAe\"]//input[@name=\"btnK\"]");
    private By firstLink = By.xpath("//h3[@class=\"LC20lb\"]");

    public GooglePage (WebDriver driver){
        this.driver = driver;
        this.driver.get("https://www.google.com");
    }

    public WebElement getSearchField() {
        return driver.findElement(searchField);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButton);
    }

    public WebElement getFacebookLink() {
        return driver.findElement(firstLink);
    }

    public void searchFor(String textToSearch){
        getSearchField().sendKeys(textToSearch);
        getSearchButton().submit();
    }
}
