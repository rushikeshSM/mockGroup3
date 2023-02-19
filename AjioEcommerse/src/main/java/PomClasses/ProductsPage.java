package PomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Boys']")
	private WebElement boys;
	
	@FindBy (xpath = "//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")
	private WebElement men;
	
	@FindBy (xpath = "(//span[@class='facet-left-pane-label'])[3]")
	private WebElement price;
	
	@FindBy (xpath = "//label[@class='facet-linkname facet-linkname-pricerange facet-linkname-Rs.500-1000']")
	private WebElement rs500Or1000;
	
	@FindBy (xpath = "(//div[@class='item rilrtl-products-list__item item'])[1]")
	private WebElement firstProduct;
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnBoysCheckbox() {
		boys.click();
	}
	
	public void clickOnMenCheckBox() {
		men.click();
	}
	public void clickOnPrice() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(price));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", price);
		js.executeScript("window.scrollBy(0,-100);");
		price.click();
	}
	public void clickOn500Or1000() {
		rs500Or1000.click();
	}
	public void clickOnFirstProduct() {
		firstProduct.click();
	}
	
	

}
