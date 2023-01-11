package com.rcg.test;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;


@ExtendWith(SerenityJUnit5Extension.class)
public class TestRunner {

	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	TestPage navigate;
	TestAction act;
	TestObject ojt;
	
	@Test
	public void searchName() {
		navigate.openURL();
		act.searchBy("Regin Dionisio");
		assertThat(ojt.getLastIndex()).isEqualTo("Regine Dionisio (@.reg) - TikTok");
		
	}
}





