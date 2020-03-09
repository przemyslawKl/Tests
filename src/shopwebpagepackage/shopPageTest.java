package shopwebpagepackage;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;

import shopwebpagepackage.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class shopPageTest {
		
	WebDriver driver;
	String baseUrl;
		

	@BeforeEach
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "F://geckodriver-v0.24.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://automationpractice.com/index.php";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		@Test
		public void oneWayTest() throws Exception {
		driver.get(baseUrl);
		pageElements.WomenRefLink(driver);
		driver.navigate().to(baseUrl);
		pageElements.SignInClick(driver);
		driver.navigate().to(baseUrl);
		driver.close();

			
		}

		@AfterEach
		public void tearDown() throws Exception {
		}

		
	}