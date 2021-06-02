@tag
Feature:parabank
 

  @tag1
  Scenario: verify that the user able to enter into the account using login credentials
    Given User able to launch the parabank website
    And able to view the login option
    When User able to enter username and password
    And User clicks the login button
    Then User enters into account overview page.
   

 