package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PomClasses.HomePage;

public class TestClass5 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\automation.selenium\\geckodriver-v0.32.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage homePage = new HomePage(driver);
		
		String text = homePage.getCustomerCareText();
		System.out.println(text);
		String text1= homePage.getHomeAndKitchenText();
		System.out.println(text1);
		String text2= homePage.getIndieText();
		System.out.println(text2);
		String text3 = homePage.getKids();
		System.out.println(text3);
		String text4= homePage.getMenText();
		System.out.println(text4);
		String text5= homePage.getsignInOrJoinAjoinButtonText();
		System.out.println(text5);
		String text6= homePage.getVisitAjioluxeText();
		System.out.println(text6);
		String text7= homePage.getWomenText();
		System.out.println(text7);

		driver.close();
		
		
	}
}
