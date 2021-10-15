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

public class CheckRememberMe3 extends BaseTest{
	
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
	public void checkRmememberMe() throws InterruptedException {
		
		
		  login.enterintoUsername("shaheer@tektek.com");
		  login.enterIntoPassword("4Javascript415"); 
		  login.checkRememberMe();
		  login.clickLoginButton();
		  login.clickusermenu();
		  login.clicklogout();
		  //need to validate aka Assert
	}
	
	

		
	
	
	 
	
		 
	
		
		

	
	@AfterMethod
	public void teardown() throws IOException {
		takescreenshot(driver);
		driver.close();
		
	} 

}
