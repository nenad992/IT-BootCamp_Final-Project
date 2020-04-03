package main_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import webpage_objects.RegistrationPage;
import webpage_objects.SignInPage;

public class SignInTest {
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
	public void singInTest() {
		SignInPage.getSignIn(driver);
		for (int i = 0; i < 30; i++) {
			SignInPage.singIn(driver, i + 1);
			sa.assertTrue(RegistrationPage.checkSingOut(driver));
			if (RegistrationPage.checkSingOut(driver) == true) {
				RegistrationPage.signOut(driver);
				RegistrationPage.wait(2000);
			}
		}
	}
}
