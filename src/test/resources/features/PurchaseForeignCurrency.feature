@Currency
Feature: Purchase foreign currency

  Scenario: Available currencies
    Given the user accesses the purchase foreign currency cash tab
    Then following currencies should be available
      | Australia(dollar)     |
      | Canada(dollar)        |
      | Switzerland(franc)    |
      | China(yuan)           |
      | Eurozone(euro)        |
      | Great Britain (pound) |
      | Japan(yen)            |
      | Mexico(peso)          |
      | Norway(krone)         |
      | NewZealand(dollar)    |
      | Singapore(dollar)     |

  Scenario: Error message for not selecting currency
    Given the user accesses the Purchase foreign currency cash tab
    When user tries to calculate cost without selecting a currency
    Then error message shoul be displayed

  Scenario: Error message for not entering value
    Given the user accesses the Purchase foreign currency cash tab
    When user tries to calculate cost without entering a value
    Then error message shoul be displayed