package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Common;

public class Payslippage {
	WebDriver driver;
	Common com;
	
	@FindBy(xpath="//a[text()='Payslip']")
	WebElement payslip;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-paperclip']")
	WebElement p1;
	
	@FindBy(id="download")
	WebElement d1;
	
	public Payslippage(WebDriver driver){
	   	 this.driver=driver;
	   	 PageFactory.initElements(driver,this);
	   	 com=new Common(driver);
		 }
	public void payslipClick() {
		com.clickWhenReady(payslip, 10);
		payslip.click();
	}
	public void feildPath() {
		com.clickWhenReady(p1,10);
		p1.click();
	}
	//public void docDownload() throws IOException {
		// com.pdfDownload(d1);
		
	//}
	
}
