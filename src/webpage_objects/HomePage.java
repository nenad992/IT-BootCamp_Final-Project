package webpage_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Xpaths;

public class HomePage {
	// Uniform Resource Locator for HomePage
	private static final String HOME_URL = "http://automationpractice.com/index.php";

	// Method for retrieving the HomePage
	public static void getToHomePage(WebDriver driver) { //
		driver.get(HOME_URL);
		RegistrationPage.wait(2000);
	}

	// Method for hovering a mouse over two elements
	public static void mouseHover(WebDriver driver, int oneOrTwo) {
		Actions action = new Actions(driver);
		WebElement elem = null;
		switch (oneOrTwo) {
		case 1:
			elem = driver.findElement(By.xpath(Xpaths.getWomenDroppingMenu()));
			action.moveToElement(elem).perform();
			RegistrationPage.wait(2500);
			break;
		case 2:
			elem = driver.findElement(By.xpath(Xpaths.getDressesDroppingMenu()));
			action.moveToElement(elem).perform();
			RegistrationPage.wait(2500);
			break;
		default:
			System.out.println("Wrong selection");
			break;
		}
	}

	// Method for clicking on Summer Dresses on Women dropping tab
	public static void clickWmSummerDresses(WebDriver driver) {
		driver.findElement(By.xpath(Xpaths.getWmDmSummerDresses())).click();
	}

	// Method for clicking on Summer Dresses on Dresses dropping tab
	public static void clickSummerDresses(WebDriver driver) {
		driver.findElement(By.xpath(Xpaths.getSummerDressesDressesDm())).click();
	}

	// Method for getting current title of a page
	public static String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	// Method for navigate to HomePage
	public static void navigateToHomePage(WebDriver driver) {
		driver.navigate().to(HOME_URL);
	}

	// Method for getting current URL of a page
	public static String getUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

}
