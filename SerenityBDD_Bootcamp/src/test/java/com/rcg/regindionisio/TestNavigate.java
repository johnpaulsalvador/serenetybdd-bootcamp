package com.rcg.regindionisio;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class TestNavigate extends UIInteractions {

	@Step("Navigate to Yahoo")
	public void openURL() {
		openUrl("https://sg.yahoo.com/");
	}
	
}
