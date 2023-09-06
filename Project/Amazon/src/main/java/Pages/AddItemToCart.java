package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AddItemToCart extends BaseClass {
    public AddItemToCart(WebDriver driver) {
        super(driver);
    }
    HomePage homePage;
    ChangeLanguage changeLanguage;
    @FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[2]/label/input")
    WebElement SecondCategoryBox;
    @FindBy(css = "div[class=\"nav-sprite hmenu-close-icon\"]")
    WebElement UserCanCloseAllTap;
    @FindBy(xpath = "//*[@id=\"grid-main-container\"]/div[3]/div/div[1]/div/div/a/div/div")
    WebElement FirstProduct;

    public void VerifyThatUserCanClickOnAllTap() {
        homePage = new HomePage(driver);
        changeLanguage = new ChangeLanguage(driver);
        homePage.UserCanClickOnAllTap();
        ClackingOnElements(UserCanCloseAllTap);
    }

    public void UserCanSopping() {
        homePage.UserCanOpenToDyDealsPage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ClackingOnElements(SecondCategoryBox);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ClackingOnElements(FirstProduct);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }

}
