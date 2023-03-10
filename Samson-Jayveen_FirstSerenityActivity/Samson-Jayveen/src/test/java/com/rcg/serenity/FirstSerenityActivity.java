package com.rcg.serenity;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class FirstSerenityActivity extends UIInteractions{
	
	 @Managed(driver = "edge")
	 WebDriver driver;
	 
	 NavigateActions navigate;
	 SearchActions search;
	 	 
	@Test
	public void enterYourNameOnSearchBar() {
		navigate.toTheGoogleSearchPage();
		driver.manage().window().maximize();
		search.byKeyword("Jayveen Samson");
	 }
}
