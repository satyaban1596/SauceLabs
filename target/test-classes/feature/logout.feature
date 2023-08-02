Feature: verify logout functionality
@SmokeTest
Scenario: verify succesful logout after login 

When user input "standard_user" and "secret_sauce"
And click on login button
Then click on menu button
And click on logout
Then validate user logout succsesfully or not