package selenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinMax1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://mail.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.lenovo.com/in/en");
		driver.quit();
	}

}
