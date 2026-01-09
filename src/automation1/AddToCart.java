package automation1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {

		String[] expectedProducts = { "Cucumber", "Beetroot" };

		String URL = "https://rahulshettyacademy.com/seleniumPractise/#/";
		WebDriver driver = new ChromeDriver();

		driver.get(URL);

		AddToCart cart = new AddToCart();
		cart.addItems(driver, expectedProducts);

	}

	public void addItems(WebDriver driver, String[] expectedProducts) {
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> listOfProducts = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < listOfProducts.size(); i++) {
			int count = 0;
			String product = listOfProducts.get(i).getText();
			String[] newList = product.split("-");
			String actualProduct = newList[0].trim();
			// check whether product present in expected products
			// convert array to ArrayList
			List<String> list = Arrays.asList(expectedProducts);
			if (list.contains(actualProduct)) {
				count += 1;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (count == expectedProducts.length) {
					break;
				}

			}
		}
		AddToCart cart = new AddToCart();
		cart.clickOnCartIcon(driver);
		cart.enterPromoCode(driver);
		cart.chooseCountry(driver);
	}
	
	public void clickOnCartIcon(WebDriver driver) {
		driver.findElement(By.cssSelector("a[class='cart-icon'] img")).click();
		driver.findElement(By.cssSelector("div[class='cart'] div button[type='button']")).click();
	}
	
	public void enterPromoCode(WebDriver driver) {
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promoInfo")));
		driver.findElement(By.xpath("//button[contains(text(), 'Place Order')]")).click();
	}
	
	public void chooseCountry(WebDriver driver) {
		WebElement dropdown = driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("India");
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Proceed')]")).click();
		String successfulMessage = driver.findElement(By.cssSelector(".wrapperThree")).getText();
		Assert.assertEquals(successfulMessage, "Thank you. Your order has been placed successfully ...!!! ");
	}
}
