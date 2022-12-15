package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.zoho.base.BaseClass;
import com.zoho.properties.ConfigHelper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ELCOT\\eclipse-workspace\\Zoho\\src\\test\\java\\com\\feature\\ZohoLogin.feature",
				glue = "com.stepdefinition",
				monochrome = true,
				plugin = {"pretty",
						"html:Report/zogo.html",
						"json:Report/zoho.json",
						"junit:Report/zoho.xml"}
						)
public class RunnerZoho{
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserLunch() throws IOException {
		String browser = ConfigHelper.getInstance().getBrowser();
		driver=BaseClass.browserLaunch(browser);
	}
	@AfterClass
	public static void browserClose() {
		driver.close();
	}
	
	

}
