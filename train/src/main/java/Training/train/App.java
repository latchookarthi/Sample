package Training.train;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Hello world!
 *
 */
public abstract class App 

{
    protected WebDriver driver = null;
//	 protected static WebDriver driver;
@BeforeTest
    protected void resuse()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
    	 driver		=new ChromeDriver();
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
    	 System.out.println("driver loaded");

//return driver;
    }

    @AfterTest
    protected void quit()
    {
    
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
    	System.out.println("driver closing");
driver.quit();
    }
}
