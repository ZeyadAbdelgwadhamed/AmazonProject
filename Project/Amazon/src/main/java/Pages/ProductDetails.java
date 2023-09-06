package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends BaseClass{
    public ProductDetails(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"quantity\"]/option[2]")
    WebElement QuantityOfProduct;
    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement AddToCartButton;
    @FindBy(xpath = "//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[2]/span/div/div[1]/a/div")
    WebElement SecondProduct;

    /////////////////////////
    @FindBy(xpath = "/html/body/div[2]/div/div[5]/div[3]/div[4]/div[1]/div/h1/span")
    public WebElement ProductName;
    @FindBy(xpath ="/html/body/div[2]/div/div[5]/div[3]/div[4]/div[10]/div[3]/div[1]/span[2]/span[2]/span[2]")
    public WebElement Price;
    public void UserCanChooseSecondItem()
    {
        ClackingOnElements(SecondProduct);

    }
    public void UserCanAddToCart()
    {
        ClackingOnElements(QuantityOfProduct);
        ClackingOnElements(AddToCartButton);
    }


}
