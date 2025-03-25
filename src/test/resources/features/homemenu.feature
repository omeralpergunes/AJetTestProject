@Home
Feature: Home Menu Tests

  Scenario: TC-04 User navigates through home menu options
    Given User go to homemenu
    When User clicks on "services"
    Then Verify the services menu is displayed
    When User clicks on "city"
    Then Verify the city directory is displayed
    When User clicks on "about us"
    And Verify the city directory is displayed


  Scenario: TC-05 User navigates to services submenus
    Given User go to homemenu
    When User clicks on "services"
    And User clicks on submenu
    And Close the menu browser
