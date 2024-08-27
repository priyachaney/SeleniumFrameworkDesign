# SeleniumFrameworkDesign
## Introduction

This Selenium Automation Framework is designed to test web applications using Selenium WebDriver, Java, and TestNG. It implements the Page Object Model (POM) to maintain a clean and manageable codebase.

## Deliverables

- **Page Object Model Implementation**: Classes for managing page elements and interactions.
- **Test Cases**: Predefined test cases to validate 6 test cases. (Refer: QE-guide.html)
- **Base Page Class**: Provides common functionality for all page classes.
- **TestNG Configuration**: XML file to configure and run the test suite.

## Setup

### Prerequisites

- **Java**: Ensure Java is installed and properly configured on your system. (JDK 8 or above is recommended)
- **Maven**: The project uses Maven for dependency management. Ensure Maven is installed.
- **WebDriver**: Download the appropriate WebDriver executable for your browser (e.g., ChromeDriver for Chrome) and ensure it is accessible in your system's PATH.

### Clone the Repository

```sh
git clone https://github.com/priyachaney/SeleniumFrameworkDesign.git
cd <directory>
```

### Configure WebDriver

Download the WebDriver executable (e.g., ChromeDriver).
Set the path to the WebDriver executable

```sh
System.setProperty("webdriver.chrome.driver","path/to/chromedriver");
```

### Install Dependencies

Navigate to the project root and install dependencies using Maven
```sh
mvn install
```

### Running the Tests

TestNG XML Configuration, Run the tests through your IDE by configuring TestNG to use the testng.xml file located in the src/test/java/com/seleniumframework/ directory.

## Improvement Areas

- **Reporting**: Integrate Extent Reports for detailed HTML reports, offering better insights into test execution.
- **Data-Driven Testing**: : Implement parameterization to run tests with data from external sources like Excel, enhancing test coverage.
