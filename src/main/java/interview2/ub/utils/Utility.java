package interview2.ub.utils;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class Utility {
	public static void waitForTheElementToBeVisible(WebElement el, WebDriver driver) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.until(ExpectedConditions.visibilityOf(el));
		wait.ignoring(NoSuchElementException.class);

	}

	public static void waitToLoad() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void waitForServerToSave() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void dragAndDropBy(WebElement from, int top, int left, WebDriver driver) {
		Actions act = new Actions(driver);
		act.dragAndDropBy(from, top, left).build().perform();
	}

	public static void dragAndDrop(WebElement from, WebElement to, WebDriver driver) {
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
	}

	public static void dragAndDropByOffset(WebElement from, int i, int j, WebDriver driver) {
		Actions act = new Actions(driver);
		act.dragAndDropBy(from, i, j).perform();

	}

	public static void pageRefresh(WebDriver driver) {
		driver.navigate().refresh();

	}

	

	public void dragAndDropByDetails(WebElement parent, WebElement child, WebDriver driver) {
//		Creating object of Actions class to build composite actions
		Actions builder = new Actions(driver);

		// Building a drag and drop action
		Action dragAndDrop = builder.clickAndHold(parent).moveToElement(child).release(child)
				.pause(Duration.ofSeconds(30)).build();

		// Performing the drag and drop action
		dragAndDrop.perform();
	}

	public static void selectItemBytext(String string, List<WebElement> els) {
		for (WebElement el : els) {
			if (el.getText().toString().trim().equalsIgnoreCase(string))
				el.click();
			break;
		}

	}

}
