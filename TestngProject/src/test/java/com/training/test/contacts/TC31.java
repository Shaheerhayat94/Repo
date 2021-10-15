package com.training.test.contacts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.ContactsPage;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class TC31 extends BaseTest {
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	ContactsPage contacts;
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException {
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		contacts = new ContactsPage(driver);
	}
	
	@Test
	public void contacts1 () {
	
		login.enterintoUsername("shaheer@tektek.com");
		login.enterIntoPassword("4Javascript415");
		login.clickLoginButton();
		home.clickContactsLink();
		home.clickpopupalertnothanks();
		home.clickpopupalertsendtosf();
		contacts.clickCreateNewViewLink();
		contacts.enterintoFirsttNameTextbox("ABCD");
		contacts.enterintoViewUnqNameTextbox("EFGH");
		contacts.clickNewViewCancelBtn();
		//completion
		}
	
	
	@AfterMethod
	public void teardown() throws IOException {
		takescreenshot(driver);
		driver.close();
		
	}

}
