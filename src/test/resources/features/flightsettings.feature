@Flight
Feature: Flight Settings Tests
  Scenario: TC-06 Check-In
    Given User goes to site
    When Click on the check in

  Scenario: TC-07 Flight Management
    Given User goes to site
    Then Click on the flight management

  Scenario: TC-08 Flight Status
    Given User goes to site
    When Click on the flight status
    Then Close the browser

  Scenario: TC-09 Slider
    Given User goes to site
    When Click on the slider
    Then Close the browser

  Scenario: TC-10 Slider Right or Left
    Given User goes to site
    When Click on the slider right
    Then Close the browser