# 🌟 Codenbox Automation Lab Practice Tests

This project contains automated test cases using **Selenium WebDriver** and **TestNG** to practice on different web elements at:

➡️ [Codenbox Automation Lab Practice Page](https://codenboxautomationlab.com/practice/)

---

## 📄 Table of Contents

- [Project Setup](#project-setup)
- [Technologies Used](#technologies-used)
- [Test Cases Overview](#test-cases-overview)
- [Detailed Test Cases](#detailed-test-cases)
- [Notes](#notes)

---

## ✅ Project Setup

- Install [Java JDK 8+](https://adoptium.net/)
- Install [Apache Maven](https://maven.apache.org/)
- Add **Selenium** and **TestNG** dependencies in your `pom.xml`
- Download [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/) and set the path correctly
- Clone this project or copy the Java code
- Run tests through **IDE** or **Maven CLI**

---

## 🛠️ Technologies Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Apache Commons IO**
- **Maven**

---

## 🧪 Test Cases Overview

| Priority | Test Name | Description | Status |
|:--------:|:---------:|:------------|:------:|
| 1 | `RadioButton()` | Selects a random radio button | Disabled |
| 2 | `Dynamic_Dropdown()` | Selects a country from dynamic dropdown | Disabled |
| 3 | `SelectTag()` | Selects option from dropdown | Disabled |
| 4 | `CheckBoxTag()` | Selects all checkboxes | Disabled |
| 5 | `SwitchWindow()` | Switches between windows | Disabled |
| 5 | `SwitchTab()` | Switches between tabs | Disabled |
| 6 | `AlertTest()` | Handles alert and confirm popups | Disabled |
| 7 | `TableTest()` | Parses table data containing Selenium | Disabled |
| 8 | `HideAndShow()` | Tests hide/show textbox | Disabled |
| 9 | `EnableDisable()` | Enable and disable textbox | Disabled |
| 10 | `MouseHover()` | Hover and click actions | Disabled |
| 11 | `CalenderOpen()` | Open calendar and read dates | Disabled |
| 12 | `Iframe()` | Switch into iframe and interact | Disabled |
| 13 | `DownloadApkFileAndScreenShot()` | Download APK and take screenshot | Enabled |

---

## 🔍 Detailed Test Cases

### 1. RadioButton
- Locate all radio buttons
- Randomly click one
- (Optional) Click specific by index

### 2. Dynamic_Dropdown
- Type a random country prefix
- Select a country using arrow keys

### 3. SelectTag
- Locate select dropdown
- Select an option by visible text ("API")

### 4. CheckBoxTag
- Locate all checkboxes
- Click all checkboxes

### 5. SwitchWindow
- Open a new window
- Switch between windows
- Print titles

### 5. SwitchTab
- Open a new tab
- Switch between tabs
- Return to original

### 6. AlertTest
- Fill input field
- Handle simple alert (Accept)
- Handle confirmation alert (Dismiss)

### 7. TableTest
- Locate a table
- Print rows containing "Selenium"

### 8. HideAndShow
- Hide textbox
- Show textbox again

### 9. EnableDisable
- Scroll down
- Disable input field
- Enable and type text

### 10. MouseHover
- Hover over element
- Click 'Top' and 'Reload' from hover menu

### 11. CalenderOpen
- Open booking calendar
- Extract and print date values

### 12. Iframe
- Switch into iframe
- Click burger menu inside iframe

### 13. DownloadApkFileAndScreenShot
- Download APK file
- Take a screenshot
- Save screenshot with timestamp filename
- **Test repeats 5 times** (`invocationCount = 5`)

---

## 📜 Notes

- Only `DownloadApkFileAndScreenShot` is enabled
- To run others, set `enabled = true` in `@Test`
- Screenshots saved at `src/test/ScreenShot/`
- Ensure ChromeDriver version matches Chrome Browser
- Handle popups and window delays using Thread.sleep() carefully

---

# 🚀 Happy Testing! 🚀
