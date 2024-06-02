package com.google.QA.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.QA.main.BaseClass;
import com.google.QA.pageFactory.HomePage;
import com.google.QA.pageFactory.SearchResultPage;

public class SearchFunctionalityTest extends BaseClass{
	HomePage hp;
	SearchResultPage srp;
	
	@BeforeMethod
	public void loadApp() {
		initialization();
		hp = new HomePage();
		srp = new SearchResultPage();
	}
	
	@AfterMethod
	public void closeApp() {
		tearDown();
	}
	
	@Test(dataProviderClass=com.google.QA.DataPkg.SearchData.class, dataProvider="Positive search data")
	public void positive_Search_Functionality_Test_With_Clicking_Search_Button(String value) {
		hp.enterValueSearchTxtBox(value);
		hp.clickSearchBtn();
		Assert.assertTrue(srp.returnActualSearchResultPageTitle().contains(value));
		Assert.assertTrue(srp.returnActualSearchResultPageURL().contains(value));	
	}

}
