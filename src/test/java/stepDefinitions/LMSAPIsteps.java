package stepDefinitions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LMSAPIsteps{
	
	WebDriver driver;
	
	
	// Scenario: check if we can update the existing programId
	@Given("User sends PUT request with LMS API end point")
	public void user_sends_put_request_with_lms_api_end_point() {
		//instead of hotcoding our strings, we can give them through properties file.
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\balum\\Desktop\\RadhikaStuff\\selenium\\java and eclipse dw\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("//lms-admin-rest-service.herokuapp.com/Programs/");
	}

	@When("User sends PUT request with New Program Name and New Desc")
	public void user_sends_put_request_with_new_program_name_and_new_desc() {
		//Write code here that turns the phrase above into concrete actions
		System.out.println("LMSAPIsteps.user_sends_put_request_with_new_program_name_and_new_desc()");   
	}
	

	//status 200 ok message
	@Then("User receives Status {int} OK is displayed.")
	public void user_receives_status_ok_is_displayed(Integer int1) {
	   //Write code here that turns the phrase above into concrete actions
		System.out.println("LMSAPIsteps.user_receives_status_ok_is_displayed()");
	}

	//Scenario: check if we can update the non-existing programId
	//Given is same
	@When("User sends PUT request with non-existing programId and non-existing program Desc")
	public void user_sends_put_request_with_non_existing_program_id_and_non_existing_program_desc() {
		//Write code here that turns the phrase above into concrete actions
		System.out.println("LMSAPIsteps.user_sends_put_request_with_non_existing_program_id_and_non_existing_program_desc()"); 
	}

	//400 status code Bad request message
	@Then("User receives Status  {int} Bad Request is displayed.")
	public void user_receives_status_bad_request_is_displayed(Integer int1) {
		//Write code here that turns the phrase above into concrete actions
				System.out.println("LMSAPIsteps.user_receives_status_bad_request_is_displayed()"); 
	}

	//Scenario: check if we can update with programId as null.
	@When("User sends PUT request with programId as null.")
	public void user_sends_put_request_with_program_id_as_null() {
		//Write code here that turns the phrase above into concrete actions
		System.out.println("LMSAPIsteps.user_sends_put_request_with_program_id_as_null()"); 
	}
	//400 status code bad request message
	
	
	//Scenario: check if we can update with programId as alphanumeric.
	@When("User sends PUT request with programId as alphanumeric.")
	public void user_sends_put_request_with_program_id_as_alphanumeric() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("LMSAPIsteps.user_sends_put_request_with_program_id_as_alphanumeric()"); 
	}
	
	

	//405 status code : method not allowed message
	@Then("User receives Status  {int} \\(error message:method not allowed) is displayed.")
	public void user_receives_status_error_message_method_not_allowed_is_displayed(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		System.out.println("LMSAPIsteps.user_receives_status_error_message_method_not_allowed_is_displayed()"); 
	}
	
	//Scenario: check if we can update the program description.
	@When("User sends PUT request with new program description.")
	public void user_sends_put_request_with_new_program_description() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("LMSAPIsteps.user_sends_put_request_with_new_program_description()"); 
	}
	
	//200 status code ok message
	
	//Scenario: check if we can update the program description is number or alphanumeric.
	@When("User sends PUT request with program description is number or aplhanumeric.")
	public void user_sends_put_request_with_program_description_is_number_or_aplhanumeric() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("LMSAPIsteps.user_sends_put_request_with_program_description_is_number_or_aplhanumeric()"); 
	}
	
	//200 status code ok message
	
	//Scenario: check if we can update the program Name is given with special characters.
	@When("User sends PUT request with program Name as special characters.")
	public void user_sends_put_request_with_program_name_as_special_characters() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("LMSAPIsteps.user_sends_put_request_with_program_name_as_special_characters()"); 
	}
	
	//200 status code ok message
	
	//Scenario: check if we can update when 'Online' field is entered with numbers.
	@When("User sends PUT request with online field filled with numbers.")
	public void user_sends_put_request_with_online_field_filled_with_numbers() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("LMSAPIsteps.user_sends_put_request_with_online_field_filled_with_numbers()"); 
	}
	
	//200 status code ok message
	
	    
	//Scenario: check if we can update when Program Name is Decimal.
	@When("User sends PUT request with program Name is Decimal input.")
	public void user_sends_put_request_with_program_name_is_decimal_input() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("LMSAPIsteps.user_sends_put_request_with_program_name_is_decimal_input()"); 
	}
	
	//200 status code ok message
	
	
	}