package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CheckOutPage;

public class CheckOutSteps  {
	
	CheckOutPage Checkout = new CheckOutPage() ;
	
	
	@When("user enter Information {string} {string} {string}")
	public void user_enter(String fname, String lname, String pcode) {
	    Checkout.user_enter_Information(fname, lname, pcode);
	}
		
	@When("user place order and finish the order")
	public void user_place_order_and_finish_the_order() {
	   Checkout.continueOnclick();
	}
    
	@Then("validate order confirmation")
	public void validate_order_confirmation() {
		Checkout.ValidateOrder();
		
	}
	@Then("validate error messege")
    public void validate_error_messege() {
	    Checkout.validateErrorMessege();
    }
	@Then("Varify Name And Price of Product")
	public void varify_name_and_price_of_product() {
		Checkout.varify_name_and_price_of_product();
		
	}
	@And("Verify the Basket Value after remove")
	public void Verify_the_Basket_Value_after_remove() {
		Checkout.BasketValue_AfterRemove();
		
	}








	
	
	
}