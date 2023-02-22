package Tests;
//new changes
//updated
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

public class TestClass1 {
	//sign in = search = boys = rs 500 = size = cart = resize;
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
		signInInfoPopUpPage.clickOnMaleGender();
		signInInfoPopUpPage.enterName("tejas magar");
		signInInfoPopUpPage.enterEmail("rushimager295@gmai.com");
		signInInfoPopUpPage.enterPassword(" tejasmager");
		signInInfoPopUpPage.clickOnCheckBox();
		signInInfoPopUpPage.clickOnCrossButton();
		
		homePage.sendProductName("footware");
		homePage.clickOnSearchIcon();
		
		ProductsPage productsPage = new ProductsPage(driverTest);
		productsPage.clickOnBoysCheckbox();
		productsPage.clickOnPrice();
		productsPage.clickOn500Or1000();
		productsPage.clickOnFirstProduct();
		
		ArrayList<String> addr = new ArrayList<String>(driverTest.getWindowHandles());
		driverTest.switchTo().window(addr.get(1));
		
		ProductInfoPage productInfoPage = new ProductInfoPage(driverTest);
		productInfoPage.clickOnProductSizeOfBoys();
		productInfoPage.getProductName();
		productInfoPage.clickOnAddToBag();
		productInfoPage.clickOnGoToBag();
		
		CartPage cartPage = new CartPage(driverTest);
		cartPage.clickOnChangeSizeAndQuantity();
		cartPage.clickOnChangeSizeOfBoys();
		cartPage.clickOnChangeQuantity();
		cartPage.clickOnUpdate();
		cartPage.getNameOfAddedProduct();
		driverTest.quit();
		
		
	
		
	}

}
