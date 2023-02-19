package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductInfoPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "(//div[@class='oval size-variant-item size-instock '])[1]")
	private WebElement productSizeOfBoys;
	
	@FindBy (xpath = "(//div[@class='circle size-variant-item size-instock '])[1]")
	private WebElement productSizeOfMen;
	
	@FindBy (xpath = "//h1[@class='prod-name']")
	private WebElement productName;
	
	@FindBy (xpath = "//span[text()='ADD TO BAG']")
	private WebElement addtoBag;
	
	@FindBy (xpath = "//span[text()='GO TO BAG']")
	private WebElement goToBag;
	
	public ProductInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnProductSizeOfBoys() {
		productSizeOfBoys.click();
	}
	
	public void clickOnProductSizeOfMen() {
		productSizeOfMen.click();
	}
	public void getProductName() {
		String text = productName.getText();
		System.out.println(text);
	}
	public void clickOnAddToBag() {
		addtoBag.click();
	}
	public void clickOnGoToBag() {
		goToBag.click();
	}

}
