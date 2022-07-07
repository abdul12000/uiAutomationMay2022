#@Lateef
Feature: Newtours
  As a User
  I want to be able to register an account
  So that I can have an account

  Background:
    Given I am on the Newtours home page
    When I click on Register link

#  @Lateef
  Scenario: Register an account with only mandatory fields
    And I enter username as "Lateef", password and confirm password as "aadd123456"
    And I click on submit button
    Then the confirmation page is displayed with the username as "Lateef"

 @LateefEncap
  Scenario: Register an account with all the fields
    When I enter the Contact information of Firstname as "Tony", Lastname as "Goodluck", number as "0738383838" and email as "aaa@email.com"
    And I enter mailing Information of Address as "92 Alderney street", city as "London", State as "Kent", Postcode as "Po5 3qj" and country as "UNITED KINGDOM"
    And I enter User Information of username as "Paul", password and confirm password as "123456"
    And I click on submit button
    Then the confirmation page is displayed with the username as "Paul"

#Using Scenario Outline/ Examples
  @Lateef
  Scenario Outline: Register an account with all the fields
    When I enter the Contact information of "<Firstname>", "<LastName>", "<PhoneNumber>" and "<Email>"
    And I enter mailing Information of "<Address>","<City>", "<State>", "<Postcode>" and "<Country>"
    And I enter User Information of "<Username>", password and confirm password as "<Password>"
    And I click on submit button
    Then the confirmation page is displayed with the username as "<Username>"
    Examples:
      | Firstname | LastName    | PhoneNumber | Email             | Address     | City   | State | Postcode | Country        | Username | Password |
      | Lateef    | abdul       | 0728383884  | weee@tt.com       | 87 dest rod | London | Ohio  | da8 ee   | BULGARIA       | late     | 123456   |
#      | paul      | Williams    | 07474859855 | weueeu@tt.com     | 94 dest rod | London | Ohio  | da8 ee   | UNITED KINGDOM | Paul11   | 123456   |
#      | Idris     | AbdulKareem | 0858483     | kkjdhddjde@tt.com | 63 dest rod | London | Ohio  | da8 ee   | FRANCE         | Idris433 | 123456   |

