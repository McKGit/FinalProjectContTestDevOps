package constants;

public class GlobalConstants {

public final static String EdurekaURL = "http://www.edureka.co";
	
	public final static String mercuryURL = "http://www.newtours.demoaut.com/";
	
	public final static String chromeWebDriverSystemProperty = "webdriver.chrome.driver";
	
	public final static String chromeWebDriverPath = "C:\\Automation\\ChromeWebDriver\\chromedriver.exe";

	public static String geckoDriverSystemProperty = "webdriver.gecko.driver";
	
	public static String geckoWebDriverPath = "C:\\GeckoDriver\\geckodriver.exe";
	
	public static String browserType = "chrome";
	
	public final static String getMercuryURL(){
		
		return mercuryURL;
	}
	
	public final static String getChromeWebDriverSystemProperty(){
		
		return chromeWebDriverSystemProperty;
	}

	public static String getChromeWebDriverPath() {

		return chromeWebDriverPath;
	}
	
	public static String getGeckoWebDriverPath() {

		return geckoWebDriverPath;
	}

	public static String getGeckoDriverSystemProperty(){
		
		return geckoDriverSystemProperty;
	}
	
	public static String getBrowserType(){
		
		return browserType;
	}

}

