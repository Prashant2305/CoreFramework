package com.automation.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public  ExtentReports startExtenReport() {		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/reports/AutomationReport.html");       
		ExtentReports extent = new ExtentReports();  
		extent.attachReporter(htmlReporter);
		return extent;				
	}

}
