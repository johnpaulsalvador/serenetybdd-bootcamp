package com.rcg.jpsalvador;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigateToYahooSearch extends UIInteractions {

	@Step("Navigate to Yahoo")
	public void openURL(String sUrl) {
		openUrl(sUrl);
	}
	
}
