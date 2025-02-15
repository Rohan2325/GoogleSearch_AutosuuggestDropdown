# GoogleSearch_AutosuggestDropdown
This project demonstrates how to automate a Google search and interact with the autosuggest dropdown using Selenium WebDriver and TestNG. The test performs a Google search for the keyword "automation" and selects the suggested result from the dropdown.

Features :
*) Automated Google Search     : Automates typing in the Google search box.
*) Autosuggest Dropdown        : Interacts with the dropdown and selects a suggestion.
*) Cross-browser               : Can run the test on Chrome or Firefox.
*) TestNG                      : Organizes the test flow with annotations like @BeforeClass, @Test, and @AfterClass.
*) WebDriverManager            : Automatically sets up WebDriver for Chrome and Firefox, so no manual setup is required.

Prerequisites :
*) Java 8+                     : Make sure you have Java 8 or higher installed on your machine.
*) Selenium WebDriver          : Used for browser automation (included in the project).
*) TestNG                      : Used to manage and run the tests (included in the project).
*) WebDriverManager            : Automatically downloads and manages the required WebDriver binaries (for Chrome and Firefox).
*) Maven                       : If you are using Maven, it will handle dependencies automatically.

Test Details : 
Test Method : The testGoogleSearch() method automates typing "automation" into Google’s search box.
It then interacts with the autosuggest dropdown, printing the number of suggestions and selecting the one that matches "automation."
