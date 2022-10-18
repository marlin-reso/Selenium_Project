package php.crm.vtiger.project1.genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import php.crm.vtiger.project1.pomRepository.HomePage;
import php.crm.vtiger.project1.pomRepository.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sdriver;
	public JavaUtility jutils = new JavaUtility();
	WebDriverUtility wUtils= new WebDriverUtility();
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Database connection has been stableished");
	}
	
	@BeforeClass
	public void bcConfig() throws IOException {
		String url = jutils.fetchDataFromPropertyFile("url");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wUtils.maximizeWindow(driver);
		wUtils.implicitWait(driver);
		driver.get(url);
		System.out.println("Chrome browser is launched");
		sdriver=driver;
	}
	
	@BeforeMethod
	public void bmConfig() throws IOException {
		String username = jutils.fetchDataFromPropertyFile("username");
		String password = jutils.fetchDataFromPropertyFile("password");
		LoginPage login = new LoginPage(driver);
		login.loginAction(username, password);
		System.out.println("Login action has been completed");
	}
	
	@AfterMethod
	public void amConfig() {
		
		HomePage home = new HomePage(driver);
		home.logOutAction();	
		System.out.println("Logout action has been completed");
	}
	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("Browser is closed");
	}
	@AfterSuite
	public void asConfig() {
		System.out.println("Database connection has been closed");
	}
	
		

}
