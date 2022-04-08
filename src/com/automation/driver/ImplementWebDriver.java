package com.automation.driver;

import org.openqa.selenium.WebDriver;

public class ImplementWebDriver {
	
	public WebDriver createWebDriver(String browser) {
		FactoryWebDriver factory=new  FactoryWebDriver();
		return factory.getDriver(browser).createWebDriverObj();
	}

}
