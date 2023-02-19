package TestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
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
import browser.Browser;

public class TestNgClass1 extends Browser {



	WebDriver driver;
	HomePage homePage;
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
	}
	@BeforeMethod
	public void openUrl() throws InterruptedException {
		driver.get("https://www.ajio.com");
		Thread.sleep(5000);
	}
	
	@Test
	public void verifyText() {
		
		String actualText = homePage.getMenText();
		String expectedText = "MEN";
		
		softAssert.assertEquals(actualText, expectedText);
	}
	@Test 
	public void verifyNeedHelpText() {
		
		String actualText = homePage.getWomenText();
		String expectedText = "WOMEN";
		
		softAssert.assertEquals(actualText, expectedText);
	}
		@Test
		public void verifyKids() {
		
		String actualText = homePage.getKids();
		String expectedText = "KIDS";
		
		softAssert.assertEquals(actualText, expectedText);
	
}
		@AfterMethod
		public void back() throws InterruptedException {
			
		}
		@AfterClass
		public void classnull() {
			homePage = null;
			System.gc();
		}
		@AfterTest
		public void close() {
			driver.quit();
				
	}
}

