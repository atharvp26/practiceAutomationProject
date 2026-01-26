package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import drivers.DriverFactory;
import drivers.DriverManager;
import utilities.ConfigReader;

public class BaseTest {
	
	@Parameters("browserName")
	@BeforeSuite
	public void setUp(String browser) {
		WebDriver driver = DriverFactory.createDriver(browser);
		DriverManager.setDriver(driver);
		driver.get(ConfigReader.get("base.url"));
	}

	@AfterSuite
	public void tearDown() {

		if (DriverManager.getDriver() != null) {
			WebDriver driver = DriverManager.getDriver();
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
