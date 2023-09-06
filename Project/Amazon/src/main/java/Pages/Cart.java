package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart  extends BaseClass{
    public Cart(WebDriver driver) {
        super(driver);
    }
    HomePage homePage;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]")
    public  WebElement CartProductName;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/div/div/div[1]")
    public WebElement CartPrice;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[3]/div[4]/div/div[1]/div[1]/div/form/div/div[3]/div[1]/span[2]/span")
    public WebElement ActualTotalPrice;
    public void UserCanOpenCart()
    {
        homePage=new HomePage(driver);
        ClackingOnElements(homePage.OpenCartButton);
    }


}
