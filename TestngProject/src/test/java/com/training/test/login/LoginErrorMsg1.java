package com.training.test.login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class LoginErrorMsg1 extends BaseTest{
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException {
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		
	}
	
	@Test
	public void invalidateLogin() throws InterruptedException {
		
		
		  login.enterintoUsername("shaheer@tektek.com");
		  login.clearPassword(); 
		  login.clickLoginButton();
		 
		

	}
	@AfterMethod
	public void teardown() throws IOException {
		takescreenshot(driver);
		driver.close();
		
	}
}
	 


