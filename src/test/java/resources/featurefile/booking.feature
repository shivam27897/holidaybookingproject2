
Feature: Booking Test

  Scenario: As user I want to booking for Holiday
    Given I am on homepage
    When I enter destination
    And I enter departure airport
    And I select date
    And I select duration
    Then I click on search
