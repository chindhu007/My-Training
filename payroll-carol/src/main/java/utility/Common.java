package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class Common {
	WebDriver driver;
	public Common(WebDriver driver) {
		this.driver=driver;
	}
	public void doSendKey(WebElement ele,String value) {
		
		ele.clear();
		ele.sendKeys(value);
		}

	
	public void doSelectbyindex(WebElement ele,int value) {
		Select sc=new Select(ele);
		sc.selectByIndex(value);
	}
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].scrollIntoView",element);
		
    }
	public void alertMethod() {
		Alert al=driver.switchTo().alert();
		al.accept();
		}
	
	public void pdfDownload(WebElement element1) throws IOException {
		String sourceLocation = element1.getAttribute("href");
		   String wget_command = "cmd /c C:\\Wget\\wget.exe -P C:\\mydownloads --no-check-certificate " + sourceLocation;
		  Runtime.getRuntime().exec(wget_command);
		
	}
	public void screenshot( ITestResult result ) throws IOException {
	
		 if(ITestResult.FAILURE==result.getStatus()) {
			 TakesScreenshot ts=(TakesScreenshot)driver;
		   File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(sourcefile, new File("C:\\myscreenshot\\stest1.png"));
		 }
		    
		}
	
	

		public void clickWhenReady(WebElement ele, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
        element.click();
	}
		
		
		public String waitForPageTitlePresent(String titleValue, int timeOut){
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.titleContains(titleValue));
			return driver.getTitle();
		}

		public WebElement waitForElementToBeVisible(WebElement element, int timeOut){
			
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			return wait.until(ExpectedConditions.visibilityOf(element));
			
		}
	


}
