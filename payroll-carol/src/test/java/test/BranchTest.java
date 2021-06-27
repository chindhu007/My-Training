package test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import config.Config;
import page.Branchpage;
import page.Companypage;
import page.Loginpage;




public class BranchTest extends BaseTest{
	Branchpage bp;
  @Test(priority=2)
  public void verifyBranchdetails() {
	  Companypage cp=new Companypage(driver);
	  cp.setCompany();
	   bp=new Branchpage(driver);
	  bp.setBranch();
	   bp.createCompany();
	  bp.createBranchname("pqrs");
	  bp.createBranchaddr("abcd");
	
	  bp.clickSave();
	 
	  
  }
  @Test(priority=3)
  public void verifyEditBranch() {
	   bp=new Branchpage(driver);
	   bp.Branchupdate();
	   bp.editBranchname("xyz");
	   bp.editStatus();
	   bp.clickSave();
  }
  @Test(priority=4)
  public void verifyBranchView() {
	  bp=new Branchpage(driver);
	  bp.Clickview();
	 // Assert.assertEquals("xyz",Config.branchname );
  }
  @Test(priority=1)
  public void verifyLogin() throws IOException {
	  
	   Loginpage lp=new Loginpage(driver);
	  lp.setUsername("carol");
	  lp.setPassword("1q2w3e4r");
	  lp.clicklogin();
	  
	//  Assert.assertEquals(lp.getHomePageTitle(),Config.hometitle );
  }
}
