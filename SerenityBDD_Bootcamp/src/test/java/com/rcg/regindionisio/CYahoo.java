package com.rcg.regindionisio;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class CYahoo {

	@Steps
	TestAct act;
	
	@Steps
	TestCom com;
	
	@Steps
	TestNavigate nav;
	
	
	@Given("^User want to navigate to Yahoo page \"(.*)\"$")
	public void User_want_to_navigate_to_yahoo_page(String sBrowser) {
		nav.openURL(sBrowser);
	}
	
	@And("^User want to click the Lifestyle button$")
	public void User_want_to_click_the_signin_button() {
		act.clickSignInButton();
	}
	
	@Then("^User verifies that he landed on Yahoo! Lifestyle$")
	public void User_verifies_that_he_landed_on_yahoo_page() {
		Assert.assertTrue(com.searchTitle().equalsIgnoreCase("Shopping"));
	}
}
