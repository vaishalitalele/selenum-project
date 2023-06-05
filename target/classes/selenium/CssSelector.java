package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		System.out.println(driver.findElement(By.xpath("//button[@type='button' and @id='but2']")).getText());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.findElement(By.xpath("//button[@type='button']")).getText());
		//System.out.println(driver.findElement(By.xpath("//button[@type='button' and @id='but2']")).getText());
		System.out.println(driver.findElement(By.xpath("//button[@type='button' or @id='but2']")).getText());
		//return url
				System.out.println(driver.getCurrentUrl());

		driver.navigate().to("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW).get(null);
				
	}

}