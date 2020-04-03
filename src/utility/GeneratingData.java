package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webpage_objects.RegistrationPage;

public class GeneratingData {
	// Uniform Resource Locator for website with fake information about persons
	private static final String URL = "https://www.fakepersongenerator.com";

	// Method for retrieving the DataPage
	public static void getDataPage(WebDriver driver) {
		driver.get(URL);
		RegistrationPage.wait(3000);

	}

	// Method for reading data from website
	public static String[] readingDataOnline(WebDriver driver) {
		if (driver.getCurrentUrl().contains("verify")) { // This if statement is used if website is looking for some //
															// sort of verification to bypass it
			driver.close();
			driver = new ChromeDriver();
			getDataPage(driver);
		}
		String[] info = new String[11];
		String name = driver.findElement(By.xpath(Xpaths.getGnName())).getText().toString();
		String City = driver.findElement(By.xpath(Xpaths.getGnCity())).getText().toString();
		String[] FirstLastName = splitingName(name);
		info[0] = FirstLastName[0];
		info[1] = FirstLastName[2];
		String[] CityPostal = splitingCity(City);
		info[2] = driver.findElement(By.xpath(Xpaths.getGnEmail())).getAttribute("value").toString();
		info[3] = driver.findElement(By.xpath(Xpaths.getGnPassword())).getText().toString();
		info[4] = driver.findElement(By.xpath(Xpaths.getGnDateOfBirth())).getText().toString();
		info[5] = driver.findElement(By.xpath(Xpaths.getGnGender())).getText().toString();
		info[6] = driver.findElement(By.xpath(Xpaths.getGnAddress1())).getText().toString();
		info[7] = driver.findElement(By.xpath(Xpaths.getGnAddress2())).getText().toString();
		info[8] = CityPostal[0];
		info[9] = CityPostal[2];
		info[10] = driver.findElement(By.xpath(Xpaths.getGnPhone())).getText().toString();
		driver.findElement(By.xpath(Xpaths.getNextProfile())).click();
		RegistrationPage.wait(3000);

		return info;
	}

	// Method to divide first and last names into separate strings
	private static String[] splitingName(String a) {
		String[] rez = a.split(" ");
		return rez;
	}

	// Method for dividing city and postalcode into separate strings
	private static String[] splitingCity(String a) {
		String[] rez = a.split(", ");
		return rez;
	}

	// Method for splitting birth date into separate strings
	private static String[] splitingBirthDay(String a) {
		String[] rez = a.split("/");
		return rez;
	}

	// Method to retrieve day from date of birth
	public static String getBirthDayDay(int desiredRow) {
		String[] Bday = splitingBirthDay(ExcelData.desiredFile(desiredRow, 4));
		String day = Bday[1];
		return day;
	}

	// Method to retrieve month from date of birth
	public static String getBirthDayMonth(int desiredRow) {
		String[] Bday = splitingBirthDay(ExcelData.desiredFile(desiredRow, 4));
		String day = Bday[0];
		return day;
	}

	// Method to retrieve year from date of birth
	public static String getBirthDayYear(int desiredRow) {
		String[] Bday = splitingBirthDay(ExcelData.desiredFile(desiredRow, 4));
		String day = Bday[2];
		return day;
	}

	// Method for navigate to DataPage
	public static void navigateToDataPage(WebDriver driver) {
		driver.navigate().to(URL);
	}
}