package assignment.SeleniumFrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/* BasePage is a base class for all page objects in the Selenium automation framework.
 * It provides common functionality for initializing page elements*/
public class BasePage {

	// WebDriver instance used to interact with the web application
	protected WebDriver driver;
	protected WebDriverWait wait;

	//Constructor to initialize the WebDriver and set up PageFactory.
	public BasePage(WebDriver driver) {

		// Assign the provided WebDriver instance to the class variable
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
		
	}

}
