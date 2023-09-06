package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Login extends BaseClass{
    public Login(WebDriver driver) {
        super(driver);
    }
    HomePage homePage;

    @FindBy(id="ap_email")
    WebElement EmailBox;
    @FindBy(id="ap_password")
    WebElement PasswordBox;
    @FindBy(css="span[class=a-button-inner]")
    WebElement ContinueButton;
    @FindBy(id="signInSubmit")
    WebElement SubmitButton;
    @FindBy(id="auth-error-message-box")
    public WebElement ErrorMassageAfterInvalidLogin;

    public void UserCanMakeLoginSuccessfully(String Email,String Pass)
    {
        homePage=new HomePage(driver);
        homePage.UserShouldGoToLoginPage();
        SendTextWithElement(EmailBox,Email);
        ClackingOnElements(ContinueButton);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        SendTextWithElement(PasswordBox,Pass);
        ClackingOnElements(SubmitButton);
    }


}
