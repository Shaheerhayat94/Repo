package com.training.test.account;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.AccountPage;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class TC10 extends BaseTest {
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	AccountPage account;
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException {
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		account = new AccountPage(driver);
		
	}
	
	@Test
	public void usermenudropdown6() throws InterruptedException {
		home.enterintoUsername("shaheer@tektek.com");
		home.enterIntoPassword("4Javascript415");
		home.clickLoginButton();
		account.clickaccounttab();
		home.clickpopupalertnothanks();
		home.clickpopupalertsendtosf();
		account.clicknewaccount();
		account.enteraccountname("shaheer's account");
		account.selecttype();
		account.selectpriortiy();
		//completion
	
		
		 }
	
	@AfterMethod
	public void teardown() throws IOException {
		takescreenshot(driver);
		//driver.close();
		
	}
}
