package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaLudwigvanBeethoven {
    WebDriver driver;

    @FindBy(id = "firstHeading")
    WebElement titleLudwigvanBeethoven;

    public  WikipedijaLudwigvanBeethoven(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() { return   titleLudwigvanBeethoven.getText(); }
}
