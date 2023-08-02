package stepDefination;

import io.cucumber.java.en.Then;
import page.logoutpage;

public class LogoutSteps {
	logoutpage logout = new logoutpage();

@Then("click on menu button")
public void click_on_menu_button() {
	logout.click_on_menu_button();
	
} 

@Then("click on logout")
public void click_on_logout() {
	logout.click_on_logout();
    
   
}

@Then("validate user logout succsesfully or not")
public void validate_user_logout_succsesfully_or_not() {
	logout.validate_user_logout_succsesfully_or_not();
	
}
   

}


