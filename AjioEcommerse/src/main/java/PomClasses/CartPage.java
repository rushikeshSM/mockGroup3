package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "(//span[@class='ic-chevrondown'])[1]")
	private WebElement sizeAndQuantity;
	
	@FindBy (xpath = "(//div[@class='oval size-variant-item size-instock '])[2]")
	private WebElement sizeOfBoys;

	@FindBy (xpath = "(//div[@class='circle size-variant-item size-instock '])[2]")
	private WebElement sizeOfMen;
	
	@FindBy (xpath = "//button[@class='increment button']")
	private WebElement quantity;
	
	@FindBy (xpath = "//button[@class='full-width-button']")
	private WebElement update;
	
	@FindBy (xpath = "//div[@class='product-name']")
	private WebElement nameOfAddedProduct;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnChangeSizeAndQuantity() {
		sizeAndQuantity.click();
	}
	public void clickOnChangeSizeOfBoys() {
		sizeOfBoys.click();
	}
	public void clickOnChangeSizeOfMen() {
		sizeOfMen.click();
	}
	public void clickOnChangeQuantity() {
		quantity.click();
	}
	public void clickOnUpdate() {
		update.click();
	}
	public void getNameOfAddedProduct() {
			String text = nameOfAddedProduct.getText();
			System.out.println(text);
		}
		
	}


