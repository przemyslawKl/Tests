package basicweb;


import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicActions {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		//C:\Users\adi\Desktop\strona\chromedriver_win32
		System.setProperty("webdriver.gecko.driver", "F://geckodriver-v0.24.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get(baseUrl);
		System.out.println("Starting webpage " + baseUrl);
		driver.findElement(By.xpath("//a[@href='/pages/practice']")).click();
		System.out.println("Redirecting on page https://learn.letskodeit.com/p/practice");
		driver.findElement(By.id("bmwradio")).click();
		System.out.println("Clicking on radio button BMW");
		driver.findElement(By.id("benzradio")).click();
		System.out.println("Clicking on radio button Benz");
		driver.findElement(By.id("hondaradio")).click();
		System.out.println("Clicking on radio button Honda");
		
		
		WebElement bmwrbt = driver.findElement(By.id("bmwcheck"));
		bmwrbt.click();
		bmwrbt.click();
		WebElement benzrbt = driver.findElement(By.xpath("//input[@id='benzcheck']"));
		benzrbt.click();
		WebElement hondarbt = driver.findElement(By.id("hondacheck"));
		hondarbt.click();
		
		
		WebElement element = driver.findElement(By.id("carselect"));
		Select s = new Select(element);
		Thread.sleep(3000);
		s.selectByValue("bmw");
		System.out.println("Selecting BMW");
		Thread.sleep(3000);
		s.selectByVisibleText("Benz");
		System.out.println("Selecting Benz");
		Thread.sleep(3000);
		s.selectByIndex(2);
		System.out.println("Selecting Honda");
		System.out.println("Redirecting on page https://learn.letskodeit.com/p/practice");
		
		
		
		boolean isChecked = false;
		List<WebElement> selectClassExample = driver.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'checkbox')]"));
		int sizeclass = selectClassExample.size();
		for (int i = 0 ; i < sizeclass ; i++ ) {
			isChecked = selectClassExample.get(i).isSelected();
				if (!isChecked) {
					selectClassExample.get(i).click();
					Thread.sleep(3000);
				}
				}
		System.out.println("Size of the list is " + sizeclass);		
		
		WebElement multiselect = driver.findElement(By.id("multiple-select-example"));
		Select s1 = new Select(multiselect);
		s1.selectByIndex(0);
		Thread.sleep(2000);
		s1.selectByValue("orange");
		Thread.sleep(2000);
		s1.selectByVisibleText("Peach");
		Thread.sleep(2000);
		s1.deselectAll();
		
	}


		
	

	
	/*
	 * @Test public void test2() throws InterruptedException {
	 * 
	 * driver.get(baseUrl); System.out.println("Starting webpage " + baseUrl);
	 * driver.findElement(By.xpath("//a[@href='/pages/practice']")).click();
	 * System.out.
	 * println("Redirecting on page https://learn.letskodeit.com/p/practice");
	 * WebElement element = driver.findElement(By.id("carselect")); Select s = new
	 * Select(element); Thread.sleep(3000); s.selectByValue("bmw");
	 * System.out.println("Selecting BMW"); Thread.sleep(3000);
	 * s.selectByVisibleText("Benz"); System.out.println("Selecting Benz");
	 * Thread.sleep(3000); s.selectByIndex(2);
	 * System.out.println("Selecting Honda");
	 */
		
	/*}
	
	@Test
	public void test3() throws InterruptedException {
		boolean isChecked = false;
		driver.get(baseUrl);
		System.out.println("Starting webpage " + baseUrl);
		driver.findElement(By.xpath("//a[@href='/pages/practice']")).click();
		System.out.println("Redirecting on page https://learn.letskodeit.com/p/practice");
		List<WebElement> selectClassExample = driver.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'checkbox')]"));
		int sizeclass = selectClassExample.size();
		for (int i = 0 ; i < sizeclass ; i++ ) {
			isChecked = selectClassExample.get(i).isSelected();
				if (!isChecked) {
					selectClassExample.get(i).click();
					Thread.sleep(3000);
				}
		}
		System.out.println("Size of the list is " + sizeclass);		
				}
	
	@Test
	public void test4() throws InterruptedException {
		driver.get(baseUrl);
		System.out.println("Starting webpage " + baseUrl);
		driver.findElement(By.xpath("//a[@href='/pages/practice']")).click();
		WebElement multiselect = driver.findElement(By.id("multiple-select-example"));
		Select s = new Select(multiselect);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("orange");
		Thread.sleep(2000);
		s.selectByVisibleText("Peach");
		Thread.sleep(2000);
		s.deselectAll();
	}*/
	
	@Test
	public void test5() throws InterruptedException {
		
		// Log in Test 
		
		driver.get(baseUrl);
		System.out.println("Starting webpage " + baseUrl);
		driver.findElement(By.xpath("//a[@href ='/sign_in']")).click();
		System.out.println("Redirecting on log in page...");
		driver.findElement(By.id("user_email")).sendKeys("usermail@user.com");
		driver.findElement(By.id("user_password")).sendKeys("passowrd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
		
		
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("passowrd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());

		
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_email")).sendKeys("usermail@user.com");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
		
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());



	}
		
	
	@After
	public void tearDown() throws Exception {
		 driver.quit();
	}
}
