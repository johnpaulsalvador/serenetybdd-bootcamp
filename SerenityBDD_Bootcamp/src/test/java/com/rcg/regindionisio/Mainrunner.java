package com.rcg.regindionisio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

@ExtendWith(SerenityJUnit5Extension.class)
public class Mainrunner {
	@Managed(driver = "chrome")
	WebDriver driver;
	
	
	TestNavigate nav;
	TestAct act;
	TestCom com;
	@Test
	public void navigateYahoo() {
		nav.openURL();
		act.clickSignInButton();
		Assert.assertTrue(com.searchTitle().equalsIgnoreCase("Shopping"));
	}
}
