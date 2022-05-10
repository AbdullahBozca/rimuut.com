@all
Feature: Try calculating an hourly rate

  Scenario: try calculating an hourly rate
    Given "question1_2" go to
    Then Currency choose
    And expenses filling
    And others filling
    Then result check
    And close page