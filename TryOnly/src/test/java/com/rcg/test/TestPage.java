package com.rcg.test;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class TestPage extends UIInteractions {
@Step("Navigate to Google")
public void openURL() {
	openUrl("https://www.google.com/");
}
}
