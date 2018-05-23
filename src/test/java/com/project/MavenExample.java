package com.project;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class MavenExample {

	WebDriver driver;
	@Test
	public void TestNew() {
		System.setProperty("webdriver.gecko.driver", "E:\\exJar\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
	}
}
