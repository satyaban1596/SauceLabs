package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import helper.Base;

public class loginpage extends Base {

	public By UserName = By.cssSelector("input#user-name");
	public By Password = By.cssSelector("input#password");
	public By loginBtn = By.cssSelector("input#login-button");
	public By confirmlogin = By.xpath("//span[@class='title']");
	public By ErrorMessege = By.cssSelector("div.error-message-container.error");

	public void user_input_username_and_password(String User, String Pass) {
		
		waitexplicity(UserName).sendKeys(User);
		waitexplicity(Password).sendKeys(Pass);
	}

	public void click_on_login_button() throws IOException {
		waitexplicity(loginBtn).click();
	}

	public void validate_user_logged_succsesfully_or_not() {
		boolean error = waitexplicity(confirmlogin).isDisplayed();
		Assert.assertTrue(error);

	}

	public void Validate_error_messege() {

		boolean error = waitexplicity(ErrorMessege).isDisplayed();
		Assert.assertTrue(error);
	}

}
