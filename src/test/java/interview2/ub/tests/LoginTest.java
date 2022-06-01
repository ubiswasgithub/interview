//package interview2.ub.tests;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//import interview2.ub.action.Base;
//import interview2.ub.action.DataProvider;
//import interview2.ub.action.Login;
//import interview2.ub.utils.Utility;
//
//public class LoginTest extends Base {
//	private WebDriver driver = null;
//	
//	ExtentReports extent;
//	ExtentTest test;
//	ExtentHtmlReporter extenthtmlreporter;
//	
//	@BeforeSuite
//	public void setupExtendReport() {
//		extent = new ExtentReports();	
//		extenthtmlreporter = new ExtentHtmlReporter("ExtentHtmlReport.html");
//		extent.attachReporter(extenthtmlreporter);
//		
//	}
//
//	@Test
//	public void verifyLogin() {
//		test = extent.createTest("Verify Login Test");
//		Login login = new Login(this.driver);
////		login.enterUsername();
////		login.enterPassword();
////		login.signIn();
////		
////		Assert.assertTrue(login.loggedUserIsDisplayed());
//		test.pass("Login is successful");
//		
//	}
//
//	@BeforeClass
//	public void initiateBrowser() {
//		this.driver = openBrowser();
//		this.driver.get(DataProvider.APP_URL);
//		try {Utility.waitToLoad();} catch (InterruptedException e) {e.printStackTrace();}
//	}
//
//	@AfterClass
//	public void closeBrowser() {
//		
//		closeBrowser(this.driver);
//	}
//	
//	@AfterSuite
//	public void tearDownExtentReports() {
//		
//		extent.flush();
//		
//	}
//
//}
