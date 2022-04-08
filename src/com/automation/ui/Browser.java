package com.automation.ui;

import org.openqa.selenium.By;

import com.automation.context.AutomationContext;

public class Browser {
	public static void launch(String browser) {
		AutomationContext.getDriver().get(browser);
	}
	
	public static void click(By locator) {
		AutomationContext.getDriver().findElement(locator).click();;
	}
	
	public static void sendKeys(By locator,String text) {
		AutomationContext.getDriver().findElement(locator).sendKeys(text);
	}
}
