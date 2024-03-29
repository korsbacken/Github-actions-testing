Feature: test feature lalala
  This is a feature to test...

  Background: User is on homepage
    Given User has navigated to the start page

    Scenario: User search for something
      When User enter search term
      And click on search
      Then search result should be this