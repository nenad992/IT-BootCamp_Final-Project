package webpage_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import utility.ExcelData;
import utility.GeneratingData;
import utility.Xpaths;

public class RegistrationPage {
	// Uniform Resource Locator for Registration and SignIn Page
	private static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	// Method for creating one new customer, fields are changeable
	public static void createNewCustomer(WebDriver driver) {
		wait(5000);
		driver.findElement(By.xpath(Xpaths.getMr())).click();
		driver.findElement(By.xpath(Xpaths.getFirstName())).sendKeys("Michael");
		driver.findElement(By.xpath(Xpaths.getLastName())).sendKeys("Scofield");
		driver.findElement(By.xpath(Xpaths.getPassword())).sendKeys("12345");
		driver.findElement(By.xpath(Xpaths.getDateBirthDays())).click();
		driver.findElement(By.xpath(Xpaths.getDateBDays4())).click();
		driver.findElement(By.xpath(Xpaths.getDateBirthMonths())).click();
		driver.findElement(By.xpath(Xpaths.getDateBMonths3())).click();
		driver.findElement(By.xpath(Xpaths.getDateBirthYear())).click();
		driver.findElement(By.xpath(Xpaths.getDateBYear1990())).click();
		driver.findElement(By.xpath(Xpaths.getNewsletter())).click();
		driver.findElement(By.xpath(Xpaths.getCompany())).sendKeys("State Penitentiary-FOX RIVER");
		driver.findElement(By.xpath(Xpaths.getAddress())).sendKeys("First Street 33");
		driver.findElement(By.xpath(Xpaths.getCity())).sendKeys("Carmel");
		driver.findElement(By.xpath(Xpaths.getStateMenu())).click();
		driver.findElement(By.xpath(Xpaths.getStateIndiana())).click();
		driver.findElement(By.xpath(Xpaths.getPostalCode())).sendKeys("11225");
		driver.findElement(By.xpath(Xpaths.getAdditionalInfo())).sendKeys("announce your shipment 2 days in advance");
		driver.findElement(By.xpath(Xpaths.getMobilePhone())).sendKeys("12355566698");
		driver.findElement(By.xpath(Xpaths.getRegisterButton())).click();
	}

