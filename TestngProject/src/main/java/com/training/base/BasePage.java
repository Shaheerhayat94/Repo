package com.training.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver  = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void waitforElement(WebElement element){

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void selectDropdown(WebDriver driver, By locator, String value){
		new Select (driver.findElement(locator)).selectByVisibleText(value); 
		}
	
	
	
	}
	


