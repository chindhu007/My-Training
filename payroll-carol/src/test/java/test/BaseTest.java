package test;

//import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import config.Config;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class BaseTest {
	WebDriver driver;
	
	
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\91807\\Desktop\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		//driver.get("https://www.qabible.in/payrollapp/site/login");
	driver.get(Config.appurl);
  }

  @AfterTest
  public void afterTest() {
  }

}
