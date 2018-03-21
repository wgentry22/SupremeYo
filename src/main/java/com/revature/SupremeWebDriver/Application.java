package com.revature.SupremeWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Application {

	public static void main(String[] args) {
		WebDriver driver = Chrome.getDriver();
		driver.get("http://www.supremenewyork.com/shop");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		WebElement shirt = driver.findElement(By.xpath("//*[@id=\"shop-scroller\"]/li[7]/a/img"));
		shirt.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		WebElement purchase = driver.findElement(By.xpath("//*[@id=\"add-remove-buttons\"]/b"));
		purchase.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		
		driver.quit();
	}
}
