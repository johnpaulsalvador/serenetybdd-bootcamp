package com.rcg.test;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class TestAction extends UIInteractions{

	
	@Step("Search by Keyword")
	public void searchBy(String keyword) {
		$("//div[@class='RNNXgb']//div//input").sendKeys(keyword,Keys.ENTER);
	}
}
