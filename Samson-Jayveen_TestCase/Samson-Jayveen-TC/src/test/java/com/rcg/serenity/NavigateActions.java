package com.rcg.serenity;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigateActions extends UIInteractions {
	@Step("Navigate to the home page")
    public void toTheYahooHomePage() {
        openUrl("https://www.sg.yahoo.com/");
    }
}