package com.singtel.step_defs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.WebDriver;  
//import com.singtel.pages.Common;
import com.singtel.pages.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TodoSteps {
	
	LandingPage dpLandingPage;
	
	public TodoSteps(LandingPage dpLandingPage) {
		this.dpLandingPage = dpLandingPage;
	}
	
	@Given("I am on twitter login page")
	public void redirect_ToLandingPage() {
		dpLandingPage.redirectToLandingPage();
	}
	
	@When("I login with username {string} and password {string}")
	public void login(String username, String password) {
		dpLandingPage.login(username, password);
	}
	
	@Then("I expect user to be navigated to home page")
	public void verifyLogin() {
		dpLandingPage.verifyLogin();
	}
	
//	@When("^Navigate profile page of logged user and upload a profile picture$")
//	 public void userUploadProfilePicture() throws Throwable {
//		dpLandingPage.userUploadProfilePicture();
//	 }
//	
//	 @When("user Update BIO field in profile section as {string}")
//	 public void userEntersBio(String bio) throws InterruptedException {
//		 dpLandingPage.userEntersBioOnProfilePage(bio);
//	 }
//	 
//	 @When("user Update Location field in profile section as {string}")
//	 public void userEntersLocation(String location) throws InterruptedException {
//		 dpLandingPage.userEntersLocationOnProfilePage(location);
//	 }
//	 
//	 @When("user Update website filed in profile section as {string}")
//	 public void userEnterswebsite(String website) throws InterruptedException {
//		 dpLandingPage.userEntersWebsiteOnProfilePage(website);
//	 }

//	 @When("user Fetch BIO {string} and location {string} and website {string} and check if the submit values got updated")
//	 public void fetchAndVerifyUserDetails(String bio, String location, String password) throws Throwable {
//		dpLandingPage.fetchAndVerifyUserDetails(bio, location, password);
//	 }
	
	 @When("user open the twitter page of {string}")
	 public void retrieveTheTweets(String search) throws InterruptedException {
		 dpLandingPage.retrieveTheTweets(search);
	 }
	
}
