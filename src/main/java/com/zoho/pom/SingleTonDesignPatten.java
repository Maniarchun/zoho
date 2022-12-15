package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPatten {
	public static WebDriver driver;

	public SingleTonDesignPatten(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public ZohoHomePom getHomePage() {
		ZohoHomePom zh = new ZohoHomePom(driver);
		return zh;
	}
	public ZohoLoginPom getLoginPage() {
		ZohoLoginPom zl= new ZohoLoginPom(driver);
		return zl;
	}

}
