package constants;

import org.openqa.selenium.By;


public class LocatorValues {
	//BEGIN MERCURY WEBSITE LOCATORS
	
	// Side and Top Link Menus

	public static final By MercuryLoginPage_email = null;

	//Top Menu
	public static By MercurySideLinkMenu_SignOnLink = By.linkText("SIGN-ON");

	public static By MercurySideLinkMenu_RegisterLink = By.linkText("REGISTER");

	public static By MercurySideLinkMenu_SupportLink = By.linkText("SUPPORT");
	
	public static By MercurySideLinkMenu_ContactLink = By.linkText("CONTACT");

	// Side Menu
	public static By MercurySideLinkMenu_HomeLink = By.linkText("Home");
	
	public static By MercurySideLinkMenu_FlightLink = By.linkText("Flights");
	
	public static By MercurySideLinkMenu_HotelsLink = By.linkText("Hotels");
	
	public static By MercurySideLinkMenu_CarRentalsLink = By.linkText("Car Rentals");
	
	public static By MercurySideLinkMenu_CruisesLink = By.linkText("Cruises");

	public static By MercurySideLinkMenu_DestinationsLink = By.linkText("Destinations");
	
	public static By MercurySideLinkMenu_VacationsLink = By.linkText("Vacations");

	//MERCURY Main Page

	public static By MercuryLoginPage_mercuryLogo = By.cssSelector("img[alt='Mercury Tours']");

	public static By MercuryMainPage_registerLink = By.linkText("REGISTER");
	
	public static By MercuryLgoinPage_loginLink = By.name("login");
	
	public static By MercuryMainPage_userName = By.name("userName");
	
	public static By MercuryMainPage_password = By.name("password");
	
	//Mercury FLights page.
	
	public static By MercuryFlightsPage_FlightsMast = By.cssSelector("img[src='/images/masts/mast_flightfinder.gif']");
	
	public static By MercuryFlightsPage_numberOfPassengers = By.name("passCount");

	public static By MercuryFlightsPage_departingFrom = By.name("fromPort");
	
	public static By MercuryFlightsPage_fromMonth = By.name("fromMonth");
	
	public static By MercuryFlightsPage_fromDay= By.name("fromDay");

	public static By MercuryFlightsPage_arrivingIn = By.name("toPort");
	
	public static By MercuryFlightsPage_toMonth = By.name("toMonth");
	
	public static By MercuryFlightsPage_toDay= By.name("toDay");
		
	public static By MercuryFlightsPage_serviceClass = By.cssSelector("input[name='servClass']");
	
	public static By MercuryFlightsPage_selectAirline = By.name("airline");
	
	public static By MercuryFlightPage_continueButton = By.name("findFlights");
	
	//Mercury Select Flights Page
	
	//MercurySelectFlightPage_SelectFlightMast)

	public static By MercurySelectFlightPage_SelectFlightPageMast = By.cssSelector("img[src='/images/masts/mast_selectflight.gif']");
	
	///Mercury Log In Page

	public static By MercuryLoginPage_userName = By.name("userName");
	
	public static By MercuryLoginPage_password = By.name("password");
			
	public static By MercuryLoginPage_login = By.name("login");
	
	//Mercury Registration Page
	
	public static By MercuryRegistartionPage_registerMast = By.cssSelector("img[src='/images/masts/mast_register.gif']");
	
	public static By MercuryRegistartionPage_firstName = By.name("firstName");
	
	public static By MercuryRegistartionPage_lastName = By.name("lastName");

	//note this control has the label "email" so control is wrong name...
	public static By MercuryRegistartionPage_email = By.name("userName");
	
	//note this control has the label "username" so control is wrong name...
	public static By MercuryRegistartionPage_userName = By.name("email");
	
	public static By MercuryRegistrationPage_password = By.name("password");

	public static By MercuryRegistrationPage_confirmPassword = By.name("confirmPassword");
	
	public static By MercuryRegistartionPage_submitButton = By.cssSelector("input[name='register']");
	
	public static By MercuryRegistartionPage_HomeLink = By.linkText("Home");

	//Mercury Flight Finder Page
	
	public static By MercuryRegistartionPage_flightFinderMast = By.cssSelector("img[src='/images/masts/mast_flightfinder.gif']");

	public static By MercuryRegistartionPage_passengerCountSelect = By.name("passCount");

	public static By MercuryRegistartionPage_departingFromSelect = By.name("departFrom");

	public static By MercuryRegistartionPage_fromMonthSelect = By.name("fromMonth");

	public static By MercuryRegistartionPage_fromDaySelect = By.name("fromDay");
	
	public static By MercuryRegistrationPage_flightClassRadio = By.cssSelector("input[name='radio'][value='First']");
	
	public static By MercuryRegistartionPage_airline = By.name("airline");
	
	public static By MercuryRegistrationPage_continueButton = By.cssSelector("img[src='/images/forms/continue.gif']");
	
	
	//Mercury Hotels Page
	
	public static By MercuryFlightsPage_HotelsMast = By.cssSelector("img[src='/images/masts/mast_hotels.gif']");
	
	public static By MercuryCarRentalsPage_CarRentalsMast = By.cssSelector("img[src='/images/masts/mast_carRentals.gif']");

	//Mercury Cruise Specials Page
	
	public static By MercuryCruisesPage_CruiseSpecialsMast = By.cssSelector("img[src='/images/masts/cruise_special.gif']");
	
	public static By MercuryCruisesPage_nowAcceptingReservations = By.cssSelector("img[src='/images/reservation_open.gif']");
}

