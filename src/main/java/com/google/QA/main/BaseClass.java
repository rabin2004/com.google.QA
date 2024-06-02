package com.google.QA.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;
	
	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("C:\\Users\\rabin\\eclipse-workspace\\com.google.QA\\src\\main"
					+ "\\java\\com\\google\\QA\\Config\\config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void initialization() {
		String browserName = prop.getProperty("browserName").toLowerCase();
		ChromeOptions options;
		switch (browserName) {
		case "chrome":
			options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Invalid browser selected.");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(prop.getProperty("implicitWait"))));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("test_URL"));
	}
	
	public void tearDown() {
		driver.quit();
	}

}
