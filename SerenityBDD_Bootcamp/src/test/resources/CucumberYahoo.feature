
Feature: Navigate to Yahoo Page

  Scenario Outline: Acessing Yahoo Page
    Given Browser "<browser>" and website "<website>" is open
    And User want to click the sign in button
    Then User verifies that he landed on Yahoo Sign-in

    Examples: 
      | browser  | website                | 
      | chrome	 | https://sg.yahoo.com/  |
