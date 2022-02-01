package com.singtel.step_defs;

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

	
}
