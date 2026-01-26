package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import drivers.DriverManager;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignUpConfirmationPage;

public class RegistrationTest extends BaseTest {

	@Test
	public void userCanRegisterSuccessfully() {

	    HomePage hp = new HomePage(DriverManager.getDriver());
	    Assert.assertTrue(hp.isLoaded(), "Home Page is not displayed");
	    Assert.assertTrue(hp.isSignUpLoginButtonVisible(), "Signup/Login button is not visible");
        Reporter.log("✔ Signup/Login button is visible", true);
	    hp.clickSignUpLogin();
		Assert.assertTrue(hp.isNewUserSignupTextVisible(), "New User Signup Text is not visible");

		hp.enterName("APP");
		hp.enterEmail("qwertyuz@gmail.com");
		hp.clickSignUp();
		Assert.assertEquals(hp.getEnterInfoText(), "ENTER ACCOUNT INFORMATION");
		
		RegistrationPage rp = new RegistrationPage(DriverManager.getDriver());
		rp.selectMaleTitle();
		rp.enterName("APP");
		rp.enterPassword("Indian@1111111");
		rp.selectDay("26");
		rp.selectMonth("January");
		rp.selectYear("2001");
		rp.selectNewsletterCheckbox();
		rp.selectOffersCheckbox();
		rp.enterFirstName("APP");
		rp.enterLastName("DRI");
		rp.enterCompanyName("CodeDarshi");
		rp.enterAddress("NYK");
		rp.enterAddress2("CMK");
		rp.selectCountry("India");
		rp.enterState("Maharashtra");
		rp.enterCity("khed");
		rp.enterZip("213567");
		rp.enterMobileNum("888888888");
		rp.createAccButtonClick();
		
		SignUpConfirmationPage sp = new SignUpConfirmationPage(DriverManager.getDriver());
		Assert.assertEquals(sp.getMessage(), "ACCOUNT CREATED!");
		sp.clickContinue();
		
	}


}
