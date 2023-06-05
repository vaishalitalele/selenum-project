package selenium;

public class DateTimeHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get();
		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//label[@for='departure']")).click();

		Thread.sleep(2000);
		while (!(driver.findElements(By.xpath("//div[@role='heading']/div")).get(0).getText().contains("July"))) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}

		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Body']//div[@class='dateInnerCell']//p[1]"));

		for (WebElement date : dates) {
			if (date.getText().contains("20"))
				date.click();
			}
		}

	}

}

	}

}
