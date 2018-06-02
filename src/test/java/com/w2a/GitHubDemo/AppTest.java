package com.w2a.GitHubDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	WebDriver driver;

	@Test
	public void verifySearch() {
		String DriverPath = "F:\\Selenium\\Jar Files\\geckodriver-v0.18.0-win64\\";
		System.setProperty("webdriver.gecko.driver", DriverPath+"geckodriver.exe");
		driver = new FirefoxDriver();
		//Added new comments
		driver.get("http://only-testing-blog.blogspot.in/");
		driver.close();
	}

}
