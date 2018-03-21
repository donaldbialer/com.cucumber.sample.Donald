@regression @amazon-login
Feature: Login feature


Background:
  Given I am on home page of Amazon

@amazon-login
Scenario: Verify user should not be able to login using invalid credentials
  When I Hover over to Accounts & List
  And I click on Sign in button
  And I enter rock@fail.com for invalid email address
  #And I enter BadPassword for invalid password
  And I click on continue button
  Then I verify invalid error message


