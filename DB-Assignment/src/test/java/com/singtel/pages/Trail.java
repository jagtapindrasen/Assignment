package com.singtel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");

		WebDriver d= new ChromeDriver();
		d.get("https://twitter.com/");
		Thread.sleep(3000);
	}

}
