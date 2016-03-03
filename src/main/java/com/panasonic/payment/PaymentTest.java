package com.panasonic.payment;

import org.junit.Assert;

import com.panasonic.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PaymentTest {

	WebConnector selenium = new WebConnector();
	
	
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_go_to_panasonic(String url,String browser){
		
	//	System.out.println("I am going to " + url + "on " + browser);
		selenium.openBrowser(browser);
		selenium.navigate(url);
	
	
	}
	
	@And("^I enter in \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter_in(String objectName,String text){
		
		//System.out.println("I enter " + credentials + " on " + values);
		selenium.enter(objectName, text);
	
	}
	
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String objectName){
		
	//	System.out.println("I click on " + object );
		selenium.click(objectName);
	}
	
	@Then("^\"([^\"]*)\" displayed on page should be \"([^\"]*)\"$")
	public void Productid_displayed_on_page_should_be(String object,String expectedResult){
		
	     boolean result= selenium.verifyElementText(object, expectedResult) ;
		
		 if(!result)
			 Assert.fail(expectedResult + "is not displayed on the page");
		 
	     
		//System.out.println(object +  " displayed on page should be " + expectedResult );
	}
	

	
	
}
