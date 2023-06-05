package testcases;

import static org.testng.Assert.assertEquals;

import utils.Utility;


import java.io.IOException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.PackageUtils;
import org.testng.internal.Utils;
import org.w3c.dom.css.CSSImportRule;

import utils.Utility;

public class VerifyHomeClass {
WebDriver driver;
@BeforeMethod(alwaysRun = true)
public void launchBrowser() throws IOException {
	System.setProperty("webdriver.chrome.driver", Utility.getProperty("driverPath"));
	driver = new ChromeDriver();
	driver.get(Utility.getProperty("newtoururl"));
	driver.manage().window().maximize();
}

@Test(groups = { "sanity" }, dataProvider = "usersData")
public void verifyImageIsOnHomePage(String uname, String pass) {
	WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	WebElement loginButton = driver.findElement(By.xpath("//input[@name='submit']"));

	userName.sendKeys(uname);
	password.sendKeys(pass);
	loginButton.click();

	WebElement loginSuccessfullyText = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	String loginText = loginSuccessfullyText.getText();

	assertEquals(loginText, "Login Successfully");

}

@DataProvider(name = "usersData")
public String[][] data() {
	String users[][] = { { "sachin", "sachin" }, { "admin", "admin" }, { "abcd", "abcd" } };
	return users;
}

@AfterMethod(alwaysRun = true)
public void closeBrowser() {
	driver.quit();
}


			
		

 }


