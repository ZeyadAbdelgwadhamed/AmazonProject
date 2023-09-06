package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateListPage extends BaseClass{
    public CreateListPage(WebDriver driver) {
        super(driver);
    }
    HomePage homePage;
    @FindBy(id="a-autoid-0-announce")
    public WebElement ListPageAssertion;
    public void UserCanOpenCreateListPage()
    {
        homePage =new HomePage(driver);
        homePage.CreateListPageButton();
    }
}
