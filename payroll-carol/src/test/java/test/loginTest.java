package test;


//import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.Assert;
import org.testng.annotations.Test;

import config.Config;
import page.Loginpage;
import utility.Common;

public class loginTest extends BaseTest {
  @Test
  public void verifyLogin() throws IOException {
	  
	  
	   Loginpage lp=new Loginpage(driver);
	  lp.setUsername("carol");
	  
	  lp.setPassword("1q2w3e4r");
		  
	  lp.clicklogin();
	  
	 
	 
	  
	 
	//  Assert.assertEquals(lp.getHomePageTitle(),Config.hometitle );

  }
 
}

  
