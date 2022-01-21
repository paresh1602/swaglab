Feature: SauceDemo Sort functionality

  Scenario: Open browser and enter url
    Given User has application url
    And User has username
    And user has password
    When User open browser and open url
    And User enter username and password and user click on login button
    Then User navigates to home page

  Scenario: Test alphabetical ascending sort
    Given User is on the home page
    When User click on the sort button
    And user click on Name (A to Z) sort
    Then Product will get sorted in alphbetical ascending order

  Scenario: Test alphabetical descending sort
    Given User is on the home page
    When User click on the sort button
    And user click on Name (Z to A) sort
    Then Product will get sorted in alphbetical descending order

  Scenario: Test price low to high sort
    Given User is on the home page
    When User click on the sort button
    And user click on Price (low to high) sort
    Then Product will get sorted in price ascending order

  Scenario: Test price high to low sort
    Given User is on the home page
    When User click on the sort button
    And user click on Price (high to low) sort
    Then Product will get sorted in price descending order
