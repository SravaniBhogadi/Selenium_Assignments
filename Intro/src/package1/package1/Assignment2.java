package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://www.myntra.com/");
		String Women = driver.findElement(By.xpath("//a[@data-group ='women']"));
		action.moveToElement(Women).perform();
		driver.findElement(By.xpath("//li[@data-reactid = '195']"));
		driver.findElement(By.xpath("//img[@title = 'Samhitas Women Floral Printed V-Neck Kurti']")).click();
		driver.findElement(By.xpath("//span[@class = 'myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		
	}
	
	

}
