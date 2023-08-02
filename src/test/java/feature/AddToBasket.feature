Feature: validate the Basket page functionalities

Scenario Outline: Validate Price And Product name visibility after Add to cart

When  user input "<UserName>" and "<Password>"
And click on login button
And user add product to cart from PLP 
And user click on CartBTN
Then Varify Name And Price of Product

Examples:
|UserName|Password|
|standard_user|secret_sauce|



Scenario: Validate Basket value decrese or not after remove of product


When  user input "standard_user" and "secret_sauce"
And click on login button
And user add product to cart from PLP 
And user click on CartBTN
Then Varify Name And Price of Product
And Verify the Basket Value after remove





