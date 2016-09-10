	package WebdriverTest.WebdriverTest;
	
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
	
	public class TestBase {
		
		WebDriver driver;
		
		
		@BeforeTest(alwaysRun = true)  
	public void setUp(){
			System.setProperty("webdriver.ie.driver", "C:\\TrainingFiles\\selenium-java-2.52.0\\selenium-2.52.0\\IEDriverServer.exe")	;
			driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.wakanow.com");
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();		
					}
	@AfterClass
	public void tearDown(){
		//driver.quit();
	}	
	
	 	}
