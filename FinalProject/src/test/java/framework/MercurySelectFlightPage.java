package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

public class MercurySelectFlightPage {
	
	WebDriver driver;

	public MercurySelectFlightPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public boolean isMercurySelectFlightPageDisplayed(WebDriver driver){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);

		try{
			
			webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercurySelectFlightPage_SelectFlightPageMast));
			
		}catch(Exception e){
			
			return false;

		}
		
		return true;
	}

}
