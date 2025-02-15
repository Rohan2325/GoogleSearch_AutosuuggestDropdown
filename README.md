# GoogleSearch_AutosuggestDropdown
This project demonstrates how to automate a Google search and interact with the autosuggest dropdown using Selenium WebDriver and TestNG. The test performs a Google search for the keyword "automation" and selects the suggested result from the dropdown.

Features :
1) **Automated Google Search**     : Automates typing in the Google search box.
2) **Autosuggest Dropdown**        : Interacts with the dropdown and selects a suggestion.
3) **Cross-browser**               : Can run the test on Chrome or Firefox.
4) **TestNG**                      : Organizes the test flow with annotations like @BeforeClass, @Test, and @AfterClass.
5) **WebDriverManager**            : Automatically sets up WebDriver for Chrome and Firefox, so no manual setup is required.

Prerequisites :
1) **Java 8+**                     : Make sure you have Java 8 or higher installed on your machine.
2) **Selenium WebDriver**          : Used for browser automation (included in the project).
3) **TestNG**                      : Used to manage and run the tests (included in the project).
4) **WebDriverManager**            : Automatically downloads and manages the required WebDriver binaries (for Chrome and Firefox).
5) **Maven**                       : If you are using Maven, it will handle dependencies automatically.

Test Details : 
Test Method : The testGoogleSearch() method automates typing "automation" into Google’s search box.
It then interacts with the autosuggest dropdown, printing the number of suggestions and selecting the one that matches "automation."
