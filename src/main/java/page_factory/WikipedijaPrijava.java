package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaPrijava {
    WebDriver driver;

    @FindBy(id = "firstHeading")
    WebElement titlePrijava;

    @FindBy(id = "wpName1")
    WebElement usernameInput;

    @FindBy(id = "wpPassword1")
    WebElement passwordInput;

    @FindBy(id = "wpRemember")
    WebElement rememberData;

    @FindBy(id = "wpLoginAttempt")
    WebElement prijavaButton;


    public WikipedijaPrijava(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {return titlePrijava.getText();}

    public void clickOnUsernameInput(){
        usernameInput.click();
    }

    public void writeTextUsername(String username){ usernameInput.sendKeys(username); }

    public void clickOnPasswordInput(){
        passwordInput.click();
    }

    public void writeTextPassword(String password){ passwordInput.sendKeys(password); }

    public void rememberLoginData(){ rememberData.click(); }

    public void clickOnPrijavaButton(){
        prijavaButton.click();
    }
}
