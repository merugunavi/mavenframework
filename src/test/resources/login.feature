@tag
Feature:parabank
 

  @tag1
  Scenario: verify that the user able to enter into the account using login credentials
    Given User able to launch the parabank website
    When User able to enter username and password
    And User clicks the login button
    Then User enters into account overview page
   
   
   @tag2
   Scenario Outline:  verify that the user able to enter into the account using login credentials
    Given User able to launch the parabank website
    When User able to enter "<username>" and "<password>"
    And User clicks the login button
    Then User enters into account overview page
   
		Examples:
		| username | password |
		| aaa	| 123|
		| bbb | 123|

		
		@tag3
		Scenario: Verify that the user able to transfer the funds from the funds transfer tab
    Given User able to launch the parabank website
    When User able to enter username and password
    And User clicks the login button
    And User able to click the funds tranfer tab from the account page
    Then User ables to enter the amount and select the accounts
    And User clicks the transfer button and displays transfer complete message

  
 