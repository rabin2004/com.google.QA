package com.google.QA.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.QA.main.BaseClass;

public class HomePage extends BaseClass{
	// Page Factory definition:
		// 1. Create WebElement -> @FindBy
		// 2. Initialize webElement in constructor
		// 3. Defining methods to handle element or define actions
	
	@FindBy(id="APjFqb")
	WebElement searchTxtBox;
	
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	@FindBy(xpath="//a[text()='Gmail']")
	WebElement gmailLink;
	
	@FindBy(xpath="//a[text()='Images']")
	WebElement imagesLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterValueSearchTxtBox(String valueToSearch) {
		searchTxtBox.sendKeys(valueToSearch);
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public void clickGmailLink() {
		gmailLink.click();
	}
	
	public void clickImagesLink() {
		imagesLink.click();
	}
	

}
