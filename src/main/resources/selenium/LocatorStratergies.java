package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStratergies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.name("Header")).getText());
		// by.id
		System.out.println(driver.findElement(By.id("header")).getText());

		// by class name
	 System.out.println(driver.findElement(By.className("header section")).getText());

		// by.tagname
		System.out.println(driver.findElement(By.tagName("button")).getText());

		// by.linktext
	 driver.findElement(By.linkText("onlytestingblog")).click();

		// by.partialLinkText
	 driver.findElement(By.partialLinkText("onlytest")).click();

		// by.cssSelector
		System.out.println(driver.findElement(By.cssSelector("div#HTML7  button#but2")).getText());

		System.out.println(driver.findElement(By.cssSelector("div[id='HTML7'] h2[class='title']")).getText());

	}




	}


