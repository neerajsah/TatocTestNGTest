
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
public class Drag {
    
    public void dragAround(WebDriver driver)
    {  
       WebElement from=driver.findElement(By.id("dragbox"));
       WebElement to=driver.findElement(By.id("dropbox"));
       Actions action = new Actions(driver);
       action.dragAndDrop(from, to).build().perform();
       driver.findElement(By.linkText("Proceed")).click();
       Assert.assertEquals("http://10.0.1.86/tatoc/basic/windows",driver.getCurrentUrl(),"Assert Failed");
    }
    
}
