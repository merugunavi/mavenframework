
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Verify that the user able to register an account in parabank website
    Given User able to launch the parabank website
    And User clicks the register button from homepage
    When User enters into registration page and enters all the required fields to create an account
    And User clicks the register button from the registration page
    Then User registration succesfull and enters into user account page


  @tag2
  Scenario Outline: Title of your scenario outline
    Given User able to launch the parabank website
    And User clicks the register button from homepage
    When User enters into registration page and enters "<firstname>","<lastname>","<address>","<city>","<state>","<zipcode>","<phone>","<ssn>","<username>","<password>","<confirmpwd>"
    And User clicks the register button from the registration page
    Then User registration succesfull and enters into user account page

    Examples: 
      | firstname | lastname | address | city | state | zipcode | phone | ssn | username | password | confirmpwd |
      | aaa | 345| westcity | Auckland | Auckland | 0634| 909766788 | 1323 | abd| 123 | 123 |
       | bbb| dolly | Northshore | Auckland | Auckland | 0689 | 012333423| 222| dfe | 123 | 123 |