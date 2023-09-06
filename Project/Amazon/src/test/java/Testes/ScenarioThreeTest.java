package Testes;

import Pages.Address;
import Pages.CreateListPage;
import Pages.Order;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ScenarioThreeTest extends BaseTestClass{
    CreateListPage createListPage;
    HomePage homePage;
//    SoftAssert softAssert;
    Address address;
    Order order;
    @Test
    public void UserShouldOpenCreateListPage() throws InterruptedException {

        createListPage=new CreateListPage(driver);
        order =new Order(driver);
        address=new Address(driver);
        createListPage.UserCanOpenCreateListPage();
        Assert.assertTrue(createListPage.ListPageAssertion.getText().contains("تسجيل الدخول"));
        order.UserCanOpenHisOrders();
        Assert.assertTrue(order.OrderPageAssertion.getText().contains("إنشاء حساب لك في أمازون"),"User Can Not Know the Orders Without Submit");
        order.BackToHomePage();
        Thread.sleep(3000);
        address.UserCanOpenAddressPage();
        Assert.assertTrue(address.AddressAssertion.getText().contains("إنشاء حساب لك في أمازون"),"User Can Not Know the Address Without Submit");

    }
}
