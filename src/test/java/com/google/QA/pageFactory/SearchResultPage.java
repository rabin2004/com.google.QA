package com.google.QA.pageFactory;

import org.openqa.selenium.support.PageFactory;
import com.google.QA.main.BaseClass;

public class SearchResultPage extends BaseClass{
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String returnActualSearchResultPageTitle() {
		return driver.getTitle();
	}
	
	public String returnActualSearchResultPageURL() {
		return driver.getCurrentUrl();
	}

}
