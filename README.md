Codenbox Automation Lab Practice Tests
This project contains automated test cases using Selenium WebDriver and TestNG for practicing different web elements and actions available on the Codenbox Automation Lab Practice Page.

Table of Contents
Project Setup

Technologies Used

Test Cases Overview

Detailed Test Cases

Notes

Project Setup
Install Java JDK 8+ and Maven.

Add Selenium and TestNG dependencies to your Maven pom.xml.

Download and configure ChromeDriver according to your Chrome browser version.

Clone or copy the project files.

Run tests via your IDE or through Maven.

Technologies Used
Java

Selenium WebDriver

TestNG

Apache Commons IO (for FileUtils)

Maven (for dependency management)

Test Cases Overview

Priority	Test Name	Description	Status
1	RadioButton()	Selects a random radio button	Disabled
2	Dynamic_Dropdown()	Selects a country from dynamic dropdown using prefix typing	Disabled
3	SelectTag()	Selects an option from a <select> dropdown by visible text	Disabled
4	CheckBoxTag()	Clicks all available checkboxes	Disabled
5	SwitchWindow()	Handles new window opening and switching	Disabled
5	SwitchTab()	Handles new tab opening and switching	Disabled
6	AlertTest()	Tests JavaScript alerts and confirms	Disabled
7	TableTest()	Parses a table and prints rows containing "Selenium"	Disabled
8	HideAndShow()	Tests hiding and showing input fields	Disabled
9	EnableDisable()	Tests enabling and disabling an input field	Disabled
10	MouseHover()	Performs mouse hover and clicks hover menu options	Disabled
11	CalenderOpen()	Opens booking calendar and extracts dates	Disabled
12	Iframe()	Switches to iframe and interacts with elements inside	Disabled
13	DownloadApkFileAndScreenShot()	Downloads APK and captures a screenshot (runs 5 times)	Enabled
Detailed Test Cases
1. RadioButton
Find all radio buttons and randomly select one.

Alternatively, specific buttons can be selected by index.

2. Dynamic_Dropdown
Type a random country prefix.

Select the first suggestion by pressing Arrow Down and Enter.

3. SelectTag
Select an option from a dropdown menu by its visible text (e.g., "API").

4. CheckBoxTag
Find all checkboxes under a specific div and select all of them.

5. SwitchWindow
Opens a new window.

Switches control between parent and child windows.

5. SwitchTab
Opens a new tab.

Switches control between the tabs.

6. AlertTest
Fills an input field.

Triggers alert and confirm dialogs and handles them (Accept/Dismiss).

7. TableTest
Finds a table and prints all rows containing the text "Selenium."

8. HideAndShow
Tests the hide/show functionality of a text input field.

9. EnableDisable
Scrolls down.

Disables and then enables an input field and types inside it.

10. MouseHover
Simulates mouse hover to reveal hidden menu options and clicks them.

11. CalenderOpen
Opens a calendar page.

Extracts and prints all date values from the calendar table.

12. Iframe
Switches into an iframe.

Clicks the burger menu inside the iframe.

13. DownloadApkFileAndScreenShot
Clicks a link to download APK files.

Takes a screenshot of the current screen and saves it with a timestamp.

Notes
invocationCount = 5 on DownloadApkFileAndScreenShot means the test will repeat 5 times.

All tests are initially disabled (enabled = false) except the last one.

To enable a test, set enabled = true in the @Test annotation.

Screenshots are saved in the src/test/ScreenShot/ directory with filenames based on the current timestamp.

Important Reminder
Always make sure the ChromeDriver matches your Chrome browser version.

Tests that involve window/tab switching or file downloading may require extra WebDriver configurations depending on your local setup.

Would you also like me to generate a simple pom.xml sample that matches this project if you want it fully plug-and-play? 🚀
(Just say yes)