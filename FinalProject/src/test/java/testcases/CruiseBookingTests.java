package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constants.GlobalConstants;
import framework.MercuryCruiseSpecialsPage;
import framework.MercuryFlightsPage;
import framework.MercuryMainPage;

public class CruiseBookingTests {

	private WebDriver driver;	
	
	private String mercuryURL;
	
	@Test
	public void testBookCruise(){
		
		//ENSURE THAT THE FLIGHT FINDER PAGE (THE DEFAULT PAGE FOR REGISTERED USER AFTER LOG ON) IS DISPLAYED
		
		MercuryFlightsPage mercuryFlightsPage = new MercuryFlightsPage(driver);
		
		if(!mercuryFlightsPage.isMercuryFlightsPage()){
			
			throw new IllegalStateException("The Mercury Flight page is not displayed, as expected.");
			
		}

		MercuryCruiseSpecialsPage mercuryCruiseSpecialsPage = mercuryFlightsPage.clickCruisesLink();
		
		//ENSURE THAT THE MERCURY CRUISE SPECIALS PAGE IS DISPLAYED
		
		if(!mercuryCruiseSpecialsPage.isMercuryCruiseSpecialsPageDisplayed(driver)){
			
			throw new IllegalStateException("The Mercury Cruises page is not displayed.");
			
		}
		
	}
	
	@BeforeMethod
	public void getURL() {	

		String chromeWebDriverPath = GlobalConstants.chromeWebDriverPath;
		
		String chromeWebDriverSystemProperty = GlobalConstants.chromeWebDriverSystemProperty;
		
		System.setProperty(chromeWebDriverSystemProperty, chromeWebDriverPath);

		driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		mercuryURL = GlobalConstants.getMercuryURL();
		
		driver.get(mercuryURL);
		
	}	
	
	@BeforeMethod
	public void logonUser(){
		
		MercuryMainPage mercuryMainPage = new MercuryMainPage(driver);
		
		mercuryMainPage.enterPassword("swtester");
		
		mercuryMainPage.enterUserName("MercuryUserAlison");

		mercuryMainPage.clickLoginLink();
		
		MercuryFlightsPage mercuryFlightsPage = new MercuryFlightsPage(driver);
		
		assert mercuryFlightsPage.isMercuryFlightsPage() : "The Mercury Flights page is not displayed.";
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();			
	}		

}
