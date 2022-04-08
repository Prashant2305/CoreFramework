package com.automation.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryWebDriver {
	final static Map<String,Supplier<SeleniumWebDriver>> map=new HashMap<>();
	
	static {
		map.put("chrome", ChromeDriver::new);
		map.put("firefox", FirefoxDriver::new);
	}
	
	public SeleniumWebDriver getDriver(String browser) {
		Supplier<SeleniumWebDriver> obj=map.get(browser);
		return obj.get();
	}

}
