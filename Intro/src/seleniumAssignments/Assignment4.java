

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/women-ethnic-wear");
		driver.manage().window().maximize();
		
		WebElement Category = driver.findElement(By.xpath("//a[@aria-label= 'Bestselling headphones']"));
		Category.click();
		
		WebElement add_to_cart = driver.findElement(By.xpath("//button[@aria-label = 'Add to cart']"));
		
		
		List <WebElement> Products = driver.findElements(By.xpath("//li[@class = 'product-base']"));
		
		
	}

}
