package com.rcg.jpsalvador;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;


public class TestActions extends UIInteractions {
	
	@Step("Click on Sign In")
	public void clickSignInButton() {
		find("//div//a[@data-redirect-params='pspid=[[pspid]]&activity=ybar-signin']").click();
	}
	
}
