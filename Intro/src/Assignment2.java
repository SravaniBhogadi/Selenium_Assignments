

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Actions action = new Actions(driver);
		
		WebElement Women = driver.findElement(By.xpath("//a[@data-group ='women']"));
		action.moveToElement(Women).perform();
		
		WebElement ethinic_wear = driver.findElement(By.xpath("//a[@data-group='women']/following-sibling::div//a[contains(text(),'Ethnic Wear')]"));
		ethinic_wear.click();
		
		WebElement select_dress = driver.findElement(By.xpath("//h4[text()= 'Bandhani Pure Georgette Saree']"));
		select_dress.click();
		
		WebElement select_size = driver.findElement(By.xpath("(//span[@class = 'size-buttons-inventory-left'])[1]"));
		select_size.click();
		
		WebElement add_to_bag = driver.findElement(By.xpath("//span[@class = 'myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']"));
		add_to_bag.click();
		
		
		WebElement open_bag = driver.findElement(By.xpath("//span[@data-reactid = '872']"));
		open_bag.click();
		
		WebElement place_order = driver.findElement(By.xpath("//div[text() = 'PLACE ORDER']"));
		place_order.click();
		
		WebElement price = driver.findElement(By.xpath("//div[@class = 'itemComponents-base-price itemComponents-base-bold ']/div"));
		System.out.println(price.getText());

		driver.close();
		
	}
	
}
