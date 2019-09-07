package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

public class MercuryLoginPage {
	
	WebDriver driver;
	
	/**
	 * Constructor for MercuryLoginPage.
	 * 
	 * @param driver
	 */
	public MercuryLoginPage(WebDriver driver){
		
		this.driver = driver;
		
		if(!isMercuryLoginPage()){
			
			throw new IllegalStateException("The Edureka Log In page is not displayed.");
		}
	}

	/**
	 * Is the Mercury Login page displayed?
	 * @return
	 */
	public boolean isMercuryLoginPage(){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);

		try{
			webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryLoginPage_mercuryLogo));
			
		}catch(Exception e){
			
			return false;

		}
		
		return true;
	}
	
	/**
	 * Enter email address on log in page.
	 * 
	 * @param emailAddress
	 */
	public void enterEmail(String emailAddress) {

		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement emailInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryLoginPage_email));

		emailInput.clear();
		
		emailInput.sendKeys(emailAddress);
	}
	
	/**
	 * Enter password on the log in page.
	 * 
	 * @param password
	 */
	public void enterPassword(String password){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement passwordInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryLoginPage_password));
		
		passwordInput.clear();
		
		passwordInput.sendKeys(password);
	}

	public void enterUserName(String password) {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement userNameInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryLoginPage_password));
		
		userNameInput.clear();
		
		userNameInput.sendKeys(password);
		
	}


}
