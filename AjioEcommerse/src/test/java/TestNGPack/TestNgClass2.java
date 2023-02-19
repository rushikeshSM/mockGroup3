package TestNGPack;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomClasses.HomePage;
import PomClasses.ProductInfoPage;
import PomClasses.ProductsPage;
import browser.Browser;

public class TestNgClass2 extends Browser{

	WebDriver driver;
	HomePage homePage;
	ProductsPage productsPage;
	ProductInfoPage productInfoPage;
	SoftAssert softAssert;
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		if (browserName.equals("Chrome") ) 
		{
			driver = openChromeBrowser();
		}
		if (browserName.equals("Firefox") ) 
		{
			driver = openFirefoxBrowser();
		}
		if (browserName.equals("Opera") ) 
		{
			driver = openOperaBrowser();
		}
		if (browserName.equals("Edge") ) 
		{
			driver = openEdgeBrowser();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void classObject()
	{
		homePage = new HomePage(driver);
	    productsPage = new ProductsPage(driver);
	    productInfoPage = new ProductInfoPage(driver);
	}
	@BeforeMethod
	public void openUrl() throws InterruptedException {
		softAssert = new SoftAssert();
		driver.get("https://www.ajio.com");
		Thread.sleep(5000);
		
		homePage.moveFocusOnMen();
		System.out.println("focusOnmen");
		homePage.clickOnFormalShoes();
		Thread.sleep(10000);
		productsPage.clickOnFirstProduct();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
	}
	@Test
	public void verifyUrl() {
		String actualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://www.ajio.com/stelvio-monk-style-formal-shoes-with-broguing/p/460185190_brown";
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Buy Brown Formal Shoes for Men by STELVIO Online | Ajio.com";
		System.out.println("test");
		softAssert.assertEquals(actualURL, ExpectedURL);
		softAssert.assertEquals(ActualTitle, ExpectedTitle);
		softAssert.assertAll();
	
	}
	@Test (enabled = false)
	public void verifyURL2() {
		productInfoPage.clickOnProductSizeOfMen();
		productInfoPage.clickOnAddToBag();
		productInfoPage.clickOnGoToBag();
		
		String actualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://www.ajio.com/cart";
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Your Shopping Bag| AJIO";
		
		softAssert.assertEquals(actualURL, ExpectedURL);
		softAssert.assertEquals(ActualTitle, ExpectedTitle);
		softAssert.assertAll();
	}
	@AfterMethod
	public void closed() throws InterruptedException {
		Thread.sleep(30000);
		driver.close();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));		
		System.out.println(addr.get(0));
	}
	@AfterClass
	public void classnull() {
		homePage = null;
		productsPage = null;
		System.gc();
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
			
	
	
}
