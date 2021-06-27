package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import config.Config;
import utility.Common;

public class Divisionpage {
	WebDriver driver;
	Common com;
	
	@FindBy(xpath="//a[@href='/payrollapp/division/create']")
	WebElement division;

	@FindBy(id="division-company_id")
	WebElement cid;
	
	@FindBy(id="division-branch_id")
	WebElement bid;
	
	@FindBy(id="division-division_name")
	WebElement divname;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement save;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr[3]//td//a[1]")
	WebElement view;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr[1]//td//a[2]")
	WebElement update;
	
	
	public Divisionpage(WebDriver driver){
	   	 this.driver=driver;
	   	 PageFactory.initElements(driver,this);
	   	 com=new Common(driver);
		 }
	
	
	public void setDivision() {
		division.click();
	}
	
	 public void createCompany() {
		   com.doSelectbyindex(cid,1);
	   }
	 public void createBranch() {
		 com.clickWhenReady(bid, 10);
		   com.doSelectbyindex(bid,3);
	   }
	 public void createDivision(String cd) {
		   com.doSendKey(divname,cd);
	   }
	 public void clicksave() {
		 save.click();
	 }
	 
	 public void Clickview() {
		   com.clickWhenReady(view, 5);
		   view.click();
	   }
	 public void editDivision(String dv) {
		 com.clickWhenReady(divname, 5);
		 com.doSendKey(divname, dv);
	 }
	 public void divisionupdate() {
		 com.clickWhenReady(update, 10);
		 update.click();
	 }
	 public String getDivisionPageTitle() {
			String divisiontitle=com.waitForPageTitlePresent(Config.divtitle, 20);
			return divisiontitle;
		}    
	 
	
}
