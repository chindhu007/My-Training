package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.Config;
import page.Companypage;
import page.Divisionpage;
import page.Loginpage;



public class DivisionTest extends BaseTest{
	Divisionpage dp;
  @Test(priority=2)
  public void verifyDivisiondetails() {
	  Companypage cp=new Companypage(driver);
	  cp.setCompany();
	  
	  dp=new Divisionpage(driver);
	  dp.setDivision();
	  dp.createCompany();
	  dp.createBranch();
	  dp.createDivision("div");
	  dp.clicksave();
	//  Assert.assertEquals(dp.getDivisionPageTitle(),Config.divtitle );
  }
	  
	  @Test(priority=3)
	  public void verifyEditDivision() {
	  dp=new Divisionpage(driver);
	  dp.divisionupdate();
	  dp.editDivision("test");
	  dp.clicksave();
	  
  }
	  @Test(priority=4)
	  public void verifyViewDivision() {
		  dp=new Divisionpage(driver);
		  dp.Clickview();
	  }
  @Test(priority=1)
  public void verifyLogin() throws IOException {
	  
	   Loginpage lp=new Loginpage(driver);
	  lp.setUsername("carol");
	  lp.setPassword("1q2w3e4r");
	  lp.clicklogin();
	  
	 // Assert.assertEquals(lp.getHomePageTitle(),Config.hometitle );
  }
  

}
