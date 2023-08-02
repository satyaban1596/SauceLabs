package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import helper.Base;

public class logoutpage extends Base {

	public By MenuBtn = By.xpath("//button[@id='react-burger-menu-btn']");
	public By Logout = By.xpath("//a[@id='logout_sidebar_link']");
	public By Logoname = By.cssSelector("div.login_logo");

	public void click_on_menu_button() {
		waitexplicity(MenuBtn).click();
	}

	public void click_on_logout() {
		waitexplicity(Logout).click();
	}

	public void validate_user_logout_succsesfully_or_not() {

		String swaglabsLogo = waitexplicity(Logoname).getText();
		Assert.assertEquals(swaglabsLogo, "Swag Labs");

	}

}
