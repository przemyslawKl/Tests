package flightChecking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsRyanAir {

		public static WebElement element;
		
		public static void WomenRefLink(WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Women']"));
			element.click();
		}
		public static void DressesRefLink(WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Dresses']"));
			element.click();
		}

		public static void TshirtsRefLink(WebDriver driver) {
				element = driver.findElement(By.xpath("//a[@title='T-Shirts']"));
				element.click();
		}
				
		public static void YourLogoClick (WebDriver driver) {
				element = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/']"));
				element.click();
		}
		
		public static void ContactUsClick (WebDriver driver) {
			element = driver.findElement(By.partialLinkText("http://automationpractice.com/index.php?controller=contact"));
			element.click();
		}
		
		public static void SignInClick (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
			element.click();
		}
		
		public static void PopularClick (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@href='#homefeatured']"));
			element.click();
		}
		
		public static void BestsellersClick (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@href='#blockbestsellers']"));
			element.click();
		}
		
		public static WebElement SearchField (WebDriver driver) {
			element = driver.findElement(By.id("search_query_top"));
			return element;
		}
		
		public static void FirstAd (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@class='htmlcontent-item-1 col-xs-4']"));
			element.click();
		}
		
		public static void SecondAd (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@class='htmlcontent-item-2 col-xs-4']"));
			element.click();
		}
		
		public static void ThirdAd (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@class='htmlcontent-item-3 col-xs-4']"));
			element.click();
		}
		
		public static void FourthAd (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@class='htmlcontent-item-4 col-xs-4']"));
			element.click();
		}
		
		public static void FifthAd (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@class='htmlcontent-item-5 col-xs-5']"));
			element.click();
		}
		
		public static void WomenCategories (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']"));
			element.click();
		}
		
		public static void SpecialInformations (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=prices-drop']"));
			element.click();
		}
		
		public static void NewProductsInformation (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=new-products']"));
			element.click();
		}
		
		
		public static void BestsellersInformation (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Best sellers']"));
			element.click();
		}
		
		public static void OurStoresInformation (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Our stores']"));
			element.click();
		}
		
		public static void ContactUsInformation (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Contact us']"));
			element.click();
		}
		
		public static void TermsandContitionsInformation (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Terms and conditions of use']"));
			element.click();
		}
		
		public static void AboutUsInformation (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='About us']"));
			element.click();
		}
		
		public static void SitemapInformation (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Sitemap']"));
			element.click();
		}
		
		public static void MyAccountmain (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Manage my customer account']"));
			element.click();
		}
		
		public static void MyOrdersMyAccount (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='My orders']"));
			element.click();
		}
		
		public static void MyCreditSlipsMyAccount (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='My credit slips']"));
			element.click();
		}
		
		public static void MyAddressesMyAccount (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='My addresses']"));
			element.click();
		}
		
		public static void MyPersonalInfoMyAccount (WebDriver driver) {
			element = driver.findElement(By.xpath("//a[@title='Manage my personal information']"));
			element.click();
		}
}



