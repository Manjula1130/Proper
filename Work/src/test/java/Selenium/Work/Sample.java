package Selenium.Work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Sample {
	public void Test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.navigate().to("www.facebook.com");
		driver.close();
	}
}
