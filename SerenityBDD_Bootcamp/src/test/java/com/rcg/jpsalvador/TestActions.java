package com.rcg.jpsalvador;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;


public class TestActions extends UIInteractions {
	
	@Step("Click on Sign In")
	public void clickSignInButton() {
		find("//div//a[@class='_yb_16vny']").click();
	}
	
}
