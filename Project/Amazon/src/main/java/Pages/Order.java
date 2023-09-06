package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Set;
import java.util.ArrayList;

public class Order extends BaseClass{
    public Order(WebDriver driver) {
        super(driver);
    }
    HomePage homePage;
    String OrderPageUrl;
    @FindBy(id= "createAccountSubmit")
    public WebElement OrderPageAssertion;

    public void UserCanOpenHisOrders()
    {
        homePage =new HomePage(driver);
        OrderPageUrl =driver.getCurrentUrl();
        homePage.OrderPageButton();
    }
    public void BackToHomePage()
    {
        driver.navigate().to(OrderPageUrl);
    }
}
