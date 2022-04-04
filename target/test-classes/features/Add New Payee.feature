@NewPayee
Feature: Add new payee under pay bill

  Scenario: Add new payee
    Given Add New payee tab
    And creates new payee using following information
      | Payee Name    | The law Offices of Hyde,Price & Scharks |
      | Payee Address | 100 Same st, Anytown,USA,10001          |
      | Account       | Checking                                |
      | Payee details | XYZ account                             |
    Then message "The new payee The Law Offices of Hyde, Price & Scharks was auccessfully created" shold be displayed