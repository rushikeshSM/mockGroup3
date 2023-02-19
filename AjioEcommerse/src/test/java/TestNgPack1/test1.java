package TestNgPack1;

import java.util.ArrayList;
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

import FbPomClasses.Fbpomclass;
import PomClasses.CustomerCarePage;
import PomClasses.HomePage;
import Utils.Utility;
import browser.Browser;

public class test1 extends Browser {
	WebDriver driver;
	Fbpomclass fbpomclass;
	CustomerCarePage customerCarePage;
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
		fbpomclass = new Fbpomclass(driver);
		softAssert = new SoftAssert();
		
	}
	@BeforeMethod
	public void openUrl() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void test1() throws Exception {
		Thread.sleep(5000);
		fbpomclass.user(Utility.getDataFromExcel("C:\\automation.selenium\\Book2.xlsx","Sheet1", 1, 0));
		fbpomclass.pass(Utility.getDataFromExcel("C:\\automation.selenium\\Book2.xlsx","Sheet1", 1, 1));
		Thread.sleep(5000);
	}
//	@Test
//	public void verifyURLAndTitle() throws InterruptedException {
//		fbpomclass.clickOnCreateNewAcountButton();
//		Thread.sleep(5000);
//		fbpomclass.clickOnTermsCare();
//		Thread.sleep(5000);
//		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(addr.get(1));
//		String actualURL = driver.getCurrentUrl();
//		String actualTitle = driver.getTitle();
//		String expectedURL = "https://www.facebook.com/legal/terms/update";
//		String expectedTitle = "Facebook";
//		
//		softAssert.assertEquals(actualURL,expectedURL);
//		softAssert.assertEquals(actualTitle, expectedTitle);
//		softAssert.assertAll();
//	}
//	@Test
//	public void verifyText() throws InterruptedException {
//		fbpomclass.clickOnCreateNewAcountButton();
//		Thread.sleep(5000);
//		fbpomclass.clickOnpp();
//		Thread.sleep(5000);
//		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(addr.get(1));
//		String actualURL = driver.getCurrentUrl();
//		String actualTitle = driver.getTitle();
//		String expectedURL = "https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
//		String expectedTitle = "Meta Privacy Policy – How Meta collects and uses user data | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy";
//		
//		softAssert.assertEquals(actualURL,expectedURL);
//		softAssert.assertEquals(actualTitle, expectedTitle);
//		softAssert.assertAll();
//		
//	}
//	@Test 
//	public void verifyNeedHelpText() throws InterruptedException {
//		fbpomclass.clickOnCreateNewAcountButton();
//		Thread.sleep(5000);
//		fbpomclass.clickOncp();
//		Thread.sleep(5000);
//		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(addr.get(1));
//		String actualURL = driver.getCurrentUrl();
//		String actualTitle = driver.getTitle();
//		String expectedURL = "https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
//		String expectedTitle = "Meta Cookies Policy | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy";
//		
//		softAssert.assertEquals(actualURL,expectedURL);
//		softAssert.assertEquals(actualTitle, expectedTitle);
//		softAssert.assertAll();
//	
//	}
		
		@AfterMethod
		public void back() throws InterruptedException {
//			driver.close();
//			Thread.sleep(3000);
//			ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(addr.get(0));
//			
		}
		@AfterClass
		public void classnull() {
			
		}
		@AfterTest
		public void close() {
			driver.quit();
		
		
		
				
	}
}
