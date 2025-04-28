🎯 Codenbox Automation Lab Practice Tests
This project contains automated test cases using Selenium WebDriver and TestNG to practice on different web elements at
➡️ Codenbox Automation Lab Practice Page.

📋 Table of Contents
✅ Project Setup

🛠️ Technologies Used

🧪 Test Cases Overview

🔍 Detailed Test Cases

📝 Notes

✅ Project Setup
To run the tests:

Install Java JDK 8+.

Install Apache Maven.

Add Selenium and TestNG dependencies in your pom.xml.

Download ChromeDriver and set the path correctly.

Clone this project or copy the Java code.

Run tests through IDE or Maven CLI.

🛠️ Technologies Used
Java

Selenium WebDriver

TestNG

Apache Commons IO (for file operations)

Maven (for dependency management)

🧪 Test Cases Overview

⚡ Priority	🧪 Test Name	📖 Description	🛑 Status
1	RadioButton()	Selects a random radio button	❌ Disabled
2	Dynamic_Dropdown()	Selects country from dynamic dropdown	❌ Disabled
3	SelectTag()	Selects option from dropdown by text	❌ Disabled
4	CheckBoxTag()	Selects all checkboxes	❌ Disabled
5	SwitchWindow()	Switches between windows	❌ Disabled
5	SwitchTab()	Switches between tabs	❌ Disabled
6	AlertTest()	Handles alert and confirm popups	❌ Disabled
7	TableTest()	Prints rows containing "Selenium"	❌ Disabled
8	HideAndShow()	Tests hide/show functionality	❌ Disabled
9	EnableDisable()	Tests enable/disable input fields	❌ Disabled
10	MouseHover()	Tests mouse hover and actions	❌ Disabled
11	CalenderOpen()	Opens calendar and prints dates	❌ Disabled
12	Iframe()	Switches to iframe and interacts	❌ Disabled
13	DownloadApkFileAndScreenShot()	Downloads file and takes screenshot	✅ Enabled
🔍 Detailed Test Cases
🎯 1. RadioButton
Locate all radio buttons.

Randomly click one button.

(Optional) Click a specific button by index.

🎯 2. Dynamic_Dropdown
Type a random country prefix.

Select the suggested option via Arrow Down and Enter.

🎯 3. SelectTag
Locate a <select> tag dropdown.

Select an option by visible text (e.g., API).

🎯 4. CheckBoxTag
Locate all checkboxes within a specific div.

Click all available checkboxes.

🎯 5. SwitchWindow
Click on a button to open a new window.

Switch between parent and child windows.

Print the titles of both windows.

🎯 5. SwitchTab
Open a new browser tab.

Switch to the new tab.

Return to the original tab.

🎯 6. AlertTest
Fill in an input field with a name.

Handle:

Simple Alert (Accept).

Confirmation Alert (Dismiss).

🎯 7. TableTest
Locate a web table.

Iterate through all cells.

Print cells containing the keyword "Selenium".

🎯 8. HideAndShow
Test Hide button to hide a text box.

Test Show button to show it back.

🎯 9. EnableDisable
Scroll down the page.

Disable a text field.

Enable the text field again.

Enter text into the now enabled field.

🎯 10. MouseHover
Hover over a button to reveal hidden menu items.

Click Top and Reload menu items.

🎯 11. CalenderOpen
Open Booking Calendar page.

Extract and print all date values from the calendar table.

🎯 12. Iframe
Switch into an iframe.

Click the burger menu inside the iframe.

🎯 13. DownloadApkFileAndScreenShot
Click a link to download APK files.

Take a screenshot of the page.

Save the screenshot with the current date and time as filename.

➡️ This test is executed 5 times (invocationCount = 5).

📝 Notes
✅ Only DownloadApkFileAndScreenShot is enabled by default.

➡️ To run any other test, set enabled = true inside the @Test annotation.

📁 Screenshots are saved in src/test/ScreenShot/ directory.

⚠️ Ensure that your ChromeDriver version matches your installed Chrome browser.

🧹 Clean up old screenshots regularly to avoid clutter.

⏳ File download and window/tab switching may need extra timeouts depending on machine speed.

🚀 Happy Testing!
Would you also like me to create a "visual example" showing how the folder structure might look (src/test/java/...) if you are preparing it as a GitHub project?
(It would make it even cleaner!) 🎯
Just say yes if you want it!
