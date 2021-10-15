package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LoginPage extends BasePage{
	

	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	public void enterintoUsername(String strusername){
		username.sendKeys(strusername);
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	public void enterIntoPassword(String strpassword){
		password.sendKeys(strpassword);
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement blankpassword;
	
	public void clearPassword(){
	blankpassword.clear();	
	}
	
	@FindBy(xpath="//input[@id='username']")
	WebElement wrongusername;
	@FindBy(xpath="//input[@id='password']")
	WebElement wrongpassword;
	
	public void wrongUsernamePass(String wrngusername, String wrngpass){
		wrongusername.sendKeys(wrngusername);
		wrongpassword.sendKeys(wrngpass);
		}
	
	
	
	@FindBy(xpath="//input[@id='Login']")
	WebElement btnLogin;
	

	public void clickLoginButton() {
		btnLogin.click();
		}

	@FindBy(xpath="//div[@id='userNavButton']")
	WebElement usermenubtn;
	
	public void clickusermenu ()  {
		waitforElement(usermenubtn);
		usermenubtn.click();
		}
	

	@FindBy(xpath="//input[@id='rememberUn']")
	WebElement checkbox;
	
	public void checkRememberMe( ) {
		checkbox.click();
		}
	
	@FindBy(partialLinkText="Forgot Your Passwor")
	WebElement forgotpasslink;
	
	public void clickforgotpasslink() {
		waitforElement(forgotpasslink);
		forgotpasslink.click();
		}
	
	@FindBy(xpath="//input[@id='un']")
	WebElement forgotpassusername;
	
	public void enterforgotpassuser () {
	waitforElement(forgotpassusername);
	forgotpassusername.sendKeys("shaheer@tektek.com");
	}
	

	@FindBy(xpath="//input[@id='continue']")
	WebElement continuebtn;
	
	public void clickcontinuebtn () {
	waitforElement(continuebtn);
	continuebtn.click();
	}
	
	
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutlink;
	
	public void clicklogout() {
		waitforElement(logoutlink);
		logoutlink.click();
		}
	
	
	

	/*public void logintapplication(String strusername, String strpassword) {
		username.sendKeys(strusername);
		password.sendKeys(strpassword);
		btnLogin.click();
	}*/
	
	
}
