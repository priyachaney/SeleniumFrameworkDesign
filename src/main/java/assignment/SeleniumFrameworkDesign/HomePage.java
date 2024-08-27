package assignment.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
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

    public WebElement getEmailInput() {
        return driver.findElement(emailInput);
    }

    public WebElement getPasswordLabel() {
        return driver.findElement(passwordLabel);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(submitButton);
    }

    public List<WebElement> getListItems() {
        return driver.findElements(listItems);
    }

    public WebElement getDropdown() {
        return driver.findElement(dropdown);
    }

    public WebElement getTest4FirstButton() {
        return driver.findElement(test4FirstButton);
    }

    public WebElement getTest4SecondButton() {
        return driver.findElement(test4SecondButton);
    }

    public WebElement getTest5Button() {
        return driver.findElement(test5Button);
    }

    public WebElement getTest5Alert() {
        return driver.findElement(test5Alert);
    }

    public String getCellValue(int rowIndex, int colIndex) {
    	// Create an XPath expression to locate the cell
    	 String cellXPath = String.format("//table[contains(@class,'table-bordered')]/tbody/tr[%d]/td[%d]", rowIndex + 1, colIndex + 1);
    	// Find the cell element using the XPath and return its text content
         WebElement gridCell = driver.findElement(By.xpath(cellXPath));
         return gridCell.getText().trim();
    }
}
	
