
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
public class CookieHandle {
    
    
    public void cookieHandling(WebDriver driver)
    {  
       driver.findElement(By.linkText("Generate Token")).click();
       String token = driver.findElement(By.id("token")).getText();
       String cookieName = token.substring(0,5);
       String cookieValue = token.substring(7,token.length());
       org.openqa.selenium.Cookie cookie= new org.openqa.selenium.Cookie(cookieName,cookieValue);
       driver.manage().addCookie(cookie);
       driver.findElement(By.linkText("Proceed")).click();
       Assert.assertEquals("http://10.0.1.86/tatoc/end",driver.getCurrentUrl(),"Assert Failed");
    }
    
    
}
