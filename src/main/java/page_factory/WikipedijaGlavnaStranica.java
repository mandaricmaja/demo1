package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaGlavnaStranica {
    WebDriver driver;

    @FindBy (linkText="Šport")
    WebElement poveznicaSport;

    @FindBy (linkText="Glazba")
    WebElement poveznicaGlazba;

    @FindBy (linkText="Prijavi se")
    WebElement poveznicaPrijaviSe;

    @FindBy (className = "hp-dd-1")
    WebElement titleDobrodosli;

    @FindBy (linkText="Odjavi se")
    WebElement poveznicaOdjaviSe;

    @FindBy (id="pt-userpage")
    WebElement loginUser;

    @FindBy (id = "searchInput")
    WebElement searchVlak;

    public WikipedijaGlavnaStranica(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickLink(){
        poveznicaSport.click();
    }

    public void chooseGlazba(){
        poveznicaGlazba.click();
    }

    public void choosePrijavise(){
        poveznicaPrijaviSe.click();
    }

    public String getPageTitle() { return   titleDobrodosli.getText(); }

    public boolean checkOdjava(){ return poveznicaOdjaviSe.isDisplayed(); }

    public String getLoginUser() { return   loginUser.getText(); }

    public void chooseOdjaviSe(){ poveznicaOdjaviSe.click(); }

    public boolean checkPrijava(){ return poveznicaPrijaviSe.isDisplayed(); }

    public void clickOnSearchInput(){
        searchVlak.click();
    }

    public void writeText(String searchInput){
        searchVlak.sendKeys(searchInput);
    }




}
