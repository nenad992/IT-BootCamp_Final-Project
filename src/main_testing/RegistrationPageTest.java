package main_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.ExcelData;
import webpage_objects.RegistrationPage;
import webpage_objects.SummerDressesPage;

public class RegistrationPageTest {

	WebDriver driver;
	SoftAssert sa;

	@BeforeTest
	public void initiator() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		sa = new SoftAssert();
		driver = new ChromeDriver();
	}

	@AfterTest
	public void finish() {
		driver.close();
		sa.assertAll();
	}

	@Test
	public void registrationForm() {
		SummerDressesPage.getToSummerDressesPage(driver);
		SummerDressesPage.FirstDressSelect(driver);
		SummerDressesPage.addToCart(driver);
		SummerDressesPage.checkout(driver);
		RegistrationPage.prossedToCheckout(driver);
		RegistrationPage.createAccount(driver, "FirstTestingAcc@ITBCFinal.com");// After starting test change this
																				// email,because it will be already
																				// registered
		RegistrationPage.createNewCustomer(driver);
		sa.assertTrue(RegistrationPage.checkSingOut(driver));
		RegistrationPage.signOut(driver);
	}

	@Test
	public void registrationForm30() {
		ExcelData.dataEntry(driver);
		RegistrationPage.getRegistrationPage(driver);
		if (RegistrationPage.checkSingOut(driver) == true) {
			RegistrationPage.signOut(driver);
			RegistrationPage.wait(2000);
		}
		for (int i = 0; i < 30; i++) {
			RegistrationPage.createAccounts(driver, i + 1);
			sa.assertTrue(RegistrationPage.checkSingOut(driver));
			if (RegistrationPage.checkSingOut(driver) == true) {
				RegistrationPage.signOut(driver);
				RegistrationPage.wait(2000);
			}
		}

	}

}
