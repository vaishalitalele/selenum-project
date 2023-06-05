package testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Utility;

public class VerifyHomeClass2 {
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", Utility.getProperty("driverPath"));
		driver = new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test(groups = { "sanity" })
	public void verifyImageIsOnHomePage() {
		WebElement img = driver.findElement(By.xpath("//img[contains(@src,'software')]"));
		assertTrue(img.isDisplayed());
	}

	@Test(groups = { "smoke" })
	public void verifyPageOneLinkText() {
		WebElement pageOneText = driver.findElement(By.xpath("//a[text()='Page One']"));
		assertEquals(pageOneText.getText(), "Page One");
	}

	@Test(groups = { "regression" })
	public void verifyDropdownOptions() {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select select = new Select(dropdown);
		List<WebElement> options = select.getOptions();
		List<String> optionsAsString = new ArrayList<String>();
		for (WebElement elm : options) {
			optionsAsString.add(elm.getText());
		}

		List<String> expectedOptions = new ArrayList<String>();
		expectedOptions.add("Volvo");
		expectedOptions.add("Swift");
		expectedOptions.add("Hyundai");
		
		expectedOptions.add("Audi");

		assertEquals(optionsAsString, expectedOptions);

	}

	@Test(groups = { "sanity", "smoke" })
	public void verifyPageTile() {
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();

	}
}
