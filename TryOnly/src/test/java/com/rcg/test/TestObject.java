package com.rcg.test;

import org.openqa.selenium.WebElement;

//import com.paulhammant.ngwebdriver.ByAngularBinding.FindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageComponent;

public class TestObject extends PageComponent {
	


//	@FindBy(css="div[class='hlcw0c'] div[class='g Ww4FFb vt6azd tF2Cxc'] h3[class='LC20lb MBeuO DKV0Md']")

		@FindBy(xpath="//h3[normalize-space()='Regine Dionisio (@.reg) - TikTok']")
	WebElement lastIndex;
		
		public String getLastIndex() {
			return lastIndex.getText();
		}

}
