package codenboxautomationlab1.codenboxautomationlab1;

import java.awt.im.InputContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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

	@Test (priority = 8)
	public void HideAndShow() throws InterruptedException {

		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();

		Thread.sleep(2000);
		WebElement displayed_text =driver.findElement(By.id("displayed-text"));


		Assert.assertEquals(displayed_text.isDisplayed(),false);


	}
	}

