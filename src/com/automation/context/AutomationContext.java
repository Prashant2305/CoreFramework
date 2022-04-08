package com.automation.context;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class AutomationContext {
	public static ThreadLocal<WebDriver> driver=new InheritableThreadLocal<WebDriver>();
	public static Properties prop=null;
	public static ExtentReports extentreport=null;
	public static ThreadLocal<ExtentTest> extenttest=new InheritableThreadLocal<ExtentTest>();
	public static ThreadLocal<ExtentTest> extenttestnode=new InheritableThreadLocal<ExtentTest>();

	public static ExtentReports getExtentreport() {
		return extentreport;
	}

	public static void setExtentreport(ExtentReports extentreport) {
		AutomationContext.extentreport = extentreport;
	}

	public static ExtentTest getExtenttest() {
		return extenttest.get();
	}

	public static void setExtenttest(ITestContext context) {
		ExtentTest extenttest=AutomationContext.getExtentreport().createTest(context.getName());
		AutomationContext.extenttest.set(extenttest);
	}

	public static ExtentTest getExtenttestnode() {
		return extenttestnode.get();
	}

	public static void setExtenttestnode(String featurename) {
		ExtentTest extenttestnode=AutomationContext.getExtenttest().createNode(featurename);
		AutomationContext.extenttestnode.set(extenttestnode);;
	}

	public static Properties getProp() {
		return prop;
	}

	public static void setProp(Properties prop) {
		AutomationContext.prop = prop;
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(WebDriver driver) {
		AutomationContext.driver.set(driver);;
	}	
	
}
