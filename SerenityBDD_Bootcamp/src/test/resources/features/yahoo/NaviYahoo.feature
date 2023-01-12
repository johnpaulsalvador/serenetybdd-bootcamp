
Feature: Navigate to Yahoo Page

  Scenario Outline: Acessing Yahoo! Lifestyle
    Given User want to navigate to Yahoo page "<website>"
    And User want to click the Lifestyle button
    Then User verifies that he landed on Yahoo! Lifestyle

    Examples: 
      |  website                | 
      |  https://sg.yahoo.com/  |
