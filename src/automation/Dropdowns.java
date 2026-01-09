package automation;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) {
		 //Dropdowns.staticDropdown("chrome");
		try {
			//Dropdowns.passengersDropdown();
			//Dropdowns.ticketBooking();
			Dropdowns.ticketBookingOnDiff();
			//Dropdowns.autoSuggestedDropDown();
			Dropdowns.checkboxSelection();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void staticDropdown(String browser) {
		WebDriver driver = DriverFactory.getDriver(browser);
		String URL = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(URL);

		WebElement dropdown = driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("AED");
		

		String selectedValue = select.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedValue, "AED");

		driver.quit();

	}
	
	public static void ticketBooking() {
			
			WebDriver driver = DriverFactory.getDriver("edge");
			String URL = "https://www.spicejet.com/";
			driver.get(URL);
			
			
			driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div")).click();
			driver.findElement(By.xpath("//*[text()='AYJ']")).click();
			
			
			
		}
	
	public static void ticketBookingOnDiff() throws InterruptedException {
		
		WebDriver driver = DriverFactory.getDriver("edge");
		String URL = "https://rahulshettyacademy.com/dropdownsPractise";
		driver.get(URL);
		
		//from
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	}
	

	public static void passengersDropdown() throws InterruptedException {
		WebDriver driver = DriverFactory.getDriver("edge");
		String URL = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(URL);

		// click on the drop-down
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(1000);

		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click(); // total 5 selects including defaults
		}

		String number = driver.findElement(By.id("divpaxinfo")).getText();

		// done button
		driver.findElement(By.id("btnclosepaxoption")).click();

		String text = driver.findElement(By.id("divpaxinfo")).getText();
		String[] array1 = number.split(" ");
		String finalNumber = array1[0];
		System.out.println(finalNumber);
		String expected = finalNumber + " Adult";

		Assert.assertEquals(text, expected);

	}
	
	public static void autoSuggestedDropDown() throws InterruptedException {

		WebDriver driver = DriverFactory.getDriver("edge");
		String URL = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(URL);
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement element : options) {
			//String text = element.getText();
			if (element.getText().equalsIgnoreCase("India")){
				element.click();
				break;
			}
		}
		
		
		
	}
	
	public static void checkboxSelection() {
		
		WebDriver driver = DriverFactory.getDriver("edge");
		String URL = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(URL);
		
		//driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		
		// regular expression
		//driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'IndArm')]")).click();
		boolean isSelected = driver.findElement(By.xpath("//input[contains(@id, 'IndArm')]")).isSelected();
		Assert.assertEquals(isSelected, true);
		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		Iterator<WebElement> iterator = checkboxes.iterator();
		int count = 0;
		while(iterator.hasNext()) {
			iterator.next();
			count = count + 1;
		}
		System.out.println(count);
		
		
	}
	
	

	

}
