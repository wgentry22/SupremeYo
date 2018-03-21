package com.revature.SupremeWebDriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static WebDriver getDriver() {
		File f = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
		return new ChromeDriver();
	}
}
