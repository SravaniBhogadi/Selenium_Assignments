package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://www.myntra.com/");
		WebElement Women = driver.findElement(By.xpath("//a[@data-group ='women']"));
		
		By ethinic_wear = By.xpath("//li[@data-reactid = '195']");
		By select_dress = By.xpath("//img[@title = 'Samhitas Women Floral Printed V-Neck Kurti']");
		By add_to_bag = By.xpath("//span[@class = 'myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']");
		By select_size = By.xpath("(//span[@class = 'size-buttons-inventory-left'])[1]");
		By open_bag = By.xpath("//span[@data-reactid = '872']");
		By place_order = By.xpath("//div[text() = 'PLACE ORDER']");
		By price = By.xpath("//div[@class = 'itemComponents-base-price itemComponents-base-bold ']/div");
		
		action.moveToElement(Women).perform();
		String x_ethinic = driver.findElement(ethinic_wear).click();
		String x_dress = driver.findElement(select_dress).click();
		driver.findElement(add_to_bag).click();
		char x_size = driver.findElement(select_size);.click();
		driver.findElement(open_bag).click();
		int x_price = driver.findElement(place_order).click();
		
		
		System.out.println(x_ethinic.getText());
		System.out.println(x_dress.getText());
		System.out.println(x_size.getText());
		System.out.println(x_price.getText());
		
	}
	
}
