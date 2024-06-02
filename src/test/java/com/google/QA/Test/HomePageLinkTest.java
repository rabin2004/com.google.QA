package com.google.QA.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.QA.main.BaseClass;
import com.google.QA.pageFactory.GmailPage;
import com.google.QA.pageFactory.GoogleImagesPage;
import com.google.QA.pageFactory.HomePage;

public class HomePageLinkTest extends BaseClass{
	HomePage hp;
	GmailPage gp;
	GoogleImagesPage gip;
	
	@BeforeMethod
	public void loadApp() {
		initialization();
		hp = new HomePage();
		gp = new GmailPage();
		gip = new GoogleImagesPage();
	}
	
	@AfterMethod
	public void closeApp() {
		tearDown();
	}
	
	@Test
	public void gmail_link_test() {
		hp.clickGmailLink();
		Assert.assertEquals(gp.returnActualGmailPageUrl(), prop.getProperty("expectedGmailPageUrl"));
	}
	
	@Test
	public void images_link_test() {
		hp.clickImagesLink();
		Assert.assertEquals(gip.returnActualGoogleImagesPageTitle(), prop.getProperty("expectedGoogleImagesPageTitle"));
	}
}
