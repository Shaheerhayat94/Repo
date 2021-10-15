package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class OptyPage extends BasePage{
	
	public OptyPage(WebDriver driver) {
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
	
	@FindBy(xpath="//a[normalize-space()='My Profile']")
	WebElement myprofile;		
	
	public void clickmyprofile () {
		waitforElement(myprofile);
		myprofile.click();
	}
	
	//write new class "DropDownPage"
	@FindBy(xpath="//a[contains(text(),'My Settings')]")
	WebElement mysettings;		
	
	public void clickmysettings () {
		waitforElement(mysettings);
		mysettings.click();
	}

	
	@FindBy(css="a[class='contactInfoLaunch editLink'] img[title='Edit Profile']")
	WebElement editprofile;		
	
	public void clickeditprofile () {
		waitforElement(editprofile);
		editprofile.click();
	}
	

	@FindBy(xpath="//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('PersonalInfo');\"]")
	WebElement personal;		
	
	public void clickpersonal () {
		waitforElement(personal);
		personal.click();
	}
	

	
	@FindBy(xpath="//a[@id='LoginHistory_font']")
	WebElement loginhistory;		
			
			public void clickloginhistory () {
				waitforElement(loginhistory);
				loginhistory.click();
			}
	
	@FindBy(partialLinkText ="Download login histo")
	WebElement dwnldloginhistory;		
				
		public void clickdwnldloginhistory () {
		waitforElement(dwnldloginhistory);
		dwnldloginhistory.click();
		}
		

		@FindBy(xpath="//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('DisplayAndLayout');\"]")
		WebElement displayandlayout;		
				
				public void clickdisplayandlayout () {
					waitforElement(displayandlayout);
					displayandlayout.click();
				}	
	
				@FindBy(xpath="//a[@id='CustomizeTabs_font']")
				WebElement customizemytabs;		
						
						public void clickcustomizemytabs () {
							waitforElement(customizemytabs);
							customizemytabs.click();
						}	
				
	@FindBy(partialLinkText ="Developer Conso")
	WebElement developerconsole;
	
	public void clickdeveloperconsole() {
	waitforElement (developerconsole);
	developerconsole.click();
	
	}
	

	@FindBy(xpath="//span[@id='closeAllFilesButton-textEl']")
	WebElement developerconsolefile;		
			
			public void clickdeveloperconsolefile () {
				waitforElement(developerconsolefile);
				developerconsolefile.click();
				
			}	
	
	@FindBy(xpath="//a[@title='Accounts Tab']")
	WebElement accounttab;
	
	public void clickaccounttab( ) {
		waitforElement(accounttab);
		accounttab.click();
		}
	
	@FindBy(xpath="//a[normalize-space()='Opportunities']")
	WebElement optytab;
	
	public void clickoptytab ( ) {
		waitforElement(optytab);
		optytab.click();
	}
	
	@FindBy(xpath="//a[@title='Leads Tab']")
	WebElement leads;
	
	public void clickleads ( ) {
		waitforElement(leads);
		leads.click();
	}
	
	@FindBy(xpath="//input[contains(@id,'lexNoThanks')]")
	WebElement popupalertnothanks;
	
	public void clickpopupalertnothanks ( ) {
		waitforElement(popupalertnothanks);
		popupalertnothanks.click();
	}
	
	@FindBy(xpath="//input[contains(@id,'lexSubmit')]")
	WebElement popupalertsendtosf;
	
	public void clickpopupalertsendtosf ( ) {
		waitforElement(popupalertsendtosf);
		popupalertsendtosf.click();
	}
	
	@FindBy(xpath="//input[@title='New']")
	WebElement newaccount;
	
	public void clicknewaccount ( ) {
		waitforElement(newaccount);
		newaccount.click();
	}
	
	@FindBy(xpath="//input[@id='acc2']")
	WebElement accountname;
	
	public void enteraccountname (String username ) {
		waitforElement(accountname);
		accountname.sendKeys(username);
	}
	
	@FindBy(xpath="//a[normalize-space()='Create New View']")
	WebElement createnewview;
	
	public void clickcreatenewview ( ) {
		waitforElement(createnewview);
		createnewview.click();
	}
	
	@FindBy(xpath="//input[@id='fname']")
	WebElement viewname;
	
	public void enterintoviewname (String name) {
		waitforElement(viewname);
		viewname.sendKeys(name);
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement newviewsavebtn;
	
	public void clicknewviewsavebtn () {
		waitforElement(newviewsavebtn);
		newviewsavebtn.click();
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Edit']")
	WebElement editviewlnk;
	
	public void clickeditviewlnk () {
		waitforElement(editviewlnk);
		editviewlnk.click();
	}
 
	@FindBy(xpath="//input[@id='fval1']")
	WebElement valuetextbox;
	
	public void enterintovalue (String valuetext) {
		waitforElement(valuetextbox);
		valuetextbox.sendKeys(valuetext);
	}
	
	@FindBy(xpath="//a[@id='publisherAttachTextPost']")
	WebElement postlink;
	
	public void clickpostlink () {
		waitforElement(postlink);
		postlink.click();
	}
 
	
	@FindBy(xpath="//input[@id='publishersharebutton']")
	WebElement sharebtn;
	
	public void clicksharebtn () {
		waitforElement(sharebtn);
		sharebtn.click();
	}
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement addtab;
	
	public void clickaddtab () {
		waitforElement(addtab);
		addtab.click();
	}
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement savebtn;
	
	public void clicksavebtn () {
		waitforElement(savebtn);
		savebtn.click();
	}
	
	@FindBy(xpath="//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('EmailSetup');\"]")
	WebElement emailink;
	
	public void clickemailink () {
		waitforElement(emailink);
		emailink.click();
	}
	
	@FindBy(xpath="//a[@id='EmailSettings_font']")
	WebElement myemailstngs;
	
	public void clickmyemailstngs () {
		waitforElement(myemailstngs);
		myemailstngs.click();
	}
	
	@FindBy(xpath="//input[@id='sender_name']")
	WebElement emailnametextbox;
	
	public void enterintoemailnametextbox (String emailnametext) {
		waitforElement(emailnametextbox);
		emailnametextbox.sendKeys(emailnametext);
	}
	
	@FindBy(xpath="//input[@id='sender_email']")
	WebElement emailaddresstextbox;
	
	public void enterintoemailaddresstextbox (String emailadresstext) {
		waitforElement(emailaddresstextbox);
		emailaddresstextbox.sendKeys(emailadresstext);
	}
	
	@FindBy(xpath="//tbody/tr[7]/td[2]/div[1]/input[1]")
	WebElement YesRadioBtn;
	//Boolean maleRadioButton = YesRadioBtn.isSelected();
	
	public void clickYesRadioBtn () {
		waitforElement(YesRadioBtn);
		YesRadioBtn.click();
	}
	
	@FindBy(xpath="//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('CalendarAndReminders');\"]")
	WebElement calendarandreminders;
	
	public void clickcalendarandreminders () {
		waitforElement(calendarandreminders);
		calendarandreminders.click();
}
	

	@FindBy(xpath="//a[@id='Reminders_font']")
	WebElement activityreminders;
	
	public void clickactivityreminderss () {
		waitforElement(activityreminders);
		activityreminders.click();
}
	
	@FindBy(xpath="//input[@id='testbtn']")
	WebElement opentestreminders;
	
	public void clickopentestreminders () {
		waitforElement(opentestreminders);
		opentestreminders.click();
}
	

	@FindBy(xpath="//a[normalize-space()='Merge Accounts']")
	WebElement mergeacccountss;
	
	public void clickmergeacccountss () {
		waitforElement(mergeacccountss);
		mergeacccountss.click();
}
	
	
	
	@FindBy(xpath="//input[@id='srch']")
	WebElement mergetextbox;
	
	public void enterintomergetextbox (String mergetext) {
		waitforElement(mergetextbox);
		mergetextbox.sendKeys(mergetext);
	}
	
	
	@FindBy(xpath="//div[@class='pbBottomButtons']//input[@title='Next']")
	WebElement nextbtn;
	
	public void clicknextbtn () {
		waitforElement(nextbtn);
		nextbtn.click();
}
	

	@FindBy(xpath="//a[normalize-space()='Accounts with last activity > 30 days']")
	WebElement acctslstactvylnk;
	
	public void clickacctslstactvylnk () {
		waitforElement(acctslstactvylnk);
		acctslstactvylnk.click();
}
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement acctslstactvySave;
	
	public void clickacctslstactvySave () {
		waitforElement(acctslstactvySave);
		acctslstactvySave.click();
}
	
	
	@FindBy(xpath="//input[@id='saveReportDlg_reportNameField']")
	WebElement saveReportTextbox;
	
	public void enterintosaveReportTextbox (String reportname) {
		waitforElement(saveReportTextbox);
	saveReportTextbox.sendKeys(reportname);
	}
	
	@FindBy(xpath="//button[normalize-space()='Save and Run Report']")
	WebElement acctslstactvySaveandRun;
	
	public void clickacctslstactvySaveandRun () {
		waitforElement(acctslstactvySaveandRun);
		acctslstactvySaveandRun.click();
	}
	
	@FindBy(xpath="//input[@id='saveReportDlg_DeveloperName']")
	WebElement saveReportUnqtextbox;
	
	public void entersaveReportUnqtextbox (String reportuniquename) {
		waitforElement(saveReportUnqtextbox);
		saveReportUnqtextbox.sendKeys(reportuniquename);
	}
	
	@FindBy(xpath="//select[@title='View:']")
	WebElement viewLeads;
	
	public void clickviewLeads () {
		waitforElement(viewLeads);
		viewLeads.click();
	}
	
	@FindBy(xpath="//input[@title='Go!']")
	WebElement viewLeadsGoBtn;
	
	public void clickviewLeadsGoBtn () {
		waitforElement(viewLeadsGoBtn);
		viewLeadsGoBtn.click();
	}
	
	
	@FindBy(xpath="//input[@title='New']")
	WebElement recentLeadsNewBtn;
	
	public void clickrecentLeadsNewBtn () {
		waitforElement(recentLeadsNewBtn);
		recentLeadsNewBtn.click();
	}
	
	
	@FindBy(xpath="//tbody/tr[4]/td[2]/div[1]/input[1]")
	WebElement newLeadLastNametextbox;
	
	public void enternewLeadLastNametextbox (String newleadlastname) {
		waitforElement(newLeadLastNametextbox);
		newLeadLastNametextbox.sendKeys(newleadlastname);
	}
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/div[1]/input[1]")
	WebElement newLeadCompanytextbox;
	
	public void enternewLeadCompanytextbox (String newleadcompany) {
		waitforElement(newLeadCompanytextbox);
		newLeadCompanytextbox.sendKeys(newleadcompany);
	}
	
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	WebElement newLeadSaveBtn;
	
	public void clicknewLeadSaveBtn () {
		waitforElement(newLeadSaveBtn);
		newLeadSaveBtn.click();
	}
	

	@FindBy(partialLinkText="Contac")
	WebElement contactsLink;
	
	public void clickContactsLink () {
		waitforElement(contactsLink);
		contactsLink.click();
		
	}
	
	@FindBy(xpath ="//input[@title='New']" )
	WebElement newOptyBtn;
	
	public void clickNewOptyBtn () {
		waitforElement(newOptyBtn);
		newOptyBtn.click();
		
	}
	
	@FindBy(partialLinkText="Stuck Opportuniti")
	WebElement stuckOptyLink;
	
	public void clickStuckOptyLink () {
		waitforElement(stuckOptyLink);
		stuckOptyLink.click();
		
	}
	
	
	@FindBy(xpath ="//input[@title='Run Report']" )
	WebElement runReportBtn;
	
	public void clickRunReportBtn () {
		waitforElement(runReportBtn);
		runReportBtn.click();
		
	}
	
	@FindBy(xpath ="//select[@id='fcf']" )
	WebElement view;
	
	public void clickViewSelect () {
		waitforElement(view);
		view.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	/*Select classes */
	
	
	public void selectMyUnreadLeads() {
		selectDropdown(driver,By.xpath("//select[@title='View:']"), "My Unread Leads");
		
	 }
	
	public void selectTodaysLead() {
		selectDropdown(driver,By.xpath("//select[@id='fcf']"), "Today's Leads" );
		
	 }
	
	public void selectField() {
		selectDropdown(driver,By.xpath("//select[@title='Search By 1']"), "Account Name" );
		
	 }
	
	public void selectInterval() {
		selectDropdown(driver,By.xpath("//select[@id='quarter_q']"), "Current and Next FQ");
		
	 }
	
	public void selectInclude() {
		selectDropdown(driver,By.xpath("//select[@id='open']"), "Open Opportunities");
		
	 }
	
	
	
	public void selectoperator () {
	Select Selectoperatortab =new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
	Selectoperatortab.selectByVisibleText("contains");
	}
	
	public void selectcustomizeapp () {
		Select selectChatterTab = new Select(driver.findElement(By.xpath("//select[@id='p4']")));
		selectChatterTab.selectByVisibleText("Salesforce Chatter");
	}
	
	public void selecttype () {
		Select selectaccttype = new Select(driver.findElement(By.xpath("//select[@id='acc6']")));
		selectaccttype.selectByVisibleText("Technology Partner");
	}
	
	public void selectpriortiy () {
		Select selectcstmrpriority = new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span[1]/select[1]")));
		selectcstmrpriority.selectByVisibleText("High");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
