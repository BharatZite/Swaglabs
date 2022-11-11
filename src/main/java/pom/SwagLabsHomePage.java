package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {

	@FindBy (xpath="//input[@type='text']")private WebElement email;
	@FindBy (xpath="//input[@type='password']")private WebElement pass;
	@FindBy (xpath="//input[@type='submit']")private WebElement login;
	@FindBy (xpath="Add to cart")private WebElement AddToCart;
	@FindBy (xpath="//a[@class='shopping_cart_link']")private WebElement Cart;
	@FindBy (xpath="//button[@data-test='checkout']")private WebElement checkout;
	//@FindBy (xpath="")private WebElement 
	
	public SwagLabsHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void entermail(String mail) {
		email.sendKeys(mail);
	}
	
	public void enterpass(String password) {
		pass.sendKeys(password);
	}
	public void clicklogin() {
		login.click();
	}

	public void clickAddCart() {
	
		AddToCart.click();
	}
	public void clickCart() {
		Cart.click();
	}
	public void clickCheckout() {
		checkout.click();
	}
	
	
	
}
