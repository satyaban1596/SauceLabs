package page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.openqa.selenium.By;
 import helper.Base;

public class CheckOutPage extends Base {

	public By Firstname = By.cssSelector("input#first-name");
	public By Lastname = By.cssSelector("input#last-name");
	public By PostalCode = By.cssSelector("input#postal-code");
	public By ContinueBtn = By.cssSelector("input#continue");
	public By FinishBtn = By.xpath("//button[@id='finish']");
	public By SuccessConfirm = By.cssSelector("h2.complete-header");
	public By ErrorMessege = By.cssSelector("[data-test='error']");
	public By Itemname = By.xpath("//div[@class='inventory_item_name']");
	public By ItemPrice = By.xpath("//div[@class='inventory_item_price']");
	public By RemoveOrder = By.cssSelector("#remove-sauce-labs-backpack");
	public By BasketValueAfterRemove = By.cssSelector("a.shopping_cart_link");

	public void user_enter_Information(String fname, String lname, String pcode) {

		waitexplicity(Firstname).sendKeys(fname);
		waitexplicity(Lastname).sendKeys(lname);
		waitexplicity(PostalCode).sendKeys(pcode);
		waitexplicity(ContinueBtn).click();

	}

	public void continueOnclick() {

		waitexplicity(FinishBtn).click();
	}

	public void ValidateOrder() {
		String orderconfirm = waitexplicity(SuccessConfirm).getText();
		assertEquals("Thank you for your order!", orderconfirm);
	}

	public void validateErrorMessege() {
		boolean Error = waitexplicity(ErrorMessege).isDisplayed();
		assertTrue(Error);

	}

	public void varify_name_and_price_of_product() {
		boolean iname = waitexplicity(Itemname).isDisplayed();
		Assert.assertTrue(iname);

		boolean price = waitexplicity(ItemPrice).isDisplayed();
		Assert.assertTrue(price);

	}

	public void BasketValue_AfterRemove() {

		waitexplicity(RemoveOrder).click();

		boolean basketvalue = waitexplicity(BasketValueAfterRemove).isDisplayed();
		Assert.assertTrue(basketvalue);
	}

}
