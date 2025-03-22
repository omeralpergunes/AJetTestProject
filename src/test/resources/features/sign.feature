@Sign
Feature: US02 AJet Sign
  Scenario: TC02 - Sign with registered User information
    Given User go to homepage
    When Enter your username
    And Enter your lastname
    Then Enter your birthday
    But Enter your gender
    Then Enter your phoneNumber
    And Enter your email
    And Enter your password
    And Click to Sign Up
    And Close the browser
