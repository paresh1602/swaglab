Feature: SauceDemo Add to Cart functionality

  Scenario: Add one item in the cart
    Given User open the url and login
    When User click on add to cart button
    Then Item should get added to cart and displayed in cart

  Scenario: Add two item in the cart
    Given User open the url and login
    When User click on add to cart button
    And User click on another item add to cart button
    Then Items should get added to cart and displayed in cart
