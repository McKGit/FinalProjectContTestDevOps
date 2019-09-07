package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constants.GlobalConstants;
import framework.MercuryFlightsPage;
import framework.MercuryMainPage;
import framework.MercurySelectFlightPage;

public class FlightBookingTests {
	
	private WebDriver driver;	
	
	private String mercuryURL;
	
	@Test
	public void testBookFlight(){
		
		//ENTER NUMBER OF PASSENGERS
		
		MercuryFlightsPage mercuryFlightsPage = new MercuryFlightsPage(driver);
		
		int numberOfPassengers = 2;
		
		mercuryFlightsPage.selectNumberOfPassengers(numberOfPassengers);

		//ENTER DEPARTING FROM
		mercuryFlightsPage.selectDepartingFrom("New York");
		
		//ENTER "ON" MONTH
		mercuryFlightsPage.selectDepartMonth("October");
		
		//ENTER "ON" DAY
		mercuryFlightsPage.selectDepartDay("1");
		
		//ENTER "ARRIVING IN"
		mercuryFlightsPage.selectArrivingTo("New York");
		
		//ENTER RETURNING ON MONTH
		mercuryFlightsPage.selectReturnMonth("October");
		
		//ENTER RETURNING ON DAY
		mercuryFlightsPage.selectReturnDay("7");
		
		//ENTER SERVICE CLASS
		mercuryFlightsPage.selectServiceClass("First");
		
		//ENTER AIRLINE
		mercuryFlightsPage.selectAirline("Blue Skies Airlines");

		//CLICK CONTINUE BUTTON
		mercuryFlightsPage.clickContinueButton();
		
		MercurySelectFlightPage mercurySelectFlightPage = new MercurySelectFlightPage(driver);
		
		//ASSERT SELECT FLIGHT PAGE DISPLAYS
		
		
		assert mercurySelectFlightPage.isMercurySelectFlightPageDisplayed(driver) : "The Mercury Select Flight Page is not displayed.";
		
		
		//SELECT DEPARTURE FLIGHT
		
		//SELECT RETURN FLIGHT
		
		//CLICK CONTINUE BUTTON
		
		//ASSERT THAT BOOK FLIGHT PLAGE DISPLAYS
		
		//CLICK SECURE PURCHASE PAGE DISPLAYS
		
		//ASSERT THAT FLIGHT CONFIRMATION PAGE DISPLAYS
		
		
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
