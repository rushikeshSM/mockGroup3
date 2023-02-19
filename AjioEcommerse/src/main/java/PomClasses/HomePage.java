package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	Actions act;
	@FindBy (xpath = "//span[text()='Sign In / Join AJIO']")
	private WebElement signInOrJoinAjio;
	
	@FindBy (xpath = "(//a[text()='Customer Care'])[1]")
	private WebElement customerCare;
	
	@FindBy (xpath = "//input[@autocomplete='off']")
	private WebElement searchAjioProduct;
	
	@FindBy (xpath = "//span[@class='ic-search']")
	private WebElement searchIcon;

	@FindBy (xpath = "//a[@title='MEN']")
	private WebElement men;
	
	@FindBy (xpath = "//a[@title='Formal Shoes']")
	private WebElement formalShoes;
	

	@FindBy (xpath = "//a[@title='WOMEN']")
	private WebElement women;
	
	@FindBy (xpath = "//a[text()='INDIE']")
	private WebElement indie;
	
	@FindBy (xpath = "//a[text()='HOME AND KITCHEN']")
	private WebElement homeAndKitchen;
	
	@FindBy (xpath = "(//a[text()='Visit AJIOLUXE'])[1]")
	private WebElement visitAjioluxe;
	
	@FindBy (xpath = "(//a[@title='Dupattas'])[1]")
	private WebElement dupattas;
	
	@FindBy (xpath = "//a[@title='KIDS']")
	private WebElement kids;
	
	@FindBy (xpath = "//a[@title='Gaming, Robots & Vehicles']")
	private WebElement gamingRobotsAndVehicles;
	
	@FindBy (xpath = "//div[@class='banner-components']")
	private WebElement poster;
	
	@FindBy (xpath = "//span[text()='Allow Location']")
	private WebElement allowLocation;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver; 
		this.act = new Actions(driver);
	}
	
	public void clickOnSignInOrJoinAjioButton()
	{
		signInOrJoinAjio.click();
	}
	public void clickOnCustomerCare() {
		customerCare.click();
	}
	public String getCustomerCareText() {
		String text = customerCare.getText();
		return text;
	}
	public String getMenText() {
		String text = men.getText();
		return text;
	}
	public String getWomenText () {
		String text = women.getText();
		return text;
	}
	public String getKids() {
		String text = kids.getText();
		return text;
	}
	public String getIndieText() {
		String text = indie.getText();
		return text;
	}
	public String getHomeAndKitchenText() {
		String text = homeAndKitchen.getText();
		return text;
	}
	public String getsignInOrJoinAjoinButtonText() {
		String text = signInOrJoinAjio.getText();
		return text;
	}
	public String getVisitAjioluxeText() {
		String text = visitAjioluxe.getText();
		return text;
	}
	public void sendProductName(String productName) {
	    searchAjioProduct.sendKeys(productName);
	}
	public void clickOnSearchIcon() {
		searchIcon.click();
	}
	public void moveFocusOnMen() {
		act.moveToElement(men).perform();
	}
	public void clickOnMen() {
		men.click();
	}
	public void clickOnFormalShoes() {
		act.moveToElement(formalShoes).click().perform();
	}
	public void moveFocusOnWomen() {
		act.moveToElement(women).perform();
	}
	public void clickOnWomen() {
		women.click();
	}
	public void clickOnDupattas() {
		dupattas.click();
	}
	public void moveFocusOnKids() {
		act.moveToElement(kids).perform();
	}
	public void clickOnKids() {
		kids.click();
	}
	public void clickOnGamingRobotsAndVehicles() {
		act.moveToElement(gamingRobotsAndVehicles).click().perform();
	}
	public void clickOnPoster() {
		poster.click();
	}
	public void clickOnAllowLocation() {
		allowLocation.click();
	}
}
