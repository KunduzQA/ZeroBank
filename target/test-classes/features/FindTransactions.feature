@FindTransaction
Feature: Find transaction in Account Activity
  Scenario: Search date range
    Given the user accesses the Find Transaction tab
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates between "2012-09-01 to "2012-09-06
    And the results should be sorted by most recent date
    When the user enters date range from "2012-09-02 to "2012-09-06"