package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constants.GlobalConstants;
import constants.LocatorValues;
import framework.MercuryCarRentalsPage;
import framework.MercuryFlightsPage;
import framework.MercuryHotelsPage;
import framework.MercuryMainPage;

public class MenuLinkTests {

WebDriver driver;
	
	private String mercuryURL;
	
	

	/**
	 * Test Flights link.
	 */
	@Test()
	public void testFlightsLink(){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement flightsLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercurySideLinkMenu_FlightLink));
		
		flightsLink.click();

		MercuryFlightsPage mercuryFlightFindersPage = new MercuryFlightsPage(driver);
		
		if(!mercuryFlightFindersPage.isMercuryFlightsPage()){
			
			throw new IllegalStateException("The Flight Finders page is not displayed.");
		}
		
	}
	
	/**
	 * Test Hotels link.
	 */
	@Test()
	public void testHotelsLink(){
		
		//MercuryFlightsPage_HotelsMast 
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement flightsLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercurySideLinkMenu_FlightLink));
		
		flightsLink.click();

		MercuryHotelsPage mercuryHotelsPage = new MercuryHotelsPage(driver);
		
		if(!mercuryHotelsPage.isMercuryHotelsPage()){
			
			throw new IllegalStateException("The Hotels page is not displayed.");
		}
		
	}

	/**
	 * Test Car Rentals link.
	 */
	@Test
	public void testCarRentalsLink(){
			
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement carRentalsLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues. MercurySideLinkMenu_CarRentalsLink));
		
		carRentalsLink.click();
	
		MercuryCarRentalsPage mercuryCarRentalsPage = new MercuryCarRentalsPage(driver);
		
		if(!mercuryCarRentalsPage.isMercuryCarRentalsPage()){
			
			throw new IllegalStateException("The Car Rentals page is not displayed.");
		}
	}

	/**
	 * Test Cruises link.
	 */
	@Test
	public void testCruisesLink(){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement carRentalsLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues. MercurySideLinkMenu_CarRentalsLink));
		
		carRentalsLink.click();
	
		MercuryCarRentalsPage mercuryCarRentalsPage = new MercuryCarRentalsPage(driver);
		
		if(!mercuryCarRentalsPage.isMercuryCarRentalsPage()){
			
			throw new IllegalStateException("The Car Rentals page is not displayed.");
		}
		
	}

	/**
	 * Test Destinations link.
	 */
	@Test
	public void testDestinationsLink(){}

	/**
	 * Test Vacations link.
	 */
	@Test
	public void testVacationsLink(){}
	
	/**
	 * Test Home link.
	 */
	@Test
	public void testHomeLink(){}
	

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
	
	@BeforeClass()
	public void logonUser(){
		
		MercuryMainPage mercuryMainPage = new MercuryMainPage(driver);
		
		mercuryMainPage.enterPassword("swtest");
		
		mercuryMainPage.enterUserName("MercuryUserAlison");
		
	}
	
	@AfterClass
	public void afterTest() {
		driver.quit();			
	}		

}

