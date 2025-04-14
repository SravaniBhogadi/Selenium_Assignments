package tommy.com.firsttommy;

import java.time.Duration;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Standalone {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		String product_name = "ZARA COAT 3";
		driver.findElement(By.id("userEmail")).sendKeys("sravanibhogadi@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Selenium@1");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		List <WebElement> products = driver.findElements(By.cssSelector(".col-lg-4"));
		
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(product_name)).findFirst().orElse(null);
		prod.findElement(By.xpath("//button[@class = 'btn w-10 rounded']")).click();
 		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role = 'alert']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@role = 'alert']")));
		driver.findElement(By.xpath("//button[@routerlink = '/dashboard/cart']")).click();
		
		List <WebElement> cartProducts = driver.findElements(By.xpath("//div[@class = 'cartSection']/h3"));
		Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(product_name));
		Assert.assertTrue(match);
		
		WebElement checkoutButton = driver.findElement(By.xpath("//button[text() = 'Checkout']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkoutButton);
		wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
		checkoutButton.click();
		
		Actions a = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder = 'Select Country']")));

		WebElement countryInput = driver.findElement(By.xpath("//input[@placeholder='Select Country']"));
		a.sendKeys(countryInput, "India").perform();
		
		driver.findElement(By.xpath("(//span[@class = 'ng-star-inserted'])[2]")).click();
		driver.findElement(By.xpath("//a[@class = 'btnn action__submit ng-star-inserted']")).click();
		
		driver.close();
		
		
	}

}
