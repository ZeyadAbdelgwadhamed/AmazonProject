package Testes;

import Pages.AddItemToCart;
import Pages.Cart;
import Pages.HomePage;
import Pages.ProductDetails;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddItemsAddCartTest extends BaseTestClass{
    AddItemToCart addItemToCart;
    Cart cart;
    ProductDetails productDetails;
//    SoftAssert softAssert;
    String GetProductName;
    String GetPrice;


    @Test
    public void VerifyThatItemsAreAddedToCartCorrectly()
    {
            addItemToCart=new AddItemToCart(driver);
            cart =new Cart(driver);
            productDetails=new ProductDetails(driver);
            addItemToCart.VerifyThatUserCanClickOnAllTap();
            addItemToCart.UserCanSopping();
            productDetails.UserCanChooseSecondItem();
            GetProductName=productDetails.ProductName.getText();
            GetPrice=productDetails.Price.getText();
            productDetails.UserCanAddToCart();
            cart.UserCanOpenCart();
            Assert.assertTrue(cart.CartProductName.getText().contains(GetProductName),"Product name");
            Assert.assertTrue(cart.CartPrice.getText().contains(GetPrice),"price");
    }



}
