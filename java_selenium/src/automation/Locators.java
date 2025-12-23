package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Locators {

	public void login() throws InterruptedException {

		WebDriver driver = DriverFactory.getDriver("chrome");

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();

		driver.findElement(By.id("inputUsername")).sendKeys("guna@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("1234");

		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();

		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait
		String text = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(text);

		driver.findElement(By.cssSelector(".forgot-pwd-container a")).click();
		Thread.sleep(2000);
		// $() --> CSS selector to check in the browser console if you don't have access to selectors hub plugin
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Python");
		driver.findElement(By.cssSelector("input[placeholder='Email'")).sendKeys("python@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7673373733");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		// regular expression for xpath 
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		// indexing in xpath //input[@type='text'][2]
		// parent to child xpath --> //form/h2/input[3]
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		
		// absolute path /html/body
		// relative path //button/
		// following-sibling         ---> //header/div/button[1]/following-sibling::button[1]
		// child to parent ----> //header/div/button[1]/parent::div
		// parent to child relation ----> //path //path
		
	}
	
	public void login1() throws InterruptedException {
		
		WebDriver driver = DriverFactory.getDriver("edge");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open the browser
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// maximize the window
		driver.manage().window().maximize();
		
		// enter user name
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//enter password
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		// click on login button
		driver.findElement(By.cssSelector("button[class*='submit']")).click(); // regular expression
		Thread.sleep(1000);
		// check login message
		String text = driver.findElement(By.cssSelector("div[class='login-container'] p")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You are successfully logged in.");
		
		// logout
		driver.findElement(By.className("logout-btn")).click();
		
		String res = driver.findElement(By.cssSelector("form[class='form'] h1")).getText();
		
		Assert.assertEquals(res, "Sign in");
		
		// another locator to find element using text
		// driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		// driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
	}
	
	public void siblings() {
		WebDriver driver = DriverFactory.getDriver("edge");
		String URL = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(URL);
		driver.manage().window().maximize();
		String login = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		//String login1 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header")).getText();
		//windows activities
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		System.out.println(login);
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Locators locators = new Locators();
//		locators.login();
		//locators.login1();
		locators.siblings();

	}

}
