package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.DriverFactory;

public class FirstProgram {
	
	public static void main(String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "path")
		WebDriver driver = DriverFactory.getDriver("edge");
		driver.get("https://rahulshettyacademy.com/#/index");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		driver.close();
		
		
	
	}

}
