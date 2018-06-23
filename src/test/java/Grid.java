
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
public class Grid {
    
    
    public void gridGate(WebDriver driver)
    {   
        driver.findElement(By.className("greenbox")).click();
        Assert.assertEquals("http://10.0.1.86/tatoc/basic/frame/dungeon",driver.getCurrentUrl(),"Assert Failed");
    }
}
