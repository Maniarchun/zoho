package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.runner.RunnerZoho;
import com.zoho.Zoho.XlsxReader;
import com.zoho.base.BaseClass;
import com.zoho.pom.SingleTonDesignPatten;
import com.zoho.properties.ConfigHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZohoStep extends BaseClass {
	 public static WebDriver driver = RunnerZoho.driver;
	 String value, value2;
	 public static SingleTonDesignPatten stdp = new SingleTonDesignPatten(driver);
	 
	@Given("user Launch The Url")
	public void user_Launch_The_Url() throws InterruptedException, IOException {
		String url = ConfigHelper.getInstance().getUrl();
		urlLaunch(url);
	
	}

	@When("user Click The SignUp Free")
	public void user_Click_The_SignUp_Free() {
		WebElement signUpElement = stdp.getHomePage().getSingUp();
//				zp.getSingUp();
		clickElement(signUpElement);
	}

	@Given("user Enter The Email")
	public void user_Enter_The_Email() throws IOException {
		WebElement username = stdp.getLoginPage().getEmailBox();
//				zp.getEmailBox();
		value = XlsxReader.singleDataReader("Data1", 1, 0);
		userInput(username, value);
	}

	@Given("user Enther The Password")
	public void user_Enther_The_Password() throws IOException {
		WebElement password = stdp.getLoginPage().getPassBox();
//				zp.getPassBox();
		value2 = XlsxReader.singleDataReader("Data1", 1, 1);
		userInput(password, value2);
	}

	@Given("user Click The Check Box")
	public  void user_Click_The_Check_Box() {
		WebElement checkBoxElement = stdp.getLoginPage().getCheckBox();
//				zp.getCheckBox();
		clickElement(checkBoxElement);
	}
	

	@Then("user Click The SignUp")
	public void user_Click_The_SignUp() throws InterruptedException, IOException {
		WebElement signUpElement = stdp.getLoginPage().getSignUpBtn();
//				zp.getSignUpBtn();
		clickElement(signUpElement);
		sleep();
		screenShot("zoho");
	}

}
