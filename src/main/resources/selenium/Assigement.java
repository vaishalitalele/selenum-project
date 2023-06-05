package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigement {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://mail.google.com/");
		Thread.sleep(2000);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.findElement(By.id("but2")).click();
		Thread.sleep(2000);
	}

}
