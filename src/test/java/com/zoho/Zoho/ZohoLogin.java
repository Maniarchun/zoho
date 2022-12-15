package com.zoho.Zoho;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoLogin {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Mydemo\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='signup.html']")).click();
		WebElement username = driver.findElement(By.id("emailfield"));
		String value = XlsxReader.singleDataReader("Data1", 1, 0);
		username.sendKeys(value);
		WebElement password = driver.findElement(By.id("password"));
		String value2 = XlsxReader.singleDataReader("Data1", 1, 1);
		password.sendKeys(value2);
		driver.findElement(By.className("unchecked")).click();
		driver.findElement(By.id("signupbtn")).click();
	}
}
