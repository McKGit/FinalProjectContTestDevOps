package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

public class MercuryFlightsPage {
	
	WebDriver driver;

	public MercuryFlightsPage(WebDriver driver) {

		this.driver = driver;

	}

	public boolean isMercuryFlightsPage() {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);

		try{
			webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_FlightsMast));
			
		}catch(Exception e){
			
			return false;

		}
		
		return true;
	}

	public void selectNumberOfPassengers(int numberOfPassengers) {
		
		String nbrOfPassengers = Integer.toString(numberOfPassengers);
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		Select selectNbrPassengers = new Select(webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_numberOfPassengers)));
		
		selectNbrPassengers.selectByVisibleText(nbrOfPassengers);
	}
	
	public void selectDepartingFrom(String departingFrom){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		Select selectDepartFrom = new Select(webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_departingFrom)));
		
		selectDepartFrom.selectByVisibleText(departingFrom);
	}
	
	public void selectArrivingTo(String arrivingTo){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		Select selectArrivingTo = new Select(webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_arrivingIn)));
		
		selectArrivingTo.selectByVisibleText(arrivingTo);
	}

	public void selectDepartMonth (String departMonth){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		Select selectDepartMonth = new Select(webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_fromMonth)));
		
		selectDepartMonth.selectByVisibleText(departMonth);
	}
	
	public void selectDepartDay (String departDay){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		Select selectDepartDay = new Select(webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_fromDay)));
		
		selectDepartDay.selectByVisibleText(departDay);
	}
	
	public void selectReturnMonth (String returnMonth){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		Select selectReturnMonth = new Select(webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_toMonth)));
		
		selectReturnMonth.selectByVisibleText(returnMonth);
	}
	
	public void selectReturnDay (String returnDay){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		Select selectReturnDay = new Select(webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_toDay)));
		
		selectReturnDay.selectByVisibleText(returnDay);
	}
	
	public void selectServiceClass (String serviceClass){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement serviceClassInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_serviceClass));
		
		List <WebElement> radioButtons = serviceClassInput.findElements(By.cssSelector("input[type='radio']"));
		
	      for(WebElement radioButton : radioButtons){
	    	  
	    	  if(radioButton.getAttribute("value").equals("First")){
	    		  radioButton.click();
	    		  break;
	    	  }
	      }
	}
	
	public void selectAirline (String airline){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		Select selectAirline = new Select(webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightsPage_selectAirline)));
		
		selectAirline.selectByVisibleText(airline);
	}
	
	public MercurySelectFlightPage clickContinueButton(){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement continueButton = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryFlightPage_continueButton));	
		
		continueButton.click();
		
		return new MercurySelectFlightPage(driver);
		

	}

	public MercuryCruiseSpecialsPage clickCruisesLink() {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement cruisesLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercurySideLinkMenu_CruisesLink));	
		
		cruisesLink.click();
		
		return new MercuryCruiseSpecialsPage(driver);
		
	}
}
