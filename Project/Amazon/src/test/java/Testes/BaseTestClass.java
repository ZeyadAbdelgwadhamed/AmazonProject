package Testes;

import Utilites.TakeScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTestClass {
    protected WebDriver driver;
    @BeforeClass
    public void OpenBrowser()
    {
        System.setProperty("Webdriver.Edge.driver",System.getProperty("user.dir")+"/Drivers/msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.eg/");

    }

    @AfterMethod
    public void ScreenShooOnFailEr(ITestResult result)
    {
      if(result.getStatus()==ITestResult.FAILURE)
          System.out.println("FAILURE");
          System.out.println("TackScreenShoot");
        TakeScreen.TakeScreenshots(driver,result.getName());

    }


    @AfterClass
    public void CloseBrowser()
    {
        driver.quit();
    }
}
