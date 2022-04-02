package com.stepDefn;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepAdactinHotel {
   WebDriver driver;

   @Given("User is search Adactin Hotal login page")
   public void user_is_search_Adactin_Hotal_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	    
      }
   @When("User should enter {string} and {string}")
   public void user_should_enter_and(String string, String string2) {
	   WebElement txtuserName = driver.findElement(By.id("username"));
		txtuserName.sendKeys(string);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(string2);	  
   }
   @When("User have to click login button")
   public void user_have_to_click_login_button() throws InterruptedException {
	   WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
   }

   @When("user should Search Hotel {string},{string},{string},{string},{string},{string}")
   public void user_should_Search_Hotel(String string, String string2, String string3, String string4, String string5, String string6) {
	   WebElement loctn = driver.findElement(By.id("location"));
		loctn.sendKeys(string);
		WebElement htel = driver.findElement(By.id("hotels"));
		htel.sendKeys(string2);
		WebElement romtp = driver.findElement(By.id("room_type"));
		romtp.sendKeys(string3);
		WebElement romnbr = driver.findElement(By.id("room_nos"));
		romnbr.sendKeys(string4);
		WebElement adrom = driver.findElement(By.id("adult_room"));
		adrom.sendKeys(string5);
		WebElement cldrom = driver.findElement(By.id("child_room"));
		cldrom.sendKeys(string6);
   }

   @When("user select clicks on search button")
   public void user_select_clicks_on_search_button() {
	   WebElement sbtn = driver.findElement(By.id("Submit"));
	   sbtn.click();
   }



   @When("User clicks on book now button")
   public void user_clicks_on_book_now_button() {
	   WebElement bNow = driver.findElement(By.id("book_now"));
		bNow.click();   
   }
   @When("User lands on select hotel page ,Click the select radio button")
   public void user_lands_on_select_hotel_page_Click_the_select_radio_button() {
	   WebElement rbtn = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		  rbtn.click();
   }
   @When("User click on continue button")
   public void user_click_on_continue_button() {
	   WebElement cbtn = driver.findElement(By.id("continue"));
		  cbtn.click();
   }
   @When("User is on bokking details page,User enters{string},{string}{string},{string},{string},{string},{string},{string}")
   public void user_is_on_bokking_details_page_User_enters(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
       
	   Thread.sleep(3000);
	   WebElement fstname = driver.findElement(By.id("first_name"));
		fstname.sendKeys(string);
		WebElement ltname = driver.findElement(By.id("last_name"));
		ltname.sendKeys(string2);
		WebElement adres = driver.findElement(By.id("address"));
		adres.sendKeys(string3);
		WebElement ccrad = driver.findElement(By.id("cc_num"));
		ccrad.sendKeys(string4);
		WebElement ctype = driver.findElement(By.id("cc_type"));
		ctype.sendKeys(string5);
		WebElement edate = driver.findElement(By.id("cc_exp_month"));
		edate.sendKeys(string6);
		WebElement eYear = driver.findElement(By.id("cc_exp_year"));
		eYear.sendKeys(string7);
		WebElement cVVn = driver.findElement(By.id("cc_cvv"));
		cVVn.sendKeys(string8);
   }
   @Then("Booking confirmation page should be displayed")
   public void booking_confirmation_page_should_be_displayed() throws InterruptedException {
	   Thread.sleep(7000);
		WebElement bNow = driver.findElement(By.id("order_no"));
		String text = bNow.getAttribute("value");
		System.out.println(text);
   }




}






















