package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

public class MercuryRegistrationPage {
	
WebDriver driver;
	
	/**
	 * Constructor for MercuryRegistrationPage.
	 * 
	 * @param driver
	 */
	public MercuryRegistrationPage(WebDriver driver){
		
		this.driver = driver;
		
		if(!isMercuryLoginPage()){
			
			throw new IllegalStateException("The Mercury Registration page is not displayed.");
		}
	}

	/**
	 * Is the Mercury Registration page displayed?
	 * @return
	 */
	public boolean isMercuryLoginPage(){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);

		try{
			webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryRegistartionPage_registerMast));
			
		}catch(Exception e){
			
			return false;

		}
		
		return true;
	}
	
	
	public void enterPassword(String password){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement passwordInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryLoginPage_password));
		
		passwordInput.clear();
		
		passwordInput.sendKeys(password);
	}
	
	public void enterConfirmPassword(String password){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement confirmPassword = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryRegistrationPage_confirmPassword));
		
		confirmPassword.clear();
		
		confirmPassword.sendKeys(password);
	}
	
	/** 
	 * Click the Submit button on the Mercury Registration page.
	 */
	public void clickSubmit() {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
			
		WebElement submitButton = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues. MercuryRegistartionPage_submitButton ));

		submitButton.click();
		 
	}

	public boolean isConfirmationMessageDisplayed() {

		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		  
		try{
			
			webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='mercurysignon.php']")));
			
			return true;
			
		}catch(Exception e){
			
			return false;
			
		}
	}

	public void enterFirstName(String first) {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement firstName = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues. MercuryRegistartionPage_firstName ));

		firstName.clear();
		
		firstName.sendKeys(first);
	}

	public void enterLastName(String last) {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement lastName = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues. MercuryRegistartionPage_lastName ));

		lastName.clear();
		
		lastName.sendKeys(last);
		
	}
	
	public void enterEmail(String emailAddress) {

		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement email = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryRegistartionPage_email));

		email.clear();
		
		email.sendKeys(emailAddress);
	}

	public void enterUserName(String un) {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement userName = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.MercuryRegistartionPage_email));

		userName.clear();
		
		userName.sendKeys(un);
		
	}

	public void clickHome() {

		driver.findElement(LocatorValues.MercuryRegistartionPage_HomeLink).click();
		
	}

}
