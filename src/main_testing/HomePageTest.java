package main_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import webpage_objects.HomePage;

public class HomePageTest {
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
	public void women_SummerDressesTest() {
		HomePage.getToHomePage(driver);
		HomePage.mouseHover(driver, 1);
		HomePage.clickWmSummerDresses(driver);

		String current = HomePage.getTitle(driver);
		String expected = "Summer Dress";
		boolean contains = current.contains(expected);
		sa.assertTrue(contains);
	}

	@Test
	public void dresses_SummerDressesTest() {
		HomePage.getToHomePage(driver);
		HomePage.mouseHover(driver, 2);
		HomePage.clickSummerDresses(driver);

		String current = HomePage.getTitle(driver);
		String expected = "Summer Dress";
		boolean contains = current.contains(expected);
		sa.assertTrue(contains);
	}

	@Test
	public void samePage() {
		HomePage.getToHomePage(driver);
		HomePage.mouseHover(driver, 1);
		HomePage.clickWmSummerDresses(driver);
		String firstPage = HomePage.getUrl(driver);

		HomePage.navigateToHomePage(driver);
		HomePage.mouseHover(driver, 2);
		HomePage.clickSummerDresses(driver);
		String secondPage = HomePage.getUrl(driver);
		sa.assertEquals(firstPage, secondPage);

	}

}
