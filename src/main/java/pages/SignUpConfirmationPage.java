package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpConfirmationPage extends BasePage {

	@FindBy(css="div[class*='col-sm-9'] h2 b")
	WebElement AccCreationMessage;
	
	@FindBy(css="a[data-qa='continue-button']")
	WebElement ContinueButton;
	
	public SignUpConfirmationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getMessage() {
		return AccCreationMessage.getText();
	}
	
	public void clickContinue() {
		click(ContinueButton);
	}
	
	

}
