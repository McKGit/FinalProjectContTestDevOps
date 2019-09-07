package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constants.GlobalConstants;
import framework.MercuryFlightsPage;
import framework.MercuryMainPage;
import framework.MercuryRegistrationPage;

public class RegistrationAndLoginTests {

	private WebDriver driver;	
	
	private String mercuryURL;
	
	/**
	 * Tests that new user can register.
	 */
	@Test
	public void testRegisterUser(){
		
		MercuryMainPage mercuryMainPage = new MercuryMainPage(driver);
		
		MercuryRegistrationPage mercuryRegistrationPage = mercuryMainPage.clickRegisterLink();
		
		mercuryRegistrationPage.enterFirstName("TestFirstName");
		
		mercuryRegistrationPage.enterLastName("TestLastName");
		
		mercuryRegistrationPage.enterEmail("TestFirstName@happywonderland.com");
		
		mercuryRegistrationPage.enterUserName("SuperSmartTester	");
		
		mercuryRegistrationPage.enterPassword("testPW");
		
		mercuryRegistrationPage.enterConfirmPassword("testPW");
		
		mercuryRegistrationPage.clickSubmit();
		
		if(!mercuryRegistrationPage.isConfirmationMessageDisplayed()){
			
			throw new IllegalStateException("Registraton confirmation message is not displayed.");
		}
		
		mercuryRegistrationPage.clickHome();
	}
	
	/**
	 * 
	 * Tests that a registered used can log in.
	 */
	@Test()
	public void logonUser(){
		
		MercuryMainPage mercuryMainPage = new MercuryMainPage(driver);
		
		mercuryMainPage.enterPassword("swtester");
		
		mercuryMainPage.enterUserName("MercuryUserAlison");

		mercuryMainPage.clickLoginLink();
		
		MercuryFlightsPage mercuryFlightsPage = new MercuryFlightsPage(driver);
		
		assert mercuryFlightsPage.isMercuryFlightsPage() : "The Mercury Flights page is not displayed.";
		
	}

	@BeforeMethod
	public void beforeMethod() {	
		
		String chromeWebDriverPath = GlobalConstants.chromeWebDriverPath;
		
		String chromeWebDriverSystemProperty = GlobalConstants.chromeWebDriverSystemProperty;
		
		System.setProperty(chromeWebDriverSystemProperty, chromeWebDriverPath);

		driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		mercuryURL = GlobalConstants.getMercuryURL();
		
		driver.get(mercuryURL);
		
	}		

	@AfterMethod
	public void afterMethod() {
		driver.quit();			
	}		
}

