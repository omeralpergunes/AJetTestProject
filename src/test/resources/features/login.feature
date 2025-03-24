@Login
Feature: US01 AJet Login
  Scenario: TC01 - Login with registered User information
    Given User goes to homepage
    Then User click to login
    And Enters mobile phone information
    When Enters password information
    And Click on the Sign in button
    And Close to browser
