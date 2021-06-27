package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Config;
import utility.Common;

public class Branchpage {
	WebDriver driver;
	Common com;
	
	@FindBy(xpath="//a[@href='/payrollapp/branch/create']")
	WebElement branch;
	
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr[1]//td//a[1]")
	WebElement view;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr[1]//td//a[2]")
	WebElement  updateoption;
	
	@FindBy(id="company-company_name")
	private WebElement comname;
	
	@FindBy(id="branch-branch_name")
	private WebElement bname;
	
	@FindBy(id="branch-company_id")
	private WebElement cid;
	
	@FindBy(name="Branch[branch_address]")
	private WebElement baddress;
	
	@FindBy(xpath="//label[text()='Status']")
	private WebElement statuscheckbox;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	public Branchpage(WebDriver driver){
   	 this.driver=driver;
   	 PageFactory.initElements(driver,this);
   	 com=new Common(driver);
	 }
	
	 public void setBranch() {
		branch.click();
	}
   public void createBranchname(String bn) {
	   com.doSendKey(bname, bn);
	   
   }
 public void createCompany() {
	   com.doSelectbyindex(cid,1);
   }
 public void createBranchaddr(String ba) {
	 com.doSendKey(baddress, ba);
 }
   
 public void clickSave() {
	 save.click();
 }
    public void Branchupdate() {
    	com.clickWhenReady(updateoption, 10);
    	updateoption.click();
    	
    	
    }
    public void editBranchname(String brname) {
    	com.clickWhenReady(bname,10);
    	
    	com.doSendKey(bname,brname);
    }
    public void editStatus() {
    	statuscheckbox.click();
    	
    }
   public void Clickview() {
	   com.clickWhenReady(view, 15);
	   view.click();
   }
   
  
    
//   public String getBranchPageTitle() {
//		String branchtitle=com.waitForPageTitlePresent(Config.branchname, 20);
//		return branchtitle;
//	}    
    
}
