package Training.train.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Training.train.App;

/**
 * Unit test for simple App.
 */
public class AppTest3 extends App
{

	@Test
	public void Script1()
	{
		driver.get("https://www.disney.com");
//		driver.manage().window().maximize();
		System.out.println("firefox 3 loaded");
//		driver.findElement(By.name("q")).click();
//		driver.findElement(By.name("q")).sendKeys("accenture");
	}
}

