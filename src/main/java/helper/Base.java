package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	static {
		
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/resources/env.properties");
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

@Before
	public void setup() {
		String browsername = prop.getProperty("browser");

		if (browsername.equals("edge")) {
			EdgeOptions options = new EdgeOptions();
			//options.addArguments("--remote-allow-origin-*");
			options.addArguments("--incognito");
			driver = new EdgeDriver(options);

		} else if (browsername.equals("Chrome")) {

			// we can remove this line ...WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--remote-allow-origins-*");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@After
	public void Screenshot(Scenario s) throws IOException 
	{
		if (s.isFailed()) {
			TakesScreenshot t = (TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("ScreenShot/"+ s.getName()+".png"));
		}
		
		driver.quit();
	}

	// Generic methods||----

	// Dropdown
	public void SelectDropdown(By filter, String Value) {
		Select s = new Select(driver.findElement(filter));
		s.selectByValue(Value);

		// Exicute|------

		// WebElement User = driver.findElement(By.cssSelector("xyz"));
		// SelectDropdown(User, Value);
	}

	// MouseHover|------
	public void MouseHover(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();

		// Exicute|------

		// WebElement Mouse = driver.findElement(By.cssSelector("..."));
		// MouseHover(Mouse);

	}

	/*
	 * ExplicitWait|------ public void ExplicitWait(WebElement ele) { WebDriverWait
	 * Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 * Wait.until(ExpectedConditions.elementToBeClickable(ele));
	 * 
	 * // Exicute|-------
	 * 
	 * // WebElement user = driver.findElement(By.cssSelector("..")); //
	 * ExplicitWait(user);
	 */

	// JavascriptExicutor|-----
	public void javaclick(By ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("Argument[0].click()",driver.findElement(ele));

		// Exicute|------

		// WebElement payment = driver.findElement(By.cssSelector("...."));
		// javaclick(payment);

	}

	// alert |---
	public void AlertHandle(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.accept();

		// Exicute |--

		AlertHandle(driver);

	}

	// wait
	public WebElement waitexplicity(By by) {
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return Wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}

	// Auntheticationpopup |---
	public void AuthenticationPopup (){
		
		
		
	}
	

}
