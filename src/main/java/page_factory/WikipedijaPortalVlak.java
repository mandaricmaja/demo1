package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaPortalVlak {
    WebDriver driver;

    @FindBy(id = "firstHeading")
    WebElement titleVlak;

    @FindBy(linkText = "maglev vlak")
    WebElement poveznicaMaglevVlak;

    public WikipedijaPortalVlak (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() { return   titleVlak.getText(); }

    public void chooseMaglevVlak() {    poveznicaMaglevVlak.click(); }

}
