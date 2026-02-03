package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="h2.title")
	WebElement title;
	
	@FindBy(css="div.productinfo p")
	WebElement productsTiles;
	
	@FindBy(css="a[href='/product_details/1']")
	WebElement firstProdDetails;
	
	@FindBy(css="div.productinfo  h2")
	WebElement prices;
	
	
	
	public String getTitleText() {
		return title.getText();
	}
	
	public List<WebElement> getProductsList(){
		return driver.findElements(By.cssSelector("div.productinfo p"));
	}
	
	public List<WebElement> getProductPrices(){
		return driver.findElements(By.cssSelector("prices"));
	}
	
	public void openFirstProd() {
		firstProdDetails.click();
	}
	
	

}
