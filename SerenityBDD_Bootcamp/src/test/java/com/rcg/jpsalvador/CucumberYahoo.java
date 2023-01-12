package com.rcg.jpsalvador;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class CucumberYahoo {

	@Steps
	NavigateToYahooSearch navigate;
	
	@Steps
	TestActions action;
	
	@Steps
	TestComponent verify;
	
	@Given("^User want to navigate to Yahoo page \"(.*)\"$")
	public void User_want_to_navigate_to_yahoo_page(String sBrowser) {
		navigate.openURL(sBrowser);
	}
	
	@And("^User want to click the sign in button$")
	public void User_want_to_click_the_signin_button() {
		action.clickSignInButton();
	}
	
	@Then("^User verifies that he landed on Yahoo Sign-in$")
	public void User_verifies_that_he_landed_on_yahoo_page() {
		Assert.assertTrue(verify.searchTitle().equalsIgnoreCase("Sign in using your Yahoo account"));
	}
}
