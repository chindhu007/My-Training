package page;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//import org.testng.ITestResult;

//import config.Config;
import utility.Common;

public class Loginpage {
	 WebDriver driver;
	 Common com;
	 
	 
	 @FindBy(id="loginform-username")
	  private WebElement user; 
	  
	  @FindBy(id="loginform-password")
	  private WebElement pass; 
	  
	  @FindBy(how = How.NAME, using = "login-button") 
		private WebElement log;
	 
	 public Loginpage(WebDriver driver){
		 
    	 this.driver=driver;
    	PageFactory.initElements(driver,this);
    	com=new Common(driver);
    }
	 
	 public void setUsername(String username) throws IOException {
		com.doSendKey(user,username);
	 }
	 
	 public void setPassword(String password) throws IOException {
		com.doSendKey(pass,password);
		 
		 }
	 
	 public  void clicklogin() {
    	 log.click();
     }
	 
//	 public void screen() throws IOException {
//		
//		 com.screenshot();
//		 }
//		 
	 
//	 public String getHomePageTitle() {
//			String hometitle=com.waitForPageTitlePresent(Config.hometitle, 20);
//			return hometitle;
//		}

	 
}
