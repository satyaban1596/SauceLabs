package stepDefination;

import java.io.IOException;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.loginpage;

public class loginPageSteps {

	loginpage login = new loginpage();

	//@When("user input valid username and valid password")
	//public void user_input_valid_username_and_valid_password() {
		//login.user_input_valid_username_and_valid_password();
	//}
	
	@When("user input {string} and {string}")
	public void user_input_and(String uname, String pass) {
	   login.user_input_username_and_password(uname, pass);
	}

	@And("click on login button")
	public void click_on_login_button() throws IOException  {
		login.click_on_login_button();

	}

	@Then("validate user logged succsesfully or not")
	public void validate_user_logged_succsesfully_or_not() {
		login.validate_user_logged_succsesfully_or_not();
	}
	
	@Then ( "Validate error messege")
	public void  Validate_error_messege() {
		login.Validate_error_messege();
		
	}

}
