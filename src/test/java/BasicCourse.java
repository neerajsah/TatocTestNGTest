
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neerajsah
 */
public class BasicCourse 
{
   
    public void basicCourseSelection(WebDriver driver)
    { 
        driver.findElement(By.linkText("Basic Course")).click();
      Assert.assertEquals("http://10.0.1.86/tatoc/basic/grid/gate",driver.getCurrentUrl(),"Assert Failed");
    }
}
