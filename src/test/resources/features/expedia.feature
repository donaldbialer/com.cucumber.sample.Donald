@regression @expedia-flightfinder
  Feature: Flighfinder feature

    Background:
    Given I am on Expedia home page

    @expedia-flightfinder
    Scenario: I can locate a city and airport
      When I select flight button on menu
      And I enter/select a Destination and Airport option
      Then Verify Autocomplete displays and populates my selection


