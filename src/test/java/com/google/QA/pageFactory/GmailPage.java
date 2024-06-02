package com.google.QA.pageFactory;

import org.openqa.selenium.support.PageFactory;

import com.google.QA.main.BaseClass;

public class GmailPage extends BaseClass{
	
	public GmailPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String returnActualGmailPageUrl() {
		return driver.getCurrentUrl();
	}


}
