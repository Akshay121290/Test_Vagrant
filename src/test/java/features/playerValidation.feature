@regression
Feature: Validation of RCB team player's list

  Scenario: Validate that only 4 foreign players are present in team
    Given I read the "TeamRCB.json" payload
    Then I validate that list only contains "11" players 
    Then I validate that only "4" foreign players are present in the list

  Scenario: Validate that at-least 1 wicket keeper is present in the team
    Given I read the "TeamRCB.json" payload
    Then I validate that list only contains "11" players 
    Then I validate that "1" wicket-keeper is present in the team
