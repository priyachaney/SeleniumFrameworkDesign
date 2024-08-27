package assignment.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* HomePage represents the homepage of the web application. It extends the BasePage class and contains locators and methods */
public class HomePage extends BasePage{

	//Constructor to initialize the HomePage with WebDriver.
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Locators information
	private By emailInput = By.xpath("//input[@type='email']");
	private By passwordLabel = By.xpath("//input[@type='password' and @id='inputPassword']");
	private By submitButton = By.xpath("//button[@type='submit']");
	private By listItems = By.xpath("//ul[@class='list-group']/li");
	private By dropdown = By.xpath("//div[@class='dropdown']/button");
    	//private By dropdown = By.xpath("h1[text()='Test 3']/following-sibling::div[@class='dropdown']/button");
   	private By test4FirstButton = By.xpath("//div[@id='test-4-div']/button[contains(@class,'primary')]");
    	private By test4SecondButton = By.xpath("//div[@id='test-4-div']/button[contains(@class,'secondary')]");
    	private By test5Button = By.id("test5-button");
    	private By test5Alert = By.id("test5-alert");

	//Returns the WebElement for the email input field.
	public WebElement getEmailInput() {
		return driver.findElement(emailInput);
	    }
	
	//Returns the WebElement for the password input field.
    public WebElement getPasswordLabel() {
        return driver.findElement(passwordLabel);
    }
	
	//Returns the WebElement for the submit button.
    public WebElement getSubmitButton() {
        return driver.findElement(submitButton);
    }

	//Returns a list of WebElements representing list items.
    public List<WebElement> getListItems() {
        return driver.findElements(listItems);
    }
	//Returns the WebElement for the dropdown button.
    public WebElement getDropdown() {
        return driver.findElement(dropdown);
    }

	//Returns the WebElement for the first button in the test 4 - first button.
    public WebElement getTest4FirstButton() {
        return driver.findElement(test4FirstButton);
    }

	//Returns the WebElement for the first button in the test 4 - second button.
    public WebElement getTest4SecondButton() {
        return driver.findElement(test4SecondButton);
    }

	//Returns the WebElement for the test 5 button.
    public WebElement getTest5Button() {
        return driver.findElement(test5Button);
    }

	//Returns the WebElement for the alert in the test 5 section.
    public WebElement getTest5Alert() {
        return driver.findElement(test5Alert);
    }

	//Method for testcase 6 to extract value from the cell
    public String getCellValue(int rowIndex, int colIndex) {
    	// Create an XPath expression to locate the cell
    	 String cellXPath = String.format("//table[contains(@class,'table-bordered')]/tbody/tr[%d]/td[%d]", rowIndex + 1, colIndex + 1);
    	// Find the cell element using the XPath and return its text content
         WebElement gridCell = driver.findElement(By.xpath(cellXPath));
         return gridCell.getText().trim();
    }
}
	
