Feature: The Shop
  This feature includes tests to verify functionality of the start page

  Background: The user is on the start page
    Given User has navigated to the start page

    #Samuel
  Scenario: When on start page user should see correct page title
    Then the page title should be "The Shop"

    #Samuel
  Scenario: When user clicks on the checkout button on the start page user should be redirected to the checkout form page
    When the user click on the Checkout button
    Then the user should be redirected to the Checkout form page