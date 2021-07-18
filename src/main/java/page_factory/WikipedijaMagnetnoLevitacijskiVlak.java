package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaMagnetnoLevitacijskiVlak {
    WebDriver driver;

    @FindBy(id = "firstHeading")
    WebElement titleMagnetnoLevitacijskiVlak;

    public WikipedijaMagnetnoLevitacijskiVlak(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        return    titleMagnetnoLevitacijskiVlak.getText();
    }
}
