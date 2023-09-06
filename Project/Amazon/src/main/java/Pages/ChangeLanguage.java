package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeLanguage extends BaseClass{
    public ChangeLanguage(WebDriver driver) {
        super(driver);
    }
    HomePage homepage;
    @FindBy(xpath = "//*[@id=\"icp-language-settings\"]/div[3]")
    WebElement EnglishButton;
    @FindBy(xpath = "//*[@id=\"icp-save-button\"]")
    WebElement LanguageSaveChangeButton;
    public void UserCanChangeLanguage()
    {
        homepage=new HomePage(driver);
        ClackingOnElements(homepage.ChangeLanguage);
        ClackingOnElements(EnglishButton);
        ClackingOnElements(LanguageSaveChangeButton);

    }
}
