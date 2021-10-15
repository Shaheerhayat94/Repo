package com.training.test.leads;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;

import com.training.page.HomePage;
import com.training.page.LeadsPage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class TC24 extends BaseTest {
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	LeadsPage leads;
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException {
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		leads = new LeadsPage(driver);
		
	}
	
	@Test
	public void leads4() throws InterruptedException {
		home.enterintoUsername("shaheer@tektek.com");
		home.enterIntoPassword("4Javascript415");
		home.clickLoginButton();
		home.clickleads();
		home.clickpopupalertnothanks();
		home.clickpopupalertsendtosf();
		home.clickrecentLeadsNewBtn();
		home.enternewLeadLastNametextbox("ABCD");
		home.enternewLeadCompanytextbox("ABCD");
		home.clicknewLeadSaveBtn();
		//completion
		
		
		 }
	
	@AfterMethod
	public void teardown() throws IOException {
		takescreenshot(driver);
		driver.close();
		
	}

}
