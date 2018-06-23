
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
public class Frame {
    
    
    public void frameDungeon(WebDriver driver)
    {  
       driver.switchTo().frame("main");
       String box1= driver.findElement(By.id("answer")).getAttribute("class");
       driver.switchTo().frame("child");
       String box2= driver.findElement(By.id("answer")).getAttribute("class");
       while(!box1.equals(box2))
        {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("main");
        driver.findElement(By.linkText("Repaint Box 2")).click();
        driver.switchTo().frame("child");
        box2= driver.findElement(By.id("answer")).getAttribute("class");
        }
        driver.switchTo().defaultContent();
        driver.switchTo().frame("main");
        driver.findElement(By.linkText("Proceed")).click();
        
       Assert.assertEquals("http://10.0.1.86/tatoc/basic/drag",driver.getCurrentUrl(),"Assert Failed");
    }
}
