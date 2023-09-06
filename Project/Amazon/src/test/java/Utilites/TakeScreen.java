package Utilites;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TakeScreen {
    public static void  TakeScreenshots(WebDriver driver,String ScreenName)
    {
          Path path= Paths.get("F:\\Automation_Test\\Amazon\\ScreenShoots",ScreenName+".png");
          try
          {
              FileOutputStream out=new FileOutputStream(path.toString());
              out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
              out.close();

          } catch (IOException e) {
              System.out.println("TackScreenShouts"+e.getMessage());
          }

    }
}
