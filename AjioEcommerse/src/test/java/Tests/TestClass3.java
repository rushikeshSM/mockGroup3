package Tests;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.CartPage;
import PomClasses.HomePage;
import PomClasses.ProductInfoPage;
import PomClasses.ProductsPage;
import PomClasses.SignInInfoPopUpPage;
import PomClasses.SignInPopUpPage;

public class TestClass3 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\automation.selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest = new ChromeDriver();
		driverTest.get("https://www.ajio.com/");
		driverTest.manage().window().maximize();
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driverTest);
		homePage.clickOnSignInOrJoinAjioButton();
		
		SignInPopUpPage signInPopUpPage = new SignInPopUpPage(driverTest);
		signInPopUpPage.enterMobileNo("9359827524");
		signInPopUpPage.clickOnContinueButton();
		
		SignInInfoPopUpPage signInInfoPopUpPage = new SignInInfoPopUpPage(driverTest);
		signInInfoPopUpPage.clickOnFemaleGender();
		signInInfoPopUpPage.enterName("anshika");
		signInInfoPopUpPage.enterEmail("rushimager295@gmail.com");
		signInInfoPopUpPage.enterPassword("rushimager");
		signInInfoPopUpPage.clickOnCheckBox();
		signInInfoPopUpPage.clickOnCrossButton();
		
		homePage.moveFocusOnWomen();
		homePage.clickOnDupattas();
		
		ProductsPage productsPage = new ProductsPage(driverTest);
		productsPage.clickOnFirstProduct();

		ArrayList<String> addr = new ArrayList<String>(driverTest.getWindowHandles());
		driverTest.switchTo().window(addr.get(1));
		
				
		ProductInfoPage productInfoPage = new ProductInfoPage(driverTest);
		productInfoPage.getProductName();
		productInfoPage.clickOnAddToBag();
		productInfoPage.clickOnGoToBag();
		
		CartPage cartPage = new CartPage(driverTest);
		cartPage.getNameOfAddedProduct();
		
		
	}

}
