#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@PUT_request
Feature: Test the PUT request of LMS API
Background:Authorizaiton is set to "Basic auth"

  @PUT_request
  Scenario: check if we can update the existing programId
    Given User sends PUT request with LMS API end point
    When User sends PUT request with New Program Name and New Desc
    Then User receives Status 200 OK is displayed. 
    
        
  @PUT_request
  Scenario: check if we can update the non-existing programId
    Given User sends PUT request with LMS API end point
    When User sends PUT request with non-existing programId and non-existing program Desc
    Then User receives Status  400 Bad Request is displayed. 

     @PUT_request
  Scenario: check if we can update with programId as null.
    Given User sends PUT request with LMS API end point
    When User sends PUT request with programId as null.
    Then User receives Status  400 Bad Request is displayed. 
    
    @PUT_request
  Scenario: check if we can update with programId as alphanumeric.
    Given User sends PUT request with LMS API end point
    When User sends PUT request with programId as alphanumeric.
    Then User receives Status  405 (error message:method not allowed) is displayed. 
    
    @PUT_request
  Scenario: check if we can update the program description.
    Given User sends PUT request with LMS API end point
    When User sends PUT request with new program description.
    Then User receives Status 200 OK is displayed. 
    
    @PUT_request
  Scenario: check if we can update the program description is number or alphanumeric.
    Given User sends PUT request with LMS API end point
    When User sends PUT request with program description is number or aplhanumeric.
    Then User receives Status 200 OK is displayed. 
    
    @PUT_request
  Scenario: check if we can update the program Name is given with special characters.
    Given User sends PUT request with LMS API end point
    When User sends PUT request with program Name as special characters.
    Then User receives Status 200 OK is displayed. 
    
    @PUT_request
  Scenario: check if we can update when 'Online' field is entered with numbers.
    Given User sends PUT request with LMS API end point
    When User sends PUT request with online field filled with numbers.
    Then User receives Status 200 OK is displayed. 
    
    @PUT_request
  Scenario: check if we can update when Program Name is Decimal.
    Given User sends PUT request with LMS API end point
    When User sends PUT request with program Name is Decimal input.
    Then User receives Status 200 OK is displayed.