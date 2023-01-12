package com.rcg.serenity;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class SearchActions extends UIInteractions {
	
	private static final By SearchBar = By.name("p");
	private static final By SgNewsToday = By.linkText("singapore news today");
	private static final By SearchKeyword = By.id("ybar-search");
	
	@Step("Search for NewsToday")
    public void byKeyword(String keyword) {
      $(SearchBar).sendKeys(keyword);
      $(SearchKeyword).click();
      $(SgNewsToday).click();
    }
}