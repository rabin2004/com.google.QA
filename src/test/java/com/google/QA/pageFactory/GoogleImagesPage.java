package com.google.QA.pageFactory;

import org.openqa.selenium.support.PageFactory;

import com.google.QA.main.BaseClass;

public class GoogleImagesPage extends BaseClass{

	public GoogleImagesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String returnActualGoogleImagesPageTitle() {
		return driver.getTitle();
	}
}
