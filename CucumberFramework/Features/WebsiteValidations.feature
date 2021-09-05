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
Feature: Title of your feature
  I want to use this template for my feature file

  @regression
  Scenario Outline: Whatfix website validation
    Given <browser> is initialized
    When URL is launched
    Then Verify that the website is opened
    And User Clicks on the “Customers” link
    Then Wait for the verification point for Customer page
    And User Clicks on “Pricing”
    Then Wait for the verification point for Pricing page
    And User Clicks on “Partners”
    Then Wait for the verification point for Partners page
    And Clicks on “Resources”
    Then Wait for the verification point for Resources page
    And Close the browser

    Examples: 
      | browser | value   | status  |
      | firefox | firefox | success |
      | chrome  | chrome  | success |
