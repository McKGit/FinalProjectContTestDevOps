package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

public class MercuryCruiseSpecialsPage {
	
	WebDriver driver;
	
	public MercuryCruiseSpecialsPage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public boolean isMercuryCruiseSpecialsPageDisplayed(WebDriver driver){
		
		 WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		 
		 try{
			 
			 webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryCruisesPage_CruiseSpecialsMast));
			 
		 }catch(Exception e){
			 
			 return false;
			 
		 }
		
		return true;
	}

}
