package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	@FindBy(xpath = "//img[contains(@src, 'home') and @alt='Website for automation practice']")
	WebElement HomeImage;

	@FindBy(xpath = "//a[text()=' Signup / Login']")
	WebElement SignUpLoginButton;

	@FindBy(xpath = "//h2[text()='New User Signup!']")
	WebElement NewUserSignupText;
	
	@FindBy(css="input[data-qa='signup-name']")
	WebElement NameSignUpInput;
	
	@FindBy(css="input[data-qa='signup-email']")
	WebElement EmailSignUpInput;
	
	@FindBy(css="button[data-qa='signup-button']")
	WebElement SignUpButton;
	
	@FindBy(xpath="(//h2/b)[1]")
	WebElement EnteraccInfoText;
	
	@FindBy(css="div.login-form h2")
	WebElement LoginTextElement;
	
	@FindBy(css="input[data-qa='login-email']")
	WebElement LoginEmailInput;
	
	@FindBy(css="input[data-qa='login-password']")
	WebElement LoginPasswordInput;
	
	@FindBy(css="button[data-qa='login-button'")
	WebElement LoginButton;
	
	@FindBy(css="form[action='/login'] p")
	WebElement loginErrorText;

	@FindBy(css="form[action='/signup']")
	WebElement userAlreadyExistsText;
	
	@FindBy(css="a[href='/contact_us']")
	WebElement contactUsLink;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public boolean isLoaded() {
		return HomeImage.isDisplayed();
	}

	public boolean isSignUpLoginButtonVisible() {
		return SignUpLoginButton.isDisplayed();
	}

	public void clickSignUpLoginButton() {
		click(SignUpLoginButton);
	}

	public boolean isNewUserSignupTextVisible() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(NewUserSignupText));
		
		return NewUserSignupText.isDisplayed();
	}
	
	public boolean isLoginToAccountTextVisible() {
		
		return LoginTextElement.isDisplayed();
	}
	
	public void enterName(String name) {
		type(NameSignUpInput, name);
	}
	
	public void enterEmail(String name) {
		type(EmailSignUpInput, name);
	}
	
	public void clickSignUp() {
		SignUpButton.click();
	}
	
	public void clickSignUpLogin() {
		SignUpLoginButton.click();
	}
	
	public String getEnterInfoText() {
		return EnteraccInfoText.getText();
	}
	
	public void enterLoginEmail(String email) {
		LoginEmailInput.clear();
		LoginEmailInput.sendKeys(email);
	}
	
	public void enterLoginPassword(String password) {
		LoginPasswordInput.clear();
		LoginPasswordInput.sendKeys(password);
	}
	
	public void clickLoginButton() {
		LoginButton.click();
	}
	
	public String getLoginErrorText() {
		return loginErrorText.getText();
	}
	
	public String getExistingUserErrorTest() {
		return userAlreadyExistsText.getText();
	}
	
	public void openContactUsPage() {
		contactUsLink.click();
	}
	
	
}
