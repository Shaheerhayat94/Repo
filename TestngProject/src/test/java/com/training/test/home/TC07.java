package com.training.test.home;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class TC07 extends BaseTest{
	
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
	public void usermenudropdown3() throws InterruptedException {
		home.enterintoUsername("shaheer@tektek.com");
		home.enterIntoPassword("4Javascript415");
		home.clickLoginButton();
		home.clickusermenu();
		home.clickmysettings();
		home.clickpersonal();
		home.clickloginhistory();
		home.clickdwnldloginhistory();
		home.clickdisplayandlayout();
		home.clickcustomizemytabs();
		home.selectcustomizeapp();
		//home.selectavlbltabreport();
		home.clickaddtab();
		home.clicksavebtn();
		home.clickemailink();
		home.clickmyemailstngs();
		home.enterintoemailnametextbox("Shane Hay");
		home.enterintoemailaddresstextbox("shaheerh@icloud.com");
		home.clickYesRadioBtn();
		home.clicksavebtn();
		home.clickcalendarandreminders();
		home.clickactivityreminderss();
		home.clickopentestreminders();
		//completion
		 }
	
	@AfterMethod
	public void teardown() throws IOException {
		takescreenshot(driver);
		driver.close();
		
	}
	

}
 


