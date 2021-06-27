package test;

import org.testng.annotations.Test;

import page.Loginpage;
import page.Workerpage;
import java.io.IOException;


public class WorkerTest extends BaseTest {
	Workerpage wp;
 @Test(priority=2)
  public void verifyWorker() {
	  Workerpage wp=new Workerpage(driver);
	  wp.clickWork();
	  wp.setWorker();
	  wp.firstName("Ravi");
	  wp.lastName("Lal");
	  wp.emailId("ravilal@gmail.com");
	  wp.genderSelect();
	  wp.address("Skyline Apartment");
	  wp.dateBirth("04-05-2015");
	  wp.phNum("9800880090");
	  wp.noNi("989");
	  wp.branchDrop();
	  wp.divDrop();
	  wp.empType();
	  wp.paySlip();
	  wp.sub();
  }
 
 @Test(priority=3)
 public void verifyUpdate() {
	 wp=new Workerpage(driver);
	 wp.clickWork();
	 wp.workUpdate();
 }

 @Test(priority=4)
 public void verifyEdit() {
	 wp=new Workerpage(driver);
	 wp.clickWork();
	 wp.workEdit("AR908");
	 }
	 @Test(priority=5)
	 public void verifyView() {
		 wp=new Workerpage(driver);
		 wp.clickWork();
		 wp.workView();
	 }
	 @Test(priority=6)
	 public void verifyDelete(){
		 wp=new Workerpage(driver);
		 wp.clickWork();
		 wp.workDelete();
	 }
	 @Test(priority=7)
	 public void verifySearch() {
		 wp=new Workerpage(driver);
		 wp.clickWork();
		 wp.nameSearch("Ravi", "Lal");
		 
	 }
	
  @Test(priority=1)
  public void verifyLogin() throws IOException {
	  
	   Loginpage lp=new Loginpage(driver);
	  lp.setUsername("carol");
	  lp.setPassword("1q2w3e4r");
	  lp.clicklogin();
  }
}

