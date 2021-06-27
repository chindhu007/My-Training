package page;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import config.Config;
import utility.Common;

public class Companypage {
	WebDriver driver;
	Common com;
	@FindBy(xpath="//a[text()='Company']")
	private WebElement compath;
	
	@FindBy(id="company-company_name")
	private WebElement comname;
	
	@FindBy(id="company-company_email")
	private WebElement email;
	
	@FindBy(id="company-company_address")
	private WebElement address;
	
	@FindBy(id="company-started_at")
	private WebElement start;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	 public Companypage(WebDriver driver){
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
    	 com=new Common(driver);
	 }
	
	public void setCompany() {
		
		compath.click();
	
	}
	public void nameCompany(String value) {
		com.doSendKey(comname, value);
	}
	public void emailCompany(String value) {
		com.doSendKey(email, value);
	}
	public void addressCompany(String value) {
		com.doSendKey(address, value);
	}
	public void startCompany(String value) {
		com.doSendKey(start,value);
	}
	public void saveCompany() {
		com.scrollIntoView(save);
		save.click();
	}
	public String getCompanyPageTitle() {
		String companytitle=com.waitForPageTitlePresent(Config.comtitle, 20);
		return companytitle;
	}
	
	}
