package webpage_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.ExcelData;
import utility.Xpaths;

public class SignInPage {
	// Uniform Resource Locator for Registration and SignIn Page
	private static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	// Method for retrieving the Registration and SignIn Page
	public static void getSignIn(WebDriver driver) {
		driver.get(URL);
		RegistrationPage.wait(3000);
	}

	// Method for logging users previously registered from an excel spreadsheet
	public static void singIn(WebDriver driver, int row) {
		driver.findElement(By.xpath(Xpaths.getSignInEmail())).sendKeys(ExcelData.desiredFile(row, 2));
		driver.findElement(By.xpath(Xpaths.getSignInPassword())).sendKeys(ExcelData.desiredFile(row, 3));
		driver.findElement(By.xpath(Xpaths.getSignInButton())).click();
		RegistrationPage.wait(2500);
	}
}
