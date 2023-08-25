package com.glueCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.utils.Utils;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginGlue2 extends Utils {
	
	@Given("Navigate to W3Schools")
	public void navigate_to_w3schools() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I enter the username")
	public void i_enter_the_username1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I enter my password")
	public void i_enter_my_password1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Click on login")
	public void click_on_login1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Login should be successful")
	public void login_should_be_successful1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Navigate to W3Schools website")
	public void navigate_to_w3schools_website() {
		try
		{
			driver.get("https://profile.w3schools.com/");
		}
		catch(Exception ex)
		{
			System.out.println("Problem while naviagting to W3Schools website");
		}

	}
	@When("I enter the username")
	public void i_enter_the_username() {
		try
		{
			driver.findElement(By.id("modalusername")).sendKeys("bv.nirmal@gmail.com");
			//explicit wait
			Thread.sleep(1000);
			
		}
		catch(Exception ex)
		{
			System.out.println("Problem while entering the username");

		}

	}
	@When("I enter my password")
	public void i_enter_my_password() {
		try
		{
			driver.findElement(By.name("current-password")).sendKeys("Testing@123");
		}
		catch(Exception ex)
		{
			System.out.println("Problem while entering the password");

		}

	}
	
	@When("Click on login")
	public void click_on_login() {
		try
		{
			driver.findElement(By.xpath("//span[text()='Log in']")).click();
			
		}
		catch(Exception ex)
		{
			System.out.println("Problem while clciking the login");
		}


	}


	@Then("Login should be successful")
	public void login_should_be_successful() {
		try
		{
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='My learning']"))));
			Assert.assertEquals(driver.getTitle(), "My learning | W3Schools");
			Thread.sleep(4000);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
