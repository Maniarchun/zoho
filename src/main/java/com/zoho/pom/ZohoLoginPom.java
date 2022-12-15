package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZohoLoginPom {
	public static WebDriver driver;
	@FindBy(id = "emailfield")
	private WebElement emailBox;
	
	@FindBy(id = "password")
	private WebElement passBox;
	
	@FindBy(className = "unchecked")
	private WebElement checkBox;
	
	@FindBy(id = "signupbtn")
	private WebElement signUpBtn;

	public ZohoLoginPom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailBox() {
		return emailBox;
	}

	public WebElement getPassBox() {
		return passBox;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}

}
