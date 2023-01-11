package com.rcg.regindionisio;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageComponent;

public class TestCom extends PageComponent {
	@FindBy(xpath="//div//span[@class='challenge-desc signin-sub-title']")
	WebElement signInSubTitle;
	
	@FindBy(xpath="//a[@id='root_1']")
	WebElement shop;
	
	public String searchTitle() {
		return shop.getText();
	}
	
}