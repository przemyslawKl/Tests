package flightChecking;


import java.util.concurrent.TimeUnit;

import flightChecking.ElementsRyanAir;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwoWayOneWayTest {
	
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "F://geckodriver-v0.24.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void oneWayTest() throws InterruptedException {
	driver.get(baseUrl);
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
}
