package com.singtel.pages;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.singtel.elements.LandingPageElements;
import com.singtel.step_defs.AbstractBase;

import io.cucumber.datatable.DataTable;

public class LandingPage {

	WebDriver driver;
	AbstractBase base;
	LandingPageElements homeElements;
	private WebDriver webdriver;

	public LandingPage(AbstractBase base) {
		this.base = base;
		this.driver = base.getDriver();
		homeElements = new LandingPageElements(this.driver);
	}

	public void redirectToLandingPage() {
		String landingPageUrl = base.getLandingPageURL();
		driver.get(landingPageUrl);
	}

	public void login(String username, String password) {

		homeElements.txtbx_userName.sendKeys(username);
		homeElements.txtbx_nextButton.click();
		homeElements.txtbx_password.sendKeys(password);
		homeElements.btn_login.click();

	}

	
}