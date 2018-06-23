/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 *
 * @author neerajsah
 */
public class NewEmptyTestNGTest 
{
     WebDriver driver;
     BasicCourse basic=new BasicCourse();
     CookieHandle cookie=new CookieHandle();
     Drag drag=new Drag();
     Frame frame=new Frame();
     Grid grid=new Grid();
     Pop pop=new Pop();
    
    
    @BeforeClass
    public void launchBrowser()
    { 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\neerajsah\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://10.0.1.86/tatoc");
        System.out.print(driver.getCurrentUrl());
        
    }
    
     @Test
    public void callBasic()
    {
        basic.basicCourseSelection(driver);
        System.out.print(driver.getCurrentUrl());
    }   
        
    @Test(dependsOnMethods={"callBasic"})
    public void callGrid()
    {
        grid.gridGate(driver);
        System.out.print(driver.getCurrentUrl());
    }
    
    @Test(dependsOnMethods={"callGrid"})
    public void callFrame()    
    {        
        frame.frameDungeon(driver);
        System.out.print(driver.getCurrentUrl());
    }

    @Test(dependsOnMethods={"callFrame"})
    public void callDrag()
    {        
        drag.dragAround(driver);
        System.out.print(driver.getCurrentUrl());
    }  
    
    @Test(dependsOnMethods={"callDrag"})
    public void callPop()
    {        
        pop.popWindow(driver);
        System.out.print(driver.getCurrentUrl());
    }

    @Test(dependsOnMethods={"callPop"})
    public void callCookie()
    {
        cookie.cookieHandling(driver);
        System.out.print(driver.getCurrentUrl());
    }
    
   
    
    @AfterClass
    public void closeBrowser()
    { driver.quit();
    }
    
}
