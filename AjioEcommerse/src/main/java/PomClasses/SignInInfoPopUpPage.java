package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInInfoPopUpPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "(//label[@class='gender-opt'])[1]")
	private WebElement female;
	
	@FindBy (xpath = "(//label[@class='gender-opt'])[2]")
	private WebElement male;
	
	@FindBy ( xpath = "(//input[@class='login-form-inputs'])[1]")
	private WebElement username;
	
	@FindBy ( xpath = "(//input[@class='login-form-inputs'])[2]")
	private WebElement useremail;
	
	@FindBy ( xpath = "//input[@type='password']")
	private WebElement userpassword;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement agreeTermsAndConditon;
	
	@FindBy (xpath = "//div[@class='ic-close-quickview']")
	private WebElement crossMark;
	
	
	public SignInInfoPopUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnFemaleGender() {
		female.click();
	}
	public void clickOnMaleGender() {
		male.click();
	}
	public void enterName(String name) {
		username.sendKeys(name);
	}
	public void enterEmail(String email) {
		useremail.sendKeys(email);
	}
	public void enterPassword(String password) {
		userpassword.sendKeys(password);
	}
	public void clickOnCheckBox() {
		agreeTermsAndConditon.click();
	}
	public void clickOnCrossButton() {
		crossMark.click();
	}

}
