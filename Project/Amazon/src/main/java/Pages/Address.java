package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Address extends BaseClass {
    public Address(WebDriver driver) {
        super(driver);
    }
    HomePage homePage;
    @FindBy(id="createAccountSubmit")
    public WebElement AddressAssertion;
    public void UserCanOpenAddressPage()
    {
        homePage=new HomePage(driver);
        homePage.AddressPageButton();
    }
}
