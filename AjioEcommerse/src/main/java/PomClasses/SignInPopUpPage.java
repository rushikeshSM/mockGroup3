package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPopUpPage {
	
	@FindBy (xpath = "(//input[@type='text'])[1]")
	private WebElement mobileNoOrEmail;
	
	@FindBy (xpath = "(//input[@type='submit'])[1]")
	private WebElement continues;
	
	public SignInPopUpPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this );
	}
	
	public void enterMobileNo(String mobileNo) 
	{
		mobileNoOrEmail.sendKeys(mobileNo);
	}
	public void clickOnContinueButton()
	{
		continues.click();
	}

}
