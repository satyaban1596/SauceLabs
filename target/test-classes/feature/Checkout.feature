Feature: validate the cheackout functionality

Scenario: Validate cheackout with valid details

When  user input "standard_user" and "secret_sauce"
And click on login button
And user add product to cart from PLP 
And user click on CartBTN
Then user click on checkoutBTN
And user enter Information "satyaban" "mahunta" "751021"
And user place order and finish the order
Then validate order confirmation


Scenario: Validate cheackout with blank details


When  user input "standard_user" and "secret_sauce"
And click on login button
And user add product to cart from PLP 
And user click on CartBTN
Then user click on checkoutBTN
And user enter Information "" "" ""
Then validate error messege


