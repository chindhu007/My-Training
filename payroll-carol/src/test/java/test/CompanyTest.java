package test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import config.Config;
import page.Companypage;
import page.Loginpage;

public class CompanyTest extends BaseTest{
  @Test(priority=2)
  public void verifyCompanydetails() {
	  
	  Companypage cp=new Companypage(driver);
	  cp.setCompany();
	  cp.nameCompany("RK Automobile");
	  cp.emailCompany("rk13@gmail.com");
	  cp.addressCompany("Ottappalam,Palakkad");
	  cp.startCompany("15-05-2023");
	  cp.saveCompany();
	  
	  Assert.assertEquals(cp.getCompanyPageTitle(),Config.comtitle );
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
