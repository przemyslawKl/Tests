package shopwebpagepackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestCase1 {
	WebDriver driver;
	String baseUrl;


	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "F://geckodriver-v0.24.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://automationpractice.com/index.php";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
	@Test
	void test() {
		driver.get(baseUrl);
		
	}
	@AfterEach
	void tearDown() throws Exception {
	}



}
