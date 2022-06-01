package interview2.ub.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	
	private static WebDriver driver = null;	
	private static final String projectdir = System.getProperty("user.dir");
	
	


	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", projectdir+"/src/test/resources/driver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();		
//		options.addArguments("--headless");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		
		driver = new ChromeDriver(options);	
		driver.manage().window().maximize();

		return driver;	

	}	

	public static void closeBrowser(WebDriver driver) {

		driver.quit();
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void waitToPageLoad(WebDriver driver) {
		driver.manage().timeouts().getPageLoadTimeout();
		
	}

}
