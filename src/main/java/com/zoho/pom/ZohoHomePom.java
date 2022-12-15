package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZohoHomePom {

	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@href='signup.html']")
	private WebElement singUp;

	public ZohoHomePom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSingUp() {
		return singUp;
	}

	
	


}
