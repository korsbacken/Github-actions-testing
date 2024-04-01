Feature: Test of shop page
  These features test the shop page

  Background: User has navigated to the shop page
    Given User has navigated to the shop page

    Scenario: User should be able to add products to the cart
      Given user clicks on add to cart button
      When user navigates to the checkout page
      Then user should see the added product in the cart