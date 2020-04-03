package webpage_objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Xpaths;

public class SummerDressesPage {
	// Uniform Resource Locator for Summer Dresses Page
	private static final String DRESSES_URL = "http://automationpractice.com/index.php?id_category=11&controller=category";

	// Method for retrieving the Summer Dresses Page
	public static void getToSummerDressesPage(WebDriver driver) {
		driver.get(DRESSES_URL);
		RegistrationPage.wait(2000);
	}

	// Method for choosing the first dress from the list of dresses
	public static void FirstDressSelect(WebDriver driver) {
		driver.findElement(By.xpath(Xpaths.getFirstDress())).click();
		RegistrationPage.wait(2000);
	}

	// Method for adding a dress to the cart
	public static void addToCart(WebDriver driver) {
		driver.findElement(By.xpath(Xpaths.getQuantity())).click();
		driver.findElement(By.xpath(Xpaths.getQuantity())).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath(Xpaths.getQuantity())).sendKeys("2");
		driver.findElement(By.xpath(Xpaths.getColorPickerBlue())).click();
		driver.findElement(By.xpath(Xpaths.getSizeDroppingMenu())).click();
		driver.findElement(By.xpath(Xpaths.getSizeDroppingMenuSizeM())).click();
		driver.findElement(By.xpath(Xpaths.getAddToCart())).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Xpaths.getContinueShopping())).click();

	}

	// Method for hovering a mouse over checkout and getting to checkout page
	public static void checkout(WebDriver driver) {
		Actions action = new Actions(driver);
		WebElement elem = driver.findElement(By.xpath(Xpaths.getCart()));
		action.moveToElement(elem).perform();
		RegistrationPage.wait(3000);
		driver.findElement(By.xpath(Xpaths.getCheckout())).click();
	}

	// Method for verification if dress is in a cart
	public static boolean checkCart(WebDriver driver) {

		try {
			driver.findElement(By.xpath(Xpaths.getDressInCart()));
			driver.findElement(By.xpath(Xpaths.getDressCartQuantity())).getAttribute("size").contains("2");
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Method to navigate to Summer Dresses Page
	public static void navigateToSummerDresses(WebDriver driver) {
		driver.navigate().to(DRESSES_URL);
	}

}
