package testcases;

import static org.testng.Assert.assertEquals;


import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import utils.Utility;

import utils.Utility;
public class VerifyPageTitle {
WebDriver driver;



@BeforeSuite
public void beforeSuite() {
	System.out.println("Before suite");
}

@BeforeTest
public void beforeTest() {
	System.out.println("Before Test plan");
}

@BeforeClass
public void beforeClass() {
	System.out.println("Before class");
}

@BeforeMethod
public void launchBrowser() throws IOException {
	System.setProperty("webdriver.chrome.driver", Utility.getProperty("driver path"));
	driver = new ChromeDriver();
	
	
	driver.get(Utility.getProperty("url"));
	driver.manage().window().maximize();
}

@Test(priority =0)
public void verifyB() {
	assertEquals(driver.getCurrentUrl(), "http://omayo.blogspot.com/");
}
@Test(enabled =true,priority =1)
public void verifyA() {
	assertEquals(driver.getTitle(), "omayo (QAFox.com)");
}

@AfterMethod
public void closeBrowser() {
	driver.quit();
}

@AfterClass
public void afterClass() {
	System.out.println("After class");
}

@AfterTest
public void afterTestPlan() {
	System.out.println("After test plan");
}

@AfterSuite
public void afterSuite() {
	System.out.println("After suite");
}

	 
 } 

