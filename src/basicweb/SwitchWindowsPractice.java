package basicweb;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class SwitchWindowsPractice {
	WebDriver driver;
	String baseUrl;

	@Before
	void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "F://geckodriver-v0.24.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	void test() throws InterruptedException {
		// ustawiasz handler
		String parentHandler = driver.getWindowHandle();
		// otwierasz do n-tej karty
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[@href='/pages/practice']")).click();
		driver.findElement(By.id("openwindow")).click();
		//ustanawiasz listê handlerów
		Set <String> handles = driver.getWindowHandles();
		// instrukcja warunkowa zagniezdzona  w pêtli FOR
		for (String handle : handles) {
			if (!handle.equals(parentHandler)) {
				// zmiana na ostatnio otwarte okno
				driver.switchTo().window(handle);
				Thread.sleep(3000);
			}
		}
		
		
		
	}

	@After 
	void tearDown() throws Exception {
	}


}