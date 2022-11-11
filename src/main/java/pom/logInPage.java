package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logInPage {

	@FindBy (xpath="//input[@type='text']")private WebElement email;
	@FindBy (xpath="//input[@type='password']")private WebElement pass;
	@FindBy (xpath="//input[@type='submit']")private WebElement login;
    @FindBy (xpath="//button[text()='Open Menu']")private WebElement button;
	
	@FindBy (xpath="//select[@class='product_sort_container']")private WebElement combobox;
	@FindBy (xpath="//a[@class='shopping_cart_link']")private WebElement cart;
	@FindBy (xpath="(//button[text()='Add to cart'])[1]")private WebElement AddToCart;
    @FindBy (xpath="//a[text()='Twitter']")private WebElement twitter;
    @FindBy (xpath="//a[text()='Facebook']")private WebElement facebook ;
    @FindBy (xpath="//a[text()='LinkedIn']")private WebElement linkedIn;
	@FindBy (xpath="//button[@data-test='checkout']")private WebElement checkout;

	public logInPage(WebDriver driver) {
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

	public void AddCart() {
	
		AddToCart.click();
	}
	
	public void clickCart () {
		cart.click();
	}
	public void clickbutton() {
		button.click();
	}
	public void clickCombo() {
		Select select =new Select(combobox);
		
		select.selectByIndex(3);
		combobox.click();
	}
	public void clickTwitter() {
		twitter.click();
	}
	
	public void clickFB() {
		facebook.click();
	}
	public void clickLinkedIn () {
		linkedIn.click();
	}
	
	public void clickCheckout() {
		checkout.click();
	}
	
}
