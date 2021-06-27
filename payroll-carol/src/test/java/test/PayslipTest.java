package test;

import java.io.IOException;

import org.testng.annotations.Test;

import page.Loginpage;
import page.Payslippage;


public class PayslipTest extends BaseTest {
  @Test
  public void f() {
  }
  @Test(priority=2)
  public void verifyPayslip() throws IOException {
	  Payslippage ps=new Payslippage(driver);
	  ps.payslipClick();
	  ps.feildPath();
	 // ps.docDownload();
  }

  @Test(priority=1)
  public void verifyLogin() throws IOException {
	  Loginpage lp=new Loginpage(driver);
	  lp.setUsername("carol");
	  lp.setPassword("1q2w3e4r");
	  lp.clicklogin();
  }

}
