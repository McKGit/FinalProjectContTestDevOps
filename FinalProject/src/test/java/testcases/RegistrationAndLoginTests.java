package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constants.GlobalConstants;
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
		
		mercuryMainPage.enterPassword("swtest");
		
		mercuryMainPage.enterUserName("MercuryUserAlison");
		
	}

	@BeforeClass
	public void beforeClass() {	
		
		String chromeWebDriverPath = GlobalConstants.chromeWebDriverPath;
		
		String chromeWebDriverSystemProperty = GlobalConstants.chromeWebDriverSystemProperty;
		
		System.setProperty(chromeWebDriverSystemProperty, chromeWebDriverPath);

		driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		mercuryURL = GlobalConstants.getMercuryURL();
		
		driver.get(mercuryURL);
		
	}		

	@AfterClass
	public void afterTest() {
		driver.quit();			
	}		
}

