package com.edureka.CucumberFramework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {

	WebDriver driver;
	String currDir = System.getProperty("user.dir");

	@Given("chrome is initialized")
	public void chrome_is_initialized() {
		System.setProperty("webdriver.chrome.driver", currDir +"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("firefox is initialized")
	public void firefox_is_initialized() {
		System.setProperty("webdriver.gecko.driver", currDir +"\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	//Open the URL: https://whatfix.com/
	@When("URL is launched")
	public void url_is_launched() {
		driver.get("https://whatfix.com/");
		driver.manage().window().maximize();
	}

	//Verify that the website is opened
	@Then("Verify that the website is opened")
	public void verify_that_the_website_is_opened() {
		String expectedTitle="Whatfix | Drive Digital Adoption";
		String actualTitle=driver.getTitle();
		Assert.assertTrue("Website is opened",expectedTitle.equals(actualTitle));
	}

	//Click on the “Customers” link
	@Then("User Clicks on the “Customers” link")
	public void user_clicks_on_the_customers_link() {
		driver.findElement(By.xpath("//span[text()='Customers']")).click();
	}
	
	//Wait for the verification point
	@Then("Wait for the verification point for Customer page")
	public void wait_for_the_verification_point_for_customer_page() {
		String expectedTitle="Customers - Whatfix";
		String actualTitle=driver.getTitle();
		Assert.assertTrue("Customer's page is loaded",expectedTitle.equals(actualTitle));
	}

	//Click on “Pricing”
	@Then("User Clicks on “Pricing”")
	public void user_clicks_on_pricing() {
		driver.findElement(By.xpath("//span[text()='Pricing']")).click();
	}
	
	//Wait for the verification point
	@Then("Wait for the verification point for Pricing page")
	public void wait_for_the_verification_point_for_pricing_page() {
		String expectedTitle="Pricing - Whatfix";
		String actualTitle=driver.getTitle();
		Assert.assertTrue("Pricing's page is loaded",expectedTitle.equals(actualTitle));
	}

	//Click on “Partners”
	@Then("User Clicks on “Partners”")
	public void user_clicks_on_partners() {
		driver.findElement(By.xpath("//span[text()='Partners']")).click();
	}
	
	//Wait for the verification point
	@Then("Wait for the verification point for Partners page")
	public void wait_for_the_verification_point_for_partners_page() {
		String expectedTitle="Partners - Whatfix";
		String actualTitle=driver.getTitle();
		Assert.assertTrue("Partners's page is loaded",expectedTitle.equals(actualTitle));
	}

	//Click on “Resources”
	@Then("Clicks on “Resources”")
	public void clicks_on_resources() {
		driver.findElement(By.xpath("//span[text()='Resources']")).click();
	}
	
	//Wait for the verification point
	@Then("Wait for the verification point for Resources page")
	public void wait_for_the_verification_point_for_resources_page() {
		String expectedTitle="Resources Archive - Whatfix";
		String actualTitle=driver.getTitle();
		Assert.assertTrue("Resources's page is loaded",expectedTitle.equals(actualTitle));
	}
	
	//Close the browser
	@Then("Close the browser")
	public void close_the_browser() {
	  driver.close();
	}

	

}
