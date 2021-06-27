package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Common;

public class Workerpage {
	WebDriver driver;
	Common com;
	@FindBy(xpath="//a[text()='Workers']")
	WebElement workpath;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr[4]//td//a[1]")
	WebElement view;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr[4]//td//a[2]")
	WebElement update;
	
	@FindBy(xpath="//a[@href='/payrollapp/worker/create']")
    WebElement worker;
	
	@FindBy(id="worker-first_name")
	WebElement Fname;
	
	@FindBy(id="worker-last_name")
	WebElement Lname;
	
	@FindBy(id="worker-phone")
	WebElement phno;
	
	@FindBy(id="worker-email")
	WebElement mailid;
	
	@FindBy(id="worker-gender")
	WebElement gender;
	
	@FindBy(id="worker-dob")
	WebElement dob;
	
	@FindBy(id="worker-address1")
	WebElement addr;
	
	@FindBy(id="worker-postcode")
	WebElement pcode;
	
	@FindBy(id="worker-branch_id")
	WebElement Wbranch;
	
	@FindBy(id="worker-division_id")
	WebElement Wdivision;
	
	@FindBy(id="worker-employment_type")
	WebElement Wemp;
	
	@FindBy(id="worker-payslip_method")
	WebElement Wpay;
	
	@FindBy(id="worker-ni_number")
	WebElement Wni;
	
	@FindBy(xpath="//*[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//a[@title='Delete']")
	WebElement delete;
	
	@FindBy(id="workersearch-first_name")
	WebElement fn;
	
	@FindBy(id="workersearch-last_name")
	WebElement ln;
	
	@FindBy(xpath="//*[text()='Search']")
	WebElement search;
	
	public Workerpage(WebDriver driver){
	   	 this.driver=driver;
	   	 PageFactory.initElements(driver,this);
	   	 com=new Common(driver);
		 }
	public void clickWork() {
		com.clickWhenReady(workpath, 15);
		workpath.click();
	}
	
	public void setWorker() {
		com.clickWhenReady(worker, 15);
		worker.click();
	}
	public void firstName(String fn) {
		com.doSendKey(Fname, fn);
	}
	public void lastName(String ln) {
		com.doSendKey(Lname, ln);
	}
    public void phNum(String n) {
		com.doSendKey(phno, n);
	}
	public void emailId(String s) {
	   com.doSendKey(mailid, s);
	}
	public void genderSelect() {
		com.doSelectbyindex(gender, 0);
	}
	public void address(String a) {
		com.doSendKey(addr, a);
	}
	public void postCode(String q) {
		com.doSendKey(pcode, q);
	}
	public void dateBirth(String d) {
		com.doSendKey(dob, d);
	}
	public void noNi(String r) {
		com.doSendKey(Wni, r);
	}
	public void branchDrop() {
		com.doSelectbyindex(Wbranch, 1);
	}
	public void divDrop() {
		com.doSelectbyindex(Wdivision, 1);
	}
	public void empType() {
		com.doSelectbyindex(Wemp, 2);
	}
	public void paySlip() {
		com.doSelectbyindex(Wpay, 1);
	}
	public void sub() {
		com.scrollIntoView(next);
		next.click();
		
	}
	
	public void workUpdate() {
		com.clickWhenReady(update, 15);
		update.click();
	}
	public void workEdit(String a) {
		com.clickWhenReady(Wni,15);
		com.doSendKey(Wni, a);
	}
	public void workView() {
		com.clickWhenReady(view, 15);
		view.click();
	}
	public void workDelete() {
		delete.click();
		com.alertMethod();
		}
	public void nameSearch(String g, String t) {
		com.doSendKey(fn, g);
		com.doSendKey(ln, t);
		search.click();
	}
}
