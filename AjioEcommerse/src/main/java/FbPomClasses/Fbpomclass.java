package FbPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpomclass {

	WebDriver driver;
	Actions act;
	@FindBy (xpath = "//a[text()='Create new account']")
	private WebElement cna;
	
	@FindBy (xpath = "(//a[text()='Terms'])[2]")
	private WebElement terms;
	
	@FindBy (xpath = "(//a[text()='Privacy Policy'])[2]")
	private WebElement pp;
	
	@FindBy (xpath = "//a[text()='Cookies Policy']")
	private WebElement cp;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement pass;
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement user;
	
	public Fbpomclass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver; 
		this.act = new Actions(driver);
	}
	
	public void user(String user1) {
		user.sendKeys(user1);
	}
	public void pass(String pass1) {
		pass.sendKeys(pass1);
	}
	public void clickOnCreateNewAcountButton()
	{
		cna.click();
	}
	public void clickOnTermsCare() {
		terms.click();
	}
	public void clickOnpp()
	{
		pp.click();
	}
	public void clickOncp() {
		cp.click();
	}
	
	
}
