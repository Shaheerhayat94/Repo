package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.training.base.BasePage;

public class ContactsPage extends BasePage{
	
	public ContactsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@title='New']")
	WebElement newBtn;
	
	public void clickNewBtn ()  {
		waitforElement(newBtn);
		newBtn.click();
		}
	
	@FindBy(xpath="//div[@class='requiredInput']//input[@type='text']")
	WebElement lastNameTextbox;
	
	public void enterintoLastNameTextbox (String lastNametextbox){
		lastNameTextbox.sendKeys(lastNametextbox);
	}
	
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/span[1]/input[1]")
	WebElement accountNameTextbox;
	
	public void enterintoAccounttNameTextbox (String accountNametextbox){
		accountNameTextbox.sendKeys(accountNametextbox);
	}
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	WebElement saveBtn;
	
	public void clickSaveBtn ()  {
		waitforElement(saveBtn);
		saveBtn.click();
		}
	
	@FindBy(partialLinkText ="Create New Vi")
	WebElement createNewViewLink;
	
	public void clickCreateNewViewLink ()  {
		waitforElement(createNewViewLink);
		createNewViewLink.click();
		}



	@FindBy(xpath="//input[@id='fname']")
	WebElement firstNameTextbox;
	
	public void enterintoFirsttNameTextbox (String firstNametextbox){
		waitforElement(firstNameTextbox);
		firstNameTextbox.sendKeys(firstNametextbox);
	}


	@FindBy(xpath="//input[@id='devname']")
	WebElement viewUnqNameTextbox;
	
	public void enterintoViewUnqNameTextbox (String viewNametextbox){
		waitforElement(viewUnqNameTextbox);
		viewUnqNameTextbox.sendKeys(viewNametextbox);
	}
	
	
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement newViewSaveBtn;
	
	public void clickNewViewSaveBtn ()  {
		waitforElement(newViewSaveBtn);
		newViewSaveBtn.click();
		}

	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
	WebElement newViewCancelBtn;
	
	public void clickNewViewCancelBtn ()  {
		waitforElement(newViewCancelBtn);
		newViewCancelBtn.click();
		}
	
	
	@FindBy(partialLinkText ="Haywa")
	WebElement recentContactsHaywardLink ;
	
	public void clickRecentContactsHaywardLink ()  {
		waitforElement(recentContactsHaywardLink);
		recentContactsHaywardLink.click();
		}

	
	

	@FindBy(xpath="//div[@class='requiredInput']//input[@type='text']")
	WebElement newLastNameTextbox;
	
	public void enterintoNewLastNameTextbox (String lastNametextbox){
		waitforElement(newLastNameTextbox);
		newLastNameTextbox.sendKeys(lastNametextbox);
	}
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/span[1]/input[1]")
	WebElement newAccountNameTextbox;
	
	public void enterintoNewAccountNameTextbox (String accountNametextbox){
		waitforElement(newAccountNameTextbox);
		newAccountNameTextbox.sendKeys(accountNametextbox);
	}
	
	
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save & New']")
	WebElement saveAndNewBtn;
	
	public void clicksSaveAndNewBtn ()  {
		waitforElement(saveAndNewBtn);
		saveAndNewBtn.click();
		}

	
	
	
	
	
//Select Methods

	public void selectRecentlyCreated() {
		selectDropdown(driver,By.xpath("//select[@id='hotlist_mode']"), "Recently Created" );
		
	 }


	public void selectMyContacts() {
		selectDropdown(driver,By.xpath("//select[@id='fcf']"), "My Contacts" );
		
	 }







}
