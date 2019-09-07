package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

public class MercuryMainPage {

	WebDriver driver;
	
	public MercuryMainPage(WebDriver driver){
		
		this.driver = driver;
		
		if(!isMercuryMainPage()){
			
			throw new IllegalStateException("The Mercury Main page is not displayed.");
		}
	}

	/*
	 * 
	 * Is the Edureka Main page displayed?
	 */
	private boolean isMercuryMainPage() {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);

		try{
			webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryLoginPage_mercuryLogo));
			
		}catch(Exception e){
			
			return false;
		}
		
		return true;

	}
	
	/**
	 * 
	 * Enter username
	 */
	public void enterUserName(String userName){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement userNameInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryMainPage_userName));
		
		userNameInput.clear();
		
		userNameInput.sendKeys(userName);
		
	}
	
	public void enterPassword(String password){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement passwordInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryMainPage_password));
		
		passwordInput.clear();
		
		passwordInput.sendKeys(password);
	}
	
	
	/**
	 * Click the Log In link on the Edureka main page.
	 * @return 
	 * 
	 */
	public MercuryLoginPage clickLoginLink(){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement loginLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryLgoinPage_loginLink));
		
		loginLink.click();
		
		return new MercuryLoginPage(driver);
	}

	public MercuryRegistrationPage clickRegisterLink() {

		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement registerLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryMainPage_registerLink));
		
		registerLink.click();
		
		return new MercuryRegistrationPage(driver);
	}
}

