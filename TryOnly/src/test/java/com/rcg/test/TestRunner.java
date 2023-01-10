package com.rcg.test;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;


@ExtendWith(SerenityJUnit5Extension.class)
public class TestRunner {

	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	TestPage navigate;
	
	
	@Test
	public void searchName() {
		navigate.openURL();
	}
}





