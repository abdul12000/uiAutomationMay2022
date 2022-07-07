Feature: Adding item on the basket on Gap website
  As a user I should be able add item to the basket on the website so that i can pay for them
  @Gap
  Scenario: adding an item from the Womens category to the basket should not be possible without selecting size
    Given I am on the Gap Home page
    When I choose the Summer Essentials under the "WOMEN" category
    And I choose the first item on the list
    And I click on "Add to Bag"
    Then I should see error msg displayed as "Please select Size before adding to bag"