	// Method for entering email on First form of RegistrationPage so it can lead to
	// next form
	public static void createAccount(WebDriver driver, String email) {
		driver.findElement(By.xpath(Xpaths.getEmail())).sendKeys(email);
		driver.findElement(By.xpath(Xpaths.getEmail())).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(Xpaths.getEmail())).click();
		driver.findElement(By.xpath(Xpaths.getEmail())).sendKeys(Keys.ENTER);

	}

	// Method for clicking on Checkout after picking desired products
	public static void prossedToCheckout(WebDriver driver) {
		driver.findElement(By.xpath(Xpaths.getProceed())).click();

	}

	// Method for checking if is there SignOut button and new logged user
	public static boolean checkSingOut(WebDriver driver) {

		try {
			driver.findElement(By.xpath(Xpaths.getSignOutButton()));
			driver.findElement(By.xpath(Xpaths.getNewAccount()));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Method for registering multiple users and reading data from excel spreadsheet
	public static void createAccounts(WebDriver driver, int row) {
		driver.findElement(By.xpath(Xpaths.getEmail())).click();
		driver.findElement(By.xpath(Xpaths.getEmail())).sendKeys(ExcelData.desiredFile(row, 2));
		driver.findElement(By.xpath(Xpaths.getEmail())).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(Xpaths.getEmail())).click();
		driver.findElement(By.xpath(Xpaths.getEmail())).sendKeys(Keys.ENTER);
		wait(4000);
		if (ExcelData.desiredFile(row, 5).equals("female"))
			driver.findElement(By.xpath(Xpaths.getMrs())).click();
		else if (ExcelData.desiredFile(row, 5).equals("male"))
			driver.findElement(By.xpath(Xpaths.getMr())).click();
		driver.findElement(By.xpath(Xpaths.getFirstName())).sendKeys(ExcelData.desiredFile(row, 0));
		driver.findElement(By.xpath(Xpaths.getLastName())).sendKeys(ExcelData.desiredFile(row, 1));
		driver.findElement(By.xpath(Xpaths.getPassword())).sendKeys(ExcelData.desiredFile(row, 3));
		driver.findElement(By.xpath(Xpaths.getDateBirthDays())).click();
		driver.findElement(By.xpath(Xpaths.getDateBirthDays())).sendKeys(GeneratingData.getBirthDayDay(row));
		driver.findElement(By.xpath(Xpaths.getDateBirthDays())).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(Xpaths.getDateBirthMonths())).click();
		selectBirthDayMonth(driver, row);
		driver.findElement(By.xpath(Xpaths.getDateBirthYear())).click();
		driver.findElement(By.xpath(Xpaths.getDateBirthYear())).sendKeys(GeneratingData.getBirthDayYear(row));
		driver.findElement(By.xpath(Xpaths.getDateBirthYear())).sendKeys(Keys.ENTER);
		if (row % 2 == 0)
			driver.findElement(By.xpath(Xpaths.getNewsletter())).click();
		if (row % 3 == 0)
			driver.findElement(By.xpath(Xpaths.getSpecialOffer())).click();
		driver.findElement(By.xpath(Xpaths.getAddress())).sendKeys(ExcelData.desiredFile(row, 6));
		driver.findElement(By.xpath(Xpaths.getCity())).sendKeys(ExcelData.desiredFile(row, 8));
		driver.findElement(By.xpath(Xpaths.getStateMenu())).click();
		for (int x = 0; x < row; x++)
			driver.findElement(By.xpath(Xpaths.getStateMenu())).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(Xpaths.getStateMenu())).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(Xpaths.getPostalCode())).sendKeys(ExcelData.desiredFile(row, 9));
		driver.findElement(By.xpath(Xpaths.getMobilePhone())).sendKeys(ExcelData.desiredFile(row, 10));
		driver.findElement(By.xpath(Xpaths.getRegisterButton())).click();
	}

	// The method for selecting the month of birth of the user and reading from the
	// excel spreadsheet
	private static void selectBirthDayMonth(WebDriver driver, int desiredRow) {
		String month = GeneratingData.getBirthDayMonth(desiredRow);
		int iMonth = Integer.parseInt(month);
		switch (iMonth) {
		case 1:
			driver.findElement(By.xpath(Xpaths.getDateBMonths1())).click();
			break;
		case 2:
			driver.findElement(By.xpath(Xpaths.getDateBMonths2())).click();
			break;
		case 3:
			driver.findElement(By.xpath(Xpaths.getDateBMonths3())).click();
			break;
		case 4:
			driver.findElement(By.xpath(Xpaths.getDateBMonths4())).click();
			break;
		case 5:
			driver.findElement(By.xpath(Xpaths.getDateBMonths5())).click();
			break;
		case 6:
			driver.findElement(By.xpath(Xpaths.getDateBMonths6())).click();
			break;
		case 7:
			driver.findElement(By.xpath(Xpaths.getDateBMonths7())).click();
			break;
		case 8:
			driver.findElement(By.xpath(Xpaths.getDateBMonths8())).click();
			break;
		case 9:
			driver.findElement(By.xpath(Xpaths.getDateBMonths9())).click();
			break;
		case 10:
			driver.findElement(By.xpath(Xpaths.getDateBMonths10())).click();
			break;
		case 11:
			driver.findElement(By.xpath(Xpaths.getDateBMonths11())).click();
			break;
		case 12:
			driver.findElement(By.xpath(Xpaths.getDateBMonths12())).click();
			break;
		}

	}

	// Method for logging out users
	public static void signOut(WebDriver driver) {
		driver.findElement(By.xpath(Xpaths.getSignOutButton())).click();
	}

	// Method for retrieving the Registration and SignIn Page
	public static void getRegistrationPage(WebDriver driver) {
		driver.get(URL);
		wait(3000);
	}

	// Waiting method
	public static void wait(int miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
