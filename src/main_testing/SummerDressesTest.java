package main_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webpage_objects.SummerDressesPage;

public class SummerDressesTest {
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
	public void addingDress() {
		SummerDressesPage.navigateToSummerDresses(driver);
		SummerDressesPage.FirstDressSelect(driver);
		SummerDressesPage.addToCart(driver);
		SummerDressesPage.checkout(driver);
		sa.assertTrue(SummerDressesPage.checkCart(driver));

	}

}
