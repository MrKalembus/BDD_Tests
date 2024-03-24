Feature: Tests of home page

  Background:
    Given Browser is open

  Scenario: Test strony głównej

    Then I am on the main site

  Scenario: Zapisanie do Newsletter

    When Fill newsletter name with "login"
    And Fill newsletter email with "test@test.test"