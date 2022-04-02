/*package com.stepDefn;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDfefn {
	WebDriver driver;
	@Given("User in on Facebook page")
	public void user_in_on_Facebook_page() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	

	@When("User should enter username and password")
	public void username_and_password() {
		WebElement txtuserName = driver.findElement(By.id("email"));
		txtuserName.sendKeys("Veda");
		System.out.println("Vedanshi");
		WebElement txtpassWord = driver.findElement(By.id("pass"));
		txtpassWord.sendKeys("Ranjan");
    	System.out.println("Ranjan");
	}

	@When("User should click login button")
	public void login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();


	}

	@Then("User should verify success msg")
	public void success_msg() {
		String title = driver.getTitle();
		boolean b = title.contains("sign up");
		Assert.assertTrue("verify title",b);


	}


}*/
