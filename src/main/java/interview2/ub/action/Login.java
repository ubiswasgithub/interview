//package interview2.ub.action;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//
//import interview2.ub.utils.Utility;
//
//public class Login {
//
//	private WebDriver driver = null;
//
//	@FindBy(how = How.ID, using = "WebLogin_UserName")
//	private static WebElement username;
//
//	@FindBy(how = How.ID, using = "Password")
//	private static WebElement password;
//
//	@FindBy(how = How.ID, using = "WebLogin_Login")
//	private static WebElement btn_Singin;
//
//	@FindBy(how = How.CSS, using = "#page-title > h1")
//	private static WebElement welcome_tittle;
//
//	public Login(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(this.driver, this);
//	}
//
//	public void enterUsername() {
//		username.sendKeys(DataProvider.username);
//	}
//
//	public void enterPassword() {
//		password.sendKeys(DataProvider.password);
//	}
//
//	public void signIn() {
//		btn_Singin.click();
//		try {Utility.waitToLoad();} catch (InterruptedException e) {e.printStackTrace();}
//		
//	}
//
//	public boolean loggedUserIsDisplayed() {
//		
//		Utility.waitForTheElementToBeVisible(welcome_tittle, driver);
//		return welcome_tittle.isDisplayed();
//	}
//
//}
