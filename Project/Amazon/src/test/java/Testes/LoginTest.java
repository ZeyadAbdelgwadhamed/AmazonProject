package Testes;

import Pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestClass{
    Login login;

    @Test
    public void UserCanNotLogin()
    {
        login=new Login(driver);
        login.UserCanMakeLoginSuccessfully("basel@gmail.com","123456");
        Assert.assertTrue(login.ErrorMassageAfterInvalidLogin.getText().contains("كلمة المرور غير صحيحة."));

    }
}
