@Language
Feature: AJet Different Language
  Scenario: TC-03 AJET website in different languages
    Given User language go to homepage
    When Click on the language button
   Then Click on the second language
    And User close the browser