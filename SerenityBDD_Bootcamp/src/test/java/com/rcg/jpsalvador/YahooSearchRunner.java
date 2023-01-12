package com.rcg.jpsalvador;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

@ExtendWith(SerenityJUnit5Extension.class)
public class YahooSearchRunner {
 
	@Managed(driver = "chrome")
	WebDriver driver;
	
	NavigateToYahooSearch navigate;
	TestComponent testComponent;
	TestActions action;
	
	@Test
	public void goToYahooPage() {
		navigate.openURL("https://sg.yahoo.com/");
		action.clickSignInButton();
		Assert.assertTrue(testComponent.searchTitle().equalsIgnoreCase("Sign in using your Yahoo account"));
	}
}
