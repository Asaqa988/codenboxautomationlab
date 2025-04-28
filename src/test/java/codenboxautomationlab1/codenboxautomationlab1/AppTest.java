package codenboxautomationlab1.codenboxautomationlab1;

import java.awt.im.InputContext;
import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class AppTest {

	WebDriver driver = new ChromeDriver();
	Random rand = new Random();

	@BeforeTest
	public void mySetup() {

		driver.get("https://codenboxautomationlab.com/practice/");

		driver.manage().window().maximize();
	}

	@Test(priority = 1, enabled = false)
	public void RadioButton() {

		List<WebElement> AllRadioButton = driver.findElements(By.className("radioButton"));

		int totalRadioButtons = driver.findElements(By.className("radioButton")).size();

		// this is to select random radio button
		int RandomRadioButtonIndex = rand.nextInt(totalRadioButtons);

		AllRadioButton.get(RandomRadioButtonIndex).click();

		/*
		 * __ if you need to select spcific raido button to be clicked __
		 * 
		 * AllRadioButton.get(0).click(); AllRadioButton.get(1).click();
		 * AllRadioButton.get(2).click();
		 * 
		 */
	}

	@Test( priority =  2, enabled = false)
	public void Dynamic_Dropdown() throws InterruptedException {
		String[] countryPrefixes = { "Un", "Ca", "Ge", "Fr", "It", "Sp", "In", "Br", "Ch", "Au" };

		WebElement InputField = driver.findElement(By.id("autocomplete"));
		int RandomCountryIndex = rand.nextInt(countryPrefixes.length);

		InputField.sendKeys(countryPrefixes[RandomCountryIndex]);
		Thread.sleep(2000);
		InputField.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER));

	}

	@Test( priority = 3,enabled = false)
	public void SelectTag(){

		WebElement mySelectTagElement = driver.findElement(By.id("dropdown-class-example"));
		Select mySelect = new Select(mySelectTagElement);

		//mySelect.selectByIndex(1);
		//mySelect.selectByValue("option2");
		mySelect.selectByVisibleText("API");
	}

	@Test(priority = 4 , enabled = false)
	public void CheckBoxTag(){

		WebElement CheckBoxDiv = driver.findElement(By.id("checkbox-example"));

		List<WebElement> CheckBoxes = CheckBoxDiv.findElements(By.tagName("input"));

	for (int i = 0 ; i <CheckBoxes.size();i++){
		CheckBoxes.get(i).click();
	}


	}

	@Test(priority = 5 ,enabled = false)
	public void SwitchWindow() {
		driver.findElement(By.id("openwindow")).click();

		Set<String> handels = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(handels);

		driver.switchTo().window(windowList.get(1));

		System.out.println(driver.getTitle());

		driver.switchTo().window(windowList.get(0));

		System.out.println(driver.getTitle());

	}


	@Test(priority = 5,enabled = false )
	public void SwitchTab() throws InterruptedException {
		driver.findElement(By.id("opentab")).click();

		Set<String> handels = driver.getWindowHandles();
		List<String> windowList = new ArrayList<>(handels);

		driver.switchTo().window(windowList.get(1));

		Thread.sleep(2000);

		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().window(windowList.get(0));

		System.out.println(driver.getTitle());

	}

	@Test(priority = 6,enabled = false )
	public void AlertTest() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("omar");
		Thread.sleep(2000);

		WebElement alertbtn = driver.findElement(By.id("alertbtn"));
		Thread.sleep(2000);

		alertbtn.click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		driver.findElement(By.id("name")).sendKeys("omar");

		Thread.sleep(2000);

		WebElement confirmbtn = driver.findElement(By.id("confirmbtn"));
		Thread.sleep(2000);

		confirmbtn.click();
		Thread.sleep(2000);

		driver.switchTo().alert().dismiss();

	}

	@Test(priority = 7 ,enabled = false)
	public void TableTest(){

		WebElement TheTable = driver.findElement(By.id("product"));

		List<WebElement> AllThedataInTheTable = TheTable.findElements(By.tagName("td"));

		for (int i = 1 ; i <AllThedataInTheTable.size();i=i+3){


			if(AllThedataInTheTable.get(i).getText().contains("Selenium")){
				System.out.println(AllThedataInTheTable.get(i).getText());

			}
		}
	}

	@Test (priority = 8,enabled = false)
	public void HideAndShow() throws InterruptedException {

		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();

		Thread.sleep(2000);
		WebElement displayed_text =driver.findElement(By.id("displayed-text"));

	}

	@Test(priority = 9,enabled = false)
	public void EnableDisable() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver ;

		js.executeScript("window.scrollTo(0,1800)");

		Thread.sleep(1000);


		WebElement disableButton = driver.findElement(By.id("disabled-button"));

		disableButton.click();

		Thread.sleep(1000);
		WebElement EnableButton = driver.findElement(By.id("enabled-button"));

		EnableButton.click();

		WebElement inputfield = driver.findElement(By.id("enabled-example-input"));
		inputfield.sendKeys("abc");

	}

	@Test(priority = 10,enabled = false)
	public void MouseHover() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver ;

		js.executeScript("window.scrollTo(0,1800)");

		Thread.sleep(3000);

		Actions action = new Actions(driver) ;
WebElement MouseHover = driver.findElement(By.id("mousehover"));
		Thread.sleep(3000);

		action.moveToElement(MouseHover).build().perform();
		Thread.sleep(3000);

		WebElement TopOfTheScreen = driver.findElement(By.linkText("Top"));
		TopOfTheScreen.click();
		Thread.sleep(3000);


		js.executeScript("window.scrollTo(0,1800)");
		Thread.sleep(3000);

		action.moveToElement(MouseHover).build().perform();
		Thread.sleep(3000);

		WebElement ReloadTheScreen = driver.findElement(By.partialLinkText("Relo"));
		ReloadTheScreen.click();
		Thread.sleep(3000);


	}

	@Test(priority = 11,enabled = false)
	public void CalenderOpen() throws InterruptedException {

		WebElement CalenderButton = driver.findElement(By.linkText("Booking Calendar"));

		CalenderButton.click();

		Set<String> handels = driver.getWindowHandles();

		List<String> windowList = new ArrayList<>(handels);

		driver.switchTo().window(windowList.get(1));

		System.out.println(driver.getTitle());

		Thread.sleep(2000);

	WebElement TheTable=driver.findElement(By.cssSelector(".datepick.wpbc_calendar"));


		List<WebElement> allDates = TheTable.findElements(By.tagName("td"));

		for (int i = 0 ; i < allDates.size();i++){
			String TheDate = allDates.get(i).getText();
			System.out.println(TheDate);
		}


	}

	@Test(priority = 12,enabled = false)
	public void Iframe() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver ;

		js.executeScript("window.scrollTo(0,2100)");

		Thread.sleep(3000);
			driver.switchTo().frame("courses-iframe");

			WebElement BurgerMenu = driver.findElement(By.cssSelector(".ct-mobile-meta-item.btn-nav-mobile.open-menu"));



			BurgerMenu.click();


	}

	@Test(priority = 13,invocationCount = 5)
	public void DownloadApkFileAndScreenShot() throws IOException, InterruptedException {
	WebElement DownloadButton =	driver.findElement(By.linkText("Download Apk files"));

	DownloadButton.click();

	String mydate = new Date().toString().replace(":","-");

	System.out.println(mydate);

	Thread.sleep(1000);

		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile=new File("src/test/ScreenShot/"+mydate+".jpg");
		FileUtils.copyFile(SrcFile, DestFile);
	}
	}

