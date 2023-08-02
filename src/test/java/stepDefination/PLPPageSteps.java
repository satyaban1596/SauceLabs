package stepDefination;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PLPPage;

public class PLPPageSteps {
	
		PLPPage Rcart = new PLPPage(); 	

@When("user add product to cart from PLP")
public void user_add_product_to_cart_from_plp() {
	Rcart.user_add_product_to_cart_from_plp();
	Rcart.ValidateCartCount();
}
	

@And("user click on CartBTN")
public void user_click_on_CartBTN() {
   Rcart.Clickoncart();
   
}
@Then("user click on checkoutBTN")
   public void user_click_on_checkoutBTN() {
   Rcart.ClickonCheckOut();
}

@Then("user Choose a option from Filter Dropdown")
public void user_choose_a_option_from_filter_dropdown() throws IOException {
   Rcart.Filterchoose();
}

@Then("Validate successfully filter choose or not")
public void Then_Validate_successfully_filter_choose_or_not() {
	Rcart.ValidateFilterChoose();
}

@And("user Add multiple product to cartbox")
public void user_Add_multiple_product_to_cartbox () {
   Rcart.AddMultiProduct();

}
@Then("Validate cartbox showing the multiple product addition")
public void Validate_cartbox_showing_the_multiple_product_addition() {
	Rcart.ValidateMutiproductBasket();
	
	
}



}



