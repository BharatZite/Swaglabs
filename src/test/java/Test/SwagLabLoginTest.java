package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.SwagLabsHomePage;
import pom.logInPage;
import utility.BaseClass;
import utility.Parametrization;

@Listeners (utility.Listeners.class)
public class SwagLabLoginTest extends  BaseClass  {
	@BeforeMethod
	public void launchBrowser() {
		driver=Browser.launchChrome();
	}
	
	
	//@Test
	public void SwagLabsLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		logInPage log=new logInPage(driver);
		String user=Parametrization.getExcelData("user", 0, 0);
		String pass=Parametrization.getExcelData("user", 1, 0);

		log.entermail(user);
		log.enterpass(pass);
		log.clicklogin();
		String ExpectedUrl="https://www.saucedemo.com/inventory.html";
		String ActualUrl=driver.getCurrentUrl();
				
		Assert.assertEquals(ActualUrl, ExpectedUrl);
		//log.clickLinkedIn();
		//log.clickFB();
		//log.clickTwitter();
		log.clickCombo();
		//log.clickbutton();
		//log.AddCart();
	    // log.clickCart();
	}
	@Test
	public void SwagLabHome () throws EncryptedDocumentException, IOException {
		logInPage log1=new logInPage(driver);
		String user=Parametrization.getExcelData("user", 0, 0);
		String pass=Parametrization.getExcelData("user", 1, 0);

		log1.entermail(user);
		log1.enterpass(pass);
		log1.clicklogin();
		String ExpectedUrl="https://www.saucedemo.com/inventory.html";
		String ActualUrl=driver.getCurrentUrl();
				
		Assert.assertEquals(ActualUrl, ExpectedUrl);
		log1.AddCart();
		log1.clickCart();
		log1.clickCheckout();
	

	}
	
	
	
	
	
	
	
	}
	
	
	
	

