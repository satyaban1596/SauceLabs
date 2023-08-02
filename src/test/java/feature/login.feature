Feature: verify login functionality

Scenario: verify succesful login with valid credentials

When user input "standard_user" and "secret_sauce"
And click on login button
Then validate user logged succsesfully or not


Scenario: verify succesful login with invalid credentials

When user input "sause" and "xyz"
And click on login button
Then validate user logged succsesfully or not
Then Validate error messege




Scenario: verify succesful login with invalid username and valid password 


When user input "sause" and "secret_sauce"
And click on login button
Then validate user logged succsesfully or not
Then Validate error messege



Scenario: verify succesful login with valid username and invalid password 

When user input "standard_user" and "xyz"
And click on login button
Then validate user logged succsesfully or not
Then Validate error messege