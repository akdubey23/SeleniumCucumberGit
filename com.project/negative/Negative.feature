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
Feature: Verification of result while giving invalid values.
  
  @tag1
  Scenario: Verify that user get no result when enter only numeric value or special character in free text box of Search filter. 
    Given I want to login into SafariDriver
    And login into SG Digital URL-
    Then user can see menu Career and click on it.
    When user want to enter numeric value in free text box of Search filter.
    Then no result should be displayed.
    When user want to enter special character in free text box of Search filter.
    Then no result should be displayed and broswer should be closed.
    
    
    
    
    
    
  