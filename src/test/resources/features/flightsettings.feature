@Flight
Feature: Flight Settings Tests
#Scenario: TC-06 Check-In
#  Given User goes to site
#  When Click on the check in

#Scenario: TC-07 Flight Management
#  Given User goes to site
#  Then Click on the flight management

#Scenario: TC-08 Flight Status
#  Given User goes to site
#  When Click on the flight status
#  Then Close the browser

#Scenario: TC-09 Slider
#  Given User goes to site
#  When Click on the slider
#  Then Close the browser

#Scenario: TC-10 Slider Right or Left
#  Given User goes to site
#  When Click on the slider right
#  Then Close the browser

 # Scenario: TC-11 Flight Search
 #   Given User goes to site
 #   When Select the one way
 #   Then Enter the value for the departure airport
 #   Then Select the airport to arrival
 #   Then Select departure date
 #   Then Determine the number of passengers arriving
 #   Then Click on the search flight button
 #   And Close the browser

  #Scenario: TC-12 Flight Search
 # Given User goes to site
 # When Select the round trip
  #Then Enter the value for the departure airport
 # Then Select the airport to arrival
 # Then Select departure date
 # Then Select return date
 # Then Determine the number of passengers arriving
 # Then Click on the search flight button
 # And Close the browser


 #Scenario: TC-13 Check-In Control
 #  Given User goes to site
 #  When Click on the check in
 #  Then Access ticket area
 #  Then Enter a value in the lastname field
 #  And Click on the search button
 #  And Close the browser

 # Bu iki senaryomuzdaki locate alanları ortak olduğundan dolayı page classımız içerisinde
 ## bir daha tanımlamamıza gerek kalmadı.

 #Scenario: TC-14 Flight Management Control
 #  Given User goes to site
 #  Then Click on the flight management
 #  Then Access pnr area
 #  Then Enter a value in the lastname field
 #  And Click on the search button
 #  And Close the browser


  Scenario: TC-15 Flight Status - Route Test
    Given User goes to site
    When Click on the flight status
    Then Enter the value for the departure
    Then Enter the value for arrival
    Then Select the departure date
    Then Click on the route search