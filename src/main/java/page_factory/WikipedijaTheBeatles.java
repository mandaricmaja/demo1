package page_factory;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaTheBeatles {
    WebDriver driver;

    @FindBy (id = "firstHeading")
    WebElement titleBeatles;

    @FindBy (id = "searchInput")
    WebElement search;

    @FindBy (id = "searchButton")
    WebElement searchButton;

    public WikipedijaTheBeatles(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() { return   titleBeatles.getText(); }

    public void clickOnSearchInput(){
        search.click();
    }

    public void writeText(String searchInput){
        search.sendKeys(searchInput);
    }

    public void clickOnSearchButton() {searchButton.click(); }

}
