package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerCarePage {


	WebDriver driver;
	@FindBy (xpath = "(//a[text()='Customer Care'])[1]")
	private WebElement customerCare;
	

	@FindBy (xpath = "//h1[@class='needhelp-txt']")
	private WebElement needHelpText;
	
	public CustomerCarePage (WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver = driver; 
		//this.act = new Actions(driver);
	}
	public String getCustomerCareText() {
		String text = customerCare.getText();
		return text;
	}
	public String getneedHelpText() {
		String text = needHelpText.getText();
		return text;
	}
	
	
	
}
