package page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class PLPPage extends Base {

	public By Addtocart = By.cssSelector("button#add-to-cart-sauce-labs-backpack");
	public By BasketCart = By.cssSelector("span.shopping_cart_badge");
	public By Basketclick = By.cssSelector("a.shopping_cart_link");
	public By Cheackout = By.cssSelector("button#checkout");
	public By filterdropdown = By.cssSelector("select.product_sort_container");
	public By ValidateFiter = By.cssSelector("span.active_option");
	public By Addtocart1 = By.cssSelector("button#add-to-cart-sauce-labs-backpack");
	public By Addtocart2 = By.cssSelector("button#add-to-cart-sauce-labs-bike-light");
	public By Addtocart3 = By.cssSelector("button#add-to-cart-sauce-labs-bolt-t-shirt");
	public By Addtocart4 = By.cssSelector("button#add-to-cart-sauce-labs-fleece-jacket");
	public By MultiBasket = By.cssSelector("span.shopping_cart_badge");
	
			

	public void user_add_product_to_cart_from_plp() {
		waitexplicity(Addtocart).click();
	}

	public void ValidateCartCount() {
		String Basket = waitexplicity(BasketCart).getText();
		assertEquals("1", Basket);
	}

	public void Clickoncart() {
		waitexplicity(Basketclick).click();
	}

	public void ClickonCheckOut() {
		waitexplicity(Cheackout).click();
	}

	public void Filterchoose() throws IOException {
		
		waitexplicity(filterdropdown);
		WebElement filter = driver.findElement(By.cssSelector("select.product_sort_container"));
		SelectDropdown(filterdropdown,"hilo");
	}
		
	public void ValidateFilterChoose() {
		
	boolean Filtervalidate = waitexplicity(ValidateFiter).isDisplayed();
	assertTrue(Filtervalidate);
	}	
	
	public void AddMultiProduct() {
		waitexplicity(Addtocart1).click();
		waitexplicity(Addtocart2).click();
		waitexplicity(Addtocart3).click();
		waitexplicity(Addtocart4).click();
	}

	public void ValidateMutiproductBasket() {
   String basket = waitexplicity(MultiBasket).getText();
   assertEquals("4",basket);
		
		
		
		
	}
	

}
