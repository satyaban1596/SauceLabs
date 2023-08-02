@Reg
Feature: verify PLP page functionalities

Scenario: verify succesful click on Filter function

When user input "standard_user" and "secret_sauce"
And click on login button
Then user Choose a option from Filter Dropdown
Then Validate successfully filter choose or not


Scenario: Verify weather User able to add myultiple product at a time 
When user input "standard_user" and "secret_sauce"
And click on login button
And user Add multiple product to cartbox
Then Validate cartbox showing the multiple product addition






