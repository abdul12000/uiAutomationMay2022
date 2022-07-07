Feature: ComputerDatabase
  As a User
  I want to be able to add new computer created to the database
  So that I can have the details of the computer stored on the Play sample application

  @CompDB
  Scenario: Add a new comuter to the computer database
    Given I am on the Play sample application home page
    When I click on "Add new computer" button
    And I enter information as follows
      | field             | value      |
      | Computer name     | MaCBook    |
      | Introduced date   | 2022-10-10 |
      | Discontinued date | 2024-10-10 |
      | Company name      | IBM        |
    Then I should be able to add the computer name to the Computer database


  @CompDB2
  Scenario Outline: Add a new comuter to the computer database
    Given I am on the Play sample application home page
    When I click on "Add new computer" button
    And I enter information as follows
      | field             | value      |
      | Computer name     | <cName>    |
      | Introduced date   | <iDate>    |
      | Discontinued date | <dDate>    |
      | Company name      | <compName> |
    Then I should be able to add the computer name to the Computer database
    @test
    Examples:
      | cName   | iDate      | dDate      | compName  |
      | MaCBook | 2022-09-09 | 2022-10-10 | RCA       |
      | MytLap  | 2022-09-09 | 2024-09-09 | Netronics |
      | iPad    | 2022-10-10 | 2025-10-10 | Canon     |
      | notePad | 2023-11-09 | 2027-11-09 | Nokia     |
    @UAT
    Examples:
      | cName   | iDate      | dDate      | compName  |
      | MaCBook | 2022-09-09 | 2022-10-10 | RCA       |
      | MytLap  | 2022-09-09 | 2024-09-09 | Netronics |

    @smoke
  @CompDBSce2
  Scenario: 2 Computer name field should take any type of xter/symbol
    Given I am on the Play sample application home page
    When I click on "Add new computer" button
    And I enter information as follows
      | field             | value      |
      | Computer name     | MaCBook£&    |
      | Introduced date   | 2022-10-10 |
      | Discontinued date | 2024-10-10 |
      | Company name      | IBM        |
    Then I should be able to add the computer name to the Computer database
