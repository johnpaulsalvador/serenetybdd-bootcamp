
Feature: Navigate to Yahoo Page

  Scenario Outline: Acessing Yahoo Page
    Given User want to navigate to Yahoo page "<website>"
    And User want to click the sign in button
    Then User verifies that he landed on Yahoo Sign-in

    Examples: 
      |  website                | 
      |  https://sg.yahoo.com/  |
