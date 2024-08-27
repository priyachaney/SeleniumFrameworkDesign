package assignment.SeleniumFrameworkDesign;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public class TestCases {
	
	private WebDriver driver;
	HomePage homePage;
	WebDriverWait wait;
	
	@BeforeClass
    public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///Users/priyachaney/Downloads/QE-index.html");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver);
    }
	
	@Test
    public void testCase1() {
        // Testcase1: Verify email input, password input, and login button are present
        Assert.assertTrue(homePage.getEmailInput().isDisplayed(), "Email input is not displayed");
        Assert.assertTrue(homePage.getPasswordLabel().isDisplayed(), "Password label is not displayed");
        Assert.assertTrue(homePage.getSubmitButton().isDisplayed(), "Submit button is not displayed");

	// Testcase1: Taking input for email address, password.
        homePage.getEmailInput().sendKeys("priya.chaney@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getPasswordLabel()));
        homePage.getPasswordLabel().sendKeys("password123");
    }
	
    @Test
    public void testCase2() {
        // Testcase2: To assert that there are 3 values present in the listgroup.
        Assert.assertEquals(homePage.getListItems().size(), 3, "The list should contain exactly 3 elements.");
        WebElement secondItemElement = homePage.getListItems().get(1);

	//Extracting the full text
        String fullText = secondItemElement.getText().trim();

	//Extracting the badge information
        String badgeValue = secondItemElement.findElement(By.xpath(".//span")).getText().trim();
        String listItemText = fullText.replace(badgeValue, "").trim();

	//Assert that the second list item's value is set to "List Item 2"
        Assert.assertEquals(listItemText, "List Item 2", "The second list item's text should be 'List Item 2'.");

	//Assert that the second list item's badge value is 6
        Assert.assertEquals(badgeValue, "6", "The badge value of the second list item should be '6'.");
    }
    
    
    @Test
    public void testCase3() {
        //Testcase3: To assert that "Option 1" is the default selected value
    	String defaultValue = homePage.getDropdown().getText();
        System.out.println(defaultValue);
        Assert.assertEquals(defaultValue, "Option 1", "The default value shouuld be Option 1.");
        System.out.println(defaultValue);

	//Select "Option 3" from the select list
	homePage.getDropdown().click();
        driver.findElement(By.xpath("//div[@class='dropdown show']/div[@class='dropdown-menu show']/a[text()='Option 3']")).click();
        System.out.println("testcase 3 over");
    }
    
    @Test
    public void testCase4() {
        // Testcase4:  To assert that the first button is enabled and that the second button is disabled
        Assert.assertTrue(homePage.getTest4FirstButton().isEnabled(), "First button should be enabled");
        Assert.assertFalse(homePage.getTest4SecondButton().isEnabled(), "Second button should be disabled");
    }
    
    @Test
    public void testCase5() {
        // Testcase5: To wait for a button to be displayed (note: the delay is random) and then click it
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(homePage.getTest5Button()));
        button.click();
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOf(homePage.getTest5Alert()));

	// To Assert that a success message is displayed
        Assert.assertTrue(successMessage.isDisplayed(), "Success message should be displayed");

	//To Assert that the button is now disabled
        Assert.assertFalse(homePage.getTest5Button().isEnabled(), "Button should be disabled after clicking");
    }
    
    @Test
    public void testCase6() {
        // Testcase6: Use the method "cellValue" to find the value of the cell at coordinates 2, 2 
        String cellValue = homePage.getCellValue(2, 2);

	//To Assert that the value of the cell (2,2) is "Ventosanzap"
        Assert.assertEquals(cellValue, "Ventosanzap", "The value of the cell should be 'Ventosanzap'.");
    }
    
	@AfterClass
    public void tearDown() {
        driver.quit();
    }
    

}
