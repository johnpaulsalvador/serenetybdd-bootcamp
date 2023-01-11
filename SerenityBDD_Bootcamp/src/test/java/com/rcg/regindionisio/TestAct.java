package com.rcg.regindionisio;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class TestAct extends UIInteractions {
	@Step("Click on LifeStyle")
	public void clickSignInButton() {
		find("//a[@id='root_3']").click();
	}
}