package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
     protected WebDriver driver;
    public BaseClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public Actions actions;
    protected static Select select;
    public static void ClackingOnElements(WebElement element)
    {
           element.click();
    }
    public static void SendTextWithElement(WebElement element,String Txt)
    {
       element.sendKeys(Txt);
    }
}
