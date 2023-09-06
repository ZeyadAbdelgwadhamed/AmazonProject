package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }
    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]")
    public WebElement AllTabButton;
    @FindBy(css = "span[class=\"icp-nav-link-inner\"]")  //////////////////////////////
    public WebElement ChangeLanguage;
    @FindBy(id = "nav-cart")                            ////////////////////////////////
    public WebElement OpenCartButton;
    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement LoginIcon;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement TodayDeals;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElement ListsAndAccounts;
    @FindBy(xpath = "//*[@id=\"nav-al-wishlist\"]/a/span")
    WebElement CreateListButton;
    @FindBy(id= "nav_prefetch_yourorders")
    WebElement OrderButton;
    @FindBy(id="nav_prefetch_youraddresses")
    WebElement AddressButton;


    public void UserShouldGoToLoginPage() {
        ClackingOnElements(LoginIcon);

    }

    public void UserCanClickOnAllTap() {
        AllTabButton.click();
    }

    public void UserCanOpenToDyDealsPage() {
        ClackingOnElements(TodayDeals);
    }

    public void CreateListPageButton() {
        actions.moveToElement(ListsAndAccounts)
                .moveToElement(CreateListButton)
                .click()
                .build()
                .perform();
    }

    public void OrderPageButton() {
        actions.moveToElement(ListsAndAccounts)
                .moveToElement(OrderButton)
                .click()
                .build()
                .perform();
    }
    public  void AddressPageButton()
    {
        actions.moveToElement(ListsAndAccounts)
                .moveToElement(AddressButton)
                .click()
                .build()
                .perform();
    }


}
