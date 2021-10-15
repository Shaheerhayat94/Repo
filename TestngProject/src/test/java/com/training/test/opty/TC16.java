package com.training.test.opty;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.page.OptyPage;
import com.training.utilities.CommonUtilities;

public class TC16 extends BaseTest {
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	OptyPage opty;
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException {
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		opty = new OptyPage(driver);
		
	}
	
	@Test
	public void createopportunity2() throws InterruptedException {
		home.enterintoUsername("shaheer@tektek.com");
		home.enterIntoPassword("4Javascript415");
		home.clickLoginButton();
		home.clickoptytab();
		home.clickpopupalertnothanks();
		home.clickpopupalertsendtosf();
		opty.clickNewOptyBtn();
		/*New Opportunity Edit page is displayed. Enter Opportunity Name,Account Name,
		 * Close Date,Stage,Probability,Lead Source , 
		 * Primary Campaign Source and click on save button.*/
		
		
		
		 }
	
	@AfterMethod
	public void teardown() throws IOException {
		takescreenshot(driver);
		driver.close();
		
	}

}


