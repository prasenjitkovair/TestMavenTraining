/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KovPackChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author prasenjitd
 */
public class TestNGSample {
    
    @BeforeTest
    public static void launchBrowser()
    {
        System.out.println("Launching the browser");
    }
    
    @BeforeClass
    public static void OpenUrl()
    {
        System.out.println("Opening the URL");
    }
    
    
    @BeforeMethod
    public static void methodSetUp()
    {
        System.out.println("In before method");
    }
    
    @Test(dataProvider="LoginData")
    public static void SigninTest(String Login,String Password)
    {
        
        
        System.out.println("In Sign In test..");
        System.out.println("Login: " + Login);
        System.out.println("Login: " + Password);
    }
    
    @Test
    @Parameters( "ValMessage1" )
    public static void ValidationTest(String valmsg)
    {
        System.out.println("In Validation test");
        System.out.println("Validation Message: " + valmsg);
        
    }
    
    @AfterMethod
    public static void methodTeardown()
    {
        System.out.println("In method teardown");
    }
    
    @AfterClass
    public static void ClassTearDown()
    {
        System.out.println("In AfterClass");
    }
    
    @AfterTest
    public static void CloseBrowser()
    {
        System.out.println("Closing the browser");
    }
    
    @DataProvider
    public static Object[][] LoginData()
    {
        /*Object[][] loginDataObj = new Object[][]
        {
            {"admin","ks"},
            {"pd","pd"}
        };*/
        
        return new Object[][] { {"admin", "ks"},{"pd","pd"} };
        
                
                
    }
    
}
