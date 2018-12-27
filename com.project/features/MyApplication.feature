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
@tag
Feature: Navigate to the open Vacancies section. 
  
  @tag1
  Scenario: Verify that user is able to see menu Career at the top of SG Digital home page. 
    Given I want to login into SafariDriver
    And login into SG Digital URL
    Then user can see new menu Career at the top SG Digital home page
    And able to click on menu Career
    Then user should able to see free text field SEARCH in the career home page
    And user is able to enter word in text box of SEARCH field
    When user click on SEARCH button then user is able to see relevant result
    Then user also apply filter for Location, and user see new result based on location
    
    
    
    
    
    
    
  