package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://www.myntra.com/");
		String Women = driver.findElement(By.xpath("//a[@data-group ='women']"));
		
		String ethinic_wear = By.xpath("//li[@data-reactid = '195']");
		String select_dress = By.xpath("//img[@title = 'Samhitas Women Floral Printed V-Neck Kurti']");
		String add_to_bag = By.xpath("//span[@class = 'myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']");
		String select_size = By.xpath("(//span[@class = 'size-buttons-inventory-left'])[1]");
		String open_bag = By.xpath("//span[@data-reactid = '872']");
		String place_order = By.xpath("//div[text() = 'PLACE ORDER']");
		String price = By.xpath("//div[@class = 'itemComponents-base-price itemComponents-base-bold ']/div");
		
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
