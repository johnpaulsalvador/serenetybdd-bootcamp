package com.rcg.jpsalvador;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageComponent;

public class TestComponent extends PageComponent{

	@FindBy(xpath="//div//span[@class='challenge-desc signin-sub-title']")
	WebElement signInSubTitle;
	
	
	public String searchTitle() {
		return signInSubTitle.getText();
	}
	
}
