package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaOdjava {
    WebDriver driver;

    @FindBy(id = "pt-anonuserpage")
    WebElement textNistePrijavljeni;

    public WikipedijaOdjava(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {return textNistePrijavljeni.getText();}
}